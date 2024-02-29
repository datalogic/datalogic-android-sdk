package com.datalogic.device.configuration;


import com.datalogic.device.configuration.*;
import com.datalogic.device.power.*;
import com.datalogic.decode.configuration.*;
import com.datalogic.device.*;
/**
 * <code>PropertyID</code> is the class that includes all the properties
 * identifiers.<br>
 * The {@link Property}s are organized in a tree. The {@link Property}s are the leaves while the intermediate nodes are the {@link PropertyGroup}s.<br>
 * A property is uniquely identified by its {@link PropertyID}.<br>
 * A property group is uniquely identified by its {@link PropertyGroupID}.<br>
 * In the following all the property group identifiers and all the property identiers are listed in a manner resembling the hierarchical tree of the corresponding {@link PropertyGroup}s and {@link Property}s. <br>
 * Each property group can be collapsed/exanded clicking on the blue squared bullet preceding the identifier. The group contains:
 * <ul>
 * <li> the {@link PropertyID} of the contained properties
 * <li> the {@link PropertyGroupID}s of the contained property groups
 * </ul>
 * <style>
 * .tree{
 *   --spacing : 1.5rem;
 *   --radius  : 7px;
 * }
 * .tree li{
 *   display      : block;
 *   position     : relative;
 *   padding-left : calc(2 * var(--spacing) - var(--radius) - 2px);
 * }
 * 
 * .tree ul{
 *   margin-left  : calc(var(--radius) - var(--spacing));
 *   padding-left : 0;
 * }
 * .tree ul li{
 *   border-left : 2px solid #ddd;
 * }
 * 
 * .tree ul li:last-child{
 *   border-color : transparent;
 * }
 * .tree ul li::before{
 *  content      : '';
 *  display      : block;
 *   position     : absolute;
 *  top          : calc(var(--spacing) / -2);
 *  left         : -2px;
 *  width        : calc(var(--spacing) + 2px);
 *  height       : calc(var(--spacing) + 1px);
 *  border       : solid #ddd;
 *  border-width : 0 0 2px 2px;
 * }
 * .tree summary{
 *  display : block;
 *  cursor  : pointer;
 * }
 * 
 * .tree summary::marker,
 * .tree summary::-webkit-details-marker{
 *  display : none;
 * }
 * 
 * .tree summary:focus{
 *  outline : none;
 * }
 * 
 * .tree summary:focus-visible{
 * outline : 1px dotted #000;
 * }
 * .tree li::after,
 * .tree summary::before{
 * content       : '';
 * display       : block;
 * position      : absolute;
 * top           : calc(var(--spacing) / 2 - var(--radius));
 * left          : calc(var(--spacing) - var(--radius) - 1px);
 * width         : calc(2 * var(--radius));
 * height        : calc(2 * var(--radius));
 * border-radius : 25%;
 * background    : #0235a4;
 * }
 * .tree summary::before{
 * content     : '+';
 * z-index     : 1;
 * background  : #0235a4;
 * color       : #fff;
 * line-height : calc(2.5 * var(--radius) - 2px);
 * text-align  : center;
 * }
 * 
 * .tree details[open] > summary::before{
 * content : '−';
 * }
 * </style>
 * <ul class=tree>
 *   <li>
 *   <details open>
 *   <summary>ROOT</summary>
 *   <ul>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#WIFI_GROUP}</summary>
 *         <ul>
 *         <li>
 *         <details>
 *             <summary> {@link PropertyGroupID#WIFI_MODULE_SETTINGS_GROUP}</summary>
 *             <ul>
 *                 <li> {@link #WIFI_802_DOT_11_MODE} </li>
 *                 <li> {@link #WIFI_BAND_SELECTION} </li>
 *                 <li> {@link #WIFI_BAND} </li>
 *                 <li> {@link #WIFI_POWER_SAVE} </li>
 *                 <li> {@link #WIFI_VERBOSE_WIFI_MODULE_LOG} </li>
 *                 <li> {@link #WIFI_MAC_RANDOMIZATION} </li>
 *                 <li> {@link #WIFI_NO_INTERNET_EXPECTED} </li>
 *                 <li>
 *                 <details>
 *                     <summary> {@link PropertyGroupID#WIFI_CHANNELS_GROUP}</summary>
 *                     <ul>
 *                         <li> {@link #WIFI_COUNTRY_CODE} </li>
 *                         <li> {@link #WIFI_UNLOCK_CHANNELS} </li>
 *                         <li>
 *                         <details>
 *                             <summary> {@link PropertyGroupID#WIFI_CHANNELS_GROUP_2_4GHZ}</summary>
 *                             <ul>
 *                                 <li> {@link #WIFI_CHANNEL_1} </li>
 *                                 <li> {@link #WIFI_CHANNEL_2} </li>
 *                                 <li> {@link #WIFI_CHANNEL_3} </li>
 *                                 <li> {@link #WIFI_CHANNEL_4} </li>
 *                                 <li> {@link #WIFI_CHANNEL_5} </li>
 *                                 <li> {@link #WIFI_CHANNEL_6} </li>
 *                                 <li> {@link #WIFI_CHANNEL_7} </li>
 *                                 <li> {@link #WIFI_CHANNEL_8} </li>
 *                                 <li> {@link #WIFI_CHANNEL_9} </li>
 *                                 <li> {@link #WIFI_CHANNEL_10} </li>
 *                                 <li> {@link #WIFI_CHANNEL_11} </li>
 *                                 <li> {@link #WIFI_CHANNEL_12} </li>
 *                                 <li> {@link #WIFI_CHANNEL_13} </li>
 *                             </ul>
 *                         </details>
 *                         </li>
 *                         <li>
 *                         <details>
 *                             <summary> {@link PropertyGroupID#WIFI_CHANNELS_GROUP_5GHZ}</summary>
 *                             <ul>
 *                                 <li> {@link #WIFI_CHANNEL_36} </li>
 *                                 <li> {@link #WIFI_CHANNEL_40} </li>
 *                                 <li> {@link #WIFI_CHANNEL_44} </li>
 *                                 <li> {@link #WIFI_CHANNEL_48} </li>
 *                                 <li> {@link #WIFI_CHANNEL_52} </li>
 *                                 <li> {@link #WIFI_CHANNEL_56} </li>
 *                                 <li> {@link #WIFI_CHANNEL_60} </li>
 *                                 <li> {@link #WIFI_CHANNEL_64} </li>
 *                                 <li> {@link #WIFI_CHANNEL_100} </li>
 *                                 <li> {@link #WIFI_CHANNEL_104} </li>
 *                                 <li> {@link #WIFI_CHANNEL_108} </li>
 *                                 <li> {@link #WIFI_CHANNEL_112} </li>
 *                                 <li> {@link #WIFI_CHANNEL_116} </li>
 *                                 <li> {@link #WIFI_CHANNEL_120} </li>
 *                                 <li> {@link #WIFI_CHANNEL_124} </li>
 *                                 <li> {@link #WIFI_CHANNEL_128} </li>
 *                                 <li> {@link #WIFI_CHANNEL_132} </li>
 *                                 <li> {@link #WIFI_CHANNEL_136} </li>
 *                                 <li> {@link #WIFI_CHANNEL_140} </li>
 *                                 <li> {@link #WIFI_CHANNEL_144} </li>
 *                                 <li> {@link #WIFI_CHANNEL_149} </li>
 *                                 <li> {@link #WIFI_CHANNEL_153} </li>
 *                                 <li> {@link #WIFI_CHANNEL_157} </li>
 *                                 <li> {@link #WIFI_CHANNEL_161} </li>
 *                                 <li> {@link #WIFI_CHANNEL_165} </li>
 *                                 <li> {@link #WIFI_CHANNEL_169} </li>
 *                                 <li> {@link #WIFI_CHANNEL_173} </li>
 *                             </ul>
 *                         </details>
 *                         </li>
 *                     </ul>
 *                 </details>
 *                 </li>
 *             </ul>
 *         </details>
 *         </li>
 *         <li>
 *         <details>
 *              <summary> {@link PropertyGroupID#WIFI_ROAMING_SETTINGS_GROUP}</summary>
 *             <ul>
 *                 <li> {@link #WIFI_ROAMING_PROFILE} </li>
 *                 <li> {@link #WIFI_ROAMING_RSSI_THRESHOLD} </li>
 *                 <li> {@link #WIFI_ROAMING_RSSI_DIFFERENCE} </li>
 *                 <li> {@link #WIFI_ROAMING_RETRY_TIMES} </li>
 *                 <li> {@link #WIFI_ROAMING_RECALCULATION_INTERVAL} </li>
 *                 <li> {@link #WIFI_ROAMING_BEACON_PERIOD} </li>
 *                 <li> {@link #WIFI_BSSID_SCAN_STABLE_TIME} </li>
 *             </ul>
 *         </details>
 *         </li>
 *         <li>
 *         <details>
 *             <summary> {@link PropertyGroupID#WIFI_SCAN_SETTINGS_GROUP}</summary>
 *             <ul>
 *                 <li>
 *                 <details>
 *                     <summary> {@link PropertyGroupID#WIFI_SCAN_TIMINGS_GROUP}</summary>
 *                     <ul>
 *                         <li> {@link #WIFI_SCAN_INTERVAL} </li>
 *                         <li> {@link #WIFI_SCAN_INTERVAL_MAX} </li>
 *                         <li> {@link #WIFI_CONNECTED_SCAN_INTERVAL} </li>
 *                         <li> {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX} </li>
 *                     </ul>
 *                 </details>
 *                 </li>
 *             </ul>
 *         </details>
 *         </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DATE_AND_TIME_GROUP}</summary>
 *         <ul>
 *            <li> {@link #DATE_AND_TIME_AUTO_TIME} </li>
 *            <li> {@link #DATE_AND_TIME_AUTO_TIME_ZONE} </li>
 *            <li> {@link #DATE_AND_TIME_TIMEZONE_ID} </li>
 *            <li> {@link #DATE_AND_TIME_TIME_24H_FORMAT} </li>
 *            <li> {@link #DATE_AND_TIME_NTP_SERVER} </li>
 *            <li> {@link #DATE_AND_TIME_NTP_SERVER_2} </li>
 *            <li> {@link #DATE_AND_TIME_NTP_TIMEOUT} </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#POWER_GROUP}</summary>
 *         <ul>
 *            <li> {@link #POWER_SOURCE_USB} </li>
 *         </ul>
 *         <ul>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_OFF_CHARGING_MODE_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_OFF_CHARGING_MODE_THRESHOLD} </li>
 *                  <li> {@link #POWER_OFF_CHARGING_MODE_POLICY} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_CHARGING_MODE_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_BATTERY_CHARGING_PROFILE} </li>
 *                  <li> {@link #POWER_CHARGING_SOURCES} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_SUSPEND_TIMEOUT_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_SUSPEND_EXTERNAL_TIMEOUT} </li>
 *                  <li> {@link #POWER_SUSPEND_INTERNAL_TIMEOUT} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_WAKEUP_SOURCES_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_WAKEUP_POWER_IN} </li>
 *                  <li> {@link #POWER_WAKEUP_LEFT_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_RIGHT_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_PISTOL_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_FRONT_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_WIFI} </li>
 *                  <li> {@link #POWER_WAKEUP_WWAN} </li>
 *                  <li> {@link #POWER_WAKEUP_ACCELEROMETER} </li>
 *                  <li> {@link #POWER_WAKEUP_TOUCH} </li>
 *                  <li> {@link #POWER_WAKEUP_AUTOSCAN_TRIGGER} </li>
 *               </ul>
 *            </details>
 *            </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#KEYBOARD_GROUP}</summary>
 *         <ul>
 *            <li> {@link #KEYBOARD_LOCK_INPUT} </li>
 *         </ul>
 *         <ul>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#KEYBOARD_TRIGGERS_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #KEYBOARD_LEFT_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_RIGHT_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_FRONT_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_PISTOL_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_AUTOSCAN_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_AUTOSCAN_TRIGGER_RANGE} </li>
 *                  <li> {@link #KEYBOARD_MOTION_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_MOTION_TRIGGER_SENSITIVITY} </li>
 *                  <li> {@link #KEYBOARD_MOTION_TRIGGER_VIBRATION} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#KEYBOARD_ADVANCED_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #KEYBOARD_BACKLIGHT} </li>
 *                  <li> {@link #KEYBOARD_BACKLIGHT_BRIGHTNESS} </li>
 *                  <li> {@link #KEYBOARD_BACKLIGHT_TIMEOUT} </li>
 *                  <li> {@link #KEYBOARD_MULTITAP_DELAY} </li>
 *               </ul>
 *            </details>
 *            </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#CRADLE_GROUP}</summary>
 *         <ul>
 *            <li> {@link #CRADLE_FW_UPDATE_POLICY} </li>
 *            <li> {@link #CRADLE_UNLOCK_POLICY} </li>
 *            <li> {@link #CRADLE_UNLOCK_KEY_POLICY} </li>
 *            <li> {@link #CRADLE_FAILURE_POLICY} </li>
 *            <li> {@link #CRADLE_UNLOCK_NOTIFICATION_POLICY} </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#USB_GROUP}</summary>
 *         <ul>
 *            <li> {@link #USB_DATA} </li>
 *            <li> {@link #USB_DEFAULT_FUNCTION} </li>
 *            <li> {@link #USB_CURRENT_FUNCTION} </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#ETHERNET_GROUP}</summary>
 *         <ul>
 *            <li> {@link #ETHERNET_ENABLED} </li>
 *         </ul>
 *         <ul>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#ETHERNET_SETTINGS_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #ETHERNET_USE_DHCP} </li>
 *                  <li> {@link #ETHERNET_STATIC_ADDRESS} </li>
 *                  <li> {@link #ETHERNET_GATEWAY_ADDRESS} </li>
 *                  <li> {@link #ETHERNET_SUBNET_PREFIX_LENGTH} </li>
 *                  <li> {@link #ETHERNET_DNS1_ADDRESS} </li>
 *                  <li> {@link #ETHERNET_DNS2_ADDRESS} </li>
 *                  <li> {@link #ETHERNET_PROXY_ENABLED} </li>
 *                  <li> {@link #ETHERNET_PROXY_HOSTNAME} </li>
 *                  <li> {@link #ETHERNET_PROXY_PORT} </li>
 *                  <li> {@link #ETHERNET_PROXY_BYPASS} </li>
 *               </ul>
 *            </details>
 *            </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DUAL_SIM_GROUP}</summary>
 *         <ul>
 *            <li> {@link #DUALSIM_AVAILABLE} </li>
 *            <li> {@link #DUALSIM_SIM1_ENABLE} </li>
 *            <li> {@link #DUALSIM_SIM2_ENABLE} </li>
 *            <li> {@link #DUALSIM_CURRENT_DATA} </li>
 *            <li> {@link #DUALSIM_CURRENT_CALLS} </li>
 *            <li> {@link #DUALSIM_CURRENT_SMS} </li>
 *            <li> {@link #DUALSIM_PREFERRED_DATA} </li>
 *            <li> {@link #DUALSIM_PREFERRED_CALLS} </li>
 *            <li> {@link #DUALSIM_PREFERRED_SMS} </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#TOUCH_GROUP}</summary>
 *         <ul>
 *            <li> {@link #TOUCH_LOCK_INPUT} </li>
 *            <li> {@link #TOUCH_MODE_SENSITIVITY} </li>
 *            <li> {@link #TOUCH_MODE} </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#UI_SETTINGS_GROUP}</summary>
 *         <ul>
 *            <li> {@link #STATUS_BAR_HIDDEN} </li>
 *         </ul>
 *         <ul>
 *            <li> {@link #NAVIGATION_BAR_HIDDEN} </li>
 *         </ul>
 *     </details>
 *     </li> 
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DEVELOPER_OPTIONS_GROUP}</summary>
 *         <ul>
 *            <li> {@link #USB_DEBUG_ENABLE} </li>
 *         </ul>
 *         <ul>
 *            <li> {@link #WIFI_DEBUG_ENABLE} </li>
 *         </ul>
 *         <ul>
 *            <li> {@link #LOGGER_BUFFER_SIZE} </li>
 *         </ul>
 *     </details>
 *     </li>
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DISPLAY_GROUP}</summary>
 *         <ul>
 *            <li style="color:black" type="circle"> {@link #SCREEN_BRIGHTNESS} </li>
 *         </ul>
 *     </details>
 *     </li>   
 *     <li>
 *         <details>
 *             <summary> {@link PropertyGroupID#SCANNER_GROUP}</summary>
 *             <ul>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#SYMBOLOGIES_GROUP}</summary>
 *                         <ul>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#s1D_GROUP}</summary>
 *                                     <ul>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#CODABAR_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #CODABAR_ENABLE} </li>
 *                                                     <li> {@link #CODABAR_USER_ID} </li>
 *                                                     <li> {@link #CODABAR_LENGTH1} </li>
 *                                                     <li> {@link #CODABAR_LENGTH2} </li>
 *                                                     <li> {@link #CODABAR_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #CODABAR_ENABLE_CHECK} </li>
 *                                                     <li> {@link #CODABAR_SEND_CHECK} </li>
 *                                                     <li> {@link #CODABAR_CLSI} </li>
 *                                                     <li> {@link #CODABAR_SEND_START} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#CODE128_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #CODE128_ENABLE} </li>
 *                                                     <li> {@link #CODE128_USER_ID} </li>
 *                                                     <li> {@link #CODE128_LENGTH1} </li>
 *                                                     <li> {@link #CODE128_LENGTH2} </li>
 *                                                     <li> {@link #CODE128_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #CODE128_AGGRESSIVENESS} </li>
 *                                                     <li> {@link #CODE128_EXTENDED_ASCII} </li>
 *                                                     <li> {@link #CODE128_CHARACTER_SET_MODE} </li>
 *                                                     <li>
 *                                                         <details>
 *                                                             <summary> {@link PropertyGroupID#GS1_128_GROUP}</summary>
 *                                                             <ul>
 *                                                                 <li> {@link #CODE128_GS1_ENABLE} </li>
 *                                                                 <li> {@link #CODE128_GS1_USER_ID} </li>
 *                                                             </ul>
 *                                                         </details>
 *                                                     </li>
 *                                                     <li>
 *                                                         <details>
 *                                                             <summary> {@link PropertyGroupID#ISBT_128_GROUP}</summary>
 *                                                             <ul>
 *                                                                 <li> {@link #ISBT_128_ENABLE} </li>
 *                                                                 <li> {@link #ISBT_128_USER_ID} </li>
 *                                                                 <li> {@link #ISBT_128_MODE} </li>
 *                                                                 <li> {@link #ISBT_128_COMMONLY_CONCATENATED_PAIRS} </li>
 *                                                             </ul>
 *                                                         </details>
 *                                                     </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#CODE39_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #CODE39_ENABLE} </li>
 *                                                     <li> {@link #CODE39_USER_ID} </li>
 *                                                     <li> {@link #CODE39_LENGTH1} </li>
 *                                                     <li> {@link #CODE39_LENGTH2} </li>
 *                                                     <li> {@link #CODE39_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #CODE39_ENABLE_CHECK} </li>
 *                                                     <li> {@link #CODE39_FULL_ASCII} </li>
 *                                                     <li> {@link #CODE39_SEND_CHECK} </li>
 *                                                     <li> {@link #CODE39_AGGRESSIVENESS} </li>
 *                                                     <li>
 *                                                         <details>
 *                                                             <summary> {@link PropertyGroupID#CODE32_GROUP}</summary>
 *                                                             <ul>
 *                                                                 <li> {@link #CODE32_ENABLE} </li>
 *                                                                 <li> {@link #CODE32_USER_ID} </li>
 *                                                             </ul>
 *                                                         </details>
 *                                                     </li>
 *                                                     <li>
 *                                                         <details>
 *                                                             <summary> {@link PropertyGroupID#TRIOPTIC_GROUP}</summary>
 *                                                             <ul>
 *                                                                 <li> {@link #TRIOPTIC_ENABLE} </li>
 *                                                                 <li> {@link #TRIOPTIC_USER_ID} </li>
 *                                                             </ul>
 *                                                         </details>
 *                                                     </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#CODE93_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #CODE93_ENABLE} </li>
 *                                                     <li> {@link #CODE93_USER_ID} </li>
 *                                                     <li> {@link #CODE93_LENGTH1} </li>
 *                                                     <li> {@link #CODE93_LENGTH2} </li>
 *                                                     <li> {@link #CODE93_LENGTH_CONTROL} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#D25_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #D25_ENABLE} </li>
 *                                                     <li> {@link #D25_USER_ID} </li>
 *                                                     <li> {@link #D25_LENGTH1} </li>
 *                                                     <li> {@link #D25_LENGTH2} </li>
 *                                                     <li> {@link #D25_LENGTH_CONTROL} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#EAN13_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #EAN13_ENABLE} </li>
 *                                                     <li> {@link #EAN13_USER_ID} </li>
 *                                                     <li> {@link #EAN13_SEND_CHECK} </li>
 *                                                     <li> {@link #EAN13_TO_ISBN} </li>
 *                                                     <li> {@link #EAN13_TO_ISSN} </li>
 *                                                     <li> {@link #EAN13_SEND_SYS} </li>
 *                                                     <li> {@link #EAN13_COMPOSITE_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#EAN8_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #EAN8_ENABLE} </li>
 *                                                     <li> {@link #EAN8_USER_ID} </li>
 *                                                     <li> {@link #EAN8_SEND_CHECK} </li>
 *                                                     <li> {@link #EAN8_TO_EAN13} </li>
 *                                                     <li> {@link #EAN8_COMPOSITE_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#GS1_14_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #GS1_14_ENABLE} </li>
 *                                                     <li> {@link #GS1_14_USER_ID} </li>
 *                                                     <li> {@link #GS1_14_GS1_128_MODE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#GS1_EXP_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #GS1_EXP_ENABLE} </li>
 *                                                     <li> {@link #GS1_EXP_USER_ID} </li>
 *                                                     <li> {@link #GS1_EXP_LENGTH1} </li>
 *                                                     <li> {@link #GS1_EXP_LENGTH2} </li>
 *                                                     <li> {@link #GS1_EXP_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #GS1_EXP_GS1_128_MODE} </li>                                                    
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#GS1_LIMIT_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #GS1_LIMIT_ENABLE} </li>
 *                                                     <li> {@link #GS1_LIMIT_USER_ID} </li>
 *                                                     <li> {@link #GS1_LIMIT_GS1_128_MODE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#I25_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #I25_ENABLE} </li>
 *                                                     <li> {@link #I25_USER_ID} </li>
 *                                                     <li> {@link #I25_LENGTH1} </li>
 *                                                     <li> {@link #I25_LENGTH2} </li>
 *                                                     <li> {@link #I25_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #I25_ENABLE_CHECK} </li>
 *                                                     <li> {@link #I25_SEND_CHECK} </li>
 *                                                     <li> {@link #ITF14_ENABLE} </li>
 *                                                     <li> {@link #I25_AGGRESSIVENESS} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#M25_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #M25_ENABLE} </li>
 *                                                     <li> {@link #M25_USER_ID} </li>
 *                                                     <li> {@link #M25_LENGTH1} </li>
 *                                                     <li> {@link #M25_LENGTH2} </li>
 *                                                     <li> {@link #M25_LENGTH_CONTROL} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#MSI_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #MSI_ENABLE} </li>
 *                                                     <li> {@link #MSI_USER_ID} </li>
 *                                                     <li> {@link #MSI_LENGTH1} </li>
 *                                                     <li> {@link #MSI_LENGTH2} </li>
 *                                                     <li> {@link #MSI_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #MSI_SEND_CHECK} </li>
 *                                                     <li> {@link #MSI_REQUIRE_2_CHECK} </li>
 *                                                     <li> {@link #MSI_CHECK_2_MOD_11} </li>
 *                                                     <li> {@link #MSI_AGGRESSIVENESS} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#UPCA_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #UPCA_ENABLE} </li>
 *                                                     <li> {@link #UPCA_USER_ID} </li>
 *                                                     <li> {@link #UPCA_SEND_CHECK} </li>
 *                                                     <li> {@link #UPCA_SEND_SYS} </li>
 *                                                     <li> {@link #UPCA_TO_EAN13} </li>
 *                                                     <li> {@link #UPCA_COMPOSITE_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#UPCE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #UPCE_ENABLE} </li>
 *                                                     <li> {@link #UPCE_USER_ID} </li>
 *                                                     <li> {@link #UPCE_SEND_CHECK} </li>
 *                                                     <li> {@link #UPCE_SEND_SYS} </li>
 *                                                     <li> {@link #UPCE_TO_UPCA} </li>
 *                                                     <li> {@link #UPCE1_ENABLE} </li>
 *                                                     <li> {@link #UPCE_COMPOSITE_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#UPC_EAN_EXT_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #EAN_EXT_REQUIRE} </li>
 *                                                     <li> {@link #EAN_EXT_ENABLE_2_DIGIT} </li>
 *                                                     <li> {@link #EAN_EXT_ENABLE_5_DIGIT} </li>
 *                                                     <li> {@link #UPC_EAN_AGGRESSIVENESS} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#LINEAR_QUITE_ZONE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #UPC_EAN_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #CODE39_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #CODE128_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #MSI_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #I25_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #CODABAR_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #CODE93_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #M25_SHORT_QUIET_ZONES} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#s2D_GROUP}</summary>
 *                                     <ul>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#AZTEC_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #AZTEC_ENABLE} </li>
 *                                                     <li> {@link #AZTEC_USER_ID} </li>
 *                                                     <li> {@link #AZTEC_LENGTH1} </li>
 *                                                     <li> {@link #AZTEC_LENGTH2} </li>
 *                                                     <li> {@link #AZTEC_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #AZTEC_CHARACTER_SET_MODE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#DATAMATRIX_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #DATAMATRIX_ENABLE} </li>
 *                                                     <li> {@link #DATAMATRIX_USER_ID} </li>
 *                                                     <li> {@link #DATAMATRIX_LENGTH1} </li>
 *                                                     <li> {@link #DATAMATRIX_LENGTH2} </li>
 *                                                     <li> {@link #DATAMATRIX_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #DATAMATRIX_CHARACTER_SET_MODE} </li>    
 *                                                     <li> {@link #DATAMATRIX_OPERATING_MODE} </li>
 *                                                     <li> {@link #DATAMATRIX_MIRROR} </li>
 *                                                     <li> {@link #DATAMATRIX_GS1_ENABLE} </li>
 *                                                     <li> {@link #DATAMATRIX_AGGRESSIVENESS} </li>
 *                                                     <li> {@link #DATAMATRIX_DMRE} </li> *                                                     
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#DOTCODE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #DOTCODE_ENABLE} </li>
 *                                                     <li> {@link #DOTCODE_USER_ID} </li>
 *                                                     <li> {@link #DOTCODE_LENGTH1} </li>
 *                                                     <li> {@link #DOTCODE_LENGTH2} </li>
 *                                                     <li> {@link #DOTCODE_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #DOTCODE_CHARACTER_SET_MODE} </li>    
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#MAXICODE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #MAXICODE_ENABLE} </li>
 *                                                     <li> {@link #MAXICODE_USER_ID} </li>
 *                                                     <li> {@link #MAXICODE_LENGTH1} </li>
 *                                                     <li> {@link #MAXICODE_LENGTH2} </li>
 *                                                     <li> {@link #MAXICODE_LENGTH_CONTROL} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#MICROPDF417_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #MICROPDF417_ENABLE} </li>
 *                                                     <li> {@link #MICROPDF417_USER_ID} </li>
 *                                                     <li> {@link #MICROPDF417_LENGTH1} </li>
 *                                                     <li> {@link #MICROPDF417_LENGTH2} </li>
 *                                                     <li> {@link #MICROPDF417_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #MICROPDF417_CHARACTER_SET_MODE} </li>    
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#MICRO_QRCODE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #MICRO_QR_ENABLE} </li>
 *                                                     <li> {@link #MICRO_QR_USER_ID} </li>
 *                                                     <li> {@link #MICRO_QR_LENGTH1} </li>
 *                                                     <li> {@link #MICRO_QR_LENGTH2} </li>
 *                                                     <li> {@link #MICRO_QR_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #MICRO_QR_CHARACTER_SET_MODE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#PDF417_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #PDF417_ENABLE} </li>
 *                                                     <li> {@link #PDF417_USER_ID} </li>
 *                                                     <li> {@link #PDF417_LENGTH1} </li>
 *                                                     <li> {@link #PDF417_LENGTH2} </li>
 *                                                     <li> {@link #PDF417_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #PDF417_CHARACTER_SET_MODE} </li>                                                    
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#QRCODE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #QRCODE_ENABLE} </li>
 *                                                     <li> {@link #QRCODE_USER_ID} </li>
 *                                                     <li> {@link #QRCODE_LENGTH1} </li>
 *                                                     <li> {@link #QRCODE_LENGTH2} </li>
 *                                                     <li> {@link #QRCODE_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #QRCODE_CHARACTER_SET_MODE} </li>
 *                                                     <li> {@link #QRCODE_WIFI_ENABLE} </li>
 *                                                     <li> {@link #QRCODE_GS1_ENABLE} </li>
 *                                                     <li> {@link #QRCODE_S2D_ENABLE} </li>
 *                                                     <li> {@link #QRCODE_MIRROR} </li>
 *                                                     <li> {@link #QRCODE_ABSOLUTE_GRID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#COMPOSITE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #COMPOSITE_ENABLE} </li>
 *                                                     <li> {@link #COMPOSITE_USER_ID} </li>
 *                                                     <li> {@link #COMPOSITE_EAN_UPC_MODE} </li>
 *                                                     <li> {@link #COMPOSITE_GS1_128_MODE} </li>
 *                                                     <li> {@link #COMPOSITE_LINEAR_TRANSMISSION_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#HAN_XIN_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #HAN_XIN_ENABLE} </li>
 *                                                     <li> {@link #HAN_XIN_LENGTH1} </li>
 *                                                     <li> {@link #HAN_XIN_LENGTH2} </li>
 *                                                     <li> {@link #HAN_XIN_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #HAN_XIN_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>                                            
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#POSTAL_GROUP}</summary>
 *                                     <ul>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_AUSTRALIAN_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #AUSTRALIAN_POST_ENABLE} </li>
 *                                                     <li> {@link #AUSTRALIAN_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_JAPAN_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #JAPANESE_POST_ENABLE} </li>
 *                                                     <li> {@link #JAPANESE_POST_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_KIX_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #KIX_CODE_ENABLE} </li>
 *                                                     <li> {@link #KIX_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_ROYAL_MAIL_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #ROYAL_MAIL_ENABLE} </li>
 *                                                     <li> {@link #ROYAL_MAIL_CODE_USER_ID} </li>
 *                                                     <li> {@link #ROYAL_MAIL_SEND_CHECK} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_US_PLANET_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #US_PLANET_ENABLE} </li>
 *                                                     <li> {@link #US_PLANET_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_US_POSTNET_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #US_POSTNET_ENABLE} </li>
 *                                                     <li> {@link #US_POSTNET_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>    
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_USPS_4STATE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #USPS_4STATE_ENABLE} </li>
 *                                                     <li> {@link #USPS_4STATE_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>                                            
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#DIGIMARC_GROUP}</summary>
 *                                     <ul>
 *                                         <li> {@link #DIGIMARC_ENABLE} </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#OCR_GROUP}</summary>
 *                                     <ul>
 *                                         <li> {@link #OCR_ENABLE} </li>
 *                                         <li> {@link #OCR_USER_ID} </li>
 *                                         <li> {@link #OCR_PASSPORT_ENABLE} </li>
 *                                         <li> {@link #OCR_ID_ENABLE} </li>
 *                                         <li> {@link #OCR_CONFIDENCE} </li>
 *                                         <li> {@link #OCR_MULTIFRAME} </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#INVERSE_GROUP}</summary>
 *                                     <ul>
 *                                         <li> {@link #INVERSE_1D_SYMBOLOGIES} </li>
 *                                         <li> {@link #INVERSE_2D_SYMBOLOGIES} </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#SCANNER_OPTIONS_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #TARGET_MODE} </li>
 *                             <li> {@link #PICKLIST_ENABLE} </li>                                                
 *                             <li> {@link #TARGET_MODE_ENABLE} </li>
 *                             <li> {@link #TARGET_TIMEOUT} </li>
 *                             <li> {@link #TARGET_RELEASE_TIMEOUT} </li>
 *                             <li> {@link #DECODE_TIMEOUT} </li>
 *                             <li> {@link #ILLUMINATION_ENABLE} </li>                                                
 *                             <li> {@link #AIM_ENABLE} </li>
 *                             <li> {@link #DISPLAY_MODE_ENABLE} </li>
 *                             <li> {@link #IMAGE_CAPTURE_PROFILE} </li>
 *                             <li> {@link #CUSTOM_IMAGE_CAPTURE_PROFILE} </li>
 *                             <li> {@link #SCAN_MODE} </li>
 *                             <li> {@link #DOUBLE_READ_TIMEOUT} </li>
 *                             <li> {@link #ILLUMINATION_TYPE} </li>
 *                             <li> {@link #ILLUMINATION_TIME} </li>
 *                             <li> {@link #ENHANCE_DOF_ENABLE} </li>
 *                             <li> {@link #IMAGE_DECODE_TIMEOUT} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#INPUT_SELECTION_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #INPUT_TYPE} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_X} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_Y} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_WIDTH} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_HEIGHT} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_X} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_Y} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_WIDTH} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_HEIGHT} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#FORMATTING_GROUP}</summary>
 *                         <ul>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#STANDARD_FORMATTING_GROUP}</summary>
 *                                         <ul>
 *                                             <li> {@link #LABEL_PREFIX} </li>
 *                                             <li> {@link #LABEL_SUFFIX} </li>
 *                                             <li> {@link #GS_SUBSTITUTION} </li>
 *                                             <li> {@link #REMOVE_NON_PRINTABLE_CHARS} </li>
 *                                             <li> {@link #SEND_CODE_ID} </li>
 *                                             <li> {@link #ECI_POLICY} </li>
 *                                             <li> {@link #GS1_CHECK} </li>
 *                                             <li> {@link #GS1_STRING_FORMAT} </li>
 *                                         </ul>
 *                                 </details>
 *                             </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#PRESENTATION_MODE_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #PRESENTATION_MODE_ENABLE} </li>
 *                             <li> {@link #PRESENTATION_MODE_AIMER_ENABLE} </li>                                                
 *                             <li> {@link #PRESENTATION_MODE_SENSITIVITY} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#MULTISCAN_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #MULTISCAN_ENABLE} </li>                                                
 *                             <li> {@link #MULTISCAN_REQUIRED_LABELS} </li>
 *                             <li> {@link #MULTISCAN_NOTIFICATION_ENABLE} </li>
 *                             <li> {@link #MULTISCAN_PARTIAL_RESULT_MODE} </li>                            
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#WEDGE_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #WEDGE_INTENT_ENABLE} </li>
 *                             <li> {@link #WEDGE_INTENT_ACTION_NAME} </li>                                                
 *                             <li> {@link #WEDGE_INTENT_CATEGORY_NAME} </li>
 *                             <li> {@link #WEDGE_INTENT_DELIVERY_MODE} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_DATA} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_TYPE} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_STRING} </li>                                
 *                             <li> {@link #WEDGE_WEB_ENABLE} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#DECODING_NOTIFICATION_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #GOOD_READ_COUNT} </li>
 *                             <li> {@link #GOOD_READ_DURATION} </li>                                                
 *                             <li> {@link #GOOD_READ_INTERVAL} </li>
 *                             <li> {@link #GOOD_READ_AUDIO_VOLUME} </li>
 *                             <li> {@link #GOOD_READ_AUDIO_FILE} </li>
 *                             <li> {@link #GOOD_READ_AUDIO_MODE} </li>
 *                             <li> {@link #GOOD_READ_AUDIO_CHANNEL} </li>                            
 *                             <li> {@link #DISPLAY_NOTIFICATION_ENABLE} </li>
 *                             <li> {@link #GOOD_READ_TIMEOUT} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#FRAME_CAPTURE_CONFIGURATION_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #FRAME_CAPTURE_ENABLE} </li>
 *                             <li> {@link #FRAME_CAPTURE_FILE_PATH} </li>                                                
 *                             <li> {@link #FRAME_CAPTURE_FORMAT} </li>
 *                             <li> {@link #FRAME_CAPTURE_MODE} </li>
 *                             <li> {@link #FRAME_CAPTURE_STORAGE_ENABLE} </li>                            
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#GOOD_READ_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #GOOD_READ_ENABLE} </li>
 *                             <li> {@link #GREEN_SPOT_ENABLE} </li>                                                
 *                             <li> {@link #GOOD_READ_LED_ENABLE} </li>
 *                             <li> {@link #GOOD_READ_VIBRATE_ENABLE} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#KEYBOARD_WEDGE_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #WEDGE_KEYBOARD_ENABLE} </li>
 *                             <li> {@link #WEDGE_KEYBOARD_ONLY_ON_FOCUS} </li>                                                
 *                             <li> {@link #WEDGE_KEYBOARD_DELIVERY_MODE} </li>                            
 *                         </ul>
 *                     </details>
 *                 </li>
 *             </ul>
 *         </details>
 *     </li>      
 *  </ul>
 *  </li>
 *   </ul>
 *   </details>
 *   </li>
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
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_SCAN_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0001;
    /**
      * Maximum interval between scans when the device is on and disconnected.
      * Scan interval and Scan interval max control the Wi-Fi scan intervals when the device has the screen on and
      * it is not connected to any Wi-Fi network. The scans are issued in this way: the first scan is done when
      * the device is woken up from a standby state, then the next scans are done in an exponential backoff fashion.
      * The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on, until it reaches
      * the maximum value defined by {@link #WIFI_SCAN_INTERVAL_MAX}.
      * <p>
      * The class of the property is {@link NumericProperty}.
     */
    public final static int WIFI_SCAN_INTERVAL_MAX = PropertyGroupID.WIFI_MIB_BASE + 0x0002;
    /**
      * Interval between scans when the device is on and connected.
      * Connected scan interval and Connected scan interval max control the Wi-Fi scan intervals when the device
      * has the screen on and it is connected to any Wi-Fi network. The scans are issued in this way: the first
      * scan is done when the device is woken up from a standby state, then the next scans are done in an exponential
      * backoff fashion. The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on,
      * until it reaches the maximum defined by {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX}.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_CONNECTED_SCAN_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0003;
    /**
      * Maximum interval between scans when the device is on and connected.
      * Connected scan interval and Connected scan interval max control the Wi-Fi scan intervals when the device
      * has the screen on and it is connected to any Wi-Fi network. The scans are issued in this way: the first scan
      * is done when the device is woken up from a standby state, then the next scans are done in an exponential
      * backoff fashion. The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on,
      * until it reaches the maximum value defined by {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX}.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_CONNECTED_SCAN_INTERVAL_MAX = PropertyGroupID.WIFI_MIB_BASE + 0x0004;
    /**
      * Selects the 802.11 mode to be used (b/g/n/a/ac).
      * This parameter controls the 802.11 mode the device will be using.
      * The allowed values for this property are defined by enum {@link Wifi802Dot11Mode}
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_802_DOT_11_MODE = PropertyGroupID.WIFI_MIB_BASE + 0x000D;
    /**
      * Selects the band used by the device (2.4/5 GHz).
      * This parameter controls the band the device will be using.
      * When one band is disabled, the device won’t transmit anything on that band.
      * On new device models, starting from M30/M35, this parameter is substituted by {@link PropertyID#WIFI_BAND}.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link WifiBandSelection}
      */
    public final static int WIFI_BAND_SELECTION = PropertyGroupID.WIFI_MIB_BASE + 0x000E;
    /**
      * Selects the power saving mode used.
      * This parameter enables the power save mode and controls which kind of power save is used.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link WifiPowerSave}.
      * The default value is set to {@link WifiPowerSave#WIFI_POWER_SAVE_ENABLED}, if you notice a degradation in the VoIP call performance
      * change the value to {WifiPowerSave#WIFI_POWER_SAVE_ENABLED_VOIP_CALLS}.
      */
    public final static int WIFI_POWER_SAVE = PropertyGroupID.WIFI_MIB_BASE + 0x000F;
    /**
      * Enables the verbose Wi-Fi module logging.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */

    public final static int WIFI_VERBOSE_WIFI_MODULE_LOG = PropertyGroupID.WIFI_MIB_BASE + 0x0012;
    /**
      * Signal threshold for triggering the roaming background scan.
      * This parameter controls the signal threshold for triggering the roaming procedure.
      * When the access point signal drops under the threshold, the device will begin scanning
      * in background for suitable networks to roam to.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_ROAMING_RSSI_THRESHOLD = PropertyGroupID.WIFI_MIB_BASE + 0x0013;
    /**
      * Signal difference between the current AP and the target AP for roaming.
      * This parameter controls the signal difference between the current access point the device
      * is connected to and the target access point the device wants to roam to.
      * If the target AP signal is higher than the current by at least the value of this parameter,
      * the device will roam.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_ROAMING_RSSI_DIFFERENCE = PropertyGroupID.WIFI_MIB_BASE + 0x0014;
    /**
      * Enables roaming profiles.
      * A roaming profile can be one of four presets: standard, aggressive, slow and custom.
      * Each preset should have a direct impact on the Roaming RSSI Threshold and Difference, and those settings should not
      * be editable if any preset other than custom is selected. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link WifiRoamingProfile}.
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
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_1 = WIFI_CHANNEL_BASE + 0x0001;
    /**
      * This parameters controls the Channels 2 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_2 = WIFI_CHANNEL_BASE + 0x0002;
    /**
      * This parameters controls the Channels 3 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_3 = WIFI_CHANNEL_BASE + 0x0003;
    /**
      * This parameters controls the Channels 4 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_4 = WIFI_CHANNEL_BASE + 0x0004;
    /**
      * This parameters controls the Channels 5 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_5 = WIFI_CHANNEL_BASE + 0x0005;
    /**
      * This parameters controls the Channels 6 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_6 = WIFI_CHANNEL_BASE + 0x0006;
    /**
      * This parameters controls the Channels 7 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_7 = WIFI_CHANNEL_BASE + 0x0007;
    /**
      * This parameters controls the Channels 8 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_8 = WIFI_CHANNEL_BASE + 0x0008;
    /**
      * This parameters controls the Channels 9 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_9 = WIFI_CHANNEL_BASE + 0x0009;
    /**
      * This parameters controls the Channels 10 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_10 = WIFI_CHANNEL_BASE + 0x000A;
    /**
      * This parameters controls the Channels 11 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_11 = WIFI_CHANNEL_BASE + 0x000B;
    /**
      * This parameters controls the Channels 12 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_12 = WIFI_CHANNEL_BASE + 0x000C;
    /**
      * This parameters controls the Channels 13 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_13 = WIFI_CHANNEL_BASE + 0x000D;
    /**
      * This parameters controls the Channels 36 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_36 = WIFI_CHANNEL_BASE + 0x0024; //36
    /**
      * This parameters controls the Channels 40 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_40 = WIFI_CHANNEL_BASE + 0x0028; //40
    /**
      * This parameters controls the Channels 44 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_44 = WIFI_CHANNEL_BASE + 0x002C; //44
    /**
      * This parameters controls the Channels 48 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_48 = WIFI_CHANNEL_BASE + 0x0030; //48
    /**
      * This parameters controls the Channels 52 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_52 = WIFI_CHANNEL_BASE + 0x0034; //52
    /**
      * This parameters controls the Channels 56 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_56 = WIFI_CHANNEL_BASE + 0x0038; //56
    /**
      * This parameters controls the Channels 60 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_60 = WIFI_CHANNEL_BASE + 0x003c; //60
    /**
      * This parameters controls the Channels 64 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_64 = WIFI_CHANNEL_BASE + 0x0040; //64
    /**
      * This parameters controls the Channels 100 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_100 = WIFI_CHANNEL_BASE + 0x0064; //100
    /**
      * This parameters controls the Channels 104 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_104 = WIFI_CHANNEL_BASE + 0x0068; //104
    /**
      * This parameters controls the Channels 108 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
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
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_116 = WIFI_CHANNEL_BASE + 0x0074; //116
    /**
      * This parameters controls the Channels 120 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_120 = WIFI_CHANNEL_BASE + 0x0078; //120
    /**
      * This parameters controls the Channels 124 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
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
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_132 = WIFI_CHANNEL_BASE + 0x0084; //132
    /**
      * This parameters controls the Channels 136 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
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
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_144 = WIFI_CHANNEL_BASE + 0x0090; //144
    /**
      * This parameters controls the Channels 149 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_149 = WIFI_CHANNEL_BASE + 0x0095; //149
    /**
      * This parameters controls the Channels 153 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_153 = WIFI_CHANNEL_BASE + 0x0099; //153
    /**
      * This parameters controls the Channels 157 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_157 = WIFI_CHANNEL_BASE + 0x009d; //157
    /**
      * This parameters controls the Channels 161 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_161 = WIFI_CHANNEL_BASE + 0x00a1; //161
    /**
      * This parameters controls the Channels 165 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_165 = WIFI_CHANNEL_BASE + 0x00a5; //165
    /**
      * This parameters controls the Channels 169 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_169 = WIFI_CHANNEL_BASE + 0x00a9; //169
    /**
      * This parameters controls the Channels 173 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_173 = WIFI_CHANNEL_BASE + 0x00ad; //173
    /**
      * This parameter reports the current Wi-Fi country-code.
      * The value is calculated by the device according to the connected AP,
      * so this property cannot be set.
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int WIFI_COUNTRY_CODE = PropertyGroupID.WIFI_MIB_BASE + 0x0100;
    /**
      * This parameter enables the Wi-Fi channels selection regardless of the current country-code.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_UNLOCK_CHANNELS = PropertyGroupID.WIFI_MIB_BASE + 0x0101;
    /**
     * Number of roaming retries before aborting the roaming procedure.
     * This parameter controls how many times the device will try to find a new access point
     * to roam to, before giving up and aborting the current roaming event.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int WIFI_ROAMING_RETRY_TIMES = PropertyGroupID.WIFI_MIB_BASE + 0x0102;
    /**
     * Minimum time interval between roaming threshold calculations.
     * This parameter controls how frequently the device recalculates the roaming trigger
     * threshold in case there are no other interruptions (i.e. scans).
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int WIFI_ROAMING_RECALCULATION_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0103;
    /**
     * Interval between beacon listening.
     * A live AP transmits beacons at periodic intervals (typically every 102.4 ms) to be
     * recognized by other devices. This parameter controls how frequently the device listens
     * to the access point beacon frame.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int WIFI_ROAMING_BEACON_PERIOD = PropertyGroupID.WIFI_MIB_BASE + 0x0104;
    /**
     * This parameter enables/disables the random MAC feature.
     * This adds some security in case of public networks, as the device real MAC address is hidden
     * and a randomly generated one is used instead. This can cause problems in case your device needs
     * a fixed MAC address (for example, MAC authentication or specific DHCP rules).
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int WIFI_MAC_RANDOMIZATION = PropertyGroupID.WIFI_MIB_BASE + 0x0105;
    /**
     * Controls the behaviour when the current Wi-Fi profile doesn't have an Internet connectivity.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link WifiNoInternetExpected}.
     */
    public final static int WIFI_NO_INTERNET_EXPECTED = PropertyGroupID.WIFI_MIB_BASE + 0x0106;

    /**
     * Selects the bands used by the device (2.4/5/6 GHz).
     * This parameter controls the bands the device will be using.
     * When one band is not enabled, the device won’t transmit anything on that band.
     * <p>
     * The class of the property is {@link MultipleChoiceProperty}.
     * The allowed values are a subset of the combinations of the values defined by {@link WifiBandFlags}.
     */
    public final static int WIFI_BAND = PropertyGroupID.WIFI_MIB_BASE + 0x0107;
    /**
     * The WIFI_BSSID_SCAN_STABLE_TIME (in seconds) means that after this period of time, the device will no longer scan this BSSID channel. 
     * When a device moves between areas covered by multiple access points, it continuously scans for available networks 
     * and evaluates their stability and signal strength. The device will clear the BSSID and its channel once it identifies 
     * the BSSID last scan update time is more than the value of this parameter, so that the next roaming scan would scan updated BSSIDs.
     * <p>
     * The class of the property is {@link NumericProperty}.
     * The allowed values are between 10 and 200.
     */
    public final static int WIFI_BSSID_SCAN_STABLE_TIME = PropertyGroupID.WIFI_MIB_BASE + 0x0108;

    /**
      * @hide
      * DateAndTime Settings definitions
      */
    public final static int DATE_AND_TIME_UNKNOWN = PropertyGroupID.DNT_MIB_BASE + 0;
    /** 
      * Value to specify if the user prefers the date, time and time zone to be automatically fetched from the network (NITZ). 
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATE_AND_TIME_AUTO_TIME = PropertyGroupID.DNT_MIB_BASE + 0x0001;
    /** 
      * Value to specify if the user prefers the time zone to be automatically fetched from the network (NITZ).
      * <p>
      * The class of the property is {@link BooleanProperty}.
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
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int DATE_AND_TIME_TIMEZONE_ID = PropertyGroupID.DNT_MIB_BASE + 0x0003;
    /**
      * Display times in 24H format, if false display times in 12H format.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATE_AND_TIME_TIME_24H_FORMAT = PropertyGroupID.DNT_MIB_BASE + 0x0004;
    /**
      * Primary NTP server address that will be used if DATE_AND_TIME_AUTO_TIME is enabled.
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int DATE_AND_TIME_NTP_SERVER = PropertyGroupID.DNT_MIB_BASE + 0x0005;
    /**
      * Secondary NTP server address that will be used if DATE_AND_TIME_NTP_SERVER is not reacheable and DATE_AND_TIME_AUTO_TIME is enabled.
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int DATE_AND_TIME_NTP_SERVER_2 = PropertyGroupID.DNT_MIB_BASE + 0x0006;
    /**
      * NTP server connection timeout expressed in milliseconds.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DATE_AND_TIME_NTP_TIMEOUT = PropertyGroupID.DNT_MIB_BASE + 0x0007;

    //
    // Power Settings definitions
    //
    /** 
      * The charging threshold (%) for automatic exit from charging mode.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int POWER_OFF_CHARGING_MODE_THRESHOLD = PropertyGroupID.POWER_MIB_BASE + 0x0001;
    /** 
      * Policy for automatic exit from charging mode.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link OffChargingModePolicy}.
      */
    public final static int POWER_OFF_CHARGING_MODE_POLICY = PropertyGroupID.POWER_MIB_BASE + 0x0002;
    /** 
    *	Controls whether the USB is enabled as a power-source.
    */
    public final static int POWER_SOURCE_USB = PropertyGroupID.POWER_MIB_BASE + 0x0003;

   /**
    * This parameter controls whether the Power button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_POWER_KEY = PropertyGroupID.POWER_MIB_BASE + 0x0005;
   /**
    * This parameter controls whether a Real-Time clock alarm trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_RTC_ALARM = PropertyGroupID.POWER_MIB_BASE + 0x0006;
   /**
    * ContrThis parameter controlsols whether a generic charging power source trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_POWER_IN = PropertyGroupID.POWER_MIB_BASE + 0x0007;
   /**
    * ContrThis parameter controlsols whether the left trigger button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_LEFT_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x0008;
   /**
    * This parameter controls whether the right trigger button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_RIGHT_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x0009;
   /**
    * This parameter controls whether the back trigger button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_PISTOL_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x000A;
   /**
    * This parameter controls whether the front trigger button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_FRONT_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x000B;
   /**
    * This parameter controls whether Wifi data trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_WIFI = PropertyGroupID.POWER_MIB_BASE + 0x000C;
   /**
    * This parameter controls whether cellular data or call trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_WWAN = PropertyGroupID.POWER_MIB_BASE + 0x000D;
   /**
    * This parameter controls whether the accelerometer sensor trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_ACCELEROMETER = PropertyGroupID.POWER_MIB_BASE + 0x000E;
   /**
    * This parameter controls whether a touch event on the screen can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_TOUCH = PropertyGroupID.POWER_MIB_BASE + 0x000F;
   /**
    * This parameter controls whether a autoScan trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_AUTOSCAN_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x0010;
   /**
    * This parameter defines the screen off timeout, in msecs, when the device is powered by an external AC power.
    * <p>
    * The class of the property is {@link NumericProperty}.
    * The allowed values are between 0 and MAX_INT. 0 means never.
    */
   public final static int POWER_SUSPEND_EXTERNAL_TIMEOUT = PropertyGroupID.POWER_MIB_BASE + 0x0011;
    /**
     * This parameter defines the screen off timeout, in msecs, when the device is powered by internal battery.
     * <p>
     * The class of the property is {@link NumericProperty}.
     * The allowed values are between 0 and MAX_INT. 0 means never.
     */
   public final static int POWER_SUSPEND_INTERNAL_TIMEOUT = PropertyGroupID.POWER_MIB_BASE + 0x0012;
    /**
     * This parameter defines the battery charging profile.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link BatteryChargingProfile}.
     */
    public final static int POWER_BATTERY_CHARGING_PROFILE = PropertyGroupID.POWER_MIB_BASE + 0x0013;
    /**
     * Selects the device charging sources.
     * This parameter controls the charging source the device will be using.
     * All charging sources could be disabled.
     * <p>
     * The class of the property is {@link MultipleChoiceProperty}.
     * The allowed values are all the combinations of the values defined by {@link ChargingSourcesFlags}.
     */
    public final static int POWER_CHARGING_SOURCES = PropertyGroupID.POWER_MIB_BASE + 0x0014;

    //
    // USB Settings definitions
    //

    /**
     *	Enables/disables USB data transmission.
     */
    public final static int USB_DATA = PropertyGroupID.USB_MIB_BASE + 0x0001;

    /**
      * Default USB data function. It is the USB Transfer Protocol setup every time a USB is plugged-in to the device.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link UsbFunction}.
      */
    public final static int USB_DEFAULT_FUNCTION = PropertyGroupID.USB_MIB_BASE + 0x0002;
    /**
      * Current USB data function. It is the USB Transfer Protocol used to change the Default USB data function 
      * just for the current USB transfer (until the USB will be plugged-out from the device).
      * When the USB will be plugged-out, then USB will be plugged-in again, 
      * the Default USB data function is used for setup new USB transfer.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link UsbFunction}.
      */
    public final static int USB_CURRENT_FUNCTION = PropertyGroupID.USB_MIB_BASE + 0x0003;

    //
    // Cradle Settings definitions
    //

    /**
     * Cradle firmware update policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link FirmwareUpdatePolicy}.
     */
    public final static int CRADLE_FW_UPDATE_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0001;
    /**
     * Cradle unlock policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link UnlockPolicy}.
     */
    public final static int CRADLE_UNLOCK_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0002;
    /**
     * Cradle unlock key policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link UnlockKeyPolicy}.
     */
    public final static int CRADLE_UNLOCK_KEY_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0003;
    /**
     * Cradle failure policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link FailurePolicy}.
     */
    public final static int CRADLE_FAILURE_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0004;
    /**
     * Enable the unlock notification only when the device is inserted in the specific cradle model.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link UnlockNotificationPolicy}.
     */
    public final static int CRADLE_UNLOCK_NOTIFICATION_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0005;

    //
    // Ethernet Settings definitions
    //

    /**
      * This parameter enables/disables the Ethernet sub-system.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ETHERNET_ENABLED = PropertyGroupID.ETHERNET_MIB_BASE + 0x0001;

    /**
      * Controls whether the device will obtain its IP settings automatically, using DHCP,
      * or manually, by an administrator using the relevant parameters, when connecting to a network through an Ethernet-equipped cradle.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ETHERNET_USE_DHCP = PropertyGroupID.ETHERNET_MIB_BASE + 0x0002;
    /**
     * This parameter is used to enter the static IP address of the device when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_STATIC_ADDRESS = PropertyGroupID.ETHERNET_MIB_BASE + 0x0003;
    /**
     * This parameter is used to enter the IP address of the default gateway when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_GATEWAY_ADDRESS = PropertyGroupID.ETHERNET_MIB_BASE + 0x0004;
    /**
     * Prefix length specifies the number of bits in the IP address that are to be used as the subnet mask.
     * <p>
     * The class of the property is {@link NumericProperty}.
     * The allowed values are between 0 and 32.
     */
    public final static int ETHERNET_SUBNET_PREFIX_LENGTH = PropertyGroupID.ETHERNET_MIB_BASE + 0x0005;
    /**
     * This parameter is used to enter the primary domain name server used when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_DNS1_ADDRESS = PropertyGroupID.ETHERNET_MIB_BASE + 0x0006;
    /**
     * This parameter is used to enter the secondary domain name server used when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_DNS2_ADDRESS = PropertyGroupID.ETHERNET_MIB_BASE + 0x0007;
    /**
     * Controls whether an Ethernet Proxy is used by the device when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ETHERNET_PROXY_ENABLED = PropertyGroupID.ETHERNET_MIB_BASE + 0x0008;
    /**
     * Used to enter the Host Name of the Proxy server through which network communications will pass when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_PROXY_HOSTNAME = PropertyGroupID.ETHERNET_MIB_BASE + 0x0009;
    /**
     * Used to enter the two-digit Port number for accessing the Proxy server through which network communications will pass when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link NumericProperty}.
     * The allowed values are between 0 to 65535.
     */
    public final static int ETHERNET_PROXY_PORT = PropertyGroupID.ETHERNET_MIB_BASE + 0x000A;
    /**
     * Used to enter the host name(s) and/or IP address(es) for direct access by the device, bypassing the Proxy server specified in the Proxy Host Name parameter.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_PROXY_BYPASS = PropertyGroupID.ETHERNET_MIB_BASE + 0x000B;

    //
    // DualSim Settings definitions
    //
    /**
      * This parameter reports the availability of SIM card 1 and SIM card 2.
      * The value is calculated by the device according to the availablity of the SIM cards, so this property cannot be set.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimStatus}.
      */
    public final static int DUALSIM_AVAILABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0001;
    /**
      * This parameters controls the SIM card Slot 1 that can be enabled or disabled on the device.
      * When this slot is disabled, the SIM card cannot be used for voice calls, mobile data and SMS.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DUALSIM_SIM1_ENABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0002;
    /**
      * This parameters controls the SIM card Slot 2 that can be enabled or disabled on the device.
      * When this slot is disabled, the SIM card cannot be used for voice calls, mobile data and sms communication.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DUALSIM_SIM2_ENABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0003;
    /**
      * This parameter reports the current SIM card privileged by the device for mobile data.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_DATA}), so this property cannot be set.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredData}.
      */
    public final static int DUALSIM_CURRENT_DATA = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0004;
    /**
      * This parameter reports the current SIM card privileged by the device for voice calls.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_CALLS}), so this property cannot be set.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_CURRENT_CALLS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0005;
    /**
      * This parameter reports the current SIM card privileged by the device for SMS.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_SMS}), so this property cannot be set.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_CURRENT_SMS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0006;
    /**
      * This parameter controls the privileged SIM card to be used for mobile data.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_DATA}).
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_PREFERRED_DATA = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0007;
    /**
      * This parameter controls the privileged SIM card to be used for voice calls.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_CALLS}).
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_PREFERRED_CALLS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0008;
    /**
      * This parameter controls the privileged SIM card to be used for SMS.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_SMS}).
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_PREFERRED_SMS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0009;

    //
    // Touch Settings definitions
    //

    /**
      * This is the property used to configure the touch controller.
      * On new device models, starting from M30/M35, this parameter is substituted by {@link PropertyID#TOUCH_MODE}.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link TouchMode}.
      */
    public final static int TOUCH_MODE_SENSITIVITY = PropertyGroupID.TOUCH_MIB_BASE + 0x0001;

    /**
     * This parameter locks or unlocks the input from touch screen.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int TOUCH_LOCK_INPUT = PropertyGroupID.TOUCH_MIB_BASE + 0x0002;
    /**
     * This is the property used to configure the touch controller.
     * <p>
     * The class of the property is {@link MultipleChoiceProperty}.
     * The allowed values are a subset of the combinations of the values defined by {@link TouchModeFlags}.
     */
    public final static int TOUCH_MODE = PropertyGroupID.TOUCH_MIB_BASE + 0x0003;

    //
    // UI Settings definitions
    //

    /**
      * This parameter hide/unhide the status bar.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int STATUS_BAR_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0001;

    /**
      * This parameter hide/unhide the navigation bar.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int NAVIGATION_BAR_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0002;

    //
    // Developer Options definitions
    //

    /**
      *	This parameter enables/disables the debug mode, over USB, when USB is connected.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int USB_DEBUG_ENABLE = PropertyGroupID.DEVELOPER_OPTIONS_GROUP + 0x0001;

    /**
      *	This parameter sets the size of the log.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LoggerBufferSize}.
      */
    public final static int LOGGER_BUFFER_SIZE = PropertyGroupID.DEVELOPER_OPTIONS_GROUP + 0x0002;

    /**
      *	This parameter enables/disables the debug mode, over Wi-Fi, when Wi-Fi is connected.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_DEBUG_ENABLE = PropertyGroupID.DEVELOPER_OPTIONS_GROUP + 0x0003;

    //
    // Display setting definitions
    //

    /**
     *	This parameter sets the Brightness level of the screen. The allowed values are between 0 and 255.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int SCREEN_BRIGHTNESS = PropertyGroupID.DISPLAY_GROUP + 0x0001;

   //
   // Keyboard definitions
   //

   /**
    *	This parameter enables the Left trigger.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int KEYBOARD_LEFT_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0001;

    /**
     *	This parameter enables the Right trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_RIGHT_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0002;

    /**
     *	This parameter enables the Front trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_FRONT_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0003;

    /**
     *	This parameter enables the Pistol trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_PISTOL_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0004;

    /**
     *	This parameter enables the Autoscan trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_AUTOSCAN_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0005;

    /**
     *	This parameter sets the Autoscan trigger range.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link AutoScanTriggerRange}.
     */
    public final static int KEYBOARD_AUTOSCAN_TRIGGER_RANGE = PropertyGroupID.KEYBOARD_GROUP + 0x0006;

    /**
     *	This parameter enables the Motion trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_MOTION_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0007;

    /**
     *	This parameter defines the sensitivity for motion detection.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link MotionTriggerSensitivity}.
     */
    public final static int KEYBOARD_MOTION_TRIGGER_SENSITIVITY = PropertyGroupID.KEYBOARD_GROUP + 0x0008;

    /**
     *	This parameter enables or disables the vibration when a motion is detected.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_MOTION_TRIGGER_VIBRATION = PropertyGroupID.KEYBOARD_GROUP + 0x0009;

    /**
     *	This parameter locks or unlocks the input from keyboard and physical buttons.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_LOCK_INPUT = PropertyGroupID.KEYBOARD_GROUP + 0x000A;

    /**
     *	This parameter enables or disables the keyboard backlight control.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_BACKLIGHT = PropertyGroupID.KEYBOARD_GROUP + 0x000B;

    /**
     *	This parameter sets the keyboard backlight brightness.
     *	This is parameter is enabled only when {@link #KEYBOARD_BACKLIGHT} is enabled.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int KEYBOARD_BACKLIGHT_BRIGHTNESS = PropertyGroupID.KEYBOARD_GROUP + 0x000C;

    /**
     *	This parameter sets the keyboard backlight inactivity timeout. In case of inactivity, the keyboard backlight will turn off after this amount of time.
     *	This parameter is enabled only when {@link #KEYBOARD_BACKLIGHT} is enabled.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int KEYBOARD_BACKLIGHT_TIMEOUT = PropertyGroupID.KEYBOARD_GROUP + 0x000D;

    /**
     *	This parameter sets the keyboard multitap delay used to define after how much time from the first multitap key press the associated character will be submitted to the UI.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int KEYBOARD_MULTITAP_DELAY = PropertyGroupID.KEYBOARD_GROUP + 0x000E;



    //
    // General Decoding definitions
    //

    /**
      * This parameter controls the barcode illumination for capturing frames from displays or reflective surfaces. 
      * The possibile configurations are: 
      * <ul>
      * <li> feature disabled that means "Illuminator alwayas enabled",
      * <li> feature enabled that means "Illuminator adjusted according" to reflection in the previous acquired frames.
      * </ul> 
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DISPLAY_MODE_ENABLE = 0x0006;
    /**
      * This parameter enables barcode illumination when capturing frames.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ILLUMINATION_ENABLE = 0x0007;
    /**
      * This parameter enables aim projection when capturing frames.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int AIM_ENABLE = 0x0008;
    /**
      * This parameter selects the scanner target beam mode.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link BeamMode}.
      */
    public final static int TARGET_MODE = 0x0009;
    /**
      * This parameter limits reading to targeted selection.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int PICKLIST_ENABLE = 0x000A;
    /**
      * This parameter enables the use of a target beam mode.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int TARGET_MODE_ENABLE = 0x000B;
    /**
      * This parameter selects the scanner image capture profile.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ImageCaptureProfile}.
      */
    public final static int IMAGE_CAPTURE_PROFILE = 0x000C;
    /**
      * This parameter allows to define a custom profile. It could be set with a number between 0-255.  
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int CUSTOM_IMAGE_CAPTURE_PROFILE = 0x000D;
    /**
      * This parameter selects the scanner illuminator to be used for decoding.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link IlluminationType}.
      */
    public final static int ILLUMINATION_TYPE = 0x000E;
    /**
      * This parameter enables the use of the good read notification on a successful read.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GOOD_READ_ENABLE = 0x0010;
    /**
      * This parameter enables the use of the green spot notification on a successful read.   
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GREEN_SPOT_ENABLE = 0x0011;
    /**
      * This parameter enables the use of the vibrator notification on a successful read.   
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GOOD_READ_VIBRATE_ENABLE = 0x0012;
     /**
      * This parameter enables the use of the led notification on a successful read.   
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GOOD_READ_LED_ENABLE = 0x0013;
     /**
      * This parameter enables the removal of all characters in the range 0x00-0x1F and the single    
      * character 0x7F from the scanned data. The length check for each symbology is evaluated before any 
      * characters are removed. Characters in the code ID, prefix, suffix, or separator won't be removed.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int REMOVE_NON_PRINTABLE_CHARS = 0x0018;
     /**
      * This parameter indicates the number of notifications to produce on a successful read.    
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int GOOD_READ_COUNT = 0x0020;
     /**
      * This parameter indicates the duration of each notification on a successful read.     
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int GOOD_READ_DURATION = 0x0022;
     /**
      * This parameter selects the symbology identifier to be transmitted along with the scanned data.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link SendCodeID}.
      */
    public final static int SEND_CODE_ID = 0x0025;
     /**
      * This parameter is a string of Unicode characters sent immediatly before symbology identifier.      
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int LABEL_PREFIX = 0x0026;
     /**
      * This parameter is a string of Unicode characters sent ent after the final character in data.      
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int LABEL_SUFFIX = 0x0027;
     /**
      * This parameter is the time the target beam is on before scanner attempts to read. 
      * <ul>
      * <li> 0 = 0.25 seconds </li> 
      * <li> 1 = 0.5 seconds </li>
      * <li> 2 = 1 seconds </li>
      * <li> 3 = 15 seconds </li>
      * <li> 4 = 2 seconds </li>
      * </ul>
      * <p>
      * If the value exceeds the range, the value is set at full scale.     
      * The class of the property is {@link NumericProperty}.
      */
    public final static int TARGET_TIMEOUT = 0x0029;
     /**
      * This parameter is the maximum time the scanner is on after trigger release when using 
      * Release Scan target beam mode. If the value exceeds the range, the value is set at full scale.       
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int TARGET_RELEASE_TIMEOUT = 0x002A;
     /**
      * This parameter is s a string of Unicode characters that replaces each occurrence of GS (ASCII code 0x1D) in the scanned data.       
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int GS_SUBSTITUTION = 0x002C;
     /**
      * This parameter is the maximum time the scanner remains on without reading a barcode. 
      * If the value exceeds the range, the value is set at full scale. 
      * The amount of time is represented in milliseconds.      
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DECODE_TIMEOUT = 0x002D;
     /**
      * This parameter is the delay between notifications on a successful read.        
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int GOOD_READ_INTERVAL = 0x002E;
     /**
      * This parameter is the volume of the audio notification on a successfull read.        
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int GOOD_READ_AUDIO_VOLUME = 0x002F;
     /**
      * This parameter is the file used for the audio notification on a successfull read.        
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int GOOD_READ_AUDIO_FILE = 0x0030;
     /**
      * This parameter activates the notification mechanism. 
      * It enables the Display Notification capability via a displaying message. 
      * This means that the decoded label is displayed through a pop-up message, an Android Toast, on the device's screen.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DISPLAY_NOTIFICATION_ENABLE = 0x0031;
     /**
     * @hide
     */
    public final static int GOOD_READ_AUDIO_TONE = 0x0032;
     /**
      * This parameter selects the scanner audio notification mode.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ToneNotificationMode}.
      */
    public final static int GOOD_READ_AUDIO_MODE = 0x0033;
     /**
      * This parameter selects the audio channel to use for the scanner notification.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ToneNotificationChannel}.
      */
    public final static int GOOD_READ_AUDIO_CHANNEL = 0x0034;
    /**
     * This parameter is the timeout to set during image decoding.
     * The amount of time is represented in milliseconds.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int IMAGE_DECODE_TIMEOUT = 0x0035;
    /**
     * This parameter is set to true to enable check of GS1 format for GS1 symbologies.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int GS1_CHECK = 0x0036;
    /**
     * This parameter is set to true to convert the GS1 barcode string in the GS1 readable string format.
     * It is used only if {@link #GS1_CHECK} is set to true.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int GS1_STRING_FORMAT = 0x0037;
    /**
     * This parameter indicates the delay after which the good read LEDs are turned off. This is valid only in case of a single good read.
     * The value range is between 20 and 5000 for  normal scanning sessions. The maximum value is lowered to 500 in case of a scan mode
     * different from SINGLE or when the target mode is set to RELEASE_SCAN.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_TIMEOUT = 0x0038;
     /**
      * This parameter enables the ability to collect a defined number of barcodes in a single session and transmit them at the same time.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MULTISCAN_ENABLE = 0x0050;
     /**
      * This parameter defines the number of required labels to be read before automatically ending a good read transaction.     
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int MULTISCAN_REQUIRED_LABELS = 0x0051;
     /**
      * This parameter defines whether to notify each successfully read label during Multi Scan operation.       
      * <p>
      * The decoding session is ended successfully and all the collected labels are returned together, only if the labelCount is reached. 
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MULTISCAN_NOTIFICATION_ENABLE = 0x0052;
     /**
      * This parameter selects the behaviour when partial results are present.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link PartialResultMode}.
      */
    public final static int MULTISCAN_PARTIAL_RESULT_MODE = 0x0053;
     /**
      * This parameter sets the inverse mode for linear barcode symbologies.    
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link InverseMode}.
      */
    public final static int INVERSE_1D_SYMBOLOGIES = 0x0060;
     /**
      * This parameter sets the inverse mode for 2D barcode symbologies.    
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link InverseMode}.
      */
    public final static int INVERSE_2D_SYMBOLOGIES = 0x0061;
     /**
      * This parameter enables the use of presentation mode.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int PRESENTATION_MODE_ENABLE = 0x0062;
     /**
      * This parameter enables the use of the aimer in presentation mode.      
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int PRESENTATION_MODE_AIMER_ENABLE = 0x0063;
     /**
      * This parameter sets sensitivity in presentation mode.    
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int PRESENTATION_MODE_SENSITIVITY = 0x0064;
     /**
      * This parameter selects the scan mode.    
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ScanMode}.
      */
    public final static int SCAN_MODE = 0x0065;
     /**
      * This parameter is the minimum time allowed between reads of the same barcode label. 
      * <p>
      * When the device decodes a label and sees the same one before this timeout is expired, 
      * the second result will be ignored. This timeout works when scanMode is set to HOLD_MULTIPLE, PULSE_MULTIPLE 
      * or ALWAYS_ON. The amount of time is represented in milliseconds.     
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DOUBLE_READ_TIMEOUT = 0x0066;
     /**
      * This parameter selects the scanner illumination pulse length. 
      * <p>
      * The scan engine illumination is a pulsed light. It is characterized by a light pulse length and a frequency
      * usually equal to the frame rate frequency. This property affects only the pulse length. With a longer light
      * pulse the scan engine can decode a more distant target and DOF performance is enhanced on low environment
      * light condition. In the counterside, a shorter light pulse makes the scan engine more motion tollerant.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link IlluminationTime}.
      */
    public final static int ILLUMINATION_TIME = 0x0067;
    /**
     * @hide
     */
    public final static int LINEAR_RASTER = 0x0068;
    /**
     * @hide
     * This parameter forcefully disable hardware generation from the scanengine
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int FORCE_HW_ACCELERATION_DISABLED = 0x0069;
    /**
     * This parameter enhances the Depth of Field.
     * <p></p>
     * Depending on barcode typology, quality and light condition it could enhance the Depth of Field.
     * Try to enable it only if you need to increment the DoF.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ENHANCE_DOF_ENABLE = 0x006A;

    //
    // Code 39 definitions
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_ENABLE = 0x0100;
     /**
      * This parameter enables the reading of Code 39 barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_SHORT_QUIET_ZONES = 0x0101;
     /**
      * This parameter requires the use of checksum characters to verify a barcode.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_ENABLE_CHECK = 0x0102;
     /**
      * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_SEND_CHECK = 0x0103;
     /**
      * This parameter enables or disables the Full Ascii conversion.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_FULL_ASCII = 0x0105;
     /**
      * This parameter is one of the two configurable label lengths. It can be used
      * as a single fixed accepted length, when {@link #CODE39_LENGTH_CONTROL} is set to {@link LengthControlMode#ONE_FIXED}.
      * When {@link LengthControlMode#TWO_FIXED} is enabled, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      * 
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *     
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE39_LENGTH_CONTROL
      */
    public final static int CODE39_LENGTH1 = 0x0120;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE39_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE39_LENGTH_CONTROL
      */
    public final static int CODE39_LENGTH2 = 0x0121;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int CODE39_LENGTH_CONTROL = 0x0122;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE39_USER_ID = 0x0123;
     /**
      * This parameter controls the aggressiveness for the Code 39 symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link Code39Aggressiveness}. 
      */
    public final static int CODE39_AGGRESSIVENESS = 0x0124;

    //
    // Trioptic definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int TRIOPTIC_ENABLE = 0x0108;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int TRIOPTIC_USER_ID = 0x0125;

    //
    // Code 32 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE32_ENABLE = 0x0110;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE32_USER_ID = 0x0127;

    //
    // Discrete 2/5 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int D25_ENABLE = 0x0200;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #D25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #D25_LENGTH_CONTROL
      */
    public final static int D25_LENGTH1 = 0x0220;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #D25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #D25_LENGTH_CONTROL
      */
    public final static int D25_LENGTH2 = 0x0221;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int D25_LENGTH_CONTROL = 0x0222;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int D25_USER_ID = 0x0223;

    //
    // Matrix 2/5 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int M25_ENABLE = 0x0208;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #M25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #M25_LENGTH_CONTROL
      */
    public final static int M25_LENGTH1 = 0x0224;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #D25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #D25_LENGTH_CONTROL
      */
    public final static int M25_LENGTH2 = 0x0225;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int M25_LENGTH_CONTROL = 0x0226;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int M25_USER_ID = 0x0227;
     /**
      * This parameter enables the reading of Matrix 2 of 5 barcode labels with short quiet zones.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int M25_SHORT_QUIET_ZONES = 0x022F;

    //
    // Interleaved 2/5 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int I25_ENABLE = 0x0210;
     /**
      * This parameter equires the use of checksum characters to verify a barcode.      
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int I25_ENABLE_CHECK = 0x0212;
     /**
      * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int I25_SEND_CHECK = 0x0213;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #I25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #I25_LENGTH_CONTROL
      */
    public final static int I25_LENGTH1 = 0x0228;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #I25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #I25_LENGTH_CONTROL
      */
    public final static int I25_LENGTH2 = 0x0229;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int I25_LENGTH_CONTROL = 0x022A;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int I25_USER_ID = 0x022B;
     /**
      * This parameter enables or disables the ITF14 symbology. It could be used to include a GTIN. It always checks and transmits the checksum character.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ITF14_ENABLE = 0x022C;
     /**
      * This parameter controls the aggressiveness for the Interleaved 2/5 symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link Interleaved25Aggressiveness}. 
      */
    public final static int I25_AGGRESSIVENESS = 0x022D;
     /**
      * This parameter enables the reading of Interleaved 2 of 5 barcode labels with short quiet zones.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int I25_SHORT_QUIET_ZONES = 0x022E;

    //
    // Codabar definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_ENABLE = 0x0300;
     /**
      * This parameter equires the use of checksum characters to verify a barcode.      
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_ENABLE_CHECK = 0x0302;
     /**
      * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_SEND_CHECK = 0x0303;
     /**
      * This parameter enables/disables the transmission of the decoded star and stop characters. The start and stop characters will both be translated as A, B, C or D.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_SEND_START = 0x0305;
     /**
      * This parameter restricts the decoding to only read labels that conform to CLSI specifications. Label length must be 14 and the data is split into fields of 1, 4, 5 and 4 characters separated by spaces.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_CLSI = 0x0306;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODABAR_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODABAR_LENGTH_CONTROL
      */
    public final static int CODABAR_LENGTH1 = 0x0320;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODABAR_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODABAR_LENGTH_CONTROL
      */
    public final static int CODABAR_LENGTH2 = 0x0321;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int CODABAR_LENGTH_CONTROL = 0x0322;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODABAR_USER_ID = 0x0323;
     /**
      * This parameter enables the reading of Codabar barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_SHORT_QUIET_ZONES = 0x0324;

    //
    // Code 93 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE93_ENABLE = 0x0400;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE93_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE93_LENGTH_CONTROL
      */
    public final static int CODE93_LENGTH1 = 0x0420;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE93_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE93_LENGTH_CONTROL
      */
    public final static int CODE93_LENGTH2 = 0x0421;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int CODE93_LENGTH_CONTROL = 0x0422;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE93_USER_ID = 0x0423;
     /**
      * This parameter enables the reading of Code 93 barcode labels with short quiet zones.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE93_SHORT_QUIET_ZONES = 0x042B;

    //
    // Code 128 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE128_ENABLE = 0x0408;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE128_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE128_LENGTH_CONTROL
      */
    public final static int CODE128_LENGTH1 = 0x0424;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE128_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE128_LENGTH_CONTROL
      */
    public final static int CODE128_LENGTH2 = 0x0425;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int CODE128_LENGTH_CONTROL = 0x0426;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE128_USER_ID = 0x0427;
     /**
      * This parameter enables or disables the GS1 Code128 symbology.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE128_GS1_ENABLE = 0x040C;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE128_GS1_USER_ID   = 0x0428;
     /**
      * This parameter controls the aggressiveness for the Code128 symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link Code128Aggressiveness}. 
      */
    public final static int CODE128_AGGRESSIVENESS = 0x0429;
     /**
      * This parameter enables the reading of Code128 barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE128_SHORT_QUIET_ZONES = 0x042A;
    /**
     * This parameter selects the support to the extended ASCII (ASCII code from 128 to 255).
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link Code128ExtendedAsciiMode}.
     */
    public final static int CODE128_EXTENDED_ASCII = 0x042C;
    /**
     * This parameter controls the character set in use for the decoded label.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link CharacterSetMode}.
     */
    public final static int CODE128_CHARACTER_SET_MODE = 0x042D;

    //
    // UPC-A definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_ENABLE = 0x0500;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_SEND_CHECK = 0x0502;
     /**
      * This parameter includes the system digit in the label transmission. For UPC-A the system digit is always zero.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_SEND_SYS = 0x0503;
     /**
      * This parameter allows to expand the UPC-A labels to their EAN-13 equivalents. Any EAN-13 parameters will then apply to the result.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_TO_EAN13 = 0x0504;
     /**
      * This parameter allows to use UPC-A labels in composite barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_COMPOSITE_ENABLE = 0x0505;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int UPCA_USER_ID = 0x0521;

    //
    // UPC-E definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_ENABLE = 0x0508;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_SEND_CHECK = 0x050A;
     /**
      * This parameter includes the system digit in the label transmission. For UPC-E the system digit is always zero.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_SEND_SYS = 0x050B;
     /**
      * This parameter allows to expand the UPC-E labels to their UPC-A equivalents. Any UPC-A parameters will then apply to the result.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_TO_UPCA = 0x050C;
     /**
      * This parameter allows to use UPC-E labels in composite barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_COMPOSITE_ENABLE = 0x050D;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int UPCE_USER_ID = 0x0523;
     /**
      * This parameter enables decoding of the UPC-E1 Symbology variation of UPC-E code.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE1_ENABLE = 0x0509;

    //
    // EAN-13 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_ENABLE = 0x0510;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_SEND_CHECK = 0x0512;
     /**
      * This parameter includes the system digit in the label transmission, it configures whether the first character should be transmitted.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_SEND_SYS = 0x0513;
     /**
      * This parameter allows to identify ISBN labels and append the check digit (per ISBN guidelines) to the end of the label.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_TO_ISBN = 0x0514;
     /**
      * This parameter allows to identify ISSN labels and append the check digit (per ISSN guidelines) to the end of the label.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_TO_ISSN = 0x0515;
     /**
      * This parameter allows to use EAN-13 labels in composite barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_COMPOSITE_ENABLE = 0x0516;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int EAN13_USER_ID = 0x0525;

    //
    // EAN-8 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN8_ENABLE = 0x0518;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN8_SEND_CHECK = 0x051A;
 
     /**
      * This parameter allows to expand the EAN-8 labels to their EAN-13 equivalents. Any EAN-13 parameters will then apply to the result.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN8_TO_EAN13 = 0x051B;
     /**
      * This parameter allows to use EAN-8 labels in composite barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN8_COMPOSITE_ENABLE = 0x0528;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int EAN8_USER_ID = 0x0527;

    //
    // UPC/EAN Extensions definitions
    //
     /**
      * This parameter requires a 2 digit extension to be verified for a successful decode of a label.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN_EXT_ENABLE_2_DIGIT = 0x051C;
     /**
      * This parameter requires a 5 digit extension to be verified for a successful decode of a label.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN_EXT_ENABLE_5_DIGIT = 0x051D;
     /**
      * This parameter indicates that are read only barcode with the supplemental label. If the parameter is false are read barcodes with or without the supplemental labels.          
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN_EXT_REQUIRE = 0x051F;

    //
    // UPC/EAN Options
    //
     /**
      * This parameter enables the reading of UPC and EAN barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPC_EAN_SHORT_QUIET_ZONES = 0x0520;
     /**
      * This parameter controls the aggressiveness for the UPC and EAN symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link UpcEanAggressiveness}. 
      */
    public final static int UPC_EAN_AGGRESSIVENESS = 0x0526;

    //
    // MSI definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_ENABLE = 0x0608;
     /**
      * This parameter requires that a MSI label contains two check digits.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_REQUIRE_2_CHECK = 0x060A;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_SEND_CHECK = 0x060B;
     /**
      * This parameter allows to interpret the second check digit as module 11 instead of module 10.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_CHECK_2_MOD_11 = 0x060C;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MSI_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MSI_LENGTH_CONTROL
      */
    public final static int MSI_LENGTH1 = 0x0624;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MSI_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MSI_LENGTH_CONTROL
      */
    public final static int MSI_LENGTH2 = 0x0625;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int MSI_LENGTH_CONTROL = 0x0626;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int MSI_USER_ID = 0x0627;
     /**
      * This parameter controls the aggressiveness for the MSI symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link MsiAggressiveness}. 
      */
    public final static int MSI_AGGRESSIVENESS = 0x0628;
     /**
      * This parameter enables the reading of MSI barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_SHORT_QUIET_ZONES = 0x0629;

    //
    // RSS-14 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_14_ENABLE = 0x0800;
     /**
      * This parameter convert the Gs1DataBar_14 label to a GS1-128 barcode.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_14_GS1_128_MODE = 0x0803;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int GS1_14_USER_ID = 0x0821;

    //
    // RSS Limited definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_LIMIT_ENABLE = 0x0808;
     /**
      * This parameter convert the Gs1DataBar_Limited label to a GS1-128 barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_LIMIT_GS1_128_MODE = 0x080B;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int GS1_LIMIT_USER_ID = 0x0823;

    //
    // RSS Expanded definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_EXP_ENABLE = 0x0810;
     /**
      * This parameter convert the Gs1DataBar_Expanded label to a sequence of one or more GS1-128 barcodes.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_EXP_GS1_128_MODE = 0x0813;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #GS1_EXP_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #GS1_EXP_LENGTH_CONTROL
      */
    public final static int GS1_EXP_LENGTH1 = 0x0824;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #GS1_EXP_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #GS1_EXP_LENGTH_CONTROL
      */
    public final static int GS1_EXP_LENGTH2 = 0x0825;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int GS1_EXP_LENGTH_CONTROL = 0x0826;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int GS1_EXP_USER_ID = 0x0827;

    //
    // Postal Code definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int US_POSTNET_ENABLE = 0x0910;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int US_PLANET_ENABLE = 0x0911;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int USPS_4STATE_ENABLE = 0x0913;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ROYAL_MAIL_ENABLE = 0x0915;
     /**
      * This parameter includes the Royal Mail checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ROYAL_MAIL_SEND_CHECK = 0x0916;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int AUSTRALIAN_POST_ENABLE = 0x0917;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int KIX_CODE_ENABLE = 0x0918;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int JAPANESE_POST_ENABLE = 0x0919;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int US_PLANET_CODE_USER_ID = 0x092A;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int US_POSTNET_CODE_USER_ID = 0x092B;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int USPS_4STATE_CODE_USER_ID = 0x092C;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int ROYAL_MAIL_CODE_USER_ID = 0x092E;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int AUSTRALIAN_CODE_USER_ID = 0x092F;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int KIX_CODE_USER_ID = 0x0930;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int JAPANESE_POST_CODE_USER_ID = 0x0931;

    //
    // PDF417 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int PDF417_ENABLE = 0x0A00;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #PDF417_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #PDF417_LENGTH_CONTROL
      */
    public final static int PDF417_LENGTH1 = 0x0A20;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #PDF417_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #PDF417_LENGTH_CONTROL
      */
    public final static int PDF417_LENGTH2 = 0x0A21;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int PDF417_LENGTH_CONTROL = 0x0A22;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int PDF417_USER_ID = 0x0A23;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int PDF417_CHARACTER_SET_MODE = 0x0A02;

    //
    // MicroPDF417 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MICROPDF417_ENABLE = 0x0A08;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MICROPDF417_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MICROPDF417_LENGTH_CONTROL
      */
    public final static int MICROPDF417_LENGTH1 = 0x0A24;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MICROPDF417_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MICROPDF417_LENGTH_CONTROL
      */
    public final static int MICROPDF417_LENGTH2 = 0x0A25;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int MICROPDF417_LENGTH_CONTROL = 0x0A26;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int MICROPDF417_USER_ID = 0x0A27;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int MICROPDF417_CHARACTER_SET_MODE = 0x0A0A;

    //
    // UCC EAN Composite
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int COMPOSITE_ENABLE = 0x0A30;
     /**
      * This parameter controls UPC/EAN label recognition mode.   
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link UpcEanCompositeMode}. 
      */
    public final static int COMPOSITE_EAN_UPC_MODE = 0x0A32;
     /**
      * This parameter convert the Composite label to a sequence of one or more GS1-128 barcodes.    
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int COMPOSITE_GS1_128_MODE = 0x0A33;
     /**
      * This parameter enable linear code transmission.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int COMPOSITE_LINEAR_TRANSMISSION_ENABLE = 0x0A34;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int COMPOSITE_USER_ID = 0x0A53;

    //
    // DataMatrix definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATAMATRIX_ENABLE = 0x0B00;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #DATAMATRIX_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #DATAMATRIX_LENGTH_CONTROL
      */
    public final static int DATAMATRIX_LENGTH1 = 0x0B20;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #DATAMATRIX_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #DATAMATRIX_LENGTH_CONTROL
      */
    public final static int DATAMATRIX_LENGTH2 = 0x0B21;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int DATAMATRIX_LENGTH_CONTROL = 0x0B22;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int DATAMATRIX_USER_ID = 0x0B23;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int DATAMATRIX_CHARACTER_SET_MODE = 0x0B02;
     /**
      * This parameter control the operating mode.   
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DatamatrixOpMode}. 
      */
    public final static int DATAMATRIX_OPERATING_MODE = 0x0B03;
     /**
      * This parameter controls the mirror mode. It controls the scanning capabilities of Data Matrix barcodes from mirror reflections.    
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DatamatrixMirror}. 
      */
    public final static int DATAMATRIX_MIRROR = 0x0B04;
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATAMATRIX_GS1_ENABLE = 0x0B05;
     /**
      * This parameter controls the aggressiveness for the Datamatrix symbology.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DatamatrixAggressiveness}. 
      */
    public final static int DATAMATRIX_AGGRESSIVENESS = 0x0B06;
     /**
      * This parameter enables or disables DataMatrix Rectangular Extended dimensions (DMRE).
      * New AIM specs introduce new Datamatrix format:
      * 8x48, 8x64, 12x48, 12x64, 16x64, 24x32, 24x36, 24x48, 24x64, 26x32, 26x40, 26x48, 26x64
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATAMATRIX_DMRE = 0x0B0A;

    //
    // MaxiCode definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MAXICODE_ENABLE = 0x0B08;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MAXICODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MAXICODE_LENGTH_CONTROL
      */
    public final static int MAXICODE_LENGTH1 = 0x0B24;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MAXICODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MAXICODE_LENGTH_CONTROL
      */
    public final static int MAXICODE_LENGTH2 = 0x0B25;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int MAXICODE_LENGTH_CONTROL = 0x0B26;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int MAXICODE_USER_ID = 0x0B27;

    //
    // QR Code definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_ENABLE = 0x0B10;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #QRCODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #QRCODE_LENGTH_CONTROL
      */
    public final static int QRCODE_LENGTH1 = 0x0B28;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #QRCODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #QRCODE_LENGTH_CONTROL
      */
    public final static int QRCODE_LENGTH2 = 0x0B29;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int QRCODE_LENGTH_CONTROL = 0x0B2A;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int QRCODE_USER_ID = 0x0B2B;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int QRCODE_CHARACTER_SET_MODE = 0x0B12;
     /**
      * This parameter enables Wi-Fi configuration through Wi-Fi QR Code.      
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_WIFI_ENABLE = 0x30E41;
     /**
      * This parameter enables or disables the GS1-QR Code symbology.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_GS1_ENABLE = 0x0B13;
     /**
      * This parameter enables device configuration through Scan2Deploy QR Codes.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_S2D_ENABLE = 0x30E42;
     /**
      * This parameter controls the mirror mode.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link QRMirror}. 
      */
    public final static int QRCODE_MIRROR = 0x0B07;
     /**
      * This parameter enables or disables Absolute Grid algorithm. It performs
      * a geometric reconstruction of the QR Code grid by regularizing it. This algorithm is executed
      * only when the standard one fails. It may slow down decoding rate.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_ABSOLUTE_GRID = 0x0B09;

    //
    // Micro QR Code definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MICRO_QR_ENABLE = 0x0B14;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MICRO_QR_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MICRO_QR_LENGTH_CONTROL
      */
    public final static int MICRO_QR_LENGTH1 = 0x0B30;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MICRO_QR_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MICRO_QR_LENGTH_CONTROL
      */
    public final static int MICRO_QR_LENGTH2 = 0x0B31;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int MICRO_QR_LENGTH_CONTROL = 0x0B32;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int MICRO_QR_USER_ID = 0x0B33;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int MICRO_QR_CHARACTER_SET_MODE = 0x0B16;

    //
    // Aztec Code definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int AZTEC_ENABLE = 0x0B18;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #AZTEC_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #AZTEC_LENGTH_CONTROL
      */
    public final static int AZTEC_LENGTH1 = 0x0B2C;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #AZTEC_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #AZTEC_LENGTH_CONTROL
      */
    public final static int AZTEC_LENGTH2 = 0x0B2D;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int AZTEC_LENGTH_CONTROL = 0x0B2E;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int AZTEC_USER_ID = 0x0B2F;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int AZTEC_CHARACTER_SET_MODE = 0x0B1A;

    //
    // Digimarc Barcode definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DIGIMARC_ENABLE = 0x10000;

    //
    // DotCode definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DOTCODE_ENABLE = 0x0C00;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #DOTCODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #DOTCODE_LENGTH_CONTROL
      */
    public final static int DOTCODE_LENGTH1 = 0x0C20;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #DOTCODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #DOTCODE_LENGTH_CONTROL
      */
    public final static int DOTCODE_LENGTH2 = 0x0C21;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int DOTCODE_LENGTH_CONTROL = 0x0C22;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int DOTCODE_USER_ID = 0x0C23;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int DOTCODE_CHARACTER_SET_MODE = 0x0C02;

    //
    // ISBT 128 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ISBT_128_ENABLE = 0x0D00;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int ISBT_128_USER_ID = 0x0D01;
     /**
      * This parameter allows the concatenation of common concatenated pairs.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ISBT_128_COMMONLY_CONCATENATED_PAIRS = 0x0D02;
     /**
      * This parameter defines the decoding mode for ISBT 128 barcodes.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link Isbt128Mode}. 
      */
    public final static int ISBT_128_MODE = 0x0D03;

    //
    // Wedge - Keyboard, Intent mode & Web
    //
     /**
      * This parameter enables the the keystroke mode for the Decode Wedge capability.
      * <p>
      * This means that the label is sent to the foreground application in the form of key events.         
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WEDGE_KEYBOARD_ENABLE = 0x11170;
     /**
      * This parameter enables the input of the keystrokes only in input areas with active focus and an IME active, such as a touch keyboard.
      * <p>
      * This means that the label will be sent to the foreground application in the form of key events only when previous 
      * conditions will be met. Instead, set to false, it will emulate keystrokes directly into the foreground activity. , 
      * Be aware, keeping this deactivated could lead to undesired behaviors.         
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WEDGE_KEYBOARD_ONLY_ON_FOCUS = 0x11171;
     /**
      * This parameter indicates the method by which the KeyboardWedge operates.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link KeyWedgeMode}. 
      */
    public final static int WEDGE_KEYBOARD_DELIVERY_MODE = 0x11172;
    /**
     * @hide
     */
    public final static int WEDGE_KEYBOARD_INJECTION2COMMIT = 0x11173;
     /**
      * This parameter enables the intent mode for the Decode Wedge capability.
      * <p>
      * This means that the label is sent to the foreground application in the form of an implicit intent. 
      * In order to retrieve the label type string, "com.datalogic.decodewedge.label_type" is the name argument 
      * to be used with Intent.getStringExtra(). In order to retrieve the output data as string, 
      * "com.datalogic.decodewedge.data_string" is the name argument to be used with Intent.getStringExtra() . In case of 
      * concatenated barcodes, the decode data is concatenated and sent out as a single string. In order to retrieve the 
      * output data as a list of byte arrays, "com.datalogic.decodewedge.decode_data" is the name argument to be used with 
      * Intent.getSerializableExtra(). For barcode symbologies that support concatenation, the decode data is stored in 
      * multiple byte arrays (one byte array per bar code). Clients can get data in each byte array by passing an index.         
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WEDGE_INTENT_ENABLE = 0x30D40;
     /**
      * This parameter is the intent action name. The default value is "com.datalogic.decodewedge.decode_action". 
      * <p>       
      * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_ACTION_NAME = 0x30D41;
     /**
      * This parameter is the intent category name. The default value is "com.datalogic.decodewedge.decode_category". 
      * <p>       
      * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_CATEGORY_NAME = 0x30D42;
     /**
      * This parameter indicates the method by which the intent is delivered.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link IntentDeliveryMode}. 
      */
    public final static int WEDGE_INTENT_DELIVERY_MODE = 0x30D43;
     /**
      * This parameter indicates the corresponding intent extra tag, associated to a byte array containing the read label. The default value is EXTRA_BARCODE_DATA. 
      * <p>       
      * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_EXTRA_BARCODE_DATA = 0x30D44;
     /**
      * This parameter indicates the corresponding intent extra tag, associated to a string containing the type of read label. The default value is EXTRA_BARCODE_TYPE.   
      * <p>       
      * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_EXTRA_BARCODE_TYPE = 0x30D45;
     /**
      * This parameter indicates the corresponding intent extra tag, associated to a string containing the read label. The default value is EXTRA_BARCODE_STRING. 
      * <p>       
      * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_EXTRA_BARCODE_STRING = 0x30D46;
     /**
      * This parameter enables the Decode Wedge capability for direct web browsing. 
      * <p>
      * Each time a label is decoded successfully and a valid URL is found, the available and selected Internet web browsing application will be launched pointing to the desired URL.        
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WEDGE_WEB_ENABLE = 0x30E40;

    //
    // External formatting
    //
     /**
      * @hide
      * This parameter enables the external formatting service.
      * <p>       
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EXTERNAL_FORMATTING_ENABLE = 0x40000;

    //
    // Visual formatting
    //
     /**
      * @hide
      * This parameter enables the external formatting service.
      * <p>       
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int VISUAL_FORMATTING_ENABLE = 0x40100;
     /**
      * @hide
      * This parameter stores the path to the visual formatting script.
      * <p>       
      * The class of the property is {@link TextProperty}.
      */
    public final static int VISUAL_FORMATTING_PATH = 0x40101;

     /**
     * @hide
     */
    public final static int VISUAL_FORMATTING_TIMEOUT = 0x40102;

    /**
     * @hide
     */
    public final static int VISUAL_FORMATTING_ACTIVE_ITEM = 0x40103;

    //
    // ECI Policy
    //
     /**
      * This parameter selects the policy used to handle ECI. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ECIPolicy}. 
      */
    public final static int ECI_POLICY = 0x40200;

    //
    // OCR
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int OCR_ENABLE = 0x40300;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int OCR_USER_ID = 0x40301;
 
     /**
      * This parameter allows to read passport booklet in TD3 size. The data of the machine-readable zone consists of two rows of 44 characters each.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int OCR_PASSPORT_ENABLE = 0x40302;
     /**
      * This parameter allows to read official travel document in TD1 size. The data of the machine-readable zone consists of three rows of 30 characters each.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int OCR_ID_ENABLE = 0x40303;
     /**
      * This parameter allows to set minimum confidence used by the OCR algorithm. An higher confidence decreases misdecoding probabilities.          
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int OCR_CONFIDENCE = 0x40304;
     /**
      * This parameter specifies how many decoded frames must match before accepting OCR data.           
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int OCR_MULTIFRAME = 0x40305;

    //
    // Camera
    //
    /**
     * This parameter indicates the input type to use for decoding.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link com.datalogic.decode.configuration.InputType}.
     */
    public final static int INPUT_TYPE = 0x40401;
    /**
     * This parameter indicates the display mode in which to show the
     * camera preview in case the input type is set to camera.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link com.datalogic.decode.configuration.PreviewDisplayMode}.
     */
    public final static int PREVIEW_DISPLAY_MODE = 0x40402;
    /**
     * This parameter indicates the Y coordinate of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in portrait.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_X = 0x40403;
    /**
     * This parameter indicates the Y coordinate of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in portrait.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_Y = 0x40404;
    /**
     * This parameter indicates the width of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in portrait.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_WIDTH = 0x40405;
    /**
     * This parameter indicates the height of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in portrait.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_HEIGHT = 0x40406;
    /**
     * This parameter indicates the X coordinate of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in landscape.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_X = 0x40407;
    /**
     * This parameter indicates the Y coordinate of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in landscape.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_Y = 0x40408;
    /**
     * This parameter indicates the width of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in landscape.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_WIDTH = 0x40409;
    /**
     * This parameter indicates the height of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in landscape.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_HEIGHT = 0x4040A;

    //
    // Frame capture
    //
     /**
      * This parameter enable the feauture that configures the scanner to capture store and provide frames.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int FRAME_CAPTURE_ENABLE = 0x50000;
     /**
      * This parameter indicates the directory where will be stored the frames saved by the Scanner. Only directory under getExternalStorageDirectory() are supported (eg. /storage/emulated/0/).       
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int FRAME_CAPTURE_FILE_PATH = 0x50001;
     /**
      * This parameter selects the format used for storing the frames captured by the Scanner.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link FrameCaptureFormat}. 
      */
    public final static int FRAME_CAPTURE_FORMAT = 0x50002;
     /**
      * This parameter selects the Scanner frame capture mode.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link FrameCaptureMode}. 
      */
    public final static int FRAME_CAPTURE_MODE = 0x50003;
     /**
      * This parameter enables the Scanner to store captured frames.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int FRAME_CAPTURE_STORAGE_ENABLE = 0x50004;

    //
    // HAN XIN
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int HAN_XIN_ENABLE = 0x40500;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #HAN_XIN_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #HAN_XIN_LENGTH_CONTROL
      */
    public final static int HAN_XIN_LENGTH1 = 0x40501;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #HAN_XIN_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #HAN_XIN_LENGTH_CONTROL
      */
    public final static int HAN_XIN_LENGTH2 = 0x40502;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int HAN_XIN_LENGTH_CONTROL = 0x40503;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int HAN_XIN_USER_ID = 0x40504;

    /**
     * @hide
     * The constructor is defined hide and private to avoid Apps create an instance of this class.
     */
    private PropertyID() {}

   /**
     * Returns the name of the constant whose value is the given id.
     * @param id
     *            <code>int</code> unique identifier of the property.
     * @return String the name of the constant.
     */
    public static String Name(int id) {
        return null;
    }
}
