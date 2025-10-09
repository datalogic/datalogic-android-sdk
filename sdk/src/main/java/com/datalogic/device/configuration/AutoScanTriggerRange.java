package com.datalogic.device.configuration;

/*
* The <code>AutoScanTriggerRange</code> enumeration defines the auto scan trigger range.
*/
public enum AutoScanTriggerRange {
    /**
     * Near range.
     */
    NEAR_RANGE,
    /**
     * Intermediate range.
     */
    INTERMEDIATE_RANGE,
    /**
     * Far range.
     */
    FAR_RANGE,
    /**
     * Custom range; configurable by means of {@link PropertyID#KEYBOARD_AUTOSCAN_TRIGGER_CUSTOM_LOW_THRESHOLD}
     * and {@link PropertyID#KEYBOARD_AUTOSCAN_TRIGGER_CUSTOM_HIGH_THRESHOLD} properties.
     */
    CUSTOM_RANGE;


    private static AutoScanTriggerRange[] allValues = values();

    /**
     * Retrieves the corresponding AutoScanTriggerRange value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return AutoScanTriggerRange the corresponding one.
     * */
    public static AutoScanTriggerRange fromOrdinal(int n) {
        AutoScanTriggerRange result = AutoScanTriggerRange.NEAR_RANGE;
        if (n >= 0 && n < allValues.length) {
            result = allValues[n];
        }
        return result;
    }
}
