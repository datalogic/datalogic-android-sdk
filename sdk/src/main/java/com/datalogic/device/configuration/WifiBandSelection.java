package com.datalogic.device.configuration;

public enum WifiBandSelection {
    /**
     *
     */
    WIFI_BAND_BOTH_ENABLED,
    /**
     *
     */
    WIFI_BAND_24_GHZ,
    /**
     *
     */
    WIFI_BAND_5_GHZ;


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
