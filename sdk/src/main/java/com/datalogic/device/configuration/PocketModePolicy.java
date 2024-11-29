package com.datalogic.device.configuration;

public enum PocketModePolicy {

    /**
     * When pocket-mode is triggered by the proximity sensor, the display will be turned off, leaving
     * the device in an unlocked state.
     * When the proximity sensor no longer detects an obstruction, the display will be turned on and
     * the device remaining in its unlocked state.
     */
    DISPLAY_OFF(0),
    /**
     * When pocket-mode is triggered by the proximity sensor the display will be initially turned
     * off, as for the {@link #DISPLAY_OFF} policy. Then, after a period defined by
     * {@link PropertyID#POWER_POCKET_MODE_LOCK_TIMEOUT} without any new sensor change,
     * it will enter the suspend state, like with the {@link #DEVICE_LOCK} policy.
     * When the proximity sensor no longer detects an obstruction, the display will turn on and
     * the device will remain in its unlocked state if the lock timeout has not elapsed; otherwise,
     * the device will resume from suspend state and will be locked or unlocked according to
     * the screen lock configuration.
     */
    PROGRESSIVE_DEVICE_LOCK(1),
    /**
     * When pocket-mode is triggered by the proximity sensor the display will enter suspend state,
     * much like when the power button is pressed. The device will be in locked state.
     * When the proximity sensor no longer detects an obstruction, the device will resume
     * from suspend state and will be locked or unlocked according to the screen lock configuration.
     */
    DEVICE_LOCK(2);

    private final int _id;

    /**
     * Internal use.
     *  @hide
     */
    PocketModePolicy(int id) {
        _id = id;
    }

    /**
     * Retrieves the corresponding PocketModePolicy value, from a valid integer.
     *
     * @param id
     *            <code>int</code>
     * @return Type of the corresponding enum value, or {@link #DISPLAY_OFF} if not a valid integer is passed.
     */
    public static PocketModePolicy fromInt(int id){
        for (PocketModePolicy policy : values()){
            if (policy._id == id){
                return policy;
            }
        }
        return DISPLAY_OFF;
    }

    /**
     * Retrieves the corresponding int value.
     *
     * @return int
     */
    public int toInt(){
        return _id;
    }

}
