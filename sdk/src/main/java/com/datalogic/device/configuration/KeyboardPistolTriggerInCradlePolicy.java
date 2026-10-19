package com.datalogic.device.configuration;

/**
 * The <code>KeyboardPistolTriggerInCradlePolicy</code> enumeration defines the behavior of the device when the pistol trigger is long pressed while the device is in a cradle.
 * <p>
 * Only support on the following products:
 * <ul>
 *     <li>Joya Smart</li>
 * </ul>
 */
public enum KeyboardPistolTriggerInCradlePolicy {
    /**
     * When long pressing the pistol trigger in cradle, the device will do nothing.
     */
    DISABLED(0),

    /**
     * When long pressing the pistol trigger in cradle, the device will show the power menu.
     */
    POWER_MENU(1),

    /**
     * When long pressing the pistol trigger in cradle, the device will reboot.
     */
    REBOOT(2),

    /**
     * When long pressing the pistol trigger in cradle, the device will power off.
     */
    POWER_OFF(3);

    /**
     * Constructor for the enum.
     * @param value the integer value representing the behavior
     */
    KeyboardPistolTriggerInCradlePolicy(int value) {
        return;
    }

    /**
     * Returns the integer value associated with this behavior.
     *
     * @return the integer value representing the behavior
     */
    public int toInt() {
        return 0;
    }

    /**
     * Returns the {@link KeyboardPistolTriggerInCradlePolicy} corresponding to the given integer value.
     * If the value does not match any behavior, it defaults to {@link #DISABLED}.
     *
     * @param n the integer value representing a behavior
     * @return the corresponding {@link KeyboardPistolTriggerInCradlePolicy}
     */
    public static KeyboardPistolTriggerInCradlePolicy fromInt(int n) {
        return DISABLED;
    }
}
