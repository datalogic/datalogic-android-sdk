package com.datalogic.device.configuration;
import com.datalogic.device.configuration.PropertyID;

/**
 * Enum {@link VirtualRAMSwapPolicy} defines the swap size for Virtual RAM feature through the property {@link PropertyID#VIRTUAL_RAM_SWAP_POLICY}.
 */
public enum VirtualRAMSwapPolicy
{
    /**
     * Virtual RAM swapping is disabled.
     */
    SWAP_DISABLED(0),
    /**
      512MB of flash memory are reserved to swapping memory for Virtual RAM
     */
    SWAP_512MB(1),
    /**
     * 1GB of flash memory are reserved to swapping memory for Virtual RAM
     */
    SWAP_1GB(2),
    /**
     * 2GB of flash memory are reserved to swapping memory for Virtual RAM
     */
    SWAP_2GB(3),
    /**
     * 3GB of flash memory are reserved to swapping memory for Virtual RAM
     * @hide
     */
    SWAP_3GB(4),
    /**
     * 4GB of flash memory are reserved to swapping memory for Virtual RAM
     * @hide
     */
    SWAP_4GB(5);

    /**
     * Internal use.
     *  @hide
     */
    private VirtualRAMSwapPolicy(int type_number)
    {

    }

    /**
     * Converts the VirtualRAMSwapPolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding VirtualRAMSwapPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static VirtualRAMSwapPolicy fromInt(int n)
    {
        return SWAP_DISABLED;
    }
}
