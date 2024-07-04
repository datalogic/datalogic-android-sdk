package com.datalogic.device.configuration;


public enum WhitelistingPersistence {
    /**
     * Undefined property. This value is used internally
     * @hide
     */
    UNDEFINED(-1, "N/A"),
    /**
     * Persistence only at ram level. Object with this level of persistence will be deleted after a reboot, a reset or an espresso package installation.
     * @hide
     */
    RAM_ONLY(1, "Ram only"),
    /**
     * Persistence only at reboot. Object with this level of persistence will be deleted only after a reset or an espresso package installation.
     */
    REBOOT(2, "Reboot"),
    /**
     * Persistence at enterprise reset. Object with this level of persistence will be deleted after only a factory reset or an espresso package installation.
     */
    ENTERPRISE_RESET(4, "Enterprise reset"),
    /**
     * Persistence at factory reset. Object with this level of persistence will be deleted after an espresso package installation.
     */
    FACTORY_RESET(8, "Factory reset"),
    /**
     * Object with this level of persistence cannot be deleted
     */
    DEFAULT(16, "Default");

    /**
     * @hide     
     */
    WhitelistingPersistence(int value, String name) {}

    /**
     * Converts the WhitelistingPersistence enum to its integer representing value.
     *
     * @return int
     */
    public int toInt() { return 0; }

    /**
     * Retrieves the corresponding WhitelistingPersistence value, from a valid integer.
     *
     * @param value
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static WhitelistingPersistence fromInt(int value) {
       return null;
    }

    /**
     * Converts the WhitelistingPersistence enum to its string representing name.
     *
     * @return int
     */
    @Override
    public String toString() {
        return null;
    }
}
