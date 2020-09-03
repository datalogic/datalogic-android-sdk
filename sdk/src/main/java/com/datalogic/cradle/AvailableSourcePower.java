package com.datalogic.cradle;

/**
 * Enumerative representing the Cradle Available Source Power Level depending on the cradle configuration.
 */
public enum AvailableSourcePower
{
    /**
     * Unknown Cradle charging level.
     */
    AVAILABLE_SOURCE_POWER_LEVEL_UNKNOWN,
    /**
     * Cradle Type or Device don't support this information.
     */
    AVAILABLE_SOURCE_POWER_NOT_SUPPORTED,
    /**
     * Cradle are charging the device with 5 watt.
     */
    AVAILABLE_SOURCE_POWER_5_WATT,
    /**
     * Cradle are charging the device with 10 watt.
     */
    AVAILABLE_SOURCE_POWER_10_WATT,
    /**
     * Cradle are charging the device with 15 watt.
     */
    AVAILABLE_SOURCE_POWER_15_WATT;

    /**
     * Converts the AvailableSourcePower enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding AvailableSourcePower value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return AvailableSourcePower the corresponding one.
     * */
    public static AvailableSourcePower fromInt(int n)
    {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
