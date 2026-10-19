package com.datalogic.device.configuration;

/**
 * Enum {@code RfidSessionPolicy} defines the session policy used
 * during RFID inventory and reading operations.
 * <p>
 * In EPC Gen2, sessions control how long a tag remains in the
 * inventoried (or non-inventoried) state after responding to a reader.
 * <p>
 * Different session values affect tag persistence, inventory speed,
 * and the likelihood of re-reading the same tag.
 * <p>
 * These are the allowed values for the property {@link PropertyID#RFID_SESSION_POLICY}
 */
public enum RfidSessionPolicy {
    /**
     * Session 0.
     * <p>
     * Tags reset their inventoried state very quickly.
     * <p>
     * Suitable for fast inventory of moving tags, but may result
     * in frequent duplicate reads.
     */
    S0(0),

    /**
     * Session 1.
     * <p>
     * Tags maintain their inventoried state for a short time.
     * <p>
     * Provides a balance between read speed and duplicate suppression.
     */
    S1(1),

    /**
     * Session 2.
     * <p>
     * Tags remain inventoried for a longer duration.
     * <p>
     * Suitable for dense tag populations where duplicate reads
     * should be minimized.
     */
    S2(2),

    /**
     * Session 3.
     * <p>
     * Tags remain inventoried for the longest duration.
     * <p>
     * Useful for inventory stability and strong duplicate suppression
     * in static environments.
     */
    S3(3),

    /**
     * Automatic session selection (mode 1).
     * <p>
     * The reader dynamically selects the session value based
     * on internal heuristics and operating conditions.
     */
    AUTO_1(4),

    /**
     * Automatic session selection (mode 2).
     * <p>
     * The reader dynamically manages session behavior using
     * an alternative optimization strategy.
     */
    AUTO_2(5);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final RfidSessionPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    RfidSessionPolicy(int value) {
        this.value = value;
    }

    /**
     * Converts a RfidSessionPolicy to its corresponding integer value.
     *
     * @return int
     * */
    public int toInt(){
        return 0;
    }

    /**
     * Retrieves the corresponding DesktopModePolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return RfidSessionPolicy the corresponding one.
     * */
    public static RfidSessionPolicy fromInt(int n) {
        return S0;
    }

}
