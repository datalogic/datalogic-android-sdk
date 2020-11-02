package com.datalogic.device.display;

import java.util.List;
import com.datalogic.device.ErrorManager;

/**
 * <b>2nd Display</b> is the LED display panel on the top of Datalogic Memor20 device, near to the ScanEngine.
 * It allows to show incoming call and App notifications. The <code>DLSecondDisplayManager</code> allows 
 * to configure and manage the 2nd Display, in order to enable/disable the whole feature or to restrict 
 * only to allowed Apps to show notifications on 2nd Display.
 * <p>
 * In order to show a notification on the 2nd Display, an App shall be allowed with {@link DLSecondDisplayManager#addPackage},
 * that adds the given installed App in the list of allowed Apps. After that, when that App sends an Android notification,
 * it will be shown on 2nd Display. The {@link DLSecondDisplayManager#removePackage}, on the contrary,
 * allows to remove an installed App from the list of allowed Apps. 
 * By default, all installed Apps are allowed to show notifications on 2nd Display.
 * So, the {@link DLSecondDisplayManager#setNewAppEnabled} API allows to change the default behavior
 * for the Apps installed at a later stage, while the current configuration for the installed Apps is preserved.
 * <p>
 * Android documentation
 * <a href="https://developer.android.com/training/notify-user/build-notification">Create a Notification</a> and
 * <a href="https://developer.android.com/training/notify-user/channels">Create and Manage Notification Channels</a>
 * provide helpful information to create and manage notifications.
 * <p>
 * Moreover, to have a better understanding of 2nd Display and notification management, the
 * <a href="https://github.com/datalogic/android-samples-astudio/tree/master/Java/SecondDisplaySampleAPI">2nd Display Sample</a>
 * is highly recommended. 
 */
public final class DLSecondDisplayManager
{
    /**
     * @hide
     * This is the constructor of DLSecondDisplayManager.
     * 
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    private DLSecondDisplayManager() {}

    /**
     * Returns an instance of the {@link DLSecondDisplayManager}.
     * This method provides the reference to the unique instance of
     * 2nd Display Manager.
     *
     * @return
     *         The 2nd Display Manager.
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public static DLSecondDisplayManager getInstance()
    {
        return null;
    }

    /**
     * Returns the availability of the 2nd Display feature.
     * This method can be used to know if the device supports the 
     * 2nd Display feature.
     *
     * @return <code>boolean</code>
     *         True if the device supports the 2nd Display, False otherwise,
     *          or throws an<code>Exception</code> in case of failure.
     */
    public boolean isSecondDisplayAvailable()
    {
        return false;
    }

    /**
     * Returns the enabled/disabled status of the 2nd Display.
     * This method can be used to know the current enabled/disabled
     * status of the whole 2nd Display feature. When 2nd Display is enabled,
     * it works according to its configuration.
     *
     * @return <code>boolean</code>
     *         True if the 2nd Display is enabled, False otherwise.
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean isSecondDisplayEnabled()
    {
        return false;
    }

    /**
     * Enables or disables the 2nd Display.
     * This method can be used to enable or disable the whole 2nd Display feature.
     *
     * @param enable
     *         True to enable the 2nd Display, False to disable it.
     *
     * @return <code>boolean</code>
     *         True if the operation complete successfully, False otherwise.
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean setSecondDisplayEnabled(boolean enable)
    {
        return false;
    }

    /**
     * Allows a package to show its own content on the 2nd Display.
     * This method allows Android notifications sent by the given package 
     * to be shown on the 2nd Display.
     *
     * @param packageName
     *         Name of the package to be added to the list of packages allowed to show notifications on the 2nd display.
     *
     * @return <code>boolean</code>
     *         True if the operation complete successfully, False otherwise (eg. package not found).
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean addPackage(String packageName)
    {
        return false;
    }

    /**
     * Returns the allowed/disallowed configuration for the given package to show its own content ont the 2nd Display.
     * This method can be used to check if Android notifications sent by the given package 
     * are allowed or disallowed to be shown on the 2nd Display.
     *
     * @param packageName
     *         Name of the package to be checked.
     *
     * @return <code>boolean</code>
     *         True if the package is allowed, False otherwise (eg. package not found).
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean isPackageAllowed(String packageName)
    {
        return false;
    }

    /**
     * Disable the given package to show its own content on the 2nd Display.
     * This method disallows Android notifications sent by the given package 
     * to be shown on the 2nd Display.
     *
     * @param packageName
     *         Name of the package to be removed to the list of packages allowed to show notifications on the 2nd display.
     *
     * @return <code>boolean</code>
     *         True if the operation complete successfully, False otherwise (eg. package not found).
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean removePackage(String packageName)
    {
        return false;
    }

    /**
     * Returns the list of allowed packages to show own Android notifications on the 2nd Display.
     *
     * @return List<String>
     *         List of allowed packages, passed as Strings.
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */    
    public List<String> getAllowedPackages()
    {
        return null;
    }

    /** 
     * Enable or disable notifications on 2nd display for all the new Apps
     *  
     * @param isEnabled
     *         Boolean parameter that represents if new Apps should show notifications on 2nd display
     * 
     * @return <code>boolean</code>
     *         True if Apps can show notification, false otherwise.
     * 
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     * 
     */
    public boolean setNewAppEnabled(boolean isEnabled)
    {
        return false;
    }

    /**
     * Return a boolean value that represents if new Apps will show notifications on 2nd display 
     * 
     * @return <code>boolean</code>
     *         True if Apps can show notification, false otherwise.
     * 
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */ 
    public boolean getNewAppEnabled()
    {
        return false;
    }

    /** 
     * Set brightness level on 2nd display 
     *
     * @param brightness
     *         Brightness percentage level for 2nd display: Values lower than 0 or higher than 100 will be cropped respectevely to 0 and 100.
     * 
     * @return <code>boolean</code>
     *         True if Apps can show notification, false otherwise.
     *  
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean setBrightness(int brightness)
    {
	return false;
    }

    /**
     * Return an integer value that represents the brightness percentage level on 2nd display 
     * 
     * @return integer
     *         Integer value that represents the brightness percentage level on 2nd display, -1 in case of error.
     * 
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */ 
    public int getBrightness()
    {
	return 0;
    }

    /** 
     * Set rotation on 2nd display 
     * 
     * @param enable
     *         Boolean parameter that represents if rotation is enabled on 2nd display
     *
     * @return <code>boolean</code>
     *         True if Apps can set rotation, false otherwise.
     *  
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean setRotateEnabled(boolean enable)
    {
	return false;
    }

    /**
     * Return a boolean value that represents if rotation is enabled on 2nd display 
     * 
     * @return <code>boolean</code>
     *         Boolean value that represents if rotation is enabled on 2nd display.
     * 
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */ 
    public boolean getRotateEnabled()
    {
	return false;
    }

    /**
     * Set switch-off timeout on 2nd display 
     * 
     * @param timeout
     *         Enum that represents 2nd display rotation speed.
     *
     * @return <code>boolean</code>
     *         True if Apps can set the switch-off timeout, false otherwise.
     *  
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean setSwitchOffTimeout(TimeoutSleep timeout)
    {
	return false;
    }

    /**
     * Return an enum that represents 2nd display switch-off timeout
     * 
     * @return enum
     *         enum value that represents 2nd display switch-off timeout, null in case of error.
     * 
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */ 
    public TimeoutSleep getSwitchOffTimeout()
    {
	return null;
    }

    /**
     * Set 2nd display rotation speed 
     *
     * @param speed
     *         Enum that represents the desired 2nd display rotation speed.
     *
     * @return <code>boolean</code>
     *         True if Apps can set the rotation speed, false otherwise.
     *  
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean setRotationSpeed(RotationSpeed speed)
    {
	return false;
    }

    /**
     * Return an enum that represents 2nd display rotation speed
     * 
     * @return enum
     *         Enum that represents 2nd display rotation speed, null in case of error.
     * 
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */ 
    public RotationSpeed getRotationSpeed()
    {
	return null;
    }	
 }
