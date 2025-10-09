package com.datalogic.cradle;


/**
 * Enumerative representing the Cradle type.
 */
public enum Type
{
    /**
     * Unknown Cradle type.
     */
    TYPE_UNKNOWN,
    /**
     * Cradle Simplified.
     */
    TYPE_SIMPLIFIED,
    /**
     * Cradle with single slot.
     */
    TYPE_SINGLE,
    /**
     * Cradle with multiple slots.
     */
    TYPE_MULTIPLE,
    /** 
     * Cradle X5 single slot wired.
     */
    TYPE_SX5_SSD_WIRED,
    /** 
     * Cradle X5 single slot wireless.
     */
    TYPE_SX5_SSD_WIRELESS,
    /** 
     * Cradle X5 with multiple slots wired.
     */
    TYPE_SX5_3SD_WIRED,
    /** 
     * Cradle X5 with multiple slots wireless.
     */
    TYPE_SX5_3SD_WIRELESS,
    /** 
     * Cradle X5 with locking multiple slots wireless.
     */
    TYPE_SX5_3SD_WIRELESS_LOCKING,
    /**
     * Cradle JT22 simplified.
     */
    TYPE_JT22_SIMPLIFIED,
    /**
     * Cradle JT22 with single slot.
     */
    TYPE_JT22_SINGLE,
    /**
     * Cradle JT22 with multiple slots.
     */
    TYPE_JT22_MULTIPLE,
    /**
     * Cradle M3X wired.
     */
    TYPE_M3X_WIRED,
    /**
     * Cradle M3X wireless.
     */
    TYPE_M3X_WIRELESS,
    /**
     * Cradle Joya Smart single slot dock wireless.
     */
    TYPE_JOYA_SMART_SSD_WIRELESS,
    /**
     * Cradle Joya Smart 3 slot dock wireless.
     */
    TYPE_JOYA_SMART_3SD_WIRELESS,
    /**
     * Cradle Joya Smart simplified single slot dock wireless.
     */
    TYPE_JOYA_SMART_SIMPLIFIED_SSD_WIRELESS;

    /**
     * Converts the Type enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding Type value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static Type fromInt(int n)
    {
        return TYPE_UNKNOWN;
    }

    @Override
    public String toString() {
        return null;
    }
}
