package com.datalogic.device.configuration;

/**
 * Enum <code>WifiBandSelection</code> defines the allowed values for settings property {@link PropertyID#WIFI_BAND_SELECTION}
 */
public enum WifiBandSelection {
    /**
     * 2.4GHz and 5GHz bands are both enabled
     */
    WIFI_BAND_BOTH_ENABLED,
    /**
     * Only 2.4GHz band is enabled
     */
    WIFI_BAND_24_GHZ,
    /**
     * Only 5GHz band is enabled
     */
    WIFI_BAND_5_GHZ;

    /**
     * @hide
     */
    private static WifiBandSelection[] allValues = values();

    /**
     * Retrieves the corresponding WifiBandSelection value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return WifiBandSelection the corresponding one.
     * */
    public static WifiBandSelection fromOrdinal(int n) {
        WifiBandSelection result = WifiBandSelection.WIFI_BAND_BOTH_ENABLED;
        if (n >= 0 && n < allValues.length) {
            result = allValues[n];
        }
        return result;
    }
}
