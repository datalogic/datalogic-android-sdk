package com.datalogic.cradle;

/**
 * Enumerative representing an insertion state depending on the device's
 * position.
 */
public enum InsertionState
{
    /**
     * Unknown Device state related to Cradle.
     */
    INSERTION_UNKNOWN,
    /**
     * Device insertion into the Cradle are not supported.
     */
    DEVICE_INSERTION_NOT_SUPPORTED,
    /**
     * Device is correctly inserted into the Cradle.
     */
    INSERTED_CORRECTLY,
    /**
     * Device has been wrongly inserted into the Cradle.
     */
    INSERTED_WRONGLY,
    /**
     * Device has been extracted from the Cradle.
     */
    EXTRACTED;

    /**
     * Converts the InsertionState enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding InsertionState value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return InsertionState the corresponding one.
     * */
    public static InsertionState fromInt(int n)
    {
	    return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
