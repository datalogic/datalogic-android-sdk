package com.datalogic.device.rfid;

/**
 * Enum {@code RfidLockObject} defines the memory areas or passwords of an RFID
 * tag that can be locked using the Gen2 Lock command.
 * <p>
 * Locking an object prevents it from being modified, and depending on the lock
 * type (temporary or permanent), the restriction may be reversible or irreversible.
 * <p>
 * This enum only identifies *what* is being locked; it does not specify
 * *how* it is locked (e.g., lock vs. unlock, permanent vs. temporary).
 */
public enum RfidLockObject {
    /**
     * Kill Password.
     * <p>
     * The kill password protects the tag from being permanently disabled ("killed").
     * Locking this password prevents unauthorized changes that could otherwise
     * allow or block tag termination.
     */
    LOCK_KILL_PASSWORD(0),

    /**
     * Access Password.
     * <p>
     * The access password controls privileged operations such as writing,
     * locking, or killing the tag. Locking this field protects the tag’s
     * security configuration.
     */
    LOCK_ACCESS_PASSWORD(1),

    /**
     * EPC (Electronic Product Code) memory bank.
     * <p>
     * This bank contains the EPC identifier used for inventory and tracking.
     * Locking it prevents modifications to the tag’s identity.
     */
    LOCK_EPC(2),

    /**
     * TID (Tag Identifier) memory bank.
     * <p>
     * The TID usually contains manufacturer and model information.
     * It is often factory-locked and read-only by design.
     */
    LOCK_TID(3),

    /**
     * User memory bank.
     * <p>
     * The user memory can store application-specific data.
     * Locking it prevents unauthorized read/write access to custom payloads.
     */
    LOCK_USER(4);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final RfidLockObject[] ALL_VALUES = values();

    /**
     * @hide
     */
    RfidLockObject(int value) {
       this.value = value;
    }

    /**
     * Converts a LockObject to its corresponding integer value.
     * 
     * @return int
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding LockObject value from a valid integer.
     * 
     * @param n <code>int</code>
     * @return LockObject the corresponding one.
     */
    public static RfidLockObject fromInt(int n) {
        return LOCK_EPC;
    }
}
