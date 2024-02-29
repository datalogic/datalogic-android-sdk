package com.datalogic.device.configuration;

/**
 * Enum <code>Wifi802Dot11Mode</code> defines the allowed values for settings property {@link PropertyID#WIFI_802_DOT_11_MODE}
 */
public enum Wifi802Dot11Mode {
    /**
     * Enables all the 802.11 modes (b/g/n/a/ac/ax).
     */
    WIFI_802_DOT_11_ALL_ENABLED,
    /**
     * Enables only the 802.11 modes (b/g/a).
     */
    WIFI_802_DOT_11_ABG,
    /**
     * Enables only the 802.11 modes (b).
     */
    WIFI_802_DOT_11_B,
    /**
     * Enables only the 802.11 modes (b/g).
     */
    WIFI_802_DOT_11_BG,
    /**
     * Enables only the 802.11 modes (b/g/n/a, AKA Wi-Fi 4).
     */
    WIFI_802_DOT_11_ABGN,
    /**
     * Enables only the 802.11 modes (b/g/n/a/ac, AKA Wi-Fi 5).
     */
    WIFI_802_DOT_11_ABGNAC,
    /**
     * Enables only the 802.11 modes (b/g/n/a/ax, AKA Wi-Fi 6).
     */
    WIFI_802_DOT_11_ABGNAX;

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
