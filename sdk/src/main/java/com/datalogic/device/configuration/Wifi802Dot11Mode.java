package com.datalogic.device.configuration;

/**
 * Enum <code>Wifi802Dot11Mode</code> defines the allowed values for settings property {@link PropertyID#WIFI_802_DOT_11_MODE}
 */
public enum Wifi802Dot11Mode {
    /**
     * All the 802.11 mode (b/g/n/a/ac) are anabled
     */
    WIFI_802_DOT_11_ALL_ENABLED,
    /**
     * Only the 802.11 mode (b/g/a) are anabled
     */
    WIFI_802_DOT_11_ABG,
    /**
     * Only the 802.11 mode (b) is anabled
     */
    WIFI_802_DOT_11_B,
    /**
     * Only the 802.11 mode (b/g) are anabled
     */
    WIFI_802_DOT_11_BG,
    /**
     * Only the 802.11 mode (b/g/n/a) are anabled
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
