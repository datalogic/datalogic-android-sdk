package com.datalogic.device.configuration;

/**
 * Enum <code>WifiRoamingProfile</code> defines the Roaming profiles that can be used for settings property {@link PropertyID#WIFI_ROAMING_PROFILE}
 */
public enum WifiRoamingProfile {
    /**
     * Slow Roaming profile.
     */
    SLOW,
    /**
     * Standard Roaming profile.
     */
    STANDARD,
    /**
     * Agressive Roaming profile.
     */
    AGGRESSIVE,
    /**
    * Custom Roaming profile: the values of the Roaming settings will be applied unsing the values of Roaming RSSI Threshold 
    * and Roaming RSSI Difference settings.
    */
    CUSTOM,
    /**
     * Legacy Roaming profile.
     */
    LEGACY;
}
