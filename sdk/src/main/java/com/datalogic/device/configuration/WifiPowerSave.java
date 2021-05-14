package com.datalogic.device.configuration;

public enum WifiPowerSave {
    /**
     *
     */
    WIFI_POWER_SAVE_DISABLED(0),
    /**
     *
     */
    WIFI_Q_POWER(2),
    /**
     *
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
