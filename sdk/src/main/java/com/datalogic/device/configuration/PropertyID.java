package com.datalogic.device.configuration;


import com.datalogic.device.configuration.PropertyGroupID;
import com.datalogic.device.configuration.*;
/**
 * <code>PropertyID</code> is the class that includes all the properties
 * identifiers.<br>
 * The {@link Property}s are organized in a tree. The {@link Property}s are the leaves while the intermediate nodes are the {@link PropertyGroup}s.<br>
 * A property is uniquely identified by its {@link PropertyID}.<br>
 * A property group is uniquely identified by its {@link PropertyGroupID}.<br>
 * In the following all the property group identifiers and all the property identiers are listed in a manner resembling the hierarchical tree of the corresponding {@link PropertyGroup}s and {@link Property}s. <br>
 * Each property group identifier (red squared bullet) is followed by:
 * <ul>
 * <li> the {@link PropertyID} (black circular bullet) of the properties contained in its group
 * <li> the {@link PropertyGroupID}s (red squared bullet) of the property groups contained in its group
 * </ul>
 * <ul>
 *     <li style="color:red" type="square"> {@link PropertyGroupID#WIFI_GROUP}
 *         <ul>
 *         <li style="color:red" type="square"> {@link PropertyGroupID#MODULE_SETTINGS_GROUP}
 *             <ul>
 *                 <li style="color:black" type="circle"> {@link #WIFI_802_DOT_11_MODE} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_BAND_SELECTION} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_POWER_SAVE} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_VERBOSE_WIFI_MODULE_LOG} </li>
 *             </ul>
 *         </li>
 *         <li style="color:red" type="square"> {@link PropertyGroupID#ROAMING_SETTINGS_GROUP}
 *             <ul>
 *                 <li style="color:black" type="circle"> {@link #WIFI_ROAMING_PROFILE} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_ROAMING_RSSI_THRESHOLD} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_ROAMING_RSSI_DIFFERENCE} </li>
 *             </ul>
 *         </li>
 *         <li style="color:red" type="square"> {@link PropertyGroupID#SCAN_SETTINGS_GROUP}
 *             <ul>
 *                 <li style="color:red" type="square"> {@link PropertyGroupID#SCAN_TIMINGS_GROUP}
 *                     <ul>
 *                         <li style="color:black" type="circle"> {@link #WIFI_SCAN_INTERVAL} </li>
 *                         <li style="color:black" type="circle"> {@link #WIFI_SCAN_INTERVAL_MAX} </li>
 *                         <li style="color:black" type="circle"> {@link #WIFI_CONNECTED_SCAN_INTERVAL} </li>
 *                         <li style="color:black" type="circle"> {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX} </li>
 *                     </ul>
 *                 </li>
 *             </ul>
 *         </li>
 *         </ul>
 *     </li>
 *     <li style="color:red" type="square"> {@link PropertyGroupID#DATE_AND_TIME_GROUP}
 *         <ul>
 *            <li style="color:black" type="circle"> {@link #DATE_AND_TIME_AUTO_TIME} </li>
 *            <li style="color:black" type="circle"> {@link #DATE_AND_TIME_AUTO_TIME_ZONE} </li>
 *            <li style="color:black" type="circle"> {@link #DATE_AND_TIME_TIMEZONE_ID} </li>
 *            <li style="color:black" type="circle"> {@link #DATE_AND_TIME_TIME_24H_FORMAT} </li>
 *            <li style="color:black" type="circle"> {@link #DATE_AND_TIME_NTP_SERVER} </li>
 *            <li style="color:black" type="circle"> {@link #DATE_AND_TIME_NTP_SERVER_2} </li>
 *            <li style="color:black" type="circle"> {@link #DATE_AND_TIME_NTP_TIMEOUT} </li>
 *         </ul>
 *     </li>
 *     <li style="color:red" type="square"> {@link PropertyGroupID#POWER_GROUP}
 *         <ul>
 *            <li style="color:red" type="square"> {@link PropertyGroupID#POWER_OFF_CHARGING_MODE_GROUP}
 *               <ul>
 *                  <li style="color:black" type="circle"> {@link #POWER_OFF_CHARGING_MODE_THRESHOLD} </li>
 *                  <li style="color:black" type="circle"> {@link #POWER_OFF_CHARGING_MODE_POLICY} </li>
 *               </ul>
 *            </li>
 *         </ul>
 *     </li>
 *     <li style="color:red" type="square"> {@link PropertyGroupID#USB_GROUP}
 *         <ul>
 *            <li style="color:black" type="circle"> {@link #USB_DEFAULT_FUNCTION} </li>
 *            <li style="color:black" type="circle"> {@link #USB_CURRENT_FUNCTION} </li>
 *         </ul>
 *     </li>
 * </ul>
 */
public class PropertyID {
    //
    // WIFI Settings definitions
    //
    public final static int WIFI_UNKNOWN = PropertyGroupID.WIFI_MIB_BASE + 0;
    /**
      * Interval between scans when the device is on and disconnected.
      * Scan interval and Scan interval max control the Wi-Fi scan intervals when the device has the screen on and
      * it is not connected to any Wi-Fi network. The scans are issued in this way: the first scan is done when
      * the device is woken up from a standby state, then the next scans are done in an exponential backoff fashion.
      * The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on, until it reaches
      * the maximum value.
      */
    public final static int WIFI_SCAN_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0001;
    /**
      * Maximum interval between scans when the device is on and disconnected.
      * Scan interval and Scan interval max control the Wi-Fi scan intervals when the device has the screen on and
      * it is not connected to any Wi-Fi network. The scans are issued in this way: the first scan is done when
      * the device is woken up from a standby state, then the next scans are done in an exponential backoff fashion.
      * The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on, until it reaches
      * the maximum value.
      */
    public final static int WIFI_SCAN_INTERVAL_MAX = PropertyGroupID.WIFI_MIB_BASE + 0x0002;
    /**
      * Interval between scans when the device is on and connected.
      * Connected scan interval and Connected scan interval max control the Wi-Fi scan intervals when the device
      * has the screen on and it is connected to any Wi-Fi network. The scans are issued in this way: the first
      * scan is done when the device is woken up from a standby state, then the next scans are done in an exponential
      * backoff fashion. The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on,
      * until it reaches the maximum.
      */
    public final static int WIFI_CONNECTED_SCAN_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0003;
    /**
      * Maximum interval between scans when the device is on and connected.
      * Connected scan interval and Connected scan interval max control the Wi-Fi scan intervals when the device
      * has the screen on and it is connected to any Wi-Fi network. The scans are issued in this way: the first scan
      * is done when the device is woken up from a standby state, then the next scans are done in an exponential
      * backoff fashion. The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on,
      * until it reaches the maximum value.
      */
    public final static int WIFI_CONNECTED_SCAN_INTERVAL_MAX = PropertyGroupID.WIFI_MIB_BASE + 0x0004;
    /**
      * Selects the 802.11 mode to be used (b/g/n/a/ac).
      * This parameter controls the 802.11 mode the device will be using. {@link Wifi802Dot11Mode}
      */
    public final static int WIFI_802_DOT_11_MODE = PropertyGroupID.WIFI_MIB_BASE + 0x000D;
    /**
      * Selects the band used by the device (2.4/5 GHz).
      * This parameter controls the band the device will be using.
      * When one band is disabled, the device won’t transmit anything on that band. {@link WifiBandSelection}
      */
    public final static int WIFI_BAND_SELECTION = PropertyGroupID.WIFI_MIB_BASE + 0x000E;
    /**
      * Selects the power saving mode used.
      * This parameter enables the power save mode and controls which kind of power save is used.
      * The default value is QPower enabled (2), if you notice a degradation in the VoIP call performance
      * increase the value to 5. {@link WifiPowerSave}
      */
    public final static int WIFI_POWER_SAVE = PropertyGroupID.WIFI_MIB_BASE + 0x000F;
    /**
      * Enables the verbose Wi-Fi module logging.
      * This parameter enables/disables a more verbose Wi-Fi module logging.
      */
    public final static int WIFI_VERBOSE_WIFI_MODULE_LOG = PropertyGroupID.WIFI_MIB_BASE + 0x0012;
    /**
      * Signal threshold for triggering the roaming background scan.
      * This parameter controls the signal threshold for triggering the roaming procedure.
      * When the access point signal drops under the threshold, the device will begin scanning
      * in background for suitable networks to roam to.
      */
    public final static int WIFI_ROAMING_RSSI_THRESHOLD = PropertyGroupID.WIFI_MIB_BASE + 0x0013;
    /**
      * Signal difference between the current AP and the target AP for roaming.
      * This parameter controls the signal difference between the current access point the device
      * is connected to and the target access point the device wants to roam to.
      * If the target AP signal is higher than the current by at least the value of this parameter,
      * the device will roam.
      */
    public final static int WIFI_ROAMING_RSSI_DIFFERENCE = PropertyGroupID.WIFI_MIB_BASE + 0x0014;
    /**
      * Enables roaming profiles.
      * A roaming profile can be one of four presets: standard, aggressive, slow and custom.
      * Each preset should have a direct impact on the Roaming RSSI Threshold and Difference, and those settings should not
      * be editable if any preset other than custom is selected. 
      */
    public final static int WIFI_ROAMING_PROFILE = PropertyGroupID.WIFI_MIB_BASE + 0x001A;

    //
    //
    // DateAndTime Settings definitions
    //
    public final static int DATE_AND_TIME_UNKNOWN = PropertyGroupID.DNT_MIB_BASE + 0;
    /** 
      * Value to specify if the user prefers the date, time and time zone to be automatically fetched from the network (NITZ). 
      */
    public final static int DATE_AND_TIME_AUTO_TIME = PropertyGroupID.DNT_MIB_BASE + 0x0001;
    /** 
      * Value to specify if the user prefers the time zone to be automatically fetched from the network (NITZ) 
      */
    public final static int DATE_AND_TIME_AUTO_TIME_ZONE = PropertyGroupID.DNT_MIB_BASE + 0x0002;
    /** 
      *  Sets the system's persistent default time zone.
      *  The id must be one of the Olson ids from the list returned by TimeZone.getAvailableIDs().
      *  <p>
      *     Android documentation
      *     <a href="https://developer.android.com/reference/java/util/TimeZone">Timezone</a> 
      *     provide helpful information about time zone IDs.
      *  <p>
      */
    public final static int DATE_AND_TIME_TIMEZONE_ID = PropertyGroupID.DNT_MIB_BASE + 0x0003;
    /**
      * Display times in 24H format, if false display times in 12H format.
      */
    public final static int DATE_AND_TIME_TIME_24H_FORMAT = PropertyGroupID.DNT_MIB_BASE + 0x0004;
    /**
      * Primary NTP server address that will be used if DATE_AND_TIME_AUTO_TIME is enabled.
      */
    public final static int DATE_AND_TIME_NTP_SERVER = PropertyGroupID.DNT_MIB_BASE + 0x0005;
    /**
      * Secondary NTP server address that will be used if DATE_AND_TIME_NTP_SERVER is not reacheable and DATE_AND_TIME_AUTO_TIME is enabled.
      */
    public final static int DATE_AND_TIME_NTP_SERVER_2 = PropertyGroupID.DNT_MIB_BASE + 0x0006;
    /**
      * NTP server connection timeout expressed in milliseconds
      */
    public final static int DATE_AND_TIME_NTP_TIMEOUT = PropertyGroupID.DNT_MIB_BASE + 0x0007;

    //
    // Power Settings definitions
    //
    /** 
      * The charging threshold (%) for automatic exit from charging mode
      */
    public final static int POWER_OFF_CHARGING_MODE_THRESHOLD = PropertyGroupID.POWER_MIB_BASE + 0x0001;
    /** 
      * Policy for automatic exit from charging mode
      */
    public final static int POWER_OFF_CHARGING_MODE_POLICY = PropertyGroupID.POWER_MIB_BASE + 0x0002;

    //
    // USB Settings definitions
    //
    /**
     * Default USB data function is the USB Transfer Protocol setup every time a USB is plugged-in to the device.
     */
    public final static int USB_DEFAULT_FUNCTION = PropertyGroupID.USB_MIB_BASE + 0x0002;
    /**
     * Current USB data function is the USB Transfer Protocol used to change the Default USB data function 
     * just for the current USB transfer (until the USB will be plugged-out from the device). 
     * When the USB will be plugged-out, then USB will be plugged-in again, 
     * the Default USB data function is used for setup new USB transfer.
     */
    public final static int USB_CURRENT_FUNCTION = PropertyGroupID.USB_MIB_BASE + 0x0003;

}
