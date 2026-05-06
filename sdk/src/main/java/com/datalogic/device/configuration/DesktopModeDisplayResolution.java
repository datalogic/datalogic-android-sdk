package com.datalogic.device.configuration;
import java.util.ArrayList;
import java.util.List;

/**
 * Enum <code>DesktopModeDisplayResolution</code> defines the available resolutions for the
 * external screen.
 * These are the allowed values for the property {@link PropertyID#DESKTOP_MODE_DISPLAY_RESOLUTION}
 */
public enum DesktopModeDisplayResolution {

    /**
     * Refers to a display resolution of 800x600 pixels.
     */
    W800_BY_H600(0),
    /**
     * Refers to a display resolution of 1024x600 pixels.
     */
    W1024_BY_H600(1),
    /**
     * Refers to a display resolution of 1024x768 pixels.
     */
    W1024_BY_H768(2),
    /**
     * Refers to a display resolution of 1280x720 pixels.
     */
    W1280_BY_H720(3),
    /**
     * Refers to a display resolution of 1280x800 pixels.
     */
    W1280_BY_H800(4),
    /**
     * Refers to a display resolution of 1280x1024 pixels.
     */
    W1280_BY_H1024(5),
    /**
     * Refers to a display resolution of 1366x768 pixels.
     */
    W1366_BY_H768(6),
    /**
     * Refers to a display resolution of 1440x900 pixels.
     */
    W1440_BY_H900(7),
    /**
     * Refers to a display resolution of 1600x900 pixels.
     */
    W1600_BY_H900(8),
    /**
     * Refers to a display resolution of 1680x1050 pixels.
     */
    W1680_BY_H1050(9),
    /**
     * Refers to a display resolution of 1920x1080 pixels.
     */
    W1920_BY_H1080(10),
    /**
     * Refers to a display resolution of 1920x1200 pixels.
     */
    W1920_BY_H1200(11),
    /**
     * Refers to a display resolution of 2048x1152 pixels.
     */
    W2048_BY_H1152(12),
    /**
     * Refers to a display resolution of 2560x1440 pixels.
     */
    W2560_BY_H1440(13),
    /**
     * Refers to a display resolution of 2560x1600 pixels.
     */
    W2560_BY_H1600(14);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final DesktopModeDisplayResolution[] ALL_VALUES = values();

    /**
     * @hide
     */
    DesktopModeDisplayResolution(int value) {
        this.value = value;
    }

    /**
     * Converts a DesktopModePolicy to its corresponding integer value.
     *
     * @return int
     *
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding DesktopModePolicy value, from a valid integer.
     *
     * @param n <code>int</code>
     * @return DesktopModePolicy the corresponding one. If no matching values are found,
     * <code>W1920_BY_H1080</code> is returned.
     *
     */
    public static DesktopModeDisplayResolution fromInt(int n) {
        return W1920_BY_H1080;
    }

}

