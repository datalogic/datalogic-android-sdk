package com.datalogic.device.battery;

/**
 * Enumerative representing the battery events.
 */
public enum BatteryEvent
{
    /**
     * Unknown Battery Event from.
     */
    BATTERY_SWAP_EVENT_UNKNOWN,
    /**
     * Batter Swap begin event.
     */
    BATTERY_SWAP_EVENT_BEGIN,
    /**
     * Batter Swap end event.
     */
    BATTERY_SWAP_EVENT_END;

    /**
     * Converts the BatteryEvent enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding BatteryEvent value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return BatteryEvent the corresponding one.
     * */
    public static BatteryEvent fromInt(int n)
    {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
