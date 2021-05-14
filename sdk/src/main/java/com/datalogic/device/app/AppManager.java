package com.datalogic.device.app;


import android.content.Context;
import java.util.ArrayList;
import com.datalogic.device.ErrorManager;


/**
 * <code>AppManager</code> gives developers the ability to manage installed apllications.
 * <p>
 */
public class AppManager {

	/**
	* This is the constructor of AppManager.
	* @param context
	*            <code>Context</code>
	*			 The context of the calling app.
    * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	*/
	public AppManager(Context context) {
 
    }

    /**
     * Call this method to grant an application all the permissions declared in its manifest. <br>
     * <br>
     *
     * @param packageName
     *            <code>String</code>The application to grant permissions to.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int grantAllPermissions(String packageName) {
        return 0;
	}

    /**
     * Call this method to grant an application the specified permissions. <br>
     * <br>
     *
     * @param packageName
     *            <code>String</code>he application to grant permissions to.
     * @param permissions
     *            <code>ArrayList<String></code> list of permissions to be granted.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int grantPermissions(String packageName, ArrayList<String>permissions) {
        return 0;
	}

    /**
     * Call this method to stop an application. <br>
     * <br>
     *
     * @param packageName
     *            <code>String</code>The package name of the application to be force stopped.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int forceStopPackage(String packageName) {
        return 0;
    }

   /**
    * Call this method to set the enable setting for an application. <br>
    * <br>
    *
    * @param packageName
    *            <code>String</code>The package name of the application to enable.
    * @param newState
    *            <code>int</code>The new enabled state for the application.
    * @param flags
    *            <code>int</code>Optional behaviour flags.
    * Value is either 0 or a combination of android.content.pm.PackageManager#DONT_KILL_APP and
    * android.content.pm.PackageManager#SYNCHRONOUS.
    * @return <code>int</code>
    *            {@link AppManagerException#SUCCESS} in case of success,
    * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
    * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
    */
    public int setApplicationEnabledSetting (String packageName, int newState, int flags) {
        return 0;
    }

  /**
   * Change whether a user can uninstalling a package. <br>
   * <br>
   *
   * @param packageName
   *            <code>String</code>The name of the package to change.
   * @param uninstallBlocked
   *            <code>boolean</code>True if the user shouldn't be able to uninstall the package.
   * @return <code>int</code>
   *            {@link AppManagerException#SUCCESS} in case of success,
   * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
   * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
   */
   public int setUninstallBlocked(String packageName, boolean uninstallBlocked) {
       return 0;
   }

  /**
   * Call this method to hide or unhide packages. <br>
   * <br>
   *
   * @param packageName
   *            <code>String</code>The name of the package to hide or unhide.
   * @param hidden
   *            <code>boolean</code>True if the package should be hidden, false if it should be unhidden.
   * @return <code>int</code>
   *            {@link AppManagerException#SUCCESS} in case of success,
   * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
   * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
   */
   public int setApplicationHidden(String packageName, boolean hidden) {
       return 0;
   }

}