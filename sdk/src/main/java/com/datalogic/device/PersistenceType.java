
package com.datalogic.device;

/**
 * Enumerative representing the persistence type.
 */
public enum PersistenceType {
    /**
     * The object is persistent to device reboots. Any type
     * of data reset (enterprise or factory) will remove this object.
     */
    REBOOT_PERSISTENT(1),
    /**
     * The object is persistent to enterprise reset. Only a
     * factory reset can remove this object.
     */
    ENTERPRISE_RESET_PERSISTENT(2),
    /**
     * The object is persistent to factory reset.
     */
    FACTORY_RESET_PERSISTENT(3);

    /**
     * @hide
     */
    private PersistenceType(int value) {
    }

    /**
     * Converts the PersistenceType to its integer corresponding value.
     *
     * @return
     *         Integer value of this persistence type.
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding PersistenceType value from a valid integer.
     *
     * @param value
     *        Integer to use as input in the conversion.
     * @return
     *         The corresponding persistence type.
     */
    public static PersistenceType fromInt(int value) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}

