package com.datalogic.device.configuration;

/**
 * The <code>ClipboardPolicy</code> enumeration defines the features which can be accessible
 * to the user through the Clipboard.
 */
public enum ClipboardPolicy {
    /**
     * No features are allowed to the user.
     */
    NONE(0),
    /**
     * Only text manipulation is allowed, such as "Copy", "Cut", "Paste" and "Select all".
     */
    ONLY_TEXT(1),
    /**
     * All features are allowed to the user.
     */
    ALL(2);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final ClipboardPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    ClipboardPolicy(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the ClipboardPolicy to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding ClipboardPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return ClipboardPolicy the corresponding one.
     * */
    public static ClipboardPolicy fromInt(int n) {
        return ALL;
    }
}

