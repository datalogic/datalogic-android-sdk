package com.datalogic.device;

import com.datalogic.device.configuration.ConfigurationManager;
import com.datalogic.device.configuration.PropertyID;

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
     *
     * {@link #EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES} - int representing the number of bytes (firmware size) will be transferred to the cradle.
     */
    public static final String ACTION_CRADLE_FIRMWARE_UPGRADE_STARTED = "com.datalogic.device.intent.action.cradle.FIRMWARE_UPGRADE_STARTED";

    /**
     * <code>ACTION_CRADLE_FIRMWARE_UPGRADE_IN_PROGRESS</code> Broadcast Action: Sent during the firmware upgrade procedure, when a firmware block has been trasferred to the the cradle. <br>
     * <br>
     * The intent will have the following extra values: <br>
     *
     * {@link #EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES} - int representing the number of bytes has been already transferred to the cradle.
     */
    public static final String ACTION_CRADLE_FIRMWARE_UPGRADE_IN_PROGRESS = "com.datalogic.device.intent.action.cradle.FIRMWARE_UPGRADE_IN_PROGRESS";

    /**
     * <code>ACTION_CRADLE_FIRMWARE_UPGRADE_COMPLETED</code> Broadcast Action: Sent when the cradle firmware upgrade procedure is completed. <br>
     * <br>
     * The intent will have the following extra values: <br>
     *
     * {@link #EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES} - int representing the number of bytes transferred to the cradle.
     */
    public static final String ACTION_CRADLE_FIRMWARE_UPGRADE_COMPLETED = "com.datalogic.device.intent.action.cradle.FIRMWARE_UPGRADE_COMPLETED";

    /**
     * <code>ACTION_CRADLE_FIRMWARE_UPGRADE_ERROR</code> Broadcast Action: Sent when an error occurs during the cradle firmware upgrade procedure.
     */
    public static final String ACTION_CRADLE_FIRMWARE_UPGRADE_ERROR = "com.datalogic.device.intent.action.cradle.FIRMWARE_UPGRADE_ERROR";

    /**
     * <code>EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES</code> Used as an int extra field in {@link #ACTION_CRADLE_FIRMWARE_UPGRADE_STARTED},
     * {@link #ACTION_CRADLE_FIRMWARE_UPGRADE_IN_PROGRESS} and {@link #ACTION_CRADLE_FIRMWARE_UPGRADE_COMPLETED} that represents the number of bytes transferred to the cradle.
     */
    public static final String EXTRA_CRADLE_FIRMWARE_UPGRADE_BYTES = "com.datalogic.device.intent.action.cradle.FIRMWARE_TRASFERRED_BYTES";    

    /**
     * <code>ACTION_CRADLE_FAILURE_OCCURRED</code> Broadcast Action: Sent when a failure occurs on the cradle. <br>
     * <br>
     * The intent will have the following extra values: <br>
     * 
     * {@link #EXTRA_CRADLE_FAILURE} - indicating which kind of failure occured on the cradle
     */
    public static final String ACTION_CRADLE_FAILURE_OCCURRED = "com.datalogic.device.intent.action.cradle.FAILURE_OCCURRED";

    /**
     * <code>ACTION_CRADLE_FAILURE_RECOVERED</code> Broadcast Action: Sent when a failure has been recovered on the cradle. <br>
     * <br>
     * The intent will have the following extra values: <br>
     * 
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

    public static final String EXTRA_CRADLE_FAILURE_GENERAL = "com.datalogic.device.intent.extra.cradle.FAILURE_GENERAL";
    public static final String EXTRA_CRADLE_FAILURE_SOLENOID = "com.datalogic.device.intent.extra.cradle.FAILURE_SOLENOID";
    public static final String EXTRA_CRADLE_FAILURE_CHARGER = "com.datalogic.device.intent.extra.cradle.FAILURE_CHARGER";
    public static final String EXTRA_CRADLE_FAILURE_BATTERY_AUTH = "com.datalogic.device.intent.extra.cradle.FAILURE_BATTERY_AUTH";
    public static final String EXTRA_CRADLE_FAILURE_BATTERY_EEPROM = "com.datalogic.device.intent.extra.cradle.FAILURE_BATTERY_EEPROM";
    public static final String EXTRA_CRADLE_FAILURE_BATTERY_DEAD = "com.datalogic.device.intent.extra.cradle.FAILURE_BATTERY_DEAD";
    public static final String EXTRA_CRADLE_FAILURE_WLC_GENERAL = "com.datalogic.device.intent.extra.cradle.FAILURE_WLC_GENERAL";

    /**
     * <code>ACTION_CONFIGURATION_COMMIT</code> This intent allows to request a change of the device configuration. <br>
     * The intent carries as extra data the list of requested properties' changes.
     * <br>
     * The intent will have the following extra values: <br>
     *
     * {@link #EXTRA_CONFIGURATION_CHANGED_MAP} - Bundle containing the map of requested properties' changes.
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
     * --esal com.datalogic.device.intent.extra.configuration.CHANGED_MAP "TOUCH_MODE_SENSITIVITY=TOUCH_MODE_STYLUS,800=10,CODE128_ENABLE=false"
     * </pre>
      * adb example with extra data as String:
     * <pre>
     * adb shell am broadcast -a com.datalogic.device.intent.action.configuration.COMMIT
     * --es com.datalogic.device.intent.extra.configuration.CHANGED_MAP "TOUCH_MODE_SENSITIVITY=TOUCH_MODE_STYLUS,800=10,CODE128_ENABLE=false"
     * </pre>    */
    public static final String ACTION_CONFIGURATION_COMMIT = "com.datalogic.device.intent.action.configuration.COMMIT";

    /**
     * <code>ACTION_CONFIGURATION_CHANGED</code> Broadcast Action: Sent to notify a change of the device configuration, when the value of a {@link com.datalogic.device.configuration.PropertyID} changed. <br>
     * The intent is sent every time the values of some properties change due to a {@link ConfigurationManager#commit} request or
     * a {@link #ACTION_CONFIGURATION_COMMIT} or a spontaneuos event caused by an environmental change.
     * The intent carries as extra data the new values of the changed properties, the time of the change event and, in case of error,
     * the list of requested changes that were not possible to commit.
     * <br>
     * The intent will have the following extra values: <br>
     *
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

}
