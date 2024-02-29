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
     * This profile allows the device to be charged faster delivering more current and reducing the maximum capacity level.<br/>
     * Increasing charge current could stress the battery reducing battery lifespan in the longterm.<br/>
     * Charging device partially instead has the advantage of preserve battery health in the longterm.
     */
    public static final int CHARGING_PROFILE_CHARGING_SPEED = 1;

    /**
     * This profile allows to fully charge the device to maximum battery capacity.<br/>
     * Increasing charge current and fully charge the device could stress the battery and affect negatively its health in the longterm.
     */
    public static final int CHARGING_PROFILE_CAPACITY = 2;

    /**
     * This profile allows the device to be fully charge faster delivering more current.<br/>
     * Fully charging the device could affect negatively battery health in the longterm.
     */
    public static final int CHARGING_PROFILE_CHARGING_SPEED_CAPACITY = 3;

    /**
     * This profile charges the device reducing the maximum capacity level.<br/>
     * Charging device partially has the advantage of preserve battery health in the longterm.
     */
    public static final int CHARGING_PROFILE_LIFETIME = 4;

    /**
     * This profile optimizes battery lifetime and allows the device to be charge faster delivering more current.<br/>
     * Fully charging the device could affect negatively battery health in the longterm.<br/> 
     * This profile damages battery less than the other speed profiles.
     */
    public static final int CHARGING_PROFILE_CHARGING_SPEED_LIFETIME = 5;

    /**
     * This profile optimizes battery lifetime and fully charges the device to maximum battery capacity.<br/>
     * Fully charging the device could affect negatively battery health in the longterm.
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
