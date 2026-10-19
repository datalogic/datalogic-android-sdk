package com.datalogic.device.configuration;

/**
 * The <code>ScreenRotationLockPolicy</code> enumeration defines the screen rotation lock modes
 * that can be applied to the device display. This enum controls how the screen orientation is
 * handled and whether it automatically rotates based on device orientation sensors or remains
 * locked to a specific orientation.
 * <p>
 * Supported only on devices running Android 15 or later.
 */
public enum ScreenRotationLockPolicy {
    /**
     * The screen rotation is dependent on the device's orientation sensor.
     * The display will automatically rotate based on how the device is held.
     */
    SENSOR_DEPENDENT,

    /**
     * The screen is locked in portrait orientation.
     * The display will not rotate and will remain in portrait mode regardless of device orientation.
     */
    PORTRAIT,

    /**
     * The screen is locked in landscape orientation.
     * The display will not rotate and will remain in landscape mode regardless of device orientation.
     */
    LANDSCAPE,

    /**
     * The screen is locked in inverted portrait orientation.
     * The display will not rotate and will remain in upside-down portrait mode.
     */
    INVERTED_PORTRAIT,

    /**
     * The screen is locked in inverted landscape orientation.
     * The display will not rotate and will remain in upside-down landscape mode.
     */
    INVERTED_LANDSCAPE;

    /**
     * Converts the enum constant to its corresponding integer ordinal value.
     *
     * @return the ordinal value of this enum constant.
     */
    public int toInt(){
        return 0;
    }

    /**
     * Retrieves the corresponding ScreenRotationLockPolicy value from a valid integer.
     * If the provided integer is not a valid ordinal, returns the default value {@link #SENSOR_DEPENDENT}.
     *
     * @param n the integer value representing the ordinal position
     * @return the corresponding ScreenRotationLockPolicy enum constant, or {@link #SENSOR_DEPENDENT} if invalid
     */
    public static ScreenRotationLockPolicy fromInt(int n){
        return null;
    }

}
