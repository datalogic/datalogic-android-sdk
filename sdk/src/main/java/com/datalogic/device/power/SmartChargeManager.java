package com.datalogic.device.power;

import com.datalogic.device.DeviceException;

/**
 * This class allows to configure and activate the smart charge feature.
 */
public class SmartChargeManager {

    /**
     * The <code>SmartChargeState</code> enumeration is the class that lists the possible
     * states of the SmartCharge algorithm state machine.
     * Useful for managing notifications to the user.
     */
    public enum State {
        /**
         * The state where the system is in manual charging mode. In this state, which can be
         * forced by user interaction, the device will force charging up to final SoC regardless
         * of other conditions.
         */
        MANUAL_CHARGE,
        /**
         * The state where the system is idle and not performing any charging or discharging and
         * used as reset condition. The device will transition to either working or non-working
         * states based on the time and configured working hours.
         */
        IDLE,
        /**
         * The state where the system is actively charging up to final SoC or maintaining it. If
         * the working hours end, the state transitions accordingly.
         */
        WORK,
        /**
         * The state where the system is outside working hours. The device will either discharge to
         * a safe SoC if above the threshold, charge to the safe SoC if below, or transition to
         * NOT_WORK_WAIT if the safe SoC is reached.
         */
        NOT_WORK,
        /**
         * The state where the system is not working and is waiting for a condition to change. The
         * device will pause charging and wait until the next working interval or a change in SoC
         * that requires action.
         */
        NOT_WORK_WAIT,
        /**
         * The state where the system is not working and is in a wireless charging cradle. The
         * device will manage charging and discharging to prevent overheating, maintaining the
         * SoC within a safe range.
         */
        NOT_WORK_WLC,
        /**
         * The state where the system is waiting to start discharging. The device will monitor the
         * time spent above the threshold SoC and transition to discharging to safe SoC if the
         * maximum allowed time is exceeded.
         */
        DISCHARGE_WAIT,
        /**
         * The state where the system is actively during the discharging process. The device will
         * reach safe SoC and then maintain it.
         */
        DISCHARGE_RAMP,
        /**
         * The state where the system is actively during the discharging process while in a wireless
         * charging cradle. The device will reach safe SoC and then maintain it.
         */
        DISCHARGE_RAMP_WLC;
    }

    /**
     * This is the constructor of SmartChargeManager.
     *
     * @throws DeviceException in case of error.
     */
    public SmartChargeManager() {
    }

    /**
     * This method allows to know the state of the smart charge algorithm.
     *
     * @return The <code>boolean</code> true if the smart charge algorithm is enabled, false otherwise.
     */
    public boolean getEnabled() {
        return false;
    }

    /**
     * This method allows to set the state of the smart charge algorithm.
     *
     * @param enabled
     *        The <code>boolean</code> value indicating if the smart charge should be enabled or disabled.
     */
    public void setEnabled(boolean enabled) {
    }

    /**
     * This method retrieves the currently configured discharge delay.
     * This setting determines the maximum time the device will remain at full (100%) charge
     * before it starts discharging to a safe state of charge (SoC).
     *
     * @return an <code>int</code> indicating the discharge delay in seconds.
     */
    public int getDischargeDelay() {
        return 0;
    }

    /**
     * This method allows to set the discharge delay.
     * This setting determines the maximum time the device will remain at full (100%) charge
     * before it starts discharging to a safe state of charge (SoC).
     *
     * @param value
     *        A <code>int</code> value indicating the discharge delay in seconds.
     */
    public void setDischargeDelay(int value) {
    }

    /**
     * This method allows to know the current state of the smart charge state machine.
     *
     * @return The <code>SmartChargeState</code> value indicating the current state, or null if the state
     * is invalid.
     */
    public State getState() {
        return null;
    }

    /**
     * This method allows to initiate a forced manual charge, bringing the battery to a full state (100%)
     * and temporarily bypassing any active smart charge algorithm operations.
     */
    public void forceManualCharge() {
    }

}