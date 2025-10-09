package com.datalogic.device.emergency;

/**
 * The <code>SosTriggerAction</code> enumeration defines the SOS trigger action that will be executed.
 */
public enum SosTriggerAction {
    /**
     * Emergency call action.
     */
    EMERGENCY_CALL(0),
    /**
     * Send an emergency SMS action.
     */
    EMERGENCY_SMS(1);

    private final int value;
    private static final SosTriggerAction[] allValues = values();

    SosTriggerAction(int type_number) {
        this.value = type_number;
    }

    public static SosTriggerAction[] getAllValues() {
        return allValues;
    }

    public int toInt() {
        return value;
    }

    public static SosTriggerAction fromInt(int n) {
        for (SosTriggerAction action : getAllValues()) {
            if (action.value == n) {
                return action;
            }
        }
        return EMERGENCY_CALL; // Default to EMERGENCY_CALL if no match found
    }
}