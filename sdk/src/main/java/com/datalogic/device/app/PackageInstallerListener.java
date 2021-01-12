package com.datalogic.device.app;
import java.util.List;
/**
 * This interface is used by the application to listen to install/uninstall/upgrade
 * result event.
 */

public interface PackageInstallerListener {

    /**
     * onResult will be called to signal the result of the commands install/uninstall/upgrade executed in a session or as standolone command. <br>
     * When the commands are submitted in a session the results in the List have the same order of the commands in the session. <br>
     * In any case the fields event and data of PackageInstallerResult allow the identification of the command. <br>
     *
     * @param results {@link PackageInstallerResult}
     *          <code>List<PackageInstallerResult></code> result of the commands <br>
     * 			e.g: <br>
     *				 results[0] = {event = INSTALL_TERMINATED, data = "/dir1/dir11/dir116/pkg1.apk", result = InstallerException.SUCCESS} <br>
     *				 results[1] = {event = UNINSTALL_TERMINATED, data = "com.android.helloandroid", result = InstallerException.SUCCESS}
     *
     */
	public void onResult(List<PackageInstallerResult> results);
}
