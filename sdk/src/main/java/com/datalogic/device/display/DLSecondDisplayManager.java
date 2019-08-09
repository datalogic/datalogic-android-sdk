package com.datalogic.device.display;

import com.datalogic.device.ErrorManager;

/**
 * The <code>DLSecondDisplayManager</code> allows to configure and manage the 2nd Display.
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
     *         True is the 2nd Display is enabled, False otherwise.
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean isSecondDisplayEnabled()
    {
        return false;
    }

    /**
     * Enables or disables the 2nd Display.
     * This method can be to enable or disable the whole 2nd Display feature.
     *
     * @param enable
     *         True to enable the 2nd Display, False to disable it.
     *
     * @return <code>boolean</code>
     *         True is the operation complete successfully, False otherwise.
     *
     * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean setSecondDisplayEnabled(boolean enable)
    {
        return false;
    }
}
