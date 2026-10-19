package com.datalogic.device.configuration;

/**
* The <code>RingingSound</code> enumeration defines the type of ringing sounds that can be used for BLE tracker operations.
*/
public enum RingingSound {
    /**
     * Barium from Android alarm sounds
     */
    BARIUM(0),
    /**
     * Beep Beep Beep alarm sound
     */
    BEEP_BEEP_BEEP_ALARM(1),
    /**
     * Buzzer alarm sound
     */
    BUZZER_ALARM(2),
    /**
     * Cesium from Android alarm sounds
     */
    CESIUM(3),
    /**
     * Helium from Android alarm sounds
     */
    HELIUM(4),
    /**
     * Krypton from Android alarm sounds
     */
    KRYPTON(5),
    /**
     * Osmium from Android alarm sounds
     */
    OSMIUM(6),
    /**
     * Piezo from Android alarm sound
     */
    PIEZO_ALARM(7),
    /**
     * Scandium from Android alarm sounds
     */
    SCANDIUM(8),
    /**
     * Custom user-defined
     */
    CUSTOM(9);

    /**
     * @hide
     */
    private final int value;

    private static final RingingSound[] ALL_VALUES = values();

    /**
     * @hide
     */
    private RingingSound(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the RingingSound to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return value;
    }

    /**
     * Retrieves the corresponding RingingSound value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return RingingSound the corresponding one.
     * */
    public static RingingSound fromInt(int n) {
        for (RingingSound allValue : ALL_VALUES) {
            if (allValue.value == n) {
                return allValue;
            }
        }
        return BEEP_BEEP_BEEP_ALARM;
    }

}
