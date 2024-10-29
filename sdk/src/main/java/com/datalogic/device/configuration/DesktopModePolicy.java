package com.datalogic.device.configuration;

/**
 * Enum <code>DesktopModePolicy</code> defines the desktop mode settings for screen sharing.
 * These are the allowed values for the property {@link PropertyID#DESKTOP_MODE_POLICY}
 */
public enum DesktopModePolicy {

    /**
     * The screen of the device is duplicated exactly on the external monitor,
     * typically with portrait orientation.
     */
    MIRRORED_SCREEN(0),
    /**
     * The screen of the device is duplicated exactly on the external monitor,
     * but typically the user interface is adapted to the resolution of the external monitor with
     * landscape orientation.
     */
    EXTERNAL_SCREEN(1),
    /**
     * The screen of the device and the external monitor are separated, each with its own content and layout.
     * The external monitor displays a desktop-like interface, which can include a taskbar, while
     * the screen device displays the Android interface and it could be used as a secondary screen.
     */
    DUAL_SCREEN(2);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final DesktopModePolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    DesktopModePolicy(int value) {
        this.value = value;
    }

    /**
     * Converts a DesktopModePolicy to its corresponding integer value.
     * 
     * @return int
     * */
    public int toInt(){
        return 0;
    }

    /**
     * Retrieves the corresponding DesktopModePolicy value, from a valid integer.
     * 
     * @param n
     *            <code>int</code>
     * @return DesktopModePolicy the corresponding one.
     * */
    public static DesktopModePolicy fromInt(int n) {
        return MIRRORED_SCREEN;
    }

}
