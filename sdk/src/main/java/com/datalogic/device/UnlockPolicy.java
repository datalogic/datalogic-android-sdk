package com.datalogic.device;



/**
 * Enumerative representing the Policy to unlock the Cradle.
 */
public enum UnlockPolicy
{
    /**
     * Unknown unlock policy.
     */
    UNLOCK_POLICY_UNKNOWN,
    /**
     * Unlock policy not supported.
     */
    UNLOCK_POLICY_NOT_SUPPORTED,
    /**
     * Unlock feature is disabled.
     */
    UNLOCK_POLICY_NONE,
    /**
     * Cradle can be unlocked from power menu.
     */
    UNLOCK_POLICY_POWER,
    /**
    * A notification with unlock button is shown to the user if the cradle is locked.
    */
    UNLOCK_POLICY_NOTIFICATION,
    /**
     * Cradle can be unlocked both from power menu and notification.   
     */
    UNLOCK_POLICY_BOTH;

 

    /**
     * Converts the UnlockPolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding UnlockPolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static UnlockPolicy fromInt(int n)
    {

        return UNLOCK_POLICY_UNKNOWN;
    }
}
