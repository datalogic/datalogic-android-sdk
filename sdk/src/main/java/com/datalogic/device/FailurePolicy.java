package com.datalogic.device;



/**
 * Enumerative representing the Policy to show Cradle failures.
 */
public enum FailurePolicy
{
    /**
     * Unknown failure policy.
     */
    FAILURE_POLICY_UNKNOWN,
    /**
     * Failure policy not supported.
     */
    FAILURE_POLICY_NOT_SUPPORTED,
    /**
     * Failure notification feature is DISABLED.
     */
    FAILURE_POLICY_DISABLED,
    /**
     * Failure notification feature is ENABLED.
     */
    FAILURE_POLICY_ENABLED;
    
 
    /**
     * Converts the FailurePolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding FailurePolicy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static FailurePolicy fromInt(int n)
    {
        return FAILURE_POLICY_UNKNOWN;
    }
}
