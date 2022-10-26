package com.datalogic.device.configuration;

/*
* The <code>MotionTriggerSensitivity</code> enumeration defines the auto scan trigger range.
*/
public enum MotionTriggerSensitivity {
    /**
     * Sensitive.
     */
    SENSITIVE,
    /**
     * Intermediate.
     */
    INTERMEDIATE,
    /**
     * Dull.
     */
    DULL;


    private static MotionTriggerSensitivity[] allValues = values();

    /**
     * Retrieves the corresponding MotionTriggerSensitivity value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return MotionTriggerSensitivity the corresponding one.
     * */
    public static MotionTriggerSensitivity fromOrdinal(int n) {
        MotionTriggerSensitivity result = MotionTriggerSensitivity.SENSITIVE;
        if (n >= 0 && n < allValues.length) {
            result = allValues[n];
        }
        return result;
    }
}
