package com.datalogic.device;

/**
 * Enumerative representing the Policy to update the Cradle Firmware.
 */
public enum FirmwareUpdatePolicy
{
    /**
     * Unknown firmware update policy.
     */
    FIRMWARE_UPDATE_POLICY_UNKNOWN,
    /**
     * Firmware update policy not supported.
     */
    FIRMWARE_UPDATE_POLICY_NOT_SUPPORTED,
    /**
     * Firmware update feature is disabled.
     */
    FIRMWARE_UPDATE_POLICY_DISABLED,
    /**
     * A notification is shown to the user if a firmware update is available.
     */
    FIRMWARE_UPDATE_POLICY_USER_NOTIFICATION,
    /**
     * Firmware update is automatically performed only if a newer firmware
     * compared with the current installed in the Cradle is available in the device.
     */
    FIRMWARE_UPDATE_POLICY_ONLY_IF_NEWER_AVAILABLE;

    /**
     * Converts the FirmwareUpdatePolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding FirmwareUpdatePolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static FirmwareUpdatePolicy fromInt(int n)
    {
        return FIRMWARE_UPDATE_POLICY_UNKNOWN;
    }
}
