#!/usr/bin/env python3
import argparse
import base64
import hashlib
import json
import os
import re
import tempfile
import time
import urllib.error
import urllib.parse
import urllib.request
import uuid
import zipfile
from pathlib import Path
from typing import Dict, List, Optional, Tuple

DEFAULT_API_BASE = "https://central.sonatype.com"
DEFAULT_PUBLISHING_TYPE = "USER_MANAGED"
DEFAULT_WAIT_SECONDS = 900
DEFAULT_POLL_INTERVAL_SECONDS = 10


def read_sdk_version(repo_root: Path) -> str:
    system_java = repo_root / "sdk" / "src" / "main" / "java" / "com" / "datalogic" / "device" / "info" / "SYSTEM.java"
    if not system_java.exists():
        raise RuntimeError(f"SYSTEM.java not found at {system_java}")

    major = None
    minor = None
    major_pattern = re.compile(r"SDK_VERSION_MAJOR\s*=\s*(\d+)")
    minor_pattern = re.compile(r"SDK_VERSION_MINOR\s*=\s*(\d+)")

    for line in system_java.read_text(encoding="utf-8").splitlines():
        if major is None:
            m = major_pattern.search(line)
            if m:
                major = m.group(1)
        if minor is None:
            m = minor_pattern.search(line)
            if m:
                minor = m.group(1)
        if major is not None and minor is not None:
            break

    if major is None or minor is None:
        raise RuntimeError("Could not extract SDK version from SYSTEM.java")

    return f"{major}.{minor}"


def resolve_credentials() -> Tuple[str, str]:
    username = os.getenv("sonatypeUsername")
    password = os.getenv("sonatypePassword")

    if not username or not password:
        raise RuntimeError(
            "Missing credentials. Set sonatypeUsername/sonatypePassword."
        )

    return username, password


def build_auth_header(username: str, password: str) -> str:
    token = base64.b64encode(f"{username}:{password}".encode("utf-8")).decode("ascii")
    return f"Bearer {token}"


def get_maven_local_repository(repo_root: Path) -> Path:
    """Return the Maven local repository path: repo_root/.m2/repository"""
    return repo_root / ".m2" / "repository"


def maven_local_artifact_dir(repo_root: Path, group_id: str, artifact_id: str, version: str) -> Tuple[Path, Path]:
    m2_root = get_maven_local_repository(repo_root)
    rel = Path(group_id.replace(".", "/")) / artifact_id / version
    artifact_dir = m2_root / rel

    if not artifact_dir.exists():
        raise RuntimeError(
            f"Maven local artifact directory not found at {artifact_dir}. "
            f"Run :sdk:publishReleasePublicationToMavenLocal first."
        )

    return m2_root, artifact_dir


def validate_artifacts(artifact_dir: Path, artifact_id: str, version: str) -> List[Path]:
    required = [
        f"{artifact_id}-{version}.aar",
        f"{artifact_id}-{version}.pom",
        f"{artifact_id}-{version}-sources.jar",
        f"{artifact_id}-{version}-javadoc.jar",
    ]

    files: List[Path] = []
    for name in required:
        p = artifact_dir / name
        asc = artifact_dir / f"{name}.asc"
        if not p.exists():
            raise RuntimeError(f"Missing artifact: {p}")
        if not asc.exists():
            raise RuntimeError(f"Missing signature file: {asc}")
        files.extend([p, asc])

    optional = [
        artifact_dir / f"{artifact_id}-{version}.module",
        artifact_dir / f"{artifact_id}-{version}.module.asc",
    ]
    for p in optional:
        if p.exists():
            files.append(p)

    # Central Publisher validation expects classic Maven checksum sidecars.
    checksum_files = ensure_checksums(files)
    files.extend(checksum_files)

    return files


def ensure_checksums(files: List[Path]) -> List[Path]:
    generated: List[Path] = []

    for p in files:
        if p.suffix in {".md5", ".sha1"}:
            continue

        md5_file = Path(str(p) + ".md5")
        sha1_file = Path(str(p) + ".sha1")

        data = p.read_bytes()
        md5_digest = hashlib.md5(data).hexdigest()
        sha1_digest = hashlib.sha1(data).hexdigest()

        md5_file.write_text(md5_digest + "\n", encoding="ascii")
        sha1_file.write_text(sha1_digest + "\n", encoding="ascii")

        generated.extend([md5_file, sha1_file])

    return generated


def create_bundle_zip(m2_root: Path, files: List[Path]) -> Path:
    fd, zip_path_str = tempfile.mkstemp(prefix="central-bundle-", suffix=".zip")
    os.close(fd)
    zip_path = Path(zip_path_str)

    with zipfile.ZipFile(zip_path, "w", compression=zipfile.ZIP_DEFLATED) as zf:
        for file_path in files:
            arcname = file_path.relative_to(m2_root)
            zf.write(file_path, arcname.as_posix())

    return zip_path


def build_multipart_body(file_field_name: str, file_path: Path) -> Tuple[bytes, str]:
    boundary = f"----central-boundary-{uuid.uuid4().hex}"
    file_name = file_path.name
    file_bytes = file_path.read_bytes()

    parts = []
    parts.append(f"--{boundary}\r\n".encode("utf-8"))
    parts.append(
        (
            f'Content-Disposition: form-data; name="{file_field_name}"; filename="{file_name}"\r\n'
            "Content-Type: application/octet-stream\r\n\r\n"
        ).encode("utf-8")
    )
    parts.append(file_bytes)
    parts.append(f"\r\n--{boundary}--\r\n".encode("utf-8"))

    body = b"".join(parts)
    content_type = f"multipart/form-data; boundary={boundary}"
    return body, content_type


def http_post(url: str, auth_header: str, body: Optional[bytes] = None, content_type: Optional[str] = None) -> Tuple[int, bytes]:
    headers = {"Authorization": auth_header}
    if content_type:
        headers["Content-Type"] = content_type
    req = urllib.request.Request(url=url, data=body, headers=headers, method="POST")
    try:
        with urllib.request.urlopen(req) as resp:
            return resp.getcode(), resp.read()
    except urllib.error.HTTPError as e:
        payload = e.read().decode("utf-8", errors="replace")
        raise RuntimeError(f"HTTP {e.code} for {url}: {payload}") from e
    except urllib.error.URLError as e:
        reason = getattr(e, "reason", e)
        raise RuntimeError(f"Network error for {url}: {reason}") from e


def http_get(url: str, auth_header: str) -> Tuple[int, bytes]:
    req = urllib.request.Request(url=url, headers={"Authorization": auth_header}, method="GET")
    try:
        with urllib.request.urlopen(req) as resp:
            return resp.getcode(), resp.read()
    except urllib.error.HTTPError as e:
        payload = e.read().decode("utf-8", errors="replace")
        raise RuntimeError(f"HTTP {e.code} for {url}: {payload}") from e
    except urllib.error.URLError as e:
        reason = getattr(e, "reason", e)
        raise RuntimeError(f"Network error for {url}: {reason}") from e


def upload_bundle(api_base: str, auth_header: str, bundle_path: Path, publishing_type: str, deployment_name: Optional[str]) -> str:
    query = {"publishingType": publishing_type}
    if deployment_name:
        query["name"] = deployment_name

    url = f"{api_base}/api/v1/publisher/upload?{urllib.parse.urlencode(query)}"
    body, content_type = build_multipart_body("bundle", bundle_path)
    _, payload = http_post(url, auth_header, body=body, content_type=content_type)

    deployment_id = payload.decode("utf-8", errors="replace").strip()
    if not deployment_id:
        raise RuntimeError("Upload succeeded but response did not include deployment ID")

    return deployment_id


def poll_status(api_base: str, auth_header: str, deployment_id: str, wait_seconds: int, interval_seconds: int) -> Dict:
    deadline = time.time() + wait_seconds
    status_url = f"{api_base}/api/v1/publisher/status?id={urllib.parse.quote(deployment_id)}"

    last = None
    while time.time() <= deadline:
        _, payload = http_post(status_url, auth_header, body=b"", content_type="application/json")
        data = json.loads(payload.decode("utf-8"))
        state = data.get("deploymentState")

        if state != last:
            print(f"Central deployment state: {state}")
            last = state

        if state in {"FAILED", "PUBLISHED", "VALIDATED"}:
            return data

        time.sleep(interval_seconds)

    raise RuntimeError(f"Timed out waiting for deployment status after {wait_seconds}s")


def publish_deployment(api_base: str, auth_header: str, deployment_id: str) -> None:
    url = f"{api_base}/api/v1/publisher/deployment/{urllib.parse.quote(deployment_id)}"
    code, _ = http_post(url, auth_header, body=b"", content_type="application/json")
    if code not in (200, 202, 204):
        raise RuntimeError(f"Unexpected status code from publish endpoint: {code}")


def check_published(api_base: str, auth_header: str, group_id: str, artifact_id: str, version: str) -> Dict:
    query = urllib.parse.urlencode({"namespace": group_id, "name": artifact_id, "version": version})
    url = f"{api_base}/api/v1/publisher/published?{query}"
    _, payload = http_get(url, auth_header)
    return json.loads(payload.decode("utf-8"))


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(description="Deploy Maven bundle to Sonatype Central Publisher API")
    parser.add_argument("--group-id", required=True)
    parser.add_argument("--artifact-id", required=True)
    parser.add_argument("--version", default="", help="Default: auto-detected from sdk SYSTEM.java")
    parser.add_argument("--api-base", default=os.getenv("CENTRAL_API_BASE", DEFAULT_API_BASE))
    parser.add_argument("--publishing-type", choices=["USER_MANAGED", "AUTOMATIC"], default=os.getenv("CENTRAL_PUBLISHING_TYPE", DEFAULT_PUBLISHING_TYPE))
    parser.add_argument("--deployment-name", default=os.getenv("CENTRAL_DEPLOYMENT_NAME", ""))
    parser.add_argument("--wait-seconds", type=int, default=int(os.getenv("CENTRAL_WAIT_SECONDS", DEFAULT_WAIT_SECONDS)))
    parser.add_argument("--poll-interval-seconds", type=int, default=DEFAULT_POLL_INTERVAL_SECONDS)
    parser.add_argument("--auto-publish", action="store_true", help="Call publish endpoint after VALIDATED")
    parser.add_argument("--check-published", action="store_true", help="Call /published endpoint at the end")
    parser.add_argument("--repo-root", default=str(Path(__file__).resolve().parents[1]))
    return parser.parse_args()


def main() -> int:
    args = parse_args()
    repo_root = Path(args.repo_root).resolve()
    version = args.version or read_sdk_version(repo_root)
    api_base = args.api_base.rstrip("/")

    username, password = resolve_credentials()
    auth_header = build_auth_header(username, password)

    m2_root, artifact_dir = maven_local_artifact_dir(repo_root, args.group_id, args.artifact_id, version)
    print(f"Using Maven local repository: {m2_root}")
    print(f"Using Central API base: {api_base}")

    files = validate_artifacts(artifact_dir, args.artifact_id, version)
    bundle = create_bundle_zip(m2_root, files)

    print(f"Uploading bundle: {bundle}")
    deployment_id = upload_bundle(api_base, auth_header, bundle, args.publishing_type, args.deployment_name or None)
    print(f"Deployment ID: {deployment_id}")

    status = poll_status(
        api_base,
        auth_header,
        deployment_id,
        wait_seconds=args.wait_seconds,
        interval_seconds=args.poll_interval_seconds,
    )

    state = status.get("deploymentState")
    print(json.dumps(status, indent=2))

    if state == "FAILED":
        raise RuntimeError("Deployment validation failed")

    if args.auto_publish:
        publish_deployment(api_base, auth_header, deployment_id)
        print("Publish endpoint triggered.")
    else:
        print("Manual publish mode active. Review and publish in Central Portal UI.")
        print(f"Deployment page: https://central.sonatype.com/publishing/deployments")

    if args.check_published:
        published = check_published(api_base, auth_header, args.group_id, args.artifact_id, version)
        print("Published status response:")
        print(json.dumps(published, indent=2))

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
