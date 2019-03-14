package com.datalogic.device.battery;

/**
 * The <code>ChargingProfile</code> represents a charging profile used by the {@link DLBatteryManager} to manage the charging preferences.
 * This class can be used to setup a different charging preference, to retrieve the current charging
 * preference or retrieve the available charging preferences.
 * Charging preference is a device independent concept, but the settings of each charging profile
 * are device dependent and their details are hidden to the programmer.
 */
public class ChargingProfile
{
    /**
     * Charging profile with charging speed only preference.
     */
    public static final int CHARGING_PROFILE_CHARGING_SPEED = 1;

    /**
     * Charging profile with capacity only preference.
     */
    public static final int CHARGING_PROFILE_CAPACITY = 2;

    /**
     * Charging profile with charging speed and capacity preference.
     */
    public static final int CHARGING_PROFILE_CHARGING_SPEED_CAPACITY = 3;

    /**
     * Charging profile with lifetime only preference.
     */
    public static final int CHARGING_PROFILE_LIFETIME = 4;

    /**
     * Charging profile with charging speed and lifetime preference.
     */
    public static final int CHARGING_PROFILE_CHARGING_SPEED_LIFETIME = 5;

    /**
     * Charging profile with capacity and lifetime preference.
     */
    public static final int CHARGING_PROFILE_CAPACITY_LIFETIME = 6;

    /**
     * Returns the charging profile ID.
     *
     * @return <code>int</code>
     *         The charging profile ID.
     */
    public int getId()
    {
        return 0;
    }

    /**
     * Returns the charging profile name.
     *
     * @return <code>String</code>
     *         The charging profile name.
     */
    public String getName()
    {
        return null;
    }

    /**
     * Returns the description of this charging profile.
     *
     * @return <code>String</code>
     *         The description of this charging profile.
     */
    public String getDescription()
    {
        return null;
    }
}
