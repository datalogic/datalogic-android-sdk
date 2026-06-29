package com.datalogic.device.configuration;

/**
 * The <code>NfcTagDispatchBlockFlags</code> defines the categories of NFC tags that could be blocked.
 */
public class NfcTagDispatchBlockFlags {
    /** Block automatic Bluetooth pairing via NFC handover (BT Classic + BLE). */
    public static final int FLAG_BT_HANDOVER = 1;

    /** Block automatic WiFi network configuration via WPS (WiFi Simple Configuration). */
    public static final int FLAG_WIFI_WPS = 2;

    /** Block Android Application Record dispatch (app launch / Play Store redirect). */
    public static final int FLAG_NDEF_AAR = 4;

    /** Block NDEF web URL dispatch (http:// and https:// schemes). */
    public static final int FLAG_NDEF_WEB = 8;

    /** Block NDEF URI dispatch for non-web schemes (tel:, mailto:, geo:, sms:, etc.). */
    public static final int FLAG_NDEF_URI = 16;

    /** Block NDEF MIME type dispatch (text/vcard, text/plain, etc.). */
    public static final int FLAG_NDEF_MIME = 32;

    /** Block tech-based dispatch ({@code ACTION_TECH_DISCOVERED}). */
    public static final int FLAG_TECH = 64;

    /** Block generic tag fallback dispatch ({@code ACTION_TAG_DISCOVERED}). */
    public static final int FLAG_TAG = 128;

}