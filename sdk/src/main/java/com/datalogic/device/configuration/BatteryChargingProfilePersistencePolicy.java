package com.datalogic.device.configuration;

/**
 * Enum {@link BatteryChargingProfilePersistencePolicy} defines the policies for applying the battery
 * charging profile used by the property {@link PropertyID#POWER_BATTERY_CHARGING_PROFILE_PERSISTENCE_POLICY}.
 */
public enum BatteryChargingProfilePersistencePolicy {

    /**
     * Undefined property. This values is used internally when property
     * BATTERY_CHARGING_PROFILE_PERSISTENCE is not defined for the device.
     * @hide
     */
    UNDEFINED(0),
    /**
     * Persistence is set by device: the battery will be charged according to the profile stored by the device.
     * So, when the user changes the battery, the new battery will be configured to be charged with that profile, the same of the previous battery.
     */
    SET_BY_DEVICE(1),
	/**
     * Persistence is set by battery: the battery will be charged according to the profile stored in the battery memory.
     * So, when the user changes the battery, the new battery will not be re-configured by the device. That profile could be different to the one used by other batteries.
     */
    SET_BY_BATTERY(2);

    /**
     * Internal use.
     *  @hide
     */
    BatteryChargingProfilePersistencePolicy(int id) {
        return;
    }

    /**
     * Retrieves the corresponding BatteryChargingProfilePersistencePolicy value, from a valid integer.
     *
     * @param id
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static BatteryChargingProfilePersistencePolicy fromInt(int id){
        return UNDEFINED;
    }

    /**
     * Retrieves the corresponding int value.
     *
     * @return int
     * */
    public int toInt(){
        return 0;
    }
}
