package com.datalogic.cradle;

/**
 * Enumerative representing the Cradle Lever status.
 */
public enum LeverStatus
{
    /**
     * Unknown Cradle lever status.
     */
    LEVER_STATUS_UNKNOWN,
    /**
     * Cradle lever close.
     */
    LEVER_STATUS_CLOSE,
    /**
     * Cradle lever open.
     */
    LEVER_STATUS_OPEN,
    /**
     * Cradle lever not supported.
     */
    LEVER_STATUS_NOT_SUPPORTED;

    /**
     * Converts the LeverStatus enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding LeverStatus value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return LeverStatus the corresponding one.
     * */
    public static LeverStatus fromInt(int n)
    {
        return LEVER_STATUS_UNKNOWN;
    }

    @Override
    public String toString() {
        return null;
    }
}
