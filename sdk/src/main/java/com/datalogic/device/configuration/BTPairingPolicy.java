package com.datalogic.device.configuration;
import com.datalogic.device.configuration.PropertyID;

/**
 * Enum {@link BTPairingPolicy} defines the policies for Bluetooth pairing through the property {@link PropertyID#BT_PAIRING_POLICY}.
 */
public enum BTPairingPolicy
{
    /**
     * Unknown paring policy.
     */
    UNKNOWN(3),
    /**
     * Android standard user experience for bluetooth pairing.
     * When this value is selected, the user will be prompted for pairing
     * a bluetooth device according the Android standard procedure.
     */
    STANDARD(0),
    /**
     * Only a single confirmation is required by the user during the pairing.
     * When this value is selected, the user will be prompted with a single
     * confirmation for pairing a bluetooth device.
     */
    SIMPLE(1),
    /**
     * No user confirmation is required for completing the pairing.
     * When this value is selected, the user will never be prompted for pairing
     * a bluetooth device. Only the pre-approved external devices are allowed to be paired.
     * This means that the user will be restricted to pair any other devices via bluetooth.
     * In order to configure the silent pairing procedure, the properties
     * {@link PropertyID#BT_SILENT_PAIRING_WHITELISTING_ENABLE} and
     * {@link PropertyID#BT_SILENT_PAIRING_WHITELISTING} shall be properly configured.
     */
    SILENT(2);

    /**
     * Internal use.
     *  @hide
     */
    private BTPairingPolicy(int type_number)
    {
       
    }

    /**
     * Converts the BTPairingPolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding BTPairingPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static BTPairingPolicy fromInt(int n)
    {
        return UNKNOWN;
    }
}
