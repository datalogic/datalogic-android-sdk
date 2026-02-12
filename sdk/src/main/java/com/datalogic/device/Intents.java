package com.datalogic.device;

import com.datalogic.device.configuration.ConfigurationManager;
import com.datalogic.device.configuration.PropertyID;
import com.datalogic.device.battery.BatteryDefinitions;
/**
* Datalogic Intents allow to be notified about system events such as interactions between Device and Cradle (ACTION_CRADLE_*) or device configuration changed (ACTION_CONFIGURATION_*).
* App are also allowed to send lock/unlock command to the Cradle ({@link #ACTION_CRADLE_LOCK_DEVICE}/{@link #ACTION_CRADLE_UNLOCK_DEVICE}) or configuration change request ().
*/
public final class Intents {

    /**
     * <code>ACTION_CRADLE_LOCK_DEVICE</code> This intent allow the user to lock the device into the cradle. When invoked, the system will communicate with the cradle to lock the device.
     */
    public static final String ACTION_CRADLE_LOCK_DEVICE = "com.datalogic.device.intent.action.cradle.LOCK_DEVICE";

    /**
     * <code>ACTION_CRADLE_UNLOCK_DEVICE</code> This intent allow the user to unlock the device from the cradle. When invoked, the system will communicate with the cradle to unlock the device.
     */
    public static final String ACTION_CRADLE_UNLOCK_DEVICE = "com.datalogic.device.intent.action.cradle.UNLOCK_DEVICE";

    /**
     * <code>ACTION_CRADLE_DEVICE_CORRECTLY_INSERTED</code> Broadcast Action: Sent when the device has been correctly inserted into the cradle.
     */
    public static final String ACTION_CRADLE_DEVICE_CORRECTLY_INSERTED = "com.datalogic.device.intent.action.cradle.DEVICE_CORRECTLY_INSERTED";

    /**
     * <code>ACTION_CRADLE_DEVICE_WRONGLY_INSERTED</code> Broadcast Action: Sent when the device has been wrongly inserted into the cradle.
     */
    public static final String ACTION_CRADLE_DEVICE_WRONGLY_INSERTED = "com.datalogic.device.intent.action.cradle.DEVICE_WRONGLY_INSERTED";

    /**
     * <code>ACTION_CRADLE_DEVICE_EXTRACTED</code> Broadcast Action: Sent when the device has been extracted from the cradle.
     */
    public static final String ACTION_CRADLE_DEVICE_EXTRACTED = "com.datalogic.device.intent.action.cradle.DEVICE_EXTRACTED";

    /**
     * <code>ACTION_TROLLEY_DEVICE_CORRECTLY_INSERTED</code> Broadcast Action: Sent when the device has been correctly inserted into the trolley.
     */
    public static final String ACTION_TROLLEY_DEVICE_CORRECTLY_INSERTED = "com.datalogic.device.intent.action.trolley.DEVICE_CORRECTLY_INSERTED";

    /**
     * <code>ACTION_TROLLEY_DEVICE_EXTRACTED</code> Broadcast Action: Sent when the device has been extracted from the trolley.
     */
    public static final String ACTION_TROLLEY_DEVICE_EXTRACTED = "com.datalogic.device.intent.action.trolley.DEVICE_EXTRACTED";

    /**
     * <code>ACTION_CRADLE_DEVICE_LOCKED</code> Broadcast Action: Sent when the device has been locked into the cradle.
     */
    public static final String ACTION_CRADLE_DEVICE_LOCKED = "com.datalogic.device.intent.action.cradle.DEVICE_LOCKED";

    /**
     * <code>ACTION_CRADLE_DEVICE_UNLOCKED</code> Broadcast Action: Sent when the device has been unlock from the cradle.
     */
    public static final String ACTION_CRADLE_DEVICE_UNLOCKED = "com.datalogic.device.intent.action.cradle.DEVICE_UNLOCKED";

    /**
     * <code>ACTION_CRADLE_UNLOCK_KEY_INSERTED</code> Broadcast Action: Sent when the unlock key has been inserted into the cradle (to unlock the device).
     */
    public static final String ACTION_CRADLE_UNLOCK_KEY_INSERTED = "com.datalogic.device.intent.action.cradle.UNLOCK_KEY_INSERTED";

    /**
     * <code>ACTION_CRADLE_UNLOCK_KEY_EXTRACTED</code> Broadcast Action: Sent when the unlock key has been extracted from the cradle (to lock the device).
     */
    public static final String ACTION_CRADLE_UNLOCK_KEY_EXTRACTED = "com.datalogic.device.intent.action.cradle.UNLOCK_KEY_EXTRACTED";

    /**
     * <code>ACTION_CRADLE_FIRMWARE_UPGRADE_STARTED</code> Broadcast Action: Sent when the system starts the firmware upgrade process with the cradle. <br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES} - int representing the number of bytes (firmware size) will be transferred to the cradle.
     */
    public static final String ACTION_CRADLE_FIRMWARE_UPGRADE_STARTED = "com.datalogic.device.intent.action.cradle.FIRMWARE_UPGRADE_STARTED";

    /**
     * <code>ACTION_CRADLE_FIRMWARE_UPGRADE_IN_PROGRESS</code> Broadcast Action: Sent during the firmware upgrade procedure, when a firmware block has been trasferred to the the cradle. <br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES} - int representing the number of bytes has been already transferred to the cradle.
     */
    public static final String ACTION_CRADLE_FIRMWARE_UPGRADE_IN_PROGRESS = "com.datalogic.device.intent.action.cradle.FIRMWARE_UPGRADE_IN_PROGRESS";

    /**
     * <code>ACTION_CRADLE_FIRMWARE_UPGRADE_COMPLETED</code> Broadcast Action: Sent when the cradle firmware upgrade procedure is completed. <br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES} - int representing the number of bytes transferred to the cradle.
     */
    public static final String ACTION_CRADLE_FIRMWARE_UPGRADE_COMPLETED = "com.datalogic.device.intent.action.cradle.FIRMWARE_UPGRADE_COMPLETED";

    /**
     * <code>ACTION_CRADLE_FIRMWARE_UPGRADE_ERROR</code> Broadcast Action: Sent when an error occurs during the cradle firmware upgrade procedure.
     */
    public static final String ACTION_CRADLE_FIRMWARE_UPGRADE_ERROR = "com.datalogic.device.intent.action.cradle.FIRMWARE_UPGRADE_ERROR";

   /**
     * <code>ACTION_SWITCH_FOREGROUND</code> Broadcast Action: Sent to notify the change of the foreground activity. <br>
     * The intent carries as extra data the activity that goes to the foreground.
     * The intent is sent any time an activity with an associated profile goes to or leaves the foreground.
     * When the activity goes to the foreground the extra data is the component name of the activity.
     * When the activity leaves the foreground the extra data is the component name of the new activity
     * that goes into the foreground no matter if the activity has an associated profile.
     * <br>
     * The intent will have the following extra values: <br>
     *
     * {@link #EXTRA_SWITCH_FOREGROUND_TO} - String containing the stringified form of the component name of the activity that goes to foreground.
     */
    public static final String ACTION_SWITCH_FOREGROUND = "com.datalogic.device.intent.action.profile.SWITCH_FOREGROUND";

    /**
     * <code>EXTRA_SWITCH_FOREGROUND_TO</code> Used as a String extra field in {@link #ACTION_SWITCH_FOREGROUND}.
     * The field contains the stringified form of the component name of the activity that goes to foreground.
     */
    public static final String EXTRA_SWITCH_FOREGROUND_TO = "com.datalogic.device.intent.extra.profile.SWITCH_FOREGROUND_TO";

    /**
     * <code>EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES</code> Used as an int extra field in {@link #ACTION_CRADLE_FIRMWARE_UPGRADE_STARTED},
     * {@link #ACTION_CRADLE_FIRMWARE_UPGRADE_IN_PROGRESS} and {@link #ACTION_CRADLE_FIRMWARE_UPGRADE_COMPLETED} that represents the number of bytes transferred to the cradle.
     */
    public static final String EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES = "com.datalogic.device.intent.action.cradle.FIRMWARE_TRASFERRED_BYTES";    

    /**
     * <code>ACTION_CRADLE_FAILURE_OCCURRED</code> Broadcast Action: Sent when a failure occurs on the cradle. <br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_CRADLE_FAILURE} - indicating which kind of failure occured on the cradle
     */
    public static final String ACTION_CRADLE_FAILURE_OCCURRED = "com.datalogic.device.intent.action.cradle.FAILURE_OCCURRED";

    /**
     * <code>ACTION_CRADLE_FAILURE_RECOVERED</code> Broadcast Action: Sent when a failure has been recovered on the cradle. <br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br> 
     * {@link #EXTRA_CRADLE_FAILURE} - indicating which kind of failure has been recovered on the cradle
     */
    public static final String ACTION_CRADLE_FAILURE_RECOVERED = "com.datalogic.device.intent.action.cradle.FAILURE_RECOVERED";

    /**
     * <code>EXTRA_CRADLE_FAILURE</code> Used as an int extra field in {@link #ACTION_CRADLE_FAILURE_OCCURRED} and {@link #ACTION_CRADLE_FAILURE_RECOVERED}
     * intents to request the type of failure occured or recovered on the cradle. <br>
     * Possible values are {@link #EXTRA_CRADLE_FAILURE_UNKNOWN}, {@link #EXTRA_CRADLE_FAILURE_BAD_LEVER_POSITION}, 
     * {@link #EXTRA_CRADLE_FAILURE_WLC_FOD}, {@link #EXTRA_CRADLE_FAILURE_WLC_EOC_TIMEOUT}, {@link #EXTRA_CRADLE_FAILURE_WLC_TX},
     * {@link #EXTRA_CRADLE_FAILURE_SOLENOID_OVERTEMPERATURE}, {@link #EXTRA_CRADLE_FAILURE_WRONG_DAISY_CHAIN_CONFIG}, {@link #EXTRA_CRADLE_FAILURE_GENERAL}, 
     * {@link #EXTRA_CRADLE_FAILURE_SOLENOID}, {@link #EXTRA_CRADLE_FAILURE_CHARGER}, {@link #EXTRA_CRADLE_FAILURE_BATTERY_AUTH},
     * {@link #EXTRA_CRADLE_FAILURE_BATTERY_EEPROM}, {@link #EXTRA_CRADLE_FAILURE_BATTERY_DEAD} or {@link #EXTRA_CRADLE_FAILURE_WLC_GENERAL}.
     */
    public static final String EXTRA_CRADLE_FAILURE = "com.datalogic.device.intent.extra.cradle.FAILURE";

    /**
     * <code>EXTRA_CRADLE_FAILURE_UNKNOWN</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * No failure was detected.
     */
    public static final String EXTRA_CRADLE_FAILURE_UNKNOWN = "com.datalogic.device.intent.extra.cradle.FAILURE_UNKNOWN";

    /**
     * <code>EXTRA_CRADLE_FAILURE_BAD_LEVER_POSITION</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The slot's lever is not in the correct position.
     */
    public static final String EXTRA_CRADLE_FAILURE_BAD_LEVER_POSITION = "com.datalogic.device.intent.extra.cradle.FAILURE_BAD_LEVER_POSITION";

    /**
     * <code>EXTRA_CRADLE_FAILURE_WLC_FOD</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * There is some metal object which prevents a successful wireless charge power transmission between the cradle and the device.
     */
    public static final String EXTRA_CRADLE_FAILURE_WLC_FOD = "com.datalogic.device.intent.extra.cradle.FAILURE_WLC_FOD";

    /**
     * <code>EXTRA_CRADLE_FAILURE_WLC_EOC_TIMEOUT</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The device asked for an "end of power transmission" for too long.
     */
    public static final String EXTRA_CRADLE_FAILURE_WLC_EOC_TIMEOUT = "com.datalogic.device.intent.extra.cradle.FAILURE_WLC_EOC_TIMEOUT";

    /**
     * <code>EXTRA_CRADLE_FAILURE_WLC_TX</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle is experiencing a problem on WLC's TX and it cannot power to the device.
     */
    public static final String EXTRA_CRADLE_FAILURE_WLC_TX = "com.datalogic.device.intent.extra.cradle.FAILURE_WLC_TX";

    /**
     * <code>EXTRA_CRADLE_FAILURE_SOLENOID_OVERTEMPERATURE</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The locking solenoid is too hot and the lever cannot be controlled until temperature will be reduced.
     */
    public static final String EXTRA_CRADLE_FAILURE_SOLENOID_OVERTEMPERATURE = "com.datalogic.device.intent.extra.cradle.FAILURE_SOLENOID_OVERTEMPERATURE";

    /**
     * <code>EXTRA_CRADLE_FAILURE_WRONG_DAISY_CHAIN_CONFIG</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The current cradle's daisy chain configuration is not allowed.
     */
    public static final String EXTRA_CRADLE_FAILURE_WRONG_DAISY_CHAIN_CONFIG = "com.datalogic.device.intent.extra.cradle.FAILURE_WRONG_DAISY_CHAIN_CONFIG";

    /**
     * <code>EXTRA_CRADLE_FAILURE_GENERAL</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * General failure was detected.
     */
    public static final String EXTRA_CRADLE_FAILURE_GENERAL = "com.datalogic.device.intent.extra.cradle.FAILURE_GENERAL";

    /**
     * <code>EXTRA_CRADLE_FAILURE_SOLENOID</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     The locking solenoid is too hot and the lever cannot be controlled until temperature will be reduced.
     */
    public static final String EXTRA_CRADLE_FAILURE_SOLENOID = "com.datalogic.device.intent.extra.cradle.FAILURE_SOLENOID";

    /**
     * <code>EXTRA_CRADLE_FAILURE_WRONG_DAISY_CHAIN_CONFIG</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle is experiencing a problem on the charger.
     */
    public static final String EXTRA_CRADLE_FAILURE_CHARGER = "com.datalogic.device.intent.extra.cradle.FAILURE_CHARGER";

    /**
     * <code>EXTRA_CRADLE_FAILURE_BATTERY_AUTH</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle is experiencing a problem on the battery authentication.
     */
    public static final String EXTRA_CRADLE_FAILURE_BATTERY_AUTH = "com.datalogic.device.intent.extra.cradle.FAILURE_BATTERY_AUTH";

    /**
     * <code>EXTRA_CRADLE_FAILURE_BATTERY_EEPROM</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle is experiencing a problem on the battery eeprom.
     */
    public static final String EXTRA_CRADLE_FAILURE_BATTERY_EEPROM = "com.datalogic.device.intent.extra.cradle.FAILURE_BATTERY_EEPROM";

    /**
     * <code>EXTRA_CRADLE_FAILURE_BATTERY_DEAD</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle is experiencing a problem on the battery status.
     */
    public static final String EXTRA_CRADLE_FAILURE_BATTERY_DEAD = "com.datalogic.device.intent.extra.cradle.FAILURE_BATTERY_DEAD";

    /**
     * <code>EXTRA_CRADLE_FAILURE_WLC_GENERAL</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle is experiencing a general problem on the wlc.
     */
    public static final String EXTRA_CRADLE_FAILURE_WLC_GENERAL = "com.datalogic.device.intent.extra.cradle.FAILURE_WLC_GENERAL";

    /**
     * <code>EXTRA_CRADLE_FAILURE_LEVER_NOT_CALIBRATED</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle is experiencing a problem with lever calibration.
     */
    public static final String EXTRA_CRADLE_FAILURE_LEVER_NOT_CALIBRATED = "com.datalogic.device.intent.extra.cradle.FAILURE_LEVER_NOT_CALIBRATED";

    /**
     * <code>EXTRA_CRADLE_FAILURE_DEVICE_NOT_CHARGING</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle is experiencing a problem on its internal charging system.
     */
    public static final String EXTRA_CRADLE_FAILURE_DEVICE_NOT_CHARGING = "com.datalogic.device.intent.extra.cradle.FAILURE_FAILURE_DEVICE_NOT_CHARGING";

    /**
     * <code>EXTRA_CRADLE_FAILURE_FLASH_CORRUPTED</code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The cradle's internal flash is corrupted.
     */
    public static final String EXTRA_CRADLE_FAILURE_FLASH_CORRUPTED = "com.datalogic.device.intent.extra.cradle.FAILURE_FLASH_CORRUPTED";

    /**
     * <code>EXTRA_CRADLE_FAILURE_THERMAL_PROTECTION_POGO </code> Used as an int value for {@link #EXTRA_CRADLE_FAILURE} to request the failure type.
     * The Cradle's pogo pins are suffering a thermal protection failure.
     */
    public static final String EXTRA_CRADLE_FAILURE_THERMAL_PROTECTION_POGO = "com.datalogic.device.intent.extra.cradle.FAILURE_THERMAL_PROTECTION_POGO";


    /**
     * <code>ACTION_CONFIGURATION_COMMIT</code> This intent allows to request a change of the device configuration. <br>
     * The intent carries as extra data the list of requested properties' changes.<br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_CONFIGURATION_CHANGED_MAP} - Bundle containing the map of requested properties' changes.<br>
     * <br>
     * java code example:
     * <br>
     * <pre>
     * Intent intent = new Intent(Intents.ACTION_CONFIGURATION_COMMIT);
     * HashMap<Integer, String> map = new HashMap<Integer, String>();
     * map.put(PropertyID.WIFI_802_DOT_11_MODE, Wifi802Dot11Mode.WIFI_802_DOT_11_ABG.toString());
     * map.put(PropertyID.CODE128_ENABLE, "true")
     * map.put(PropertyID.CODE128_LENGTH2, "10");
     * map.put(PropertyID.CODE128_USER_ID, String.format ("\\u%04x", (int)'a'));
     * intent.putExtra(Intents.EXTRA_CONFIGURATION_CHANGED_MAP, map);
     * mContext.sendBroadcast(intent);
     * </pre>
     *
     * adb example with extra data as List&ltString&gt:
     * <pre>
     * adb shell am broadcast -a com.datalogic.device.intent.action.configuration.COMMIT
     * --esal com.datalogic.device.intent.extra.configuration.CHANGED_MAP 'TOUCH_MODE_SENSITIVITY=TOUCH_MODE_STYLUS,800=10,CODE128_ENABLE=false'
     * </pre>
      * adb example with extra data as String:
     * <pre>
     * adb shell am broadcast -a com.datalogic.device.intent.action.configuration.COMMIT
     * --es com.datalogic.device.intent.extra.configuration.CHANGED_MAP 'TOUCH_MODE_SENSITIVITY=TOUCH_MODE_STYLUS,800=10,CODE128_ENABLE=false'
     * </pre>    */
    public static final String ACTION_CONFIGURATION_COMMIT = "com.datalogic.device.intent.action.configuration.COMMIT";

    /**
     * <code>ACTION_CONFIGURATION_CHANGED</code> Broadcast Action: Sent to notify a change of the device configuration, when the value of a {@link com.datalogic.device.configuration.PropertyID} changed. <br>
     * The intent is sent every time the values of some properties change due to a {@link ConfigurationManager#commit} request or
     * a {@link #ACTION_CONFIGURATION_COMMIT} or a spontaneuos event caused by an environmental change.
     * The intent carries as extra data the new values of the changed properties, the time of the change event and, in case of error,
     * the list of requested changes that were not possible to commit.<br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_CONFIGURATION_CHANGED_MAP} - Bundle containing the Map&lt;Integer, String&gt; of properties' changes. <br>
     * {@link #EXTRA_CONFIGURATION_ERROR_MAP} - Bundle containing the Map&lt;Integer, String&gt; of the refused properties' changes. <br>
     * {@link #EXTRA_CONFIGURATION_CHANGED_TIME} - Bundle containing the timestamp of the changes
     */
    public static final String ACTION_CONFIGURATION_CHANGED = "com.datalogic.device.intent.action.configuration.CHANGED";

    /**
     * <code>EXTRA_CONFIGURATION_CHANGED_MAP</code> Used as an Map&lt;Integer, String&gt; extra field in {@link #ACTION_CONFIGURATION_COMMIT} and {@link #ACTION_CONFIGURATION_CHANGED}.
     * The field contains a Map&lt;Integer, String&gt; with the new values of all the properties changed.
     * The Integer key is the {@link PropertyID} of the property and the String value
     * is the stringified form of the new value of the property.
     */
    public static final String EXTRA_CONFIGURATION_CHANGED_MAP = "com.datalogic.device.intent.extra.configuration.CHANGED_MAP";

    /**
     * <code>EXTRA_CONFIGURATION_ERROR_MAP</code> Used as an Map&lt;Integer, String&gt; extra field in {@link #ACTION_CONFIGURATION_CHANGED}.
     * The field contains a Map&lt;Integer, String&gt; that lists the properties' changes, requested through the sdk interface
     * or a {@link #ACTION_CONFIGURATION_COMMIT} that were not possible to apply.
     * The Integer key is the {@link PropertyID} of the property and the String value
     * is the stringified form of the value of the property that was not possible to apply.
     */
    public static final String EXTRA_CONFIGURATION_ERROR_MAP = "com.datalogic.device.intent.extra.configuration.ERROR_MAP";

    /**
     * <code>EXTRA_CONFIGURATION_CHANGED_TIME</code> Used as an int extra field in {@link #ACTION_CONFIGURATION_CHANGED}.
     * The field contains the time of the event as a difference, measured in milliseconds, between the current time and midnight, January 1, 1970 UTC.
     * See
     * <a href="https://developer.android.com/reference/java/lang/System#currentTimeMillis()">System.currentTimeMillis()</a>.
     * Use
     * <a href="https://developer.android.com/reference/java/util/Date#Date(long)">Date</a> to convert the value in a Date object.
     */
    public static final String EXTRA_CONFIGURATION_CHANGED_TIME = "com.datalogic.device.intent.extra.configuration.CHANGED_TIME";

    /**
     * <code>ACTION_CONFIGURATION_BOOT_REQUIRED</code> Broadcast Action: Sent when a reboot is required to fully apply the new device configuration.
     */
    public static final String ACTION_CONFIGURATION_BOOT_REQUIRED = "com.datalogic.device.intent.action.configuration.BOOT_REQUIRED";

    /**
     * <code>EXTRA_SYSTEM_FIRMWARE_UPGRADE_FILE_PATH</code> Used as a String value to specify the path of the fw to be used for the upgrade.
     */
    public static final String EXTRA_SYSTEM_FIRMWARE_UPGRADE_FILE_PATH = "path";

    /**
     * <code>EXTRA_SYSTEM_FIRMWARE_UPGRADE_REBOOT</code> Used as an int value to request a device reboot after successful update.
     * <br>
     * Use 1 to request the reboot, 0 otherwise.
     */
    public static final String EXTRA_SYSTEM_FIRMWARE_UPGRADE_REBOOT = "reboot";

    /**
     * <code>EXTRA_SYSTEM_FIRMWARE_UPGRADE_ACTION</code> Used, as an int, in a startService intent to com.datalogic.systemupdate/.SystemUpgradeService to request a device firmware upgrade.
     * <br>
     * The value to be used is 2.
     */
    public static final String EXTRA_SYSTEM_FIRMWARE_UPGRADE_ACTION = "action";

    /**
     * <code>EXTRA_SYSTEM_FIRMWARE_UPGRADE_RESET</code> Used as an int value to request a reset after successful update.
     * <br>
     * The allowed values are:
     * <br>
     * <pre>
     * - 0 for NONE
     * - 1 for FACTORY RESET
     * - 2 for ENTERPRISE RESET
     * </pre>
     */
    public static final String EXTRA_SYSTEM_FIRMWARE_UPGRADE_RESET = "reset";

    /**
     * <code>EXTRA_SYSTEM_FIRMWARE_UPGRADE_WIPE_ESIM_PROFILES</code> Used as an int value
     * to request the wipe of all the eSIM profiles after successful update.
     * <br>
     *  Use 1 to request the wipe, 0 otherwise.
     */
    public static final String EXTRA_SYSTEM_FIRMWARE_UPGRADE_WIPE_ESIM_PROFILES = "wipe_esim_profiles";

    /**
     * <code>ACTION_SYSTEM_FIRMWARE_UPGRADE</code> This intent allows to request a device firmware upgrade. <br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_SYSTEM_FIRMWARE_UPGRADE_FILE_PATH} - Path of the fw to be used for the upgrade.
     * <br>
     * {@link #EXTRA_SYSTEM_FIRMWARE_UPGRADE_REBOOT} - To request a reboot device after a successful update.
     * <br>
     * {@link #EXTRA_SYSTEM_FIRMWARE_UPGRADE_RESET} - To request a device reset after a successful update.
     * <br>
     * {@link #EXTRA_SYSTEM_FIRMWARE_UPGRADE_WIPE_ESIM_PROFILES} - To request the wipe of all the eSIM profiles after a successful update.
     * <br>
     * The intent can be sent as a broadcast intent, a startService intent or a startActivity intent.
     *
     *
     * <p>
     * <b>broadcast intent adb example:</b>
     * <pre>
     * adb shell am broadcast -a com.datalogic.systemupdate.action.FIRMWARE_UPDATE -n com.datalogic.systemupdate/.SystemUpgradeReceiver
     * --es path /sdcard/ota.zip
     * --ei reset 0
     * --ei reboot 1
     * --ei wipe_esim_profiles 1
     * </pre>
     *
     *
     * <p>
     * In addition to the broadcast intent a startService intent or a startActivity intent can be used with the same extra data of the broadcast intent.
     * <br>   
     * Pay attention that with startService intent the extra data {@link #EXTRA_SYSTEM_FIRMWARE_UPGRADE_ACTION} must be specified with the value <i>2</i> while for the broadcast and the startActivity intents it is implicit.
     * <br>
     *
     *
     * <p>
     * <b>startService intent adb example:</b>
     * <pre>
     * adb shell am startservice -n com.datalogic.systemupdate/.SystemUpgradeService
     * --ei action 2
     * --es path /sdcard/ota.zip
     * --ei reset 0
     * --ei reboot 1
     * --ei wipe_esim_profiles 1
     * </pre>
     *
     *
     * <p>
     * <b>startActivity intent adb example:</b>
     * <pre>
     * adb shell am start -n com.datalogic.systemupdate/.SystemUpgradeActivity
     * --es path /sdcard/ota.zip
     * --ei reset 0
     * --ei reboot 1
     * --ei wipe_esim_profiles 1
     * </pre>
     */
    public static final String ACTION_SYSTEM_FIRMWARE_UPGRADE = "com.datalogic.systemupdate.action.FIRMWARE_UPDATE";

    /**
     * <code>ACTION_BATTERY_START_LOG</code> Broadcast Action: Enable Battery Manager logging, if disabled.<br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_BATTERY_LOG_IN_IDLE_MODE} - boolean that indicates if logging must be executed in idle mode. <br>
     * {@link #EXTRA_BATTERY_LOG_PERIOD} - int representing the log period in seconds. <br>
     * {@link #EXTRA_BATTERY_LOG_STATUS} -  boolean that indicates if field "Status" must be logged. <br>
     * {@link #EXTRA_BATTERY_LOG_SOURCE} - boolean that indicates if field "Source" must be logged. <br>
     * {@link #EXTRA_BATTERY_LOG_CAPACITY} - boolean that indicates if field "Capacity" must be logged. <br>
     * {@link #EXTRA_BATTERY_LOG_TEMPERATURE} - boolean that indicates if field "Temperature" must be logged. <br>
     * {@link #EXTRA_BATTERY_LOG_VOLTAGE} - boolean that indicates if field "Voltage" must be logged. <br>
     * {@link #EXTRA_BATTERY_LOG_CURRENT} - boolean that indicates if field "Current" must be logged. <br>
     * {@link #EXTRA_BATTERY_LOG_CHARGE_LEFT} - boolean that indicates if field "Charge Left" must be logged. <br>
     *
     * <p>
     * <b>Broadcast intent adb example:</b>
     * <pre>
     * adb shell am broadcast -a com.datalogic.device.intent.action.battery.START_LOG -n com.datalogic.battery/com.datalogic.battery.receiver.BatteryLogReceiver
     * --ez com.datalogic.device.intent.extra.battery.LOG_IN_IDLE_MODE true
     * --ei com.datalogic.device.intent.extra.battery.LOG_PERIOD 60
     * --ez com.datalogic.device.intent.extra.battery.LOG_STATUS true
     * --ez com.datalogic.device.intent.extra.battery.LOG_SOURCE true
     * --ez com.datalogic.device.intent.extra.battery.LOG_CAPACITY true
     * --ez com.datalogic.device.intent.extra.battery.LOG_TEMPERATURE true
     * --ez com.datalogic.device.intent.extra.battery.LOG_VOLTAGE true
     * --ez com.datalogic.device.intent.extra.battery.LOG_CURRENT true
     * --ez com.datalogic.device.intent.extra.battery.LOG_CHARGE_LEFT true
     * </pre>
     */
    public final static String ACTION_BATTERY_START_LOG = "com.datalogic.device.intent.action.battery.START_LOG";

    /**
     * <code>ACTION_BATTERY_STOP_LOG</code> Broadcast Action: Disable Battery Manager logging, if enabled.
     */
    public final static String ACTION_BATTERY_STOP_LOG = "com.datalogic.device.intent.action.battery.STOP_LOG";

    /**
     * <code>EXTRA_BATTERY_LOG_IN_IDLE_MODE</code> Used as a boolean extra field in {@link #ACTION_BATTERY_START_LOG},
     * It enables or disables feature "Log In Idle Mode".
     */
    public final static String EXTRA_BATTERY_LOG_IN_IDLE_MODE = "com.datalogic.device.intent.extra.battery.LOG_IN_IDLE_MODE";

    /**
     * <code>EXTRA_BATTERY_LOG_PERIOD</code> Used as an int extra field in {@link #ACTION_BATTERY_START_LOG},
     * It selects the logging period expressed in seconds.<br>
     * <br>
     * If {@link #EXTRA_BATTERY_LOG_IN_IDLE_MODE} is enabled, allowed values are (60, 120, 300, 600, 1800, 3600) with 300 as default. <br>
     * If {@link #EXTRA_BATTERY_LOG_IN_IDLE_MODE} is disabled, allowed values are (10,30, 60, 120, 300, 600, 1800, 3600) with 60 as default. <br>
     */
    public final static String EXTRA_BATTERY_LOG_PERIOD = "com.datalogic.device.intent.extra.battery.LOG_PERIOD";

    /**
     * <code>EXTRA_BATTERY_LOG_STATUS</code> Used as a boolean extra field in {@link #ACTION_BATTERY_START_LOG},
     * It enables or disables log of feature "Status"
     */
    public final static String EXTRA_BATTERY_LOG_STATUS = "com.datalogic.device.intent.extra.battery.LOG_STATUS";

    /**
     * <code>EXTRA_BATTERY_LOG_SOURCE</code> Used as a boolean extra field in {@link #ACTION_BATTERY_START_LOG},
     * It enables or disables log of feature "Source"
     */
    public final static String EXTRA_BATTERY_LOG_SOURCE = "com.datalogic.device.intent.extra.battery.LOG_SOURCE";

    /**
     * <code>EXTRA_BATTERY_LOG_CAPACITY</code> Used as a boolean extra field in {@link #ACTION_BATTERY_START_LOG},
     * It enables or disables log of feature "Capacity"
     */
    public final static String EXTRA_BATTERY_LOG_CAPACITY = "com.datalogic.device.intent.extra.battery.LOG_CAPACITY";

    /**
     * <code>EXTRA_BATTERY_LOG_TEMPERATURE</code> Used as a boolean extra field in {@link #ACTION_BATTERY_START_LOG},
     * It enables or disables log of feature "Temperature"
     */
    public final static String EXTRA_BATTERY_LOG_TEMPERATURE = "com.datalogic.device.intent.extra.battery.LOG_TEMPERATURE";

    /**
     * <code>EXTRA_BATTERY_LOG_VOLTAGE</code> Used as a boolean extra field in {@link #ACTION_BATTERY_START_LOG},
     * It enables or disables log of feature "Voltage"
     */
    public final static String EXTRA_BATTERY_LOG_VOLTAGE = "com.datalogic.device.intent.extra.battery.LOG_VOLTAGE";

    /**
     * <code>EXTRA_BATTERY_LOG_CURRENT</code> Used as a boolean extra field in {@link #ACTION_BATTERY_START_LOG},
     * It enables or disables log of feature "Current"
     */
    public final static String EXTRA_BATTERY_LOG_CURRENT = "com.datalogic.device.intent.extra.battery.LOG_CURRENT";

    /**
     * <code>EXTRA_BATTERY_LOG_CHARGE_LEFT</code> Used as a boolean extra field in {@link #ACTION_BATTERY_START_LOG},
     * It enables or disables log of feature "Charge Left"
     */
    public final static String EXTRA_BATTERY_LOG_CHARGE_LEFT = "com.datalogic.device.intent.extra.battery.LOG_CHARGE_LEFT";

    /**
     * <code>ACTION_BATTERY_SWAP</code> Broadcast Action: Sent to notify a battery swap event <br>
     * <br>
     * The intent will have the following extra values: <br>
     * <br>
     * {@link #EXTRA_BATTERY_EVENT_ID} -  int that indicates the type of event.<br>
     * {@link #EXTRA_BATTERY_EVENT_TIMESTAMP} - long the indicates when the events happens.<br>
     */
    public static final String ACTION_BATTERY_SWAP = "com.datalogic.device.intent.action.battery.SWAP";

    /**
     * <code>EXTRA_BATTERY_EVENT_ID</code> Used as an int extra field in {@link #ACTION_BATTERY_SWAP},
     * It defines the event associated to the battery swap: available values are:<br>
     * <br>
     * {@link BatteryDefinitions#BATTERY_SWAP_EVENT_UNKNOWN}: unknown event.<br>
     * {@link BatteryDefinitions#BATTERY_SWAP_EVENT_BEGIN}: battery swap started: battery extracted.<br>
     * {@link BatteryDefinitions#BATTERY_SWAP_EVENT_END}: battery swap ended: battery inserted.<br>
     */
    public static final String EXTRA_BATTERY_EVENT_ID = "com.datalogic.device.intent.extra.battery.EVENT_ID";

    /**
     * <code>EXTRA_BATTERY_EVENT_TIMESTAMP</code> Used as a long extra field in {@link #ACTION_BATTERY_SWAP},
     * It specifies the time in milliseconds when event happens. Time is calculated by System.currentTimeMillis().
     */
    public static final String EXTRA_BATTERY_EVENT_TIMESTAMP = "com.datalogic.device.intent.extra.battery.EVENT_TIMESTAMP";

    /**
     * <code>ACTION_BATTERY_SWAP_REQUEST</code> Broadcast Action: Sent to command a battery swap <br>
     * <br>
     * The intent can have the following extra values: <br>
     * <br>
     * {@link #EXTRA_BATTERY_SWAP_REQUEST} - string that indicates the type of battery swap request.<br>
     */
    public static final String ACTION_BATTERY_SWAP_REQUEST = "com.datalogic.device.intent.action.battery.SWAP_REQUEST";

    /**
     * <code>EXTRA_BATTERY_SWAP_REQUEST</code> Used as an string extra field in {@link #ACTION_BATTERY_SWAP_REQUEST},
     * It defines the type of battery swap request. Available values are:<br>
     * <br>
     * {@link BatteryDefinitions#BATTERY_SWAP_REQUEST_UNATTENDED}: do not ask for confirmation to the user.<br>
     * {@link BatteryDefinitions#BATTERY_SWAP_REQUEST_CONFIRMED}: ask for confirmation to the user through a dialog.<br>
     */
    public static final String EXTRA_BATTERY_SWAP_REQUEST = "com.datalogic.device.intent.extra.battery.SWAP_REQUEST";

    /**
     * <code>ACTION_BATTERY_FORCE_CHARGE</code> Broadcast Action: forces a full charge of the battery.
     */
    public final static String ACTION_BATTERY_FORCE_CHARGE = "com.datalogic.device.intent.action.battery.FORCE_CHARGE";

    /**
     * <code>ACTION_POWER_STATUS_CHARGE_UPDATE</code> Broadcast Action: notifies about a power status charge update. <br>
     * <br>
     * The intent will have the following extra value: <br>
     * <br>
     * {@link #EXTRA_POWER_STATUS_CHARGE} - int that indicates the current Charge status.<br>
     */
    public final static String ACTION_POWER_STATUS_CHARGE_UPDATE = "com.datalogic.device.intent.action.power.status.CHARGE_UPDATE";

    /**
     * <code>EXTRA_POWER_STATUS_CHARGE</code> - Used as an int extra field in {@link #ACTION_POWER_STATUS_CHARGE_UPDATE}
     * <br>
     * Indicates the current Charge status. Possible values are {@link #EXTRA_POWER_STATUS_CHARGE_NONE}, {@link #EXTRA_POWER_STATUS_CHARGE_END_OF_CHARGE},
     * {@link #EXTRA_POWER_STATUS_CHARGE_CHARGE_PAUSE}, {@link #EXTRA_POWER_STATUS_CHARGE_DISCHARGE}, {@link #EXTRA_POWER_STATUS_CHARGE_SMART_WLC},
     * {@link #EXTRA_POWER_STATUS_CHARGE_MANUAL_CHARGE} or {@link #EXTRA_POWER_STATUS_CHARGE_ONE_TIME_FULL_CHARGE}.
     */
    public final static String EXTRA_POWER_STATUS_CHARGE = "com.datalogic.device.intent.extra.power.status.CHARGE";

    /**
     * <code>EXTRA_POWER_STATUS_CHARGE_NONE</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CHARGE} to request the charge status.
     * Indicates that the device is regularly charging.
     */
    public static final String EXTRA_POWER_STATUS_CHARGE_NONE = "com.datalogic.device.intent.extra.power.status.CHARGE_NONE";

    /**
     * <code>EXTRA_POWER_STATUS_CHARGE_END_OF_CHARGE</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CHARGE} to request the charge status.
     * Indicates that the battery is fully charged.
     */
    public static final String EXTRA_POWER_STATUS_CHARGE_END_OF_CHARGE = "com.datalogic.device.intent.extra.power.status.CHARGE_END_OF_CHARGE";

    /**
     * <code>EXTRA_POWER_STATUS_CHARGE_CHARGE_PAUSE</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CHARGE} to request the charge status.
     * Indicates that charging is paused due to smart charge schedule.
     */
    public static final String EXTRA_POWER_STATUS_CHARGE_CHARGE_PAUSE = "com.datalogic.device.intent.extra.power.status.CHARGE_CHARGE_PAUSE";

    /**
     * <code>EXTRA_POWER_STATUS_CHARGE_DISCHARGE</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CHARGE} to request the charge status.
     * Indicates that the device is discharging due to smart charge schedule.
     */
    public static final String EXTRA_POWER_STATUS_CHARGE_DISCHARGE = "com.datalogic.device.intent.extra.power.status.CHARGE_DISCHARGE";

    /**
     * <code>EXTRA_POWER_STATUS_CHARGE_SMART_WLC</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CHARGE} to request the charge status.
     * Indicates that the device is performing a smart wireless charge, meaning that the device will oscillate between charge and
     * discharge in order to reduce the temperature of the battery.
     */
    public static final String EXTRA_POWER_STATUS_CHARGE_SMART_WLC = "com.datalogic.device.intent.extra.power.status.CHARGE_SMART_WLC";

    /**
     * <code>EXTRA_POWER_STATUS_CHARGE_MANUAL_CHARGE</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CHARGE} to request the charge status.
     * Indicates that the device is performing a manual charge up to 100% due to user intervention.
     */
    public static final String EXTRA_POWER_STATUS_CHARGE_MANUAL_CHARGE = "com.datalogic.device.intent.extra.power.status.CHARGE_MANUAL_CHARGE";

    /**
     * <code>EXTRA_POWER_STATUS_CHARGE_ONE_TIME_FULL_CHARGE</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CHARGE} to request the charge status.
     * Indicates that the device is performing a charge up to 100% in order to automatically recalibrate the gauge telemetry.
     */
    public static final String EXTRA_POWER_STATUS_CHARGE_ONE_TIME_FULL_CHARGE = "com.datalogic.device.intent.extra.power.status.CHARGE_ONE_TIME_FULL_CHARGE";

    /**
     * <code>ACTION_POWER_STATUS_FAILURE_OCCURRED</code> Broadcast Action: Sent when a power status failure occurs. <br>
     * <br>
     * The intent will have the following extra value: <br>
     * <br>
     * {@link #EXTRA_POWER_STATUS_FAILURE} - int that indicates the current Failure status.
     */
    public final static String ACTION_POWER_STATUS_FAILURE_OCCURRED = "com.datalogic.device.intent.action.power.status.FAILURE_OCCURRED";

    /**
     * <code>ACTION_POWER_STATUS_FAILURE_RECOVERED</code> Broadcast Action: Sent when a power status failure recovers. <br>
     * <br>
     * The intent will have the following extra value: <br>
     * <br>
     * {@link #EXTRA_POWER_STATUS_FAILURE} - int that indicates the current Failure status.
     */
    public final static String ACTION_POWER_STATUS_FAILURE_RECOVERED = "com.datalogic.device.intent.action.power.status.FAILURE_RECOVERED";

    /**
     * <code>EXTRA_POWER_STATUS_FAILURE</code> - Used as an int extra field in {@link #ACTION_POWER_STATUS_FAILURE_OCCURRED}
     * and {@link #ACTION_POWER_STATUS_FAILURE_RECOVERED}
     * <br>
     * Indicates the current Failure status. Possible values are {@link #EXTRA_POWER_STATUS_FAILURE_HOT} or {@link #EXTRA_POWER_STATUS_FAILURE_COLD}.
     */
    public final static String EXTRA_POWER_STATUS_FAILURE = "com.datalogic.device.intent.extra.power.status.FAILURE";

    /**
     * <code>EXTRA_POWER_STATUS_FAILURE_HOT</code> Used as an int value for {@link #EXTRA_POWER_STATUS_FAILURE} to request the failure type.
     * The device is experiencing hot temperatures and charge may be inhibited.
     */
    public static final String EXTRA_POWER_STATUS_FAILURE_HOT = "com.datalogic.device.intent.extra.power.status.FAILURE_HOT";

    /**
     * <code>EXTRA_POWER_STATUS_FAILURE_COLD</code> Used as an int value for {@link #EXTRA_POWER_STATUS_FAILURE} to request the failure type.
     * The device is experiencing cold temperatures and charge may be inhibited.
     */
    public static final String EXTRA_POWER_STATUS_FAILURE_COLD = "com.datalogic.device.intent.extra.power.status.FAILURE_COLD";

    /**
     * <code>ACTION_POWER_STATUS_CRITICAL_FAILURE_OCCURRED</code> Broadcast Action: Sent when a power status critical failure occurs. <br>
     * <br>
     * The intent will have the following extra value: <br>
     * <br>
     * {@link #EXTRA_POWER_STATUS_CRITICAL_FAILURE} - int that indicates the current CriticalFailure status.
     */
    public final static String ACTION_POWER_STATUS_CRITICAL_FAILURE_OCCURRED = "com.datalogic.device.intent.action.power.status.CRITICAL_FAILURE_OCCURRED";

    /**
     * <code>ACTION_POWER_STATUS_CRITICAL_FAILURE_RECOVERED</code> Broadcast Action: Sent when a power status critical failure recovers. <br>
     * <br>
     * The intent will have the following extra value: <br>
     * <br>
     * {@link #EXTRA_POWER_STATUS_CRITICAL_FAILURE} - int that indicates the current CriticalFailure status.
     */
    public final static String ACTION_POWER_STATUS_CRITICAL_FAILURE_RECOVERED = "com.datalogic.device.intent.action.power.status.CRITICAL_FAILURE_RECOVERED";

    /**
     * <code>EXTRA_POWER_STATUS_CRITICAL_FAILURE</code> - Used as an int extra field in {@link #ACTION_POWER_STATUS_CRITICAL_FAILURE_OCCURRED}
     * and {@link #ACTION_POWER_STATUS_CRITICAL_FAILURE_RECOVERED}
     * <br>
     * Indicates the current CriticalFailure status. Possible values are {@link #EXTRA_POWER_STATUS_CRITICAL_FAILURE_GAUGE},
     * {@link #EXTRA_POWER_STATUS_CRITICAL_FAILURE_AUTHENTICATION} or {@link #EXTRA_POWER_STATUS_CRITICAL_FAILURE_EEPROM_CORRUPTED}.
     */
    public final static String EXTRA_POWER_STATUS_CRITICAL_FAILURE = "com.datalogic.device.intent.extra.power.status.CRITICAL_FAILURE";

    /**
     * <code>EXTRA_POWER_STATUS_CRITICAL_FAILURE_GAUGE</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CRITICAL_FAILURE}
     * to request the failure type.
     * The device is experiencing a crtical failure in communicating with the battery gauge and charge may be inhibited.
     */
    public static final String EXTRA_POWER_STATUS_CRITICAL_FAILURE_GAUGE = "com.datalogic.device.intent.extra.power.status.CRITICAL_FAILURE_GAUGE";

    /**
     * <code>EXTRA_POWER_STATUS_CRITICAL_FAILURE_AUTHENTICATION</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CRITICAL_FAILURE}
     * to request the failure type.
     * The device is unable to authenticate the battery and charge will be inhibited. Please replace the battery.
     */
    public static final String EXTRA_POWER_STATUS_CRITICAL_FAILURE_AUTHENTICATION = "com.datalogic.device.intent.extra.power.status.CRITICAL_FAILURE_AUTHENTICATION";

    /**
     * <code>EXTRA_POWER_STATUS_CRITICAL_FAILURE_EEPROM_CORRUPTED</code> Used as an int value for {@link #EXTRA_POWER_STATUS_CRITICAL_FAILURE}
     * to request the failure type.
     * The battery's EEPROM is corrupted and charge may be inhibited. Please replace the battery.
     */
    public static final String EXTRA_POWER_STATUS_CRITICAL_FAILURE_EEPROM_CORRUPTED = "com.datalogic.device.intent.extra.power.status.CRITICAL_FAILURE_EEPROM_CORRUPTED";

}
