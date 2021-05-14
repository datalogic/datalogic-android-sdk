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
    protected final static int DECODE_MIB_BASE = 0<<18;
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

    /**
      * Root of the configuration tree.
      * @hide
      */
    public final static int MIB_ROOT = 0;

    /**
      * Root of the subtree of Wifi's properties.
      */
    public final static int WIFI_GROUP = WIFI_MIB_BASE + 0x0001;
    /**
      * Root of the subtree of the wifi module settings properties.
      */
    public final static int MODULE_SETTINGS_GROUP = WIFI_MIB_BASE + 0x0001;
    /**
      * Root of the subtree of the wifi roaming settings properties.
      */
    public final static int ROAMING_SETTINGS_GROUP = WIFI_MIB_BASE + 0x0002;
    /**
      * Root of the subtree of the wifi scan settings properties.
      */
    public final static int SCAN_SETTINGS_GROUP = WIFI_MIB_BASE + 0x0003;
    /**
      * Root of the subtree of the wifi scan timings properties.
      */
    public final static int SCAN_TIMINGS_GROUP = WIFI_MIB_BASE + 0x0004;

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

}