package com.datalogic.device.app;

import android.content.Context;
import java.util.ArrayList;
import com.datalogic.device.ErrorManager;
import java.util.List;
import android.app.NotificationChannel;

/**
 * <code>AppManager</code> gives developers the ability to manage installed applications.
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
     * Call this method to enable/disable the notifications of the given application. <br>
     * <br>
     * @param packageName
     *            <code>String</code>The package of the application for which to enable/disable notifications.
     * @param enabled
     *            <code>boolean</code>True to enable notifications, false to disable.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int setNotificationsEnabledForPackage(String packageName, boolean enabled) {
        return 0;
    }



    /**
     * Call this method to grant an application all the <a href="https://developer.android.com/guide/topics/permissions/overview#runtime">runtime permissions</a> declared in its manifest. <br>
     * If the application is a system application the method fails and returns the exception {@link AppManagerException#SECURITY_ERROR} or the corresponding error.
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
     * Call this method to grant an application the specified <a href="https://developer.android.com/guide/topics/permissions/overview#runtime">runtime permissions</a>. <br>
     * If the application is a system application the method fails and returns the exception {@link AppManagerException#SECURITY_ERROR} or the corresponding error.
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
     * Call this method to revoke an application the specified <a href="https://developer.android.com/guide/topics/permissions/overview#runtime">runtime permissions</a>. <br>
     * If the application is a system application the method fails and returns the exception {@link AppManagerException#SECURITY_ERROR} or the corresponding error.
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
    *            <code>int</code> Optional behaviour flags.
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
     *            <code>String</code> The name of the package to be added to the device's power allowlist.
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
     *            <code>String</code> The name of the package to be removed from the device's power allowlist.
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

    /**
     * Call this method to get the list of <a href="https://developer.android.com/reference/android/app/NotificationChannel">NotificationChannel</a> defined by a given application. <br>
     * This method is usefull to know the <a href="https://developer.android.com/reference/android/app/NotificationChannel#getId()">NotificationChannel identifier</a> to be used in {@link #enableNotificationChannels}.
     * <br>
     * <a href="https://developer.android.com/reference/android/app/NotificationChannel#getName()">NotificationChannel name</a> is the name, localized, used as label to show the NotificationChannel on the Android Settings..
     * <br>
     * @param packageName
     *            <code>String</code> The package name of the application whose <a href="https://developer.android.com/reference/android/app/NotificationChannel">NotificationChannel</a> is given back.
     * @param notificationChannels
     *            <code>List<<a href="https://developer.android.com/reference/android/app/NotificationChannel">NotificationChannel</a>></code> <br> Call the method passing an empty list. In output the list will contains the <a href="https://developer.android.com/reference/android/app/NotificationChannel">NotificationChannel</a>s defined by the given app.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int getNotificationChannels(String packageName, List<NotificationChannel> notificationChannels) {
        return 0;
    }

    /**
     * Enables or disables a <a href="https://developer.android.com/reference/android/app/NotificationChannel">NotificationChannel</a> for a specified application.
     * <p>
     * The NotificationChannel is identified using its Android <a href="https://developer.android.com/reference/android/app/NotificationChannel#getId()">identifier</a>.
     * </p>
     * <p>
     * Regular expressions can be used to enable or disable multiple notification channels and/or applications in a single call:
     * </p>
     * <ul>
     *   <li>To target all notification channels of a specific app, use the regular expression: <code>"^(?:[\\w ]*)$"</code>.</li>
     *   <li>To target all installed apps, use the regular expression: <code>"^[a-zA-Z_][\\w]*(\\.[a-zA-Z_][\\w]*)*$"</code>.</li>
     * </ul>
     * <br>
     * <br>
     * <p><b>Examples:</b></p>
     * <ul>
     *   <li>Disable all NotificationChannels of the Clock app:
     *     <pre>
     *     AppManager appManager = new AppManager(this);
     *     int result = appManager.enableNotificationChannels("com.google.android.deskclock", "^(?:[\\w ]*)$", false);
     *     </pre>
     *   </li>
     *   <li>Disable specific NotificationChannels (e.g., Bedtime, Timers, Firing alarms & timers, Missed alarms) of the Clock app:
     *     <pre>
     *     AppManager appManager = new AppManager(this);
     *     int result = appManager.enableNotificationChannels("com.google.android.deskclock", "^(?:Bedtime|Timers|Firing|Missed Alarms)$", false);
     *     </pre>
     *   </li>
     *   <li>Retrieve NotificationChannel identifiers for Clock app:
     *     <pre>
     *     AppManager appManager = new AppManager(this);
     *     List<NotificationChannel> channels = new ArrayList<>();
     *     int result = appManager.getNotificationChannels("com.google.android.deskclock", channels);
     *     for (NotificationChannel channel : channels) {
     *         Log.d(TAG, "channel=" + channel.getId());
     *     }
     *     </pre>
     *   </li>
     *   <li>Disable all NotificationChannels for all apps:
     *     <pre>
     *     AppManager appManager = new AppManager(this);
     *     int result = appManager.enableNotificationChannels("^[a-zA-Z_][\\w]*(\\.[a-zA-Z_][\\w]*)*$", "^(?:[\\w ]*)$", false);
     *     </pre>
     *   </li>
     * </ul>
     *
     * @param packageName
     *            <code>String</code> A regular expression matching the package names of the applications whose NotificationChannels are to be enabled/disabled.
     * @param notificationChannels
     *            <code>String</code> A regular expression matching the identifiers of the NotificationChannels to be enabled/disabled.
     * @param enabled
     *            <code>boolean</code> Set to <code>false</code> to disable the notification channels, or <code>true</code> to enable them with their original importance.
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} if successful, or an error code matching one of the {@link AppManagerException} constants.
     * @throws AppManagerException if an error occurs and exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int enableNotificationChannels(String packageName, String notificationChannels, boolean enabled) {
        return 0;
    }

    /**
     * Call this method to set the mode of the specified <a href="https://developer.android.com/guide/topics/permissions/overview#special">app-ops permissions</a> of a given application. <br>
     * If the application is a system application the method fails and returns the exception {@link AppManagerException#SECURITY_ERROR} or the corresponding error.
     * <br>
     *
     * @param packageName
     *            <code>String</code>The application to grant permissions to.  If the application is a system application the method fails.
     * @param permissions
     *            <code>ArrayList<String></code> The list of app-ops permissions to be set.
     * @param mode
     *            <code>int</code> <br>
     * <a href="https://developer.android.com/reference/android/app/AppOpsManager#MODE_ALLOWED">AppOpsManager.MODE_ALLOWED</a>: the given application is allowed to perform the given operation. <br>
     * <a href="https://developer.android.com/reference/android/app/AppOpsManager#MODE_IGNORED">AppOpsManager.MODE_IGNORED</a>: the given application not allowed to perform the given operation, and the attempt should silently
     * fail (it should not cause the app to crash). <br>
     * <a href="https://developer.android.com/reference/android/app/AppOpsManager#MODE_ERRORED">AppOpsManager.MODE_ERRORED</a>: the given application not allowed to perform the given operation, and the attempt should cause it to have a fatal error. <br>
     * @return <code>int</code>
     *            {@link AppManagerException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link AppManagerException} error constants.
     * @throws AppManagerException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int setModeAppOps(String packageName, List<String> permissions, int mode) {
        return 0;
    }

}
