package com.datalogic.device.configuration;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;

import android.util.Log;


/**
 * <code>PropertyGroupID</code> is the class that includes all the property group identifiers.
 *
 */
public class PropertyGroupID {
    /** @hide */
    protected final static int SCANNER_MIB_BASE = 0<<18;
    /** @hide */
    protected final static int EXTERNAL_FORMATTING_MIB_BASE = 1<<18;
    /** @hide */
    protected final static int WEDGE_MIB_BASE = 2<<18;
    /** @hide */
    protected final static int WIFI_MIB_BASE = 3<<18;
    /** @hide */
    protected final static int RF_MIB_BASE = 4<<18;
    /** @hide */
    protected final static int DNT_MIB_BASE = 5<<18;
    /** @hide */
    protected final static int POWER_MIB_BASE = 6<<18;
    /** @hide */
    protected final static int USB_MIB_BASE = 7<<18;
    /** @hide */
    protected final static int DUAL_SIM_MIB_BASE = 8<<18;
    /** @hide */
    protected final static int ETHERNET_MIB_BASE = 9<<18;
    /** @hide */
    protected final static int TOUCH_MIB_BASE = 10<<18;
    /** @hide */
    protected final static int UI_SETTINGS_MIB_BASE = 11<<18;
    /** @hide */
    protected final static int DEVELOPER_OPTIONS_MIB_BASE = 12<<18;
    /** @hide */
    protected final static int DISPLAY_MIB_BASE = 13<<18;
    /** @hide */
    protected final static int KEYBOARD_MIB_BASE = 14<<18;
    /** @hide */
    protected final static int CRADLE_MIB_BASE = 15<<18;
    /** @hide */
    protected final static int BLUETOOTH_MIB_BASE = 16<<18;
    /** @hide */
    protected final static int DEVICE_MIB_BASE = 17<<18;
    /** @hide */
    protected final static int PROFILES_MIB_BASE = 18<<18;

    /**
      * Root of the configuration tree.
      * @hide
      */
    public final static int MIB_ROOT = 0;

    /**
      * Root of the subtree of Wifi's properties.
      */
    public final static int WIFI_GROUP = WIFI_MIB_BASE;

    /**
      * Root of the subtree of the wifi module settings properties.
      */
    public final static int WIFI_MODULE_SETTINGS_GROUP = WIFI_MIB_BASE + 0x0001;
    /**
      * Root of the subtree of the wifi roaming settings properties.
      */
    public final static int WIFI_ROAMING_SETTINGS_GROUP = WIFI_MIB_BASE + 0x0002;
    /**
      * Root of the subtree of the wifi scan settings properties.
      */
    public final static int WIFI_SCAN_SETTINGS_GROUP = WIFI_MIB_BASE + 0x0003;
    /**
      * Root of the subtree of the wifi scan timings properties.
      */
    public final static int WIFI_SCAN_TIMINGS_GROUP = WIFI_MIB_BASE + 0x0004;
    
    /** Root of the subtree of Wifi's channels. */
    public final static int WIFI_CHANNELS_GROUP = WIFI_MIB_BASE +  0x0006;

    /** Root of the subtree of 2.4ghz Wifi's channels. */
    public final static int WIFI_CHANNELS_GROUP_2_4GHZ = WIFI_MIB_BASE +  0x0007;

     /** Root of the subtree of 5ghz Wifi's channels. */
     public final static int WIFI_CHANNELS_GROUP_5GHZ = WIFI_MIB_BASE +  0x0008;
    /**
      * Root of the subtree of Date and Time properties.
      */
    public final static int DATE_AND_TIME_GROUP = DNT_MIB_BASE + 0x0001;

    /**
      * Root of the subtree of Power properties.
      */
    public final static int POWER_GROUP = POWER_MIB_BASE + 0x0001;
    /**
      * Root of the subtree of Power Off Charging Mode properties.
      */
    public final static int POWER_OFF_CHARGING_MODE_GROUP = POWER_MIB_BASE + 0x0002;

    /**
      * Root of the subtree of USB properties.
      */
    public final static int USB_GROUP = USB_MIB_BASE + 0x0001;

    /**
     * Root of the subtree of ethernet properties.
     */
    public final static int ETHERNET_GROUP = ETHERNET_MIB_BASE + 0x0001;

    /**
     * Root of the subtree of the ethernet settings properties.
     */
    public final static int ETHERNET_SETTINGS_GROUP = ETHERNET_MIB_BASE + 0x0002;

    /**
      * Root of the subtree of Dual SIM properties
      */
    public final static int DUAL_SIM_GROUP = DUAL_SIM_MIB_BASE;


    /**
     * Root of the subtree of Touch Mode properties.
     */
    public static final int TOUCH_GROUP = TOUCH_MIB_BASE + 0x0001;

    /**
     * Root of the subtree of the UI Settings properties.
     */
    public static final int UI_SETTINGS_GROUP = UI_SETTINGS_MIB_BASE + 0x0001;

    /**
      * Root of the subtree of the Dual SIM properties
      */
    public static final int DUAL_SIM_MGMT_GROUP = DUAL_SIM_MIB_BASE + 0x0001;
    /**
     * Root of specific sim properties
     */
    public static final int SPECIFIC_SIM_MGMT_GROUP = DUAL_SIM_MIB_BASE + 0x0002;

    /**
      * Root of the subtree of Power Sources properties.
      */
    public final static int POWER_SOURCE_GROUP = POWER_MIB_BASE + 0x0003;
    /**
      * Root of the subtree of Wake-Up Sources properties.
      */
    public final static int POWER_WAKEUP_SOURCES_GROUP = POWER_MIB_BASE + 0x0004;
    /**
     * Root of the subtree of screen off timeout properties.
     */
    public final static int POWER_SUSPEND_TIMEOUT_GROUP = POWER_MIB_BASE + 0x0005;
    /**
     * Root of the subtree of battery charging mode properties.
     */
    public final static int POWER_CHARGING_MODE_GROUP = POWER_MIB_BASE + 0x0006;
    /**
     * Root of the subtree of the Developer Options properties.
     */
    public static final int DEVELOPER_OPTIONS_GROUP = DEVELOPER_OPTIONS_MIB_BASE + 0x0001;

    /**
     * Root of the subtree of the Display properties.
     */
    public static final int DISPLAY_GROUP = DISPLAY_MIB_BASE + 0x0001;

    /**
      * Root of the subtree of the Keyboard properties.
      */
    public static final int KEYBOARD_GROUP = KEYBOARD_MIB_BASE + 0x0001;
    /**
      * Root of the subtree of the Keyboard Triggers properties.
      */
    public static final int KEYBOARD_TRIGGERS_GROUP = KEYBOARD_MIB_BASE + 0x0002;
    /**
     * Root of the subtree of the Keyboard Advanced Settings properties.
     */
    public static final int KEYBOARD_ADVANCED_GROUP = KEYBOARD_MIB_BASE + 0x0003;

    /**
     * Root of Keyboard Push-to-Talk properties.
     */
    public static final int KEYBOARD_PTT_GROUP = KEYBOARD_MIB_BASE + 0x0004;

    /**
     * Root of Keyboard action in suspend properties.
     */
    public static final int KEYBOARD_PHYSICAL_TRIGGER_ACTION_IN_SUSPEND = KEYBOARD_MIB_BASE + 0x0005;

    /**
     * Root of the subtree of the Cradle properties.
     */
    public static final int CRADLE_GROUP = CRADLE_MIB_BASE + 0x0001;

    /**
     * Root of the subtree of the decoding properties.
     */
    public final static int SCANNER_GROUP = SCANNER_MIB_BASE + 0x0001; //don't change, zero must be the MIB_ROOT

    /**
     * Root of the subtree of the EAN 8 symbology properties.
     */
    public final static int EAN8_GROUP = SCANNER_MIB_BASE + 0x0002;
    /**
     * Root of the subtree of the CODE 39 symbology properties.
     */
    public final static int CODE39_GROUP = SCANNER_MIB_BASE + 0x0003;
    /**
     * Root of the subtree of the TRIOPTIC symbology properties.
     */
    public final static int TRIOPTIC_GROUP = SCANNER_MIB_BASE + 0x0004;
    /**
     * Root of the subtree of the CODE 32 symbology properties.
     */
    public final static int CODE32_GROUP = SCANNER_MIB_BASE + 0x0005;
    /**
     * Root of the subtree of the Discrete 2/5 symbology properties.
     */
    public final static int D25_GROUP = SCANNER_MIB_BASE + 0x0006;
    /**
     * Root of the subtree of the Matrix 2/5 symbology properties.
     */
    public final static int M25_GROUP = SCANNER_MIB_BASE + 0x0007;
    /**
     * Root of the subtree of the Interleaved 2/5 symbology properties.
     */
    public final static int I25_GROUP = SCANNER_MIB_BASE + 0x0008;
    /**
     * Root of the subtree of the Codabar symbology properties.
     */
    public final static int CODABAR_GROUP = SCANNER_MIB_BASE + 0x0009;
    /**
     * Root of the subtree of the Code 93 symbology properties.
     */
    public final static int CODE93_GROUP = SCANNER_MIB_BASE + 0x000A;
    /**
     * Root of the subtree of the Code 128 symbology properties.
     */
    public final static int CODE128_GROUP = SCANNER_MIB_BASE + 0x000B;
    /**
     * Root of the subtree of the UPC-A symbology properties.
     */
    public final static int UPCA_GROUP = SCANNER_MIB_BASE + 0x000C;
    /**
     * Root of the subtree of the UPC-E symbology properties.
     */
    public final static int UPCE_GROUP = SCANNER_MIB_BASE + 0x000D;
    /**
     * Root of the subtree of the EAN-13 symbology properties.
     */
    public final static int EAN13_GROUP = SCANNER_MIB_BASE + 0x000E;
    /**
     * Root of the subtree of the UPC/EAN Extensions symbology properties.
     */
    public final static int EAN_EXT_GROUP = SCANNER_MIB_BASE + 0x000F;
    /**
     * Root of the subtree of the UPC/EAN Options symbology properties.
     */
    public final static int UPC_EAN_GROUP = SCANNER_MIB_BASE + 0x0010;
    /**
     * Root of the subtree of the MSI symbology properties.
     */
    public final static int MSI_GROUP = SCANNER_MIB_BASE + 0x0011;
    /**
     * Root of the subtree of the RSS-14 symbology properties.
     */
    public final static int GS1_14_GROUP = SCANNER_MIB_BASE + 0x0012;
    /**
     * Root of the subtree of the RSS Limited symbology properties.
     */
    public final static int GS1_LIMIT_GROUP = SCANNER_MIB_BASE + 0x0013;
    /**
     * Root of the subtree of the RSS Expanded symbology properties.
     */
    public final static int GS1_EXP_GROUP = SCANNER_MIB_BASE + 0x0014;
    /**
     * Root of the subtree of the Postal Code symbology properties.
     */
    public final static int POSTAL_GROUP = SCANNER_MIB_BASE + 0x0015;
    /**
     * Root of the subtree of the PDF417 symbology properties.
     */
    public final static int PDF417_GROUP = SCANNER_MIB_BASE + 0x0016;
    /**
     * Root of the subtree of the Micro PDF417 symbology properties.
     */
    public final static int MICROPDF417_GROUP = SCANNER_MIB_BASE + 0x0017;
    /**
     * Root of the subtree of the UCC EAN Composite symbology properties.
     */
    public final static int COMPOSITE_GROUP = SCANNER_MIB_BASE + 0x0018;
    /**
     * Root of the subtree of the DataMatrix symbology properties.
     */
    public final static int DATAMATRIX_GROUP = SCANNER_MIB_BASE + 0x0019;
    /**
     * Root of the subtree of the MaxiCode symbology properties.
     */
    public final static int MAXICODE_GROUP = SCANNER_MIB_BASE + 0x001A;
    /**
     * Root of the subtree of the QR Code symbology properties.
     */
    public final static int QRCODE_GROUP = SCANNER_MIB_BASE + 0x001B;
    /**
     * Root of the subtree of the Micro QR Code symbology properties.
     */
    public final static int MICRO_QRCODE_GROUP = SCANNER_MIB_BASE + 0x001C;
    /**
     * Root of the subtree of the Aztec Code symbology properties.
     */
    public final static int AZTEC_GROUP = SCANNER_MIB_BASE + 0x001D;
    /**
     * Root of the subtree of the Digimarc Barcode symbology properties.
     */
    public final static int DIGIMARC_GROUP = SCANNER_MIB_BASE + 0x001E;
    /**
     * Root of the subtree of the DotCode symbology properties.
     */
    public final static int DOTCODE_GROUP = SCANNER_MIB_BASE + 0x001F;
    /**
     * Root of the subtree of the ISBT 128 symbology properties.
     */
    public final static int ISBT_128_GROUP = SCANNER_MIB_BASE + 0x0020;

    /**
     * Root of the subtree of the 1D symbologies.
     */
    public final static int s1D_GROUP = SCANNER_MIB_BASE + 0x0021;
    /**
     * Root of the subtree of the 2D symbologies.
     */
    public final static int s2D_GROUP = SCANNER_MIB_BASE + 0x0022;

     /**
     * Root of the subtree of the properties that configure the UPC/EAN Extensions.
     */
    public final static int UPC_EAN_EXT_GROUP = SCANNER_MIB_BASE + 0x0023;

     /**
     * Root of the subtree of the properties that configure the admitted quiet zones for the supported linear symbologies. 
     */
    public final static int LINEAR_QUITE_ZONE_GROUP = SCANNER_MIB_BASE + 0x0024;

     /**
     * Root of the subtree of the properties that configure the notification to produce on a successful read. 
     */
    public final static int DECODING_NOTIFICATION_GROUP = SCANNER_MIB_BASE + 0x0025;

    /**
     * Root of the subtree of the properties that configure the Display Notification capability via a displaying message. 
     * This means that the decoded label is displayed through a pop-up message, an Android Toast, on the device's screen.  
     */
    public final static int DISPLAY_NOTIFICATION_GROUP = SCANNER_MIB_BASE + 0x0026;

    /**
     * Root of the subtree of the properties that configure the Decode Wedge capability with the keystroke mode. 
     */
    public final static int KEYBOARD_WEDGE_GROUP = SCANNER_MIB_BASE + 0x0027;

    /**
     * Root of the subtree of the properties that configure the barcode text formatting. 
     */
    public final static int FORMATTING_GROUP = SCANNER_MIB_BASE + 0x0028;

    /**
     * Root of the subtree of the properties that configure the scanner to capture, store and provide frames. 
     */
    public final static int FRAME_CAPTURE_CONFIGURATION_GROUP = SCANNER_MIB_BASE + 0x0029;

    /**
     * Root of the subtree of the properties that configure which type of notification is activated on a successful read.
     */
    public final static int GOOD_READ_GROUP = SCANNER_MIB_BASE + 0x002A;

    /**
     * Root of the subtree of the properties that configure the inverse mode for the supported 1D and 2D symbologies.
     */
    public final static int INVERSE_GROUP = SCANNER_MIB_BASE + 0x002B;

    /**
     * Root of the subtree of the properties that configure the Multi Scan functionality. 
     * This functionality allows to collect a defined number of barcodes in a single session and transmit them at the same time.
     */    
    public final static int MULTISCAN_GROUP = SCANNER_MIB_BASE + 0x002C;
    /**
     * Root of the subtree of the properties that configure presentation mode functionality.
     */
    public final static int PRESENTATION_MODE_GROUP = SCANNER_MIB_BASE + 0x002D;

    /**
     * Root of the subtree of the properties that configure the scanner target beam and other scanner functionalities.
     */
    public final static int SCANNER_OPTIONS_GROUP = SCANNER_MIB_BASE + 0x002E;

    /**
     * Root of the subtree of the GS1 symbology properties.
     */
    public final static int GS1_GROUP = SCANNER_MIB_BASE + 0x002F;

    /**
     * Root of the subtree of the GS1 Code 128 symbology properties.
     */
    public final static int GS1_128_GROUP = SCANNER_MIB_BASE + 0x0030;


    /**
     * Root of the subtree of the Austarlian Postal Code symbology properties.
     */
    public final static int POSTAL_AUSTRALIAN_GROUP = SCANNER_MIB_BASE + 0x0031;
    /**
     * Root of the subtree of the Japan Postal Code symbology properties.
     */
    public final static int POSTAL_JAPAN_GROUP = SCANNER_MIB_BASE + 0x0032;
    /**
     * Root of the subtree of the KIX Postal Code symbology properties.
     */
    public final static int POSTAL_KIX_GROUP = SCANNER_MIB_BASE + 0x0033;
    /**
     * Root of the subtree of the Royal Mail Postal Code symbology properties.
     */
    public final static int POSTAL_ROYAL_MAIL_GROUP = SCANNER_MIB_BASE + 0x0034;
    /**
     * Root of the subtree of the US Planet Postal Code symbology properties.
     */
    public final static int POSTAL_US_PLANET_GROUP = SCANNER_MIB_BASE + 0x0035;
    /**
     * Root of the subtree of the US Postnet Postal Code symbology properties.
     */
    public final static int POSTAL_US_POSTNET_GROUP = SCANNER_MIB_BASE + 0x0036;
    /**
     * Root of the subtree of the USPS 4 State Postal Code symbology properties.
     */
    public final static int POSTAL_USPS_4STATE_GROUP = SCANNER_MIB_BASE + 0x0037;

    /**
     * Root of the subtree of the symbologies.
     */
    public final static int SYMBOLOGIES_GROUP = SCANNER_MIB_BASE + 0x0038;

    /**
     * Root of the subtree of the OCR properties.
     */
    public final static int OCR_GROUP = SCANNER_MIB_BASE + 0x0039;
    /**
     * Root of the subtree of the Han Xin Barcode symbology properties
     */
    public final static int HAN_XIN_GROUP = SCANNER_MIB_BASE + 0x003A;
    /**
     * Root of the subtree of the TLC39 Barcode symbology properties
     */
    public final static int TLC39_GROUP = SCANNER_MIB_BASE + 0x003C;
    /**
     * Root of the subtree of the Standard Formatting properties
     */
    public final static int STANDARD_FORMATTING_GROUP = SCANNER_MIB_BASE + 0x003B;
    /**
     * Root of the subtree of the Input Selection properties
     */
    public final static int INPUT_SELECTION_GROUP = SCANNER_MIB_BASE + 0x0040;
    /**
     * Root of the subtree of the properties that configure the barcode injection from an External Scanner Source.
     */
    public final static int EXT_SCANNER_SOURCE_GROUP = SCANNER_MIB_BASE + 0x0041;
    /**
     * Root of the subtree of External Formatter Group's properties.
     */
    public final static int EXTERNAL_FORMATTING_GROUP = EXTERNAL_FORMATTING_MIB_BASE + 0x0001;
    /**
     * Root of the subtree of Wedge - Keyboard Group's properties.
     */
    public final static int WEDGE_GROUP = WEDGE_MIB_BASE + 0x0002;

    /**
     * Root of the subtree of RF's properties.
     */
    public final static int RF_GROUP = RF_MIB_BASE + 0x0001;

    /**
     * Root of the subtree of Device Information's properties.
     */
    public final static int DEVICE_INFO_GROUP = DEVICE_MIB_BASE + 0x0001;
    
    /**
     * Root of the subtree of policies' management properties.
     */
    public final static int PROFILES_GROUP = PROFILES_MIB_BASE + 0x0001;
    /**
     * Root of the subtree of bluetooth's properties.
     */
    public final static int BLUETOOTH_GROUP = BLUETOOTH_MIB_BASE;

    /**
     * @hide
     * The constructor is defined hide and private to avoid Apps create an instance of this class.
     */
    private PropertyGroupID() {}
}
