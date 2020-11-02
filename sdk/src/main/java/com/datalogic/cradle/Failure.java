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
     * The slot's lever is not in the correct position. 
     */
    FAILURE_BAD_LEVER_POSITION,
    /**
     * There is some metal object which prevents a successful wireless
     * charge power transmission between the cradle and the device.
     */
    FAILURE_WLC_FOD,
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
    FAILURE_WRONG_DAISY_CHAIN_CONFIG;

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
