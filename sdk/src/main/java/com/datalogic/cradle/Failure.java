package com.datalogic.cradle;

/**
 * This enum lists failures managed by the Cradle.
 */
public enum Failure
{
    /**
     * No failure was detected.
     */
    FAILURE_UNKNOWN,
    /**
     * There is some metal object which prevents a successful wireless
     * charge power transmission between the cradle and the device.
     */
    FAILURE_WLC_FOD,
    /**
     * The slot's lever is not in the correct position.
     */
    FAILURE_BAD_LEVER_POSITION,
    /**
     * The device asked for an "end of power transmission" for too long.
     */
    FAILURE_WLC_EOC_TIMEOUT,
    /**
     * The Cradle is experiencing a problem on WLC's TX and
     * it cannot power to the device.
     */
    FAILURE_WLC_TX,
    /**
     * The locking solenoid is too hot and the lever cannot be
     * controlled until temperature will be reduced.
     */
    FAILURE_SOLENOID_OVERTEMPERATURE,
    /**
     * The current cradle's daisy chain configuration is not allowed.
     */
    FAILURE_WRONG_DAISY_CHAIN_CONFIG,
    /**
     * General failure was detected.
     */
    FAILURE_GENERAL,
    /**
     * The locking solenoid is too hot and the lever cannot be
     * controlled until temperature will be reduced.
     */
    FAILURE_SOLENOID,
    /**
     * The Cradle is experiencing a problem on the charger.
     */
    FAILURE_CHARGER,
    /**
     * The Cradle is experiencing a problem on the battery authentication.
     */
    FAILURE_SPARE_BATTERY_AUTH,
    /**
     * The Cradle is experiencing a problem on the battery eeprom.
     */
    FAILURE_SPARE_BATTERY_EEPROM,
    /**
     * The Cradle is experiencing a problem on the battery status.
     */
    FAILURE_SPARE_BATTERY_DEAD,
    /**
     * The Cradle is experiencing a general problem on the wlc.
     */
    FAILURE_WLC_GENERAL,
    /**
     * The Cradle is experiencing a problem with lever calibration
     */
    FAILURE_LEVER_NOT_CALIBRATED,
    /**
     * The Cradle is experiencing a problem on its internal charging system
     */
    FAILURE_DEVICE_NOT_CHARGING,
    /**
     * The cradle's internal flash is corrupted.
     */
    FAILURE_FLASH_CORRUPTED,
    /**
     * The cradle's pogo pins are in thermal protection.
     */
    FAILURE_THERMAL_PROTECTION_POGO;

    /**
     * Converts the Failure enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding Failure value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Failure the corresponding one.
     * */
    public static Failure fromInt(int n)
    {
        return FAILURE_UNKNOWN;
    }

    @Override
    public String toString() {
        return null;
    }
};
