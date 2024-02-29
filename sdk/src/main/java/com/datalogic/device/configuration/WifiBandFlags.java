package com.datalogic.device.configuration;

/*
* The <code>WifiBandFlags</code> defines the Wi-Fi bands that the device can use.
* When one band is disabled, the device won’t transmit anything on that band.
*/
public class WifiBandFlags {
    /**
     * 2.4 Ghz band.
     */
    public final static int FLAG_24_GHZ = 1;
    /**
     * 5 Ghz band.
     */
    public final static int FLAG_5_GHZ = 2;
    /**
     * 6 Ghz band.
     */
    public final static int FLAG_6_GHZ = 4;

    /**
     * @hide
     */
    public WifiBandFlags() {}
}
