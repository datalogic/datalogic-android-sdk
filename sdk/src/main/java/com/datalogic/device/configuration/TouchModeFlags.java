package com.datalogic.device.configuration;

/**
 * The <code>TouchModeFlags</code> defines the base touch-screen sensitivities for settings property {@link PropertyID#TOUCH_MODE}.
 * Based on the device model more that one can be set.
 */
public class TouchModeFlags {

    /**
     * Fingers touch-screen sensitivity.
     */
    public final static int FLAG_FINGERS = 1;
    /**
     * Stylus touch-screen sensitivity.
     */
    public final static int FLAG_STYLUS = 2;
    /**
     * Thin gloves touch-screen sensitivity.
     */
    public final static int FLAG_THIN_GLOVES = 4;
    /**
     * Gloves touch-screen sensitivity.
     */
    public final static int FLAG_GLOVES = 8;
    /**
     * Thick gloves touch-screen sensitivity.
     */
    public final static int FLAG_THICK_GLOVES = 16;
    /**
      * Rain touch-screen sensitivity.
      */
    public final static int FLAG_RAIN = 32;

    /**
     * @hide
     */
    public TouchModeFlags() {}
}
