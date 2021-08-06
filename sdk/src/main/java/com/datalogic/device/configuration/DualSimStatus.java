package com.datalogic.device.configuration;

/**
 * Enum <code>DualSimStatus</code> defines the Dual SIM settings for SIM Cards availability.
 * These are the allowed values for the property {@link PropertyID#DUALSIM_AVAILABLE}.
 */
public enum DualSimStatus {

    /**
     * No SIM Card available
     */
    NONE,
    /**
     * Only SIM Card 1 available
     */
    SIM1,
    /**
     * Only SIM Card 2 available
     */
    SIM2,
    /**
     * Both SIM Card 1 and SIM Card 2 available
     */
    BOTH;
}
