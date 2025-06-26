package com.datalogic.device.configuration;

public enum ScreensaverPolicy {
    /**
     * Unknown policy
     */
    UNKNOWN,
    /**
     * Screensaver starts when device is charging via USB cable
     */
    USB_CHARGING,
    /**
     * Screensaver starts when device is charging in a cradle
     */
    CRADLE_CHARGING;

    /**
     * Converts the ScreensaverPolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt() { return 0; }

    /**
     * Retrieves the corresponding ScreensaverPolicy value, from a valid integer.
     *
     * @param value
     *            <code>int</code>
     * @return Type the corresponding one.
     */
    public static ScreensaverPolicy fromInt(int value) {        
        return UNKNOWN;
    }

    /**
     * Converts the ScreensaverPolicy enum to its string representing value.
     *
     * @return String
     */
    @Override
    public String toString() {
        return null;
    }

    /**
     * Retrieves the corresponding ScreensaverPolicy value, from a valid string.
     *
     * @param name
     *            <code>String</code>
     * @return Type the corresponding one.
     */
    public static ScreensaverPolicy fromString(String name) {        
        return UNKNOWN;
    }
}
