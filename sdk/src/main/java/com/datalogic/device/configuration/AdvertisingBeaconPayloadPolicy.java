package com.datalogic.device.configuration;

/**
* The <code>AdvertisingBeaconPayloadPolicy</code> enumeration defines the type of advertising beacon payload that can be used for BLE tracker operations.
*/
public enum AdvertisingBeaconPayloadPolicy {
    /**
     * Model-SN payload (default)
     */
    MODEL_SN(0),
    /**
     * Custom payload (user defined)
     */
    CUSTOM(1);

    /**
     * @hide
     */
    private final int value;

    private static final AdvertisingBeaconPayloadPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    private AdvertisingBeaconPayloadPolicy(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the AdvertisingBeaconPayloadPolicy to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return value;
    }

    /**
     * Retrieves the corresponding AdvertisingBeaconPayloadPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return AdvertisingBeaconPayloadPolicy the corresponding one.
     * */
    public static AdvertisingBeaconPayloadPolicy fromInt(int n) {
        for (AdvertisingBeaconPayloadPolicy allValue : ALL_VALUES) {
            if (allValue.value == n) {
                return allValue;
            }
        }
        return MODEL_SN;
    }

}
