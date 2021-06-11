package com.datalogic.device.configuration;

/**
 * Enum <code>WifiPowerSave</code> defines the allowed values for settings property {@link PropertyID#WIFI_POWER_SAVE}
 */
public enum WifiPowerSave {
    /**
     * Power Save mode disabled.
     */
    WIFI_POWER_SAVE_DISABLED(0),
    /**
     * Power Save mode enabled with default power consumpsion level.
     */
    WIFI_Q_POWER(2),
    /**
     * Power Save mode enabled with power consumpsion level set to avoid performance degradation in the VoIP call . 
     */
    WIFI_Q_POWER_VOIP_CALLS(5);

    /**
     * @hide
     */
    private final int value;

    private static WifiPowerSave[] allValues = values();

    /**
     * @hide
     */
    private WifiPowerSave(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the WifiPowerSave to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return value;
    }

    /**
     * Retrieves the corresponding WifiPowerSave value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return WifiPowerSave the corresponding one.
     * */
    public static WifiPowerSave fromInt(int n) {
        for (int i = 0; i < allValues.length; i++) {
            if (allValues[i].value == n)
                return allValues[i];
        }
        return WIFI_POWER_SAVE_DISABLED;
    }

}
