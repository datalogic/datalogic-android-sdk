package com.datalogic.device.configuration;

/**
 * Enum <code>NavigationBarPolicy</code> defines the Navigation mode settings for gestures.
 * These are the allowed values for the property {@link PropertyID#NAVIGATION_BAR_POLICY}
 */
public enum NavigationBarPolicy {

    /**
     * 3 buttons navigation mode
     */
    THREE_BUTTONS(0),

    /**
     * gesture navigation mode
     */
    GESTURE(1);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final NavigationBarPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    NavigationBarPolicy(int value) {
        this.value = value;
    }

    /**
     * Converts the NavigationBarPolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt(){
        return value;
    }

    /**
     * Retrieves the corresponding NavigationBarPolicy value, from a valid integer.
     *
     * @param value
     *            <code>int</code>
     * @return NavigationBarPolicy the corresponding one.
     * */
    public static NavigationBarPolicy fromInt(int value) {
        for (NavigationBarPolicy allValue : ALL_VALUES) {
            if (allValue.value == value) {
                return allValue;
            }
        }
        return THREE_BUTTONS;
    }

}
