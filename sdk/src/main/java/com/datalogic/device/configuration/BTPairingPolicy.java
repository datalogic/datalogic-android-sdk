package com.datalogic.device.configuration;
import com.datalogic.device.configuration.PropertyID;

/**
 * Enum {@link BTPairingPolicy} defines the policies for Bluetooth pairing,
 * configured through the property {@link PropertyID#BT_PAIRING_POLICY}.
 *
 * <p>Each policy controls the level of user interaction required during the
 * Bluetooth pairing process, ranging from the standard Android experience
 * to fully silent or secured pairing.</p>
 */
public enum BTPairingPolicy
{
    /**
     * Unknown pairing policy.
     */
    UNKNOWN(-1),
    /**
     * Standard Android user experience for Bluetooth pairing.
     * <p>When this value is selected, the user will be prompted to pair
     * a Bluetooth device following the standard Android procedure.</p>
     */
    STANDARD(0),
    /**
     * Simplified pairing requiring only a single user confirmation.
     * <p>When this value is selected, the user will be prompted with a single
     * popup confirmation to pair a Bluetooth device.</p>
     */
    SIMPLE(1),
    /**
     * Fully silent pairing with no user confirmation required.
     * <p>When this value is selected, the user will never be prompted during
     * Bluetooth device pairing.</p>
     *
     * <p><b>Important:</b> This policy allows <em>any</em> device to pair
     * without user consent. Use with caution.</p>
     */
    SILENT(2),
    /**
     * Secured pairing that blocks connections from unauthorized peripherals.
     * <p>This policy enhances security and operational efficiency by preventing
     * accidental or malicious device pairings. Only devices that are whitelisted
     * (if enabled) or trusted (if enabled) are allowed to pair and connect.</p>
     *
     * <p>The following properties must be properly configured:</p>
     * <ul>
     *   <li>{@link PropertyID#BT_SILENT_PAIRING_WHITELISTING_ENABLE}</li>
     *   <li>{@link PropertyID#BT_SILENT_PAIRING_WHITELISTING}</li>
     * </ul>
     */
    SECURED(3);

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
