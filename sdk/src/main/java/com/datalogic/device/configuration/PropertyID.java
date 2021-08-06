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
 *         <li style="color:red" type="square"> {@link PropertyGroupID#WIFI_MODULE_SETTINGS_GROUP}
 *             <ul>
 *                 <li style="color:black" type="circle"> {@link #WIFI_802_DOT_11_MODE} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_BAND_SELECTION} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_POWER_SAVE} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_VERBOSE_WIFI_MODULE_LOG} </li>
 *                 <li style="color:red" type="square"> {@link PropertyGroupID#WIFI_CHANNELS_GROUP}
 *                     <ul>
 *                         <li style="color:black" type="circle"> {@link #WIFI_COUNTRY_CODE} </li>
 *                         <li style="color:black" type="circle"> {@link #WIFI_UNLOCK_CHANNELS} </li>
 *                         <li style="color:red" type="square"> {@link PropertyGroupID#WIFI_CHANNELS_GROUP_2_4GHZ}
 *                             <ul>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_1} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_2} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_3} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_4} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_5} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_6} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_7} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_8} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_9} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_10} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_11} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_12} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_13} </li>
 *                             </ul>
 *                         <li style="color:red" type="square"> {@link PropertyGroupID#WIFI_CHANNELS_GROUP_5GHZ}
 *                             <ul>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_36} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_40} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_44} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_48} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_52} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_56} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_60} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_64} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_100} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_104} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_108} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_112} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_116} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_120} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_124} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_128} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_132} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_136} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_140} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_144} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_149} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_153} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_157} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_161} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_165} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_169} </li>
 *                                 <li style="color:black" type="circle"> {@link #WIFI_CHANNEL_173} </li>
 *                             </ul>
 *                     </ul>
 *             </ul>
 *         </li>
 *         <li style="color:red" type="square"> {@link PropertyGroupID#WIFI_ROAMING_SETTINGS_GROUP}
 *             <ul>
 *                 <li style="color:black" type="circle"> {@link #WIFI_ROAMING_PROFILE} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_ROAMING_RSSI_THRESHOLD} </li>
 *                 <li style="color:black" type="circle"> {@link #WIFI_ROAMING_RSSI_DIFFERENCE} </li>
 *             </ul>
 *         </li>
 *         <li style="color:red" type="square"> {@link PropertyGroupID#WIFI_SCAN_SETTINGS_GROUP}
 *             <ul>
 *                 <li style="color:red" type="square"> {@link PropertyGroupID#WIFI_SCAN_TIMINGS_GROUP}
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
 *     <li style="color:red" type="square"> {@link PropertyGroupID#DUAL_SIM_GROUP}
 *         <ul>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_AVAILABLE} </li>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_SIM1_ENABLE} </li>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_SIM2_ENABLE} </li>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_CURRENT_DATA} </li>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_CURRENT_CALLS} </li>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_CURRENT_SMS} </li>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_PREFERRED_DATA} </li>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_PREFERRED_CALLS} </li>
 *            <li style="color:black" type="circle"> {@link #DUALSIM_PREFERRED_SMS} </li>
 *         </ul>
 *     </li>
 * </ul>
 */
public class PropertyID {
   /**
     * @hide
     * WIFI Settings definitions
     */
    public final static int WIFI_UNKNOWN = PropertyGroupID.WIFI_MIB_BASE + 0;
    /**
      * Interval between scans when the device is on and disconnected.
      * Scan interval and Scan interval max control the Wi-Fi scan intervals when the device has the screen on and
      * it is not connected to any Wi-Fi network. The scans are issued in this way: the first scan is done when
      * the device is woken up from a standby state, then the next scans are done in an exponential backoff fashion.
      * The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on, until it reaches
      * the maximum value defined by {@link #WIFI_SCAN_INTERVAL_MAX}.
      */
    public final static int WIFI_SCAN_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0001;
    /**
      * Maximum interval between scans when the device is on and disconnected.
      * Scan interval and Scan interval max control the Wi-Fi scan intervals when the device has the screen on and
      * it is not connected to any Wi-Fi network. The scans are issued in this way: the first scan is done when
      * the device is woken up from a standby state, then the next scans are done in an exponential backoff fashion.
      * The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on, until it reaches
      * the maximum value defined by {@link #WIFI_SCAN_INTERVAL_MAX}.
      */
    public final static int WIFI_SCAN_INTERVAL_MAX = PropertyGroupID.WIFI_MIB_BASE + 0x0002;
    /**
      * Interval between scans when the device is on and connected.
      * Connected scan interval and Connected scan interval max control the Wi-Fi scan intervals when the device
      * has the screen on and it is connected to any Wi-Fi network. The scans are issued in this way: the first
      * scan is done when the device is woken up from a standby state, then the next scans are done in an exponential
      * backoff fashion. The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on,
      * until it reaches the maximum defined by {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX}.
      */
    public final static int WIFI_CONNECTED_SCAN_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0003;
    /**
      * Maximum interval between scans when the device is on and connected.
      * Connected scan interval and Connected scan interval max control the Wi-Fi scan intervals when the device
      * has the screen on and it is connected to any Wi-Fi network. The scans are issued in this way: the first scan
      * is done when the device is woken up from a standby state, then the next scans are done in an exponential
      * backoff fashion. The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on,
      * until it reaches the maximum value defined by {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX}.
      */
    public final static int WIFI_CONNECTED_SCAN_INTERVAL_MAX = PropertyGroupID.WIFI_MIB_BASE + 0x0004;
    /**
      * Selects the 802.11 mode to be used (b/g/n/a/ac).
      * This parameter controls the 802.11 mode the device will be using.
      * The allowed values for this property are defined by enum {@link Wifi802Dot11Mode}
      */
    public final static int WIFI_802_DOT_11_MODE = PropertyGroupID.WIFI_MIB_BASE + 0x000D;
    /**
      * Selects the band used by the device (2.4/5 GHz).
      * This parameter controls the band the device will be using.
      * When one band is disabled, the device won’t transmit anything on that band.
      * The allowed values for this property are defined by enum {@link WifiBandSelection}
      */
    public final static int WIFI_BAND_SELECTION = PropertyGroupID.WIFI_MIB_BASE + 0x000E;
    /**
      * Selects the power saving mode used.
      * This parameter enables the power save mode and controls which kind of power save is used.
      * The allowed values for this property are defined by enum {@link WifiPowerSave}.
      * The default value is set to {@link WifiPowerSave#WIFI_POWER_SAVE_ENABLED}, if you notice a degradation in the VoIP call performance
      * change the value to {WifiPowerSave#WIFI_POWER_SAVE_ENABLED_VOIP_CALLS}.
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
      * The allowed values for this property are defined by enum {@link WifiRoamingProfile}.
      */
    public final static int WIFI_ROAMING_PROFILE = PropertyGroupID.WIFI_MIB_BASE + 0x001A;
    /**
      * @hide
      * This parameters controls the channels that will be disabled on the device.
      * When a channel is disabled, the device won’t be able to communicate on that specific channel
      * and thus won’t see any AP using that channel.
      */
    private final static int WIFI_CHANNEL_BASE = PropertyGroupID.WIFI_MIB_BASE + 0x001B;
    /**
      * This parameters controls the Channels 1 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_1 = WIFI_CHANNEL_BASE + 0x0001;
    /**
      * This parameters controls the Channels 2 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_2 = WIFI_CHANNEL_BASE + 0x0002;
    /**
      * This parameters controls the Channels 3 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_3 = WIFI_CHANNEL_BASE + 0x0003;
    /**
      * This parameters controls the Channels 4 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_4 = WIFI_CHANNEL_BASE + 0x0004;
    /**
      * This parameters controls the Channels 5 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_5 = WIFI_CHANNEL_BASE + 0x0005;
    /**
      * This parameters controls the Channels 6 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_6 = WIFI_CHANNEL_BASE + 0x0006;
    /**
      * This parameters controls the Channels 7 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_7 = WIFI_CHANNEL_BASE + 0x0007;
    /**
      * This parameters controls the Channels 8 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_8 = WIFI_CHANNEL_BASE + 0x0008;
    /**
      * This parameters controls the Channels 9 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_9 = WIFI_CHANNEL_BASE + 0x0009;
    /**
      * This parameters controls the Channels 10 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_10 = WIFI_CHANNEL_BASE + 0x000A;
    /**
      * This parameters controls the Channels 11 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_11 = WIFI_CHANNEL_BASE + 0x000B;
    /**
      * This parameters controls the Channels 12 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_12 = WIFI_CHANNEL_BASE + 0x000C;
    /**
      * This parameters controls the Channels 13 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_13 = WIFI_CHANNEL_BASE + 0x000D;
    /**
      * This parameters controls the Channels 36 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_36 = WIFI_CHANNEL_BASE + 0x0024; //36
    /**
      * This parameters controls the Channels 40 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_40 = WIFI_CHANNEL_BASE + 0x0028; //40
    /**
      * This parameters controls the Channels 44 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_44 = WIFI_CHANNEL_BASE + 0x002C; //44
    /**
      * This parameters controls the Channels 48 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_48 = WIFI_CHANNEL_BASE + 0x0030; //48
    /**
      * This parameters controls the Channels 52 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_52 = WIFI_CHANNEL_BASE + 0x0034; //52
    /**
      * This parameters controls the Channels 56 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_56 = WIFI_CHANNEL_BASE + 0x0038; //56
    /**
      * This parameters controls the Channels 60 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_60 = WIFI_CHANNEL_BASE + 0x003c; //60
    /**
      * This parameters controls the Channels 64 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_64 = WIFI_CHANNEL_BASE + 0x0040; //64
    /**
      * This parameters controls the Channels 100 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_100 = WIFI_CHANNEL_BASE + 0x0064; //100
    /**
      * This parameters controls the Channels 104 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_104 = WIFI_CHANNEL_BASE + 0x0068; //104
    /**
      * This parameters controls the Channels 108 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_108 = WIFI_CHANNEL_BASE + 0x006c; //108
    /**
      * This parameters controls the Channels 112 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_112 = WIFI_CHANNEL_BASE + 0x0070; //112
    /**
      * This parameters controls the Channels 116 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_116 = WIFI_CHANNEL_BASE + 0x0074; //116
    /**
      * This parameters controls the Channels 120 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_120 = WIFI_CHANNEL_BASE + 0x0078; //120
    /**
      * This parameters controls the Channels 124 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_124 = WIFI_CHANNEL_BASE + 0x007c; //124
    /**
      * This parameters controls the Channels 128 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_128 = WIFI_CHANNEL_BASE + 0x0080; //128
    /**
      * This parameters controls the Channels 132 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_132 = WIFI_CHANNEL_BASE + 0x0084; //132
    /**
      * This parameters controls the Channels 136 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_136 = WIFI_CHANNEL_BASE + 0x0088; //136
    /**
      * This parameters controls the Channels 140 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_140 = WIFI_CHANNEL_BASE + 0x008c; //140
    /**
      * This parameters controls the Channels 144 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_144 = WIFI_CHANNEL_BASE + 0x0090; //144
    /**
      * This parameters controls the Channels 149 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_149 = WIFI_CHANNEL_BASE + 0x0095; //149
    /**
      * This parameters controls the Channels 153 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_153 = WIFI_CHANNEL_BASE + 0x0099; //153
    /**
      * This parameters controls the Channels 157 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_157 = WIFI_CHANNEL_BASE + 0x009d; //157
    /**
      * This parameters controls the Channels 161 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_161 = WIFI_CHANNEL_BASE + 0x00a1; //161
    /**
      * This parameters controls the Channels 165 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_165 = WIFI_CHANNEL_BASE + 0x00a5; //165
    /**
      * This parameters controls the Channels 169 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_169 = WIFI_CHANNEL_BASE + 0x00a9; //169
    /**
      * This parameters controls the Channels 173 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_173 = WIFI_CHANNEL_BASE + 0x00ad; //173
    /**
      * This parameter reports the current Wi-Fi country-code.
      * The value is calculated by the device according to the connected AP,
      * so this property cannot be set.
      */
    public final static int WIFI_COUNTRY_CODE = PropertyGroupID.WIFI_MIB_BASE + 0x0100;
    /**
      * This parameter enables the Wi-Fi channels selection regardless of the current country-code.
      */
    public final static int WIFI_UNLOCK_CHANNELS = PropertyGroupID.WIFI_MIB_BASE + 0x0101;

    /**
      * @hide
      * DateAndTime Settings definitions
      */
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
      * Policy for automatic exit from charging mode, according to the enum {@link OffChargingModePolicy}.
      */
    public final static int POWER_OFF_CHARGING_MODE_POLICY = PropertyGroupID.POWER_MIB_BASE + 0x0002;

    //
    // USB Settings definitions
    //
    /**
     * Default USB data function is the USB Transfer Protocol setup every time a USB is plugged-in to the device,
     * according to the enum {@link UsbFunction}.
     */
    public final static int USB_DEFAULT_FUNCTION = PropertyGroupID.USB_MIB_BASE + 0x0002;
    /**
     * Current USB data function is the USB Transfer Protocol used to change the Default USB data function 
     * just for the current USB transfer (until the USB will be plugged-out from the device),
     * according to the enum {@link UsbFunction}.
     * When the USB will be plugged-out, then USB will be plugged-in again, 
     * the Default USB data function is used for setup new USB transfer.
     */
    public final static int USB_CURRENT_FUNCTION = PropertyGroupID.USB_MIB_BASE + 0x0003;


    //
    // DualSim Settings definitions
    //
    /**
     * This parameter reports the availability of SIM card 1 and SIM card 2 according to the enum {@link DualSimStatus}.
     * The value is calculated by the device according to the availablity of the SIM cards, so this property cannot be set.
     */
    public final static int DUALSIM_AVAILABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0001;
    /**
      * This parameters controls the SIM card Slot 1 that can be enabled or disabled on the device.
      * When this slot is disabled, the SIM card cannot be used for voice calls, mobile data and SMS.
      */
    public final static int DUALSIM_SIM1_ENABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0002;
    /**
      * This parameters controls the SIM card Slot 2 that can be enabled or disabled on the device.
      * When this slot is disabled, the SIM card cannot be used for voice calls, mobile data and sms communication.
      */
    public final static int DUALSIM_SIM2_ENABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0003;
    /**
      * This parameter reports the current SIM card privileged by the device for mobile data, according to the enum {@link DualSimPreferredData}.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_DATA}), so this property cannot be set.
      */
    public final static int DUALSIM_CURRENT_DATA = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0004;
    /**
      * This parameter reports the current SIM card privileged by the device for voice calls, according to the enum {@link DualSimPreferredCallsAndSms}.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_CALLS}), so this property cannot be set.
      */
    public final static int DUALSIM_CURRENT_CALLS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0005;
    /**
      * This parameter reports the current SIM card privileged by the device for SMS, according to the enum {@link DualSimPreferredCallsAndSms}.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_SMS}), so this property cannot be set.
      */
    public final static int DUALSIM_CURRENT_SMS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0006;
    /**
      * This parameter controls the privileged SIM card to be used for mobile data, according to the enum {@link DualSimPreferredData}.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_DATA}).
      */
    public final static int DUALSIM_PREFERRED_DATA = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0007;
    /**
      * This parameter controls the privileged SIM card to be used for voice calls, according to the enum {@link DualSimPreferredCallsAndSms}.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_CALLS}).
      */
    public final static int DUALSIM_PREFERRED_CALLS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0008;
    /**
      * This parameter controls the privileged SIM card to be used for SMS, according to the enum {@link DualSimPreferredCallsAndSms}.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_SMS}).
      */
    public final static int DUALSIM_PREFERRED_SMS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0009;

    /**
     * @hide
     * The constructor is defined hide and private to avoid Apps create an instance of this class.
     */
    private PropertyID() {}
}
