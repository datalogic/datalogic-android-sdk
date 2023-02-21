package com.datalogic.device.configuration;

/**
 * The <code>WifiNoInternetExpected</code> enumeration defines the behaviour when the current
 * connection doesn't have an Internet connection.
 */
public enum WifiNoInternetExpected {
    /**
     * Don't reconnect and show a notification to the user.
     */
    DONT_RECONNECT(0),
    /**
     * Reconnect but show a notification to the user.
     */
    RECONNECT_VERBOSE(1),
    /**
     * Reconnect and don't show a notification to the user.
     */
    RECONNECT_QUIET(2);

    /**
     * @hide
     */
    private final int value;

    private static final WifiNoInternetExpected[] ALL_VALUES = values();

    /**
     * @hide
     */
    WifiNoInternetExpected(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the WifiNoInternetExpected to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return value;
    }

    /**
     * Retrieves the corresponding WifiNoInternetExpected value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return WifiNoInternetExpected the corresponding one.
     * */
    public static WifiNoInternetExpected fromInt(int n) {
        for (int i = 0; i < ALL_VALUES.length; i++) {
            if (ALL_VALUES[i].value == n)
                return ALL_VALUES[i];
        }
        return DONT_RECONNECT;
    }

}
