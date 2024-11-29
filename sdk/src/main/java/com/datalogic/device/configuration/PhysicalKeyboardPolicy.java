package com.datalogic.device.configuration;

/**
 * The <code>PhysicalKeyboardPolicy</code> enumeration defines the layouts for external physical keyboard.
 */
public enum PhysicalKeyboardPolicy {
    /**
     * Default layout for physical keyboards defined in Android.
     */
    DEFAULT(0),
    /**
     * Layout set with the current Locale.
     * Physical Keyboard is defined by system language.
     */
    AUTOMATIC(1),
    /**
     * User defined preference.
     * Physical Keyboard Layout is defined by {@link PropertyID#PHYSICAL_KEYBOARD_PROFILE}.
     */
    CUSTOM(2);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final PhysicalKeyboardPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    PhysicalKeyboardPolicy(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the PhysicalKeyboardPolicy to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding PhysicalKeyboardPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return PhysicalKeyboardPolicy the corresponding one.
     * */
    public static PhysicalKeyboardPolicy fromInt(int n) {
        return DEFAULT;
    }
}

