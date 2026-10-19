package com.datalogic.device.configuration;

/**
* The <code>AdvertisingPolicy</code> enumeration defines the type of advertising modes that can be used.
*/
public enum AdvertisingPolicy {
    /**
     * Disabled advertising mode, payloads are never sent
     */
    DISABLED(0),
    /**
     * Enabled advertising mode, payloads are sent
     */
    ENABLED(1),
    /**
     * Advertising mode is enabled only when the watchdog is expired.
     * When the watchdog gets reset, the advertising mode returns disabled
     */
    AUTOMATIC(2);

    /**
     * @hide
     */
    private final int value;

    private static final AdvertisingPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    private AdvertisingPolicy(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the AdvertisingPolicy to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return value;
    }

    /**
     * Retrieves the corresponding AdvertisingPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return AdvertisingPolicy the corresponding one.
     * */
    public static AdvertisingPolicy fromInt(int n) {
        for (AdvertisingPolicy allValue : ALL_VALUES) {
            if (allValue.value == n) {
                return allValue;
            }
        }
        return DISABLED;
    }

}
