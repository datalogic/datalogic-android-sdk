package com.datalogic.device.configuration;

/**
 * The <code>NfcHostListenerTechFlags</code> defines bitmask flags representing NFC RF technology protocols.
 */
public class NfcHostListenerTechFlags {
    /** Flag for NFC-A (ISO 14443-3A) technology.*/
    public static final int FLAG_ISO_TECH_A = 1;

    /** Flag for NFC-B (ISO 14443-3B) technology. */
    public static final int FLAG_ISO_TECH_B = 2;

    /** Flag for NFC-F technology, also known as Type 3 Tag (T3T).*/
    public static final int FLAG_T3T_TYPE_TECH_F = 4;
}
