package com.datalogic.device.configuration;

/**
 * Enum <code>TouchMode</code> defines the allowed touch-screen sensitivity values for settings property {@link PropertyID#TOUCH_MODE_SENSITIVITY}.
 * On new device models, starting from M30/M35, property {@link PropertyID#TOUCH_MODE_SENSITIVITY} is replaced by {@link PropertyID#TOUCH_MODE}.
 * @deprecated Use {@link PropertyID#TOUCH_MODE} and {@link TouchModeFlags} instead.
 */
public enum TouchMode {
    /**
     * Fingers touch-screen sensitivity.
     */
    TOUCH_MODE_FINGERS(2),
    /**
     * Stylus touch-screen sensitivity.
     */
    TOUCH_MODE_STYLUS(3),
    /**
     * Thin gloves touch-screen sensitivity.
     */
    TOUCH_MODE_THIN_GLOVES(5),
    /**
     * Gloves touch-screen sensitivity.
     */
    TOUCH_MODE_GLOVES(6),
    /**
     * Thick gloves touch-screen sensitivity.
     */
    TOUCH_MODE_TICK_GLOVES(7),
    /**
     * Fingers and stylus touch-screen sensitivity.
     */
    TOUCH_MODE_FINGERS_AND_STYLUS(8),
    /**
     * Fingers and gloves touch-screen sensitivity.
     */
    TOUCH_MODE_FINGERS_AND_GLOVES(9);

    /**
     * @hide
     * */
    private final int code;

    private static TouchMode[] allValues = values();

    /**
     * @hide
     * */
    private TouchMode(int code){
        this.code=code;
    }

    /**
     * Converts a TouchMode to its integer corresponding value.
     * 
     * @return int
     * */
    public int toInt(){
        return this.code;
    }

    /**
     * Retrieves the corresponding TouchMode value, from a valid integer.
     * 
     * @param n
     *            <code>int</code>
     * @return TouchMode the corresponding one.
     * */
    public static TouchMode fromInt(int n){
        for(int i = 0; i < allValues.length; i++) {
            if (allValues[i].code == n)
                return allValues[i];
        }
        return TOUCH_MODE_FINGERS;
    }

}
