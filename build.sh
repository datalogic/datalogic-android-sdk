#!/usr/bin/env bash
set -euo pipefail

if [[ $# -lt 1 ]]; then
  cat <<'EOF'
Usage: ./build.sh <target>

Targets:
  build           Run clean + release assemble
  publish-local   Publish release publication to Maven local
  deploy-central-api Upload and validate deployment bundle via Central Publisher API
EOF
  exit 1
fi

target="$1"
JDK_VERSION_FILE="JDK_VERSION"
DEFAULT_JDK_VERSION="17"
if [[ -f "${JDK_VERSION_FILE}" ]]; then
  JDK_VERSION="$(tr -d '[:space:]' < "${JDK_VERSION_FILE}")"
  if [[ -z "${JDK_VERSION}" ]]; then
    JDK_VERSION="${DEFAULT_JDK_VERSION}"
    echo "${JDK_VERSION_FILE} is empty, defaulting to JDK ${JDK_VERSION}."
  fi
else
  JDK_VERSION="${DEFAULT_JDK_VERSION}"
  echo "${JDK_VERSION_FILE} not found, defaulting to JDK ${JDK_VERSION}."
fi

JDK_HOME="/usr/lib/jvm/java-${JDK_VERSION}-openjdk-amd64"
echo "Using JDK ${JDK_VERSION} at ${JDK_HOME}"
if [[ ! -d "${JDK_HOME}" ]]; then
  echo "*** ERROR *** JDK not found at ${JDK_HOME}!"
  exit 1
fi
export JDK_HOME="${JDK_HOME}"
export JAVA_HOME="${JDK_HOME}"

export PATH="$JAVA_HOME/bin:$PATH"
echo "Using JDK_HOME=$JDK_HOME"

if [[ -n "${ANDROID_SDK_ROOT:-}" ]]; then
  SOURCE_SDK_DIR="${ANDROID_SDK_ROOT}"
elif [[ -n "${ANDROID_HOME:-}" ]]; then
  SOURCE_SDK_DIR="${ANDROID_HOME}"
elif [[ -d "${HOME}/Android/Sdk" ]]; then
  SOURCE_SDK_DIR="${HOME}/Android/Sdk"
elif [[ -d "/opt/android-sdk" ]]; then
  SOURCE_SDK_DIR="/opt/android-sdk"
else
  echo "*** ERROR *** Android SDK not found. Set ANDROID_SDK_ROOT/ANDROID_HOME or install under ${HOME}/Android/Sdk."
  exit 1
fi

ACTIVE_SDK_DIR="${SOURCE_SDK_DIR}"
if [[ ! -w "${SOURCE_SDK_DIR}" ]]; then
  ACTIVE_SDK_DIR="${PWD}/.android-sdk"
  if [[ ! -d "${ACTIVE_SDK_DIR}" ]]; then
    echo "Android SDK directory is not writable (${SOURCE_SDK_DIR}), creating writable copy at ${ACTIVE_SDK_DIR}"
    mkdir -p "${ACTIVE_SDK_DIR}"
    cp -a "${SOURCE_SDK_DIR}"/. "${ACTIVE_SDK_DIR}"/
  fi
fi

export ANDROID_SDK_ROOT="${ACTIVE_SDK_DIR}"
export ANDROID_HOME="${ACTIVE_SDK_DIR}"
printf 'sdk.dir=%s\n' "${ACTIVE_SDK_DIR}" > local.properties
echo "Using ANDROID_SDK_ROOT=${ANDROID_SDK_ROOT}"

MAVEN_LOCAL_REPOSITORY="${MAVEN_LOCAL_REPOSITORY:-${PWD}/.m2/repository}"
mkdir -p "${MAVEN_LOCAL_REPOSITORY}"
export MAVEN_LOCAL_REPOSITORY
echo "Using MAVEN_LOCAL_REPOSITORY=${MAVEN_LOCAL_REPOSITORY}"

case "$target" in
  build)
    ./gradlew clean :sdk:assembleRelease
    ;;
  publish-local)
    ./gradlew -Dmaven.repo.local="${MAVEN_LOCAL_REPOSITORY}" :sdk:publishReleasePublicationToMavenLocal
    ;;
  deploy-central-api)
    if ! command -v python3 >/dev/null 2>&1; then
      echo "*** ERROR *** python3 is required for Central Publisher API deployment flow."
      exit 1
    fi

    ./gradlew -Dmaven.repo.local="${MAVEN_LOCAL_REPOSITORY}" :sdk:publishReleasePublicationToMavenLocal

    python3 scripts/central_portal_deploy.py \
      --group-id com.datalogic \
      --artifact-id datalogic-android-sdk \
      --publishing-type "${CENTRAL_PUBLISHING_TYPE:-USER_MANAGED}" \
      ${CENTRAL_DEPLOYMENT_NAME:+--deployment-name "$CENTRAL_DEPLOYMENT_NAME"} \
      --wait-seconds "${CENTRAL_WAIT_SECONDS:-900}" \
      ${CENTRAL_AUTO_PUBLISH:+--auto-publish}
    ;;
  *)
    echo "Unknown target: $target"
    echo "Valid targets: build | publish-local | deploy-central-api"
    exit 1
    ;;
esac
