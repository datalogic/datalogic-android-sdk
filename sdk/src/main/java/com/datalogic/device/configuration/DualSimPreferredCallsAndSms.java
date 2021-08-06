package com.datalogic.device.configuration;

/**
 * Enum <code>DualSimPreferredCallsAndSms</code> defines the Dual SIM settings for voice calls and SMS.
 */
public enum DualSimPreferredCallsAndSms {

    /**
     * Used to prompt the user to select which SIM card shall be used
     */
    ASK,
    /**
     * SIM card 1 as preferred SIM for voice calls and SMS.
     */
    SIM1,
    /**
     * SIM card 2 as preferred SIM for voice calls and SMS.
     */
    SIM2;
}
