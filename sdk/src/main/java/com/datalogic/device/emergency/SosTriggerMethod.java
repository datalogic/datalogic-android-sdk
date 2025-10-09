package com.datalogic.device.emergency;

import com.datalogic.device.configuration.PropertyID;

/**
 * The <code>SosTriggerMethod</code> enumeration defines the SOS trigger activation methods.
 */
public enum SosTriggerMethod {
    /**
     * Single press: The SOS action is triggered with a single press of the KEYCODE_SOS trigger.
     */
    SINGLE_PRESS(0),
    /**
     * Long press timeout: The SOS action is triggered when the KEYCODE_SOS trigger is held down
     * for the duration specified by {@link PropertyID#SOS_TRIGGER_LONG_PRESS_TIMEOUT}.
     */
    LONG_PRESS_TIMEOUT(1),
    /**
     * Multipress: The SOS action is triggered when the KEYCODE_SOS trigger is pressed
     * multiple times in sequence, as specified by {@link PropertyID#SOS_TRIGGER_MULTIPRESS_COUNT}.
     */
    MULTIPRESS(2);


    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final SosTriggerMethod[] ALL_VALUES = values();

    /**
     * @hide
     */
    SosTriggerMethod(int value) {
        this.value = value;
    }

    /**
     * Converts the SosTriggerMethod to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return value;
    }

    /**
     * Converts an integer to its corresponding SosTriggerMethod value.
     *
     * @param n the integer value to convert
     * @return SosTriggerMethod
     */
    public static SosTriggerMethod fromInt(int n) {
        for (SosTriggerMethod method : ALL_VALUES) {
            if (method.value == n) {
                return method;
            }
        }
        return LONG_PRESS_TIMEOUT; // Default to LONG_PRESS_TIMEOUT if no match found
    }
}
