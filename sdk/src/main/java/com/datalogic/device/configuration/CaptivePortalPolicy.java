package com.datalogic.device.configuration;

/**
 * Enum <code>CaptivePortalPolicy</code> defines the behaviour of the device
 * in case of connecting to a public Wi-Fi with a captive portal interface.
 * In particular, selecting the desired mode, the user can be prompted to authenticate,
 * to be allowed or disallowed to connect to networks which requiring authentication through a captive portal.
 */
public enum CaptivePortalPolicy {
    /**
     * User not prompted, Wi-Fi connected, no internet access.
     * <p>
     * In particular, when a network requiring an authentication through the captive portal,
     * the user is not prompted to authenticate into the captive portal page.
     * The device connects to that network, but the user can't access to internet.
     */
    NO_INTERNET(0),
    /**
     * User prompted, Wi-Fi connected, internet access.
     * <p>
     * In particular, when a network requiring an authentication through the captive portal,
     * the user is prompted to authenticate into the captive portal page.
     * The device connects to that network and the user is allowed to access to internet.
     */
    USER_PROMPTED(1),
    /**
     * User not prompted, Wi-Fi disconnected, no internet access.
     * <p>
     * In particular, when a network requiring an authentication through the captive portal,
     * the user is not prompted to authenticate into the captive portal page.
     * Moreover, the device automatically disconnects from that network,
     * so the user is not able to access to internet.
     */
    DISCONNECTED(2);

    /**
     * @hide
     */
    private final int value;

    /**
     * @hide
     */
    private static final CaptivePortalPolicy[] ALL_VALUES = values();

    /**
     * @hide
     */
    CaptivePortalPolicy(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the CaptivePortalPolicy to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return 0;
    }

    /**
     * Retrieves the corresponding CaptivePortalPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return CaptivePortalPolicy the corresponding one.
     * */
    public static CaptivePortalPolicy fromInt(int n) {
        return USER_PROMPTED;
    }
}
