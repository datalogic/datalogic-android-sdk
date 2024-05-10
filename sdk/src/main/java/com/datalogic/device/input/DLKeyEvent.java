package com.datalogic.device.input;

/**
 * DLKeyEvent defines the custom Datalogic's keycodes.
 */
public enum DLKeyEvent {

    /**
     * Datalogic's Android keycode meant to represent
     * the scan request button.
     */
    KEYCODE_BARCODE(180), //val = 1125 for the qcm4490 platform devices -> This value will be dynamically retrieve

    /**
     * Datalogic's android keycode meant to represent
     * the request to switch the scanner input from camera to scan engine.
     */
    KEYCODE_SCANNER_INPUT_SWITCH(1126),

    /**
     * Datalogic's android keycode meant to represent
     * the PTT button.
     */
    KEYCODE_PUSH_TO_TALK(1127),

    /**
     * Datalogic's android keycode meant to represent
     * the battery swap request button.
     */
    KEYCODE_BATTERY_SWAP(1128),

    /**
     * Datalogic's Android keycode meant to represent
     * Undefined keycode
     */
    KEYCODE_UNKNOWN(0);

    /**
     * @hide
     */
    private final int val;

    /**
     * @hide
     */
    private static final DLKeyEvent[] ALL_VALUES = values();

    /**
     * @hide
     */
    DLKeyEvent(int val) {
        this.val = val;
    }

    /**
     * Converts a DLKeyEvent to its integer corresponding value.
     * 
     * @return {@code int} : value of the corresponding DLKeyEvent.
     */
    public int getKeyCodeValue(){
        return this.val;
    }

    /**
     * Retrieves the corresponding DLKeyEvent value, from a valid integer.
     * 
     * @param value : KeyCode value.
     * 
     * @return {@code DLKeyEvent} : the corresponding DLKeyEvent.
     */
    public static DLKeyEvent getKeyCodeType(int value){
        for(int i = 0; i < ALL_VALUES.length; i++) {
            if (ALL_VALUES[i].val == value) {
                return ALL_VALUES[i];
            }
        }
        return KEYCODE_UNKNOWN;
    }

    /**
     * Retrieves the array of all available DLKeyEvent.
     * @return an array of available DLKeyEvent.
     */
    public static DLKeyEvent[] getAvailableDLKeyEvents(){
        return ALL_VALUES;
    }
}
