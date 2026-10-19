package com.datalogic.device.configuration;

/**
 * Enum {@code RfidTargetPolicy} defines the target selection policy
 * used by the RFID reader during tag sessions.
 * <p>
 * The target policy controls whether the reader inventories tags
 * in state A, state B, or alternates between both states.
 * <p>
 * These are the allowed values for the property {@link PropertyID#RFID_TARGET_POLICY}.
 */
public enum RfidTargetPolicy {

    /**
     * The RFID reader targets tags in state A.
     */
    TARGET_A(0),

    /**
     * The RFID reader targets tags in state B.
     */
    TARGET_B(1),

    /**
     * The RFID reader alternates targeting between state A and B.
     */
    TARGET_A_B(2),

    /**
     * The RFID reader alternates targeting between state B and A.
     */
    TARGET_B_A(3);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final RfidTargetPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    RfidTargetPolicy(int value) {
        this.value = value;
    }

    /**
     * Retrieves the corresponding RfidTargetPolicy value from a valid integer.
     *
     * @param n <code>int</code>
     * @return RfidTargetPolicy the corresponding one.
     */
    public static RfidTargetPolicy fromOrdinal(int n) {
        return TARGET_A;
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
