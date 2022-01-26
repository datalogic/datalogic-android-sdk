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
     * The method works in best effort. If almost one of the requested permissions is not granted an error is returned.
     * In case of error to check which permissions are granted use
     * <a href="https://developer.android.com/reference/android/content/pm/PackageManager#getPackageInfo(android.content.pm.VersionedPackage,%20int)">PackageManger.getPackageInfo(String packageName, int flags)</a>
     * with the flag
     * <a href="https://developer.android.com/reference/android/content/pm/PackageManager#GET_PERMISSIONS">PackageManager#GET_PERMISSIONS</a>
     * to get the PackageInfo of the application with the permissions information.
     *
     * @param packageName
     *            <code>String</code> The application to grant permissions to.
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
     * The method works in best effort. If almost one of the requested permissions is not granted an error is returned.
     * In case of error to check which permissions are granted use
     * <a href="https://developer.android.com/reference/android/content/pm/PackageManager#getPackageInfo(android.content.pm.VersionedPackage,%20int)">PackageManger.getPackageInfo(String packageName, int flags)</a>
     * with the flag
     * <a href="https://developer.android.com/reference/android/content/pm/PackageManager#GET_PERMISSIONS">PackageManager#GET_PERMISSIONS</a>
     * to get the PackageInfo of the application with the permissions information.
     *
     * @param packageName
     *            <code>String</code> The application to grant permissions to.
     * @param permissions
     *            <code>ArrayList<String></code> The list of permissions to be granted.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int grantPermissions(String packageName, ArrayList<String>permissions) {
        return 0;
	}

    /**
     * Call this method to revoke an application the specified permissions. <br>
     * <br>
     * The method works in best effort. If almost one of the requested permissions is not revoked an error is returned.
     * In case of error to check which permissions are revoked use
     * <a href="https://developer.android.com/reference/android/content/pm/PackageManager#getPackageInfo(android.content.pm.VersionedPackage,%20int)">PackageManger.getPackageInfo(String packageName, int flags)</a>
     * with the flag
     * <a href="https://developer.android.com/reference/android/content/pm/PackageManager#GET_PERMISSIONS">PackageManager#GET_PERMISSIONS</a>
     * to get the PackageInfo of the application with the permissions information.
     *
     *
     * @param packageName
     *            <code>String</code> The application to revoke permissions to.
     * @param permissions
     *            <code>ArrayList<String></code> The list of permissions to be revoked.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int revokePermissions(String packageName, ArrayList<String>permissions) {
        return 0;
    }

    /**
     * Call this method to stop an application. <br>
     * <br>
     *
     * @param packageName
     *            <code>String</code> The package name of the application to be force stopped.
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
    *            <code>String</code> The package name of the application to enable.
    * @param newState
    *            <code>int</code> The new enabled state for the application.
    * @param flags
    *            <code>int</code >Optional behaviour flags.
    * Value is either 0 or a combination of android.content.pm.PackageManager#DONT_KILL_APP and
    * android.content.pm.PackageManager#SYNCHRONOUS. Not expected values in combinationation with these are ignored.
    * See for more details the Android documentation
    * <a href="https://developer.android.com/reference/android/content/pm/PackageManager#setApplicationEnabledSetting(java.lang.String,%20int,%20int)">PackageManager.setApplicationEnabledSetting(String packageName, int newState, int flags)</a>.
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
   *            <code>String</code> The name of the package to change.
   * @param uninstallBlocked
   *            <code>boolean</code> True if the user shouldn't be able to uninstall the package.
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
   * If the package is already hide/unhide the method returns  {@link AppManagerException#GENERIC_ERROR}.
   * @param packageName
   *            <code>String</code> The name of the package to hide or unhide.
   * @param hidden
   *            <code>boolean</code> True if the package should be hidden, false if it should be unhidden.
   * @return <code>int</code>
   *            {@link AppManagerException#SUCCESS} in case of success,
   * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
   * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
   */
   public int setApplicationHidden(String packageName, boolean hidden) {
       return 0;
   }

    /**
     * Call this method to place the given application package on the device's power allowlist. <br>
     * <br>
     * @param packageName
     *            <code>String</code>The name of the package to be added to the device's power allowlist.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int addBatteryOptimizationExemption(String packageName) {
        return 0;
    }


    /**
     * Call this method to remove the given application package from the device's power allowlist. <br>
     * <br>
     * @param packageName
     *            <code>String</code>The name of the package to be removed from the device's power allowlist.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int removeBatteryOptimizationExemption(String packageName) {
        return 0;
    }

    /**
     * Call this method to disable or enable the status bar. <br>
     * Disabling the status bar blocks notifications and quick settings. 
     * <br>
     * @param disabled
     *            <code>boolean</code> True disables the status bar, false reenables it.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int setStatusBarDisabled(boolean disabled) {
        return 0;
    }

}
