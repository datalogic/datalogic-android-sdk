package com.datalogic.device;



/**
 * Enumerative representing the battery charging profile.
 */
public enum BatteryChargingProfile
{

    /**
     * Charging profile with charging speed only preference.
     */
    CHARGING_PROFILE_CHARGING_SPEED(1),
    /**
     * Charging profile with capacity only preference.
     */
    CHARGING_PROFILE_CAPACITY(2),
    /**
     * Charging profile with charging speed and capacity preference.
     */
    CHARGING_PROFILE_CHARGING_SPEED_CAPACITY(3),
    /**
     * Charging profile with lifetime only preference.
    */
    CHARGING_PROFILE_LIFETIME(4),
    /**
     * Charging profile with charging speed and lifetime preference.
     */
    CHARGING_PROFILE_CHARGING_SPEED_LIFETIME(5),
    /**
     * Charging profile with capacity and lifetime preference.
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
