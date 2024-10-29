package com.datalogic.device.configuration;
import com.datalogic.device.app.PackageInstallerException;

import android.app.NotificationManager;

/**
 * Enum {@link DoNotDisturbPolicy} defines the policy for Do Not Disturb. It's used by
 * property {@link PropertyID#DO_NOT_DISTURB_POLICY}.
 */
public enum DoNotDisturbPolicy {

    /**
     * Do not disturb is disabled, no notifications are suppressed.
     */
    OFF(0),
    /**
     * Do Not Disturb is enabled, it's the standard policy used by Android Settings.<br>
     * All notifications are suppressed except those that are in the exclusion filter.
     * The filter can be configured by Android Settings under Notification menu or by
     * {@link <a href="https://developer.android.com/reference/android/app/NotificationManager#setInterruptionFilter(int)">NotificationManager</a>}
     * service.
     */
    SHOW_FILTERED(1),
    /**
     * Do Not Disturb is enabled, all notifications are suppressed except Alarms.
     */
    SHOW_ALARMS(2),
    /**
     * Do Not Disturb is enabled, all notifications are suppressed.
     */
    SHOW_NONE(3);

    /**
     * Internal use.
     *  @hide
     */
    DoNotDisturbPolicy(int id) {
        return;
    }

    /**
     * Retrieves the corresponding DoNotDisturbPolicy value, from a valid integer.
     *
     * @param id
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static DoNotDisturbPolicy fromInt(int id){
        return OFF;
    }

    /**
     * Retrieves the corresponding int value.
     *
     * @return int
     * */
    public int toInt(){
        return 0;
    }
}
