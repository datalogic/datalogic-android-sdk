package com.datalogic.device.configuration;

/**
 * Enum {@code RfidInventoryPolicy} defines how an RFID inventory
 * operation is terminated.
 * <p>
 * The inventory policy controls whether the reader stops automatically
 * after a predefined timeout or continues running until explicitly stopped
 * by the application or user action.
 * <p>
 * These are the allowed values for the property {@link PropertyID#RFID_INVENTORY_POLICY}.
 */
public enum RfidInventoryPolicy {

    /**
     * Timed inventory mode.
     * <p>
     * The inventory operation ends automatically when the timeout defined
     * by {@link PropertyID#RFID_TIMEOUT} expires.
     * <p>
     * The inventory can also be stopped manually by calling
     * {@code stopInventory()}.
     */
    TIMED(0),

    /**
     * Continuous inventory mode.
     * <p>
     * The inventory operation runs continuously until
     * {@code stopInventory()} is explicitly called or the RFID trigger
     * or hardware key is released.
     */
    CONTINUOUS(1);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final RfidInventoryPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    RfidInventoryPolicy(int value) {
        this.value = value;
    }

    /**
     * Retrieves the corresponding RfidInventoryPolicy value from a valid integer.
     *
     * @param n <code>int</code>
     * @return RfidInventoryPolicy the corresponding one.
     */
    public static RfidInventoryPolicy fromOrdinal(int n) {
        return TIMED;
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
