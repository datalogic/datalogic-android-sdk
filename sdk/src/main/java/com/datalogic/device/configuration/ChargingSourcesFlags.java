package com.datalogic.device.configuration;

/**
 * The <code>ChargingSourcesFlags</code> defines device charging source.
 */
public class ChargingSourcesFlags {
    /**
     * Cradle Wired
     */
    public final static int FLAG_WIRED_CRADLE = 1;
    /**
     * Datalogic wireless cradle
     */
    public final static int FLAG_DATALOGIC_WIRELESS_CRADLE = 2;
    /**
     * Other wireless chargers
     */
    public final static int FLAG_OTHER_WIRELESS_CRADLE = 4;
    /**
     * USB charging
     */
    public final static int FLAG_USB = 8;

    /**
     * @hide
     */
    public ChargingSourcesFlags() {}
}
