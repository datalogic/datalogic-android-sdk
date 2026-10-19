package com.datalogic.device.configuration;

/**
 * Enum {@code RfidModePolicy} defines how RFID tags are reported
 * to the application during a reading or inventory session.
 * <p>
 * The mode policy determines whether tags are reported once,
 * only a single tag is reported, or all detected tags are reported
 * repeatedly for the duration of the session.
 * <p>
 * These are the allowed values for the property {@link PropertyID#RFID_MODE_POLICY}.
 */
public enum RfidModePolicy {

    /**
     * Send a single tag per reading session.
     * <p>
     * Even if multiple tags are detected, only one tag is reported
     * and the session completes after the first successful read.
     */
    SEND_ONE(0),

    /**
     * Send all detected tags once per reading session.
     * <p>
     * Each unique tag is reported a single time, even if it is
     * detected multiple times during the same session.
     */
    SEND_ONCE(1),

    /**
     * Send all detected tags continuously.
     * <p>
     * Tags are reported every time they are detected, including
     * duplicates, for the entire duration of the reading session.
     */
    SEND_ALL(2);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final RfidModePolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    RfidModePolicy(int value) {
        this.value = value;
    }

    /**
     * Retrieves the corresponding RfidModePolicy value from a valid integer.
     *
     * @param n <code>int</code>
     * @return RfidModePolicy the corresponding one.
     */
    public static RfidModePolicy fromOrdinal(int n) {
        return SEND_ONE;
    }

    /**
     * Converts this policy to its corresponding integer value.
     *
     * @return <code>int</code> representing the policy.
     */
    public int toInt() {
        return 0;
    }
}
