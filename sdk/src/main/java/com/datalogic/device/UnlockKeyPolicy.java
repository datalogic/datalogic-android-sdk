package com.datalogic.device;



/**
 * Enumerative representing the Policy to unlock the Cradle.
 */
public enum UnlockKeyPolicy
{
    /**
     * Unknown unlock key policy.
     */
    UNLOCK_KEY_POLICY_UNKNOWN,
    /**
     * Unlock key policy not supported.
     */
    UNLOCK_KEY_POLICY_NOT_SUPPORTED,
    /**
     * Unlock key notification feature is DISABLED.
     */
    UNLOCK_KEY_POLICY_DISABLED,
    /**
     * Unlock key notification feature is ENABLED.
     */
    UNLOCK_KEY_POLICY_ENABLED;
    
 
    /**
     * Converts the UnlockKeyPolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding UnlockKeyPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static UnlockKeyPolicy fromInt(int n)
    {
        return UNLOCK_KEY_POLICY_UNKNOWN;
    }
}
