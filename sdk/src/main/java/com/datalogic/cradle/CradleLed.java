package com.datalogic.cradle;

/**
 * Enumerative representing the Cradle LED identifiers.
 */
public enum CradleLed {
    /**
     * Unknown cradle LED.
     * @hide
     */
    UNKNOWN,

    /**
     * Main cradle LED.
     */
    MAIN;

    /**
     * Converts the LedID enum to its integer representing value.
     *
     * @return int
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding LedID value, from a valid integer.
     *
     * @param id
     *            <code>int</code>
     * @return LedID the corresponding one.
     * */
    public static CradleLed fromInt(int id) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}