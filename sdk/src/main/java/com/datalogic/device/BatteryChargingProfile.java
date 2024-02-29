package com.datalogic.device;



/**
 * Enumerative representing the battery charging profile.
 */
public enum BatteryChargingProfile
{

    /**
     * This profile allows the device to be charged faster delivering more current and reducing the maximum capacity level.<br/>
     * Increasing charge current could stress the battery reducing battery lifespan in the longterm.<br/>
     * Charging device partially instead has the advantage of preserve battery health in the longterm.
     */
    CHARGING_PROFILE_CHARGING_SPEED(1),
    /**
     * This profile allows to fully charge the device to maximum battery capacity.<br/>
     * Increasing charge current and fully charge the device could stress the battery and affect negativley its health in the longterm.
     */
    CHARGING_PROFILE_CAPACITY(2),
    /**
     * This profile allows the device to be fully charge faster delivering more current.<br/>
     * Fully charging the device could affect negativley battery health in the longterm.
     */
    CHARGING_PROFILE_CHARGING_SPEED_CAPACITY(3),
    /**
     * This profile charges the device reducing the maximum capacity level.<br/>
     * Charging device partially has the advantage of preserve battery health in the longterm.
     */
    CHARGING_PROFILE_LIFETIME(4),
    /**
     * This profile optimizes battery lifetime and allows the device to be charge faster delivering more current.<br/>
     * Fully charging the device could affect negativley battery health in the longterm.<br/> 
     * This profile damages battery less than the other speed profiles.
     */
    CHARGING_PROFILE_CHARGING_SPEED_LIFETIME(5),
    /**
     * This profile optimizes battery lifetime and fully charges the device to maximum battery capacity.<br/>
     * Fully charging the device could affect negativley battery health in the longterm.
     */
    CHARGING_PROFILE_CAPACITY_LIFETIME(6);

    /**
     * Internal use.
     *  @hide
     */
    private BatteryChargingProfile(int type_number)
    {      
    }

     /**
     * Converts the UnlockPolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding UnlockPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static BatteryChargingProfile fromInt(int n)
    {

        return CHARGING_PROFILE_CHARGING_SPEED;
    }
}
