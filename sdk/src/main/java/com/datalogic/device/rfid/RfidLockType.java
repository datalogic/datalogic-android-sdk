package com.datalogic.device.rfid;

/**
 * Enum {@code RfidLockType} defines how a specific RFID tag object
 * (memory bank or password) is locked.
 * <p>
 * This enum describes the *lock state* applied to a target identified
 * by {@link RfidLockObject}. Lock types control whether a region is writable,
 * requires access password authorization, or is permanently locked.
 * <p>
 * Permanent lock states are irreversible for the lifetime of the tag.
 */
public enum RfidLockType {
    /**
     * Unlocked state.
     * <p>
     * - Passwords: readable and writable without restrictions.
     * <p>
     * - Memory banks: writable without access password protection.
     */
    UNLOCK(0x00),

    /**
     * Permanently unlocked state.
     * <p>
     * - Passwords: permanently readable and writable.
     * <p>
     * - Memory banks: permanently writable.
     * <p>
     * This state cannot be changed afterward.
     */
    PERMANENT_UNLOCK(0x01),

    /**
     * Locked state (password-protected).
     * <p>
     * - Passwords: readable and writable only after successful access
     *   password authentication.
     * <p>
     * - Memory banks: writable only with the correct access password.
     * <p>
     * This state is reversible unless a permanent lock is applied.
     */
    LOCK(0x02),

    /**
     * Permanently locked state.
     * <p>
     * - Passwords: permanently unreadable and unwritable.
     * <p>
     * - Memory banks: permanently unwritable.
     * <p>
     * This state enforces maximum protection and is irreversible.
     */
    PERMANENT_LOCK(0x03);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final RfidLockType[] ALL_VALUES = values();

    /**
     * @hide
     */
    RfidLockType(int value) {
        this.value = value;
    }

    /**
     * Converts a {@code RfidLockType} to its corresponding integer value.
     * 
     * @return int
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding {@code RfidLockType} value from a valid integer.
     * 
     * @param n <code>int</code>
     * @return {@code RfidLockType} the corresponding one.
     */
    public static RfidLockType fromInt(int n) {
        return UNLOCK;
    }
}
