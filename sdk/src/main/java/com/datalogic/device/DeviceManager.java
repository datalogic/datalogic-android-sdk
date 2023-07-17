package com.datalogic.device;

/**
 * This class provides access to control several device options.
 */
public final class DeviceManager
{

    /**
     * @hide
     * This is the constructor of DeviceManager.
     * 
     * @throws DeviceException in case of error.
     */
    private DeviceManager() {}

    /**
     * Returns an instance of the {@link DeviceManager}.
     *
     * @return
     *         The Device Manager.
     */
    public static DeviceManager getInstance()
    {
        return null;
    }
    
    /**
     * Retrieves the current policy for Cradle firmware updates, when a firmware
     * is avalable in the device.
     *
     * @return
     *         The {@link FirmwareUpdatePolicy} current required for Cradle firmware updates.
     */
    public FirmwareUpdatePolicy getFirmwareUpdatePolicy()
    {
        return FirmwareUpdatePolicy.FIRMWARE_UPDATE_POLICY_UNKNOWN;
    }

    /**
     * Sets the policy required to update the Cradle firmware, when a firmware
     * is avalable in the device.
     *
     * @param policy
     *            The required {@link FirmwareUpdatePolicy} to update the Cradle firmware.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    public boolean setFirmwareUpdatePolicy(FirmwareUpdatePolicy policy)
    {
        return false;
    }

    /**
     * Enable or disable the cradle failure event
     *
     * @param enable The required boolean for Cradle failure event.
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    public boolean enableCradleFailureEvent(boolean enable) 
    {        
        return false;
    }
}
