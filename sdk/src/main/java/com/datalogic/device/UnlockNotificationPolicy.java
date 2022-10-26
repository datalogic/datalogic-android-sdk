package com.datalogic.device;

/**
 * Enumerative representing the Policy to unlock the Cradle.
 */
public enum UnlockNotificationPolicy
{
    /**
     * Unlock notification is disabled on all cradle model.
     */
    UNLOCK_NOTIFICATION_NONE,
    /**
     * Unlock notification is enabled only when the device is inserted in a single slot cradle.
     */
    UNLOCK_NOTIFICATION_SINGLE,
    /**
     * Unlock notification is enabled only when the device is inserted in a multiple slot cradle.
     */
    UNLOCK_NOTIFICATION_MULTIPLE,
    /**
     * Unlock notification is enabled when the device is inserted in both single or multiple slot cradle.
     */
    UNLOCK_NOTIFICATION_SINGLE_AND_MULTIPLE;


    /**
     * Converts the UnlockNotificationPolicy enum to its integer representing value.
     *
     * @return int
     */
    public int toInt()
    {
        return 0;
    }

    /**
     * Retrieves the corresponding UnlockNotification Policy value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return Type the corresponding one.
     * */
    public static UnlockNotificationPolicy fromInt(int n)
    {
        return UNLOCK_NOTIFICATION_NONE;
    }
}
