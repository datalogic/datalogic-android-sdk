package com.datalogic.device.configuration;

/**
 * The <code>NotificationPanelPolicy</code> enumeration defines the notifications to be displayed on the Notification Panel.
 */
public enum NotificationPanelPolicy {
    /**
     * No notifications are displayed on the Notification Panel.
     */
    NONE(0),
    /**
     * The silent notifications are not displayed on the Notification Panel.
     */
    SILENT_HIDDEN(1),
    /**
     * All notifications are displayed on the Notification Panel.
     */
    ALL(2);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final NotificationPanelPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    NotificationPanelPolicy(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the NotificationPanelPolicy to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding NotificationPanelPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return NotificationPanelPolicy the corresponding one.
     * */
    public static NotificationPanelPolicy fromInt(int n) {
        return ALL;
    }
}

