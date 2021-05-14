package com.datalogic.device.configuration;

public enum Wifi802Dot11Mode {
    /**
     *
     */
    WIFI_802_DOT_11_ALL_ENABLED,
    /**
     *
     */
    WIFI_802_DOT_11_ABG,
    /**
     *
     */
    WIFI_802_DOT_11_B,
    /**
     *
     */
    WIFI_802_DOT_11_BG,
    /**
     *
     */
    WIFI_802_DOT_11_ABGN;

    private static Wifi802Dot11Mode[] allValues = values();

    /**
     * Retrieves the corresponding Wifi802Dot11Mode value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return WifiBandSelection the corresponding one.
     * */
    public static Wifi802Dot11Mode fromOrdinal(int n) {
        Wifi802Dot11Mode result = Wifi802Dot11Mode.WIFI_802_DOT_11_ALL_ENABLED;
        if (n >= 0 && n < allValues.length) {
            result = allValues[n];
        }
        return result;
    }
}
