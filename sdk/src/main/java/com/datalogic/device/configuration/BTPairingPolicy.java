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
     */
    STANDARD(0),
    /**
     * Only a single confirmation is required by the user during the pairing.
     */
    SIMPLE(1),
    /**
     * No user confirmation is required for completing the pairing.
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
