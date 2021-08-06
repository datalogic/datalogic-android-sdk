package com.datalogic.device.configuration;

/**
 * Enum <code>OffChargingModePolicy</code> defines the behaviors that the device can assume 
 * while it is turned off and is being charged. These values are used by property {@link PropertyID#POWER_OFF_CHARGING_MODE_POLICY} 
 */
public enum OffChargingModePolicy {
    /**
     * Always power off.
     */
    ALWAYS_POWER_OFF,
    /**
     * Always power on when the charge threshold is reached.
     */
    ALWAYS_POWER_ON_ON_THRESHOLD,
    /**
     * Always power on when the charge threshold is reached and the device is placed in the cradle.
     */
    ALWAYS_POWER_ON_ON_THRESHOLD_WHILE_IN_CRADLE;
}
