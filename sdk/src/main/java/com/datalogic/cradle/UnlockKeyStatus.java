package com.datalogic.cradle;

/**
 * Enumerative representing the unlock key status.
 */
public enum UnlockKeyStatus
{
    /**
     * Unknown Cradle unlock key status.
     */
    UNLOCK_KEY_STATUS_UNKNOWN,
    /**
     * Cradle unlock key extracted.
     */
    UNLOCK_KEY_STATUS_EXTRACTED,
    /**
     * Cradle unlock key inserted.
     */
    UNLOCK_KEY_STATUS_INSERTED,
    /**
     * Cradle unlock key not supported.
     */
    UNLOCK_KEY_STATUS_NOT_SUPPORTED;

    /**
     * Converts the UnlockKeyStatus enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding UnlockKeyStatus value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return UnlockKeyStatus the corresponding one.
     * */
    public static UnlockKeyStatus fromInt(int n)
    {
        return UNLOCK_KEY_STATUS_UNKNOWN;
    }

    @Override
    public String toString() {
        return null;
    }
}
