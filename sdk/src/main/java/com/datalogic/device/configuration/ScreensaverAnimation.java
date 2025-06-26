package com.datalogic.device.configuration;

/**
 * Enum representing the different types of screensaver animations used by `Datalogic Screensaver` application
 * when when configured as the screensver manager.
 * <p>
 * This enum provides various animation styles that can be used for a screensaver.
 * </p>
 */
public enum ScreensaverAnimation {
    /**
     * Default value used when no specific animation is set.
     * <p>
     * This value indicates that no animation type has been defined.
     * </p>
     */
    UNDEFINED,

     /**
     * The screensaver will move to different positions on the screen.
     * <p>
     * This animation style repositions the screensaver periodically.
     * </p>
     */
    REPOSITIONING,

     /**
     * The screensaver will move in a zig-zag pattern across the screen.
     * <p>
     * This animation style creates a dynamic zig-zag movement for the screensaver.
     * </p>
     */
    ZIG_ZAG,

     /**
     * The screensaver will bounce back and forth across the screen.
     * <p>
     * This animation style makes the screensaver move in a "ping-pong" motion,
     * bouncing between the edges of the screen.
     * </p>
     */
    PING_PONG;

    /**
     * Converts the ScreensaverAnimation enum to its integer representing value.
     *
     * @return int
     */
    public int toInt() { return 0; }

    /**
     * Retrieves the corresponding ScreensaverAnimation value, from a valid integer.
     *
     * @param value
     *            <code>int</code>
     * @return Type the corresponding one.
     */
    public static ScreensaverAnimation fromInt(int value) {       
        return UNDEFINED;
    }

    /**
     * Converts the ScreensaverAnimation enum to its string representing value.
     *
     * @return String
     */
    @Override
    public String toString() {
        return null;
    }

    /**
     * Retrieves the corresponding ScreensaverAnimation value, from a valid string.
     *
     * @param name
     *            <code>String</code>
     * @return Type the corresponding one.
     */
    public static ScreensaverAnimation fromString(String name) {        
        return UNDEFINED;
    }

}
