package com.datalogic.device.configuration;

/**
 * The <code>WifiMobilePriorityPolicy</code> enumeration defines the preferred network to use when
 * both mobile data and Wi-Fi are available. The default policy is to prefer Wi-Fi, but the policy
 * can be changed to prefer mobile data instead.
 */
public enum WifiMobilePriorityPolicy {
    /**
     * Default priority (Wi-Fi is preferred).
     */
    DEFAULT(0),
    /**
     * Mobile is preferred.
     */
    MOBILE_PREFERRED(1);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final WifiMobilePriorityPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    WifiMobilePriorityPolicy(int value) {
        this.value = value;
    }

    /**
     * Converts the WifiMobilePriorityPolicy to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return value;
    }

    /**
     * Retrieves the corresponding WifiMobilePriorityPolicy value, from a valid integer.
     *
     * @param n <code>int</code>
     * @return WifiMobilePriorityPolicy the corresponding one.
     **/
    public static WifiMobilePriorityPolicy fromInt(int n) {
        for (WifiMobilePriorityPolicy allValue : ALL_VALUES) {
            if (allValue.value == n)
                return allValue;
        }
        return MOBILE_PREFERRED;
    }

}
