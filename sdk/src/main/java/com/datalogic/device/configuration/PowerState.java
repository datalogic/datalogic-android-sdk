package com.datalogic.device.configuration;

import com.datalogic.device.power.PowerStatusManager;

/**
 * <code>PowerState</code> is a class defining constants for different charge statuses
 * and failure statuses of the device.
 */
public class PowerState {
    /**
     * <code>Charge</code> is a class defining constants for different charge status values
     * of the device.
     */
    public static final class Charge {
        /**
         * Regular charge status,
         * constant int value represented in {@link PowerStatusManager.ChargeStatus}.
         */
        public static final int NONE = 0;
        /**
         * End of charge status, indicating that the battery is fully charged,
         * constant int value represented in {@link PowerStatusManager.ChargeStatus}.
         */
        public static final int END_OF_CHARGE = 1;
        /**
         * Charge has been paused due to smart charge schedule,
         * constant int value represented in {@link PowerStatusManager.ChargeStatus}.
         */
        public static final int CHARGE_PAUSE = 2;
        /**
         * The device is discharging due to smart charge schedule,
         * constant int value represented in {@link PowerStatusManager.ChargeStatus}.
         */
        public static final int DISCHARGE = 3;
        /**
         * The device is performing a smart wireless charge, meaning that the device
         * will oscillate between charge and discharge in order to reduce the
         * temperature of the battery,
         * constant int value represented in {@link PowerStatusManager.ChargeStatus}.
         */
        public static final int SMART_WLC = 4;
        /**
         * The device is performing a manual charge up to 100% due to user
         * intervention,
         * constant int value represented in {@link PowerStatusManager.ChargeStatus}.
         */
        public static final int MANUAL_CHARGE = 5;
        /**
         * The device is performing a charge up to 100% in order to automatically
         * recalibrate the gauge telemetry,
         * constant int value represented in {@link PowerStatusManager.ChargeStatus}.
         */
        public static final int ONE_TIME_FULL_CHARGE = 6;
    }

    /**
     * <code>Failure</code> is a class defining constants for different failure status values
     */
    public static final class Failure {
        /**
         * No failures detected,
         * constant int value represented in {@link PowerStatusManager.FailureStatus}.
         */
        public static final int NONE = 0;
        /**
         * Battery is too hot and won't charge regularly,
         * constant int value represented in {@link PowerStatusManager.FailureStatus}.
         */
        public static final int HOT = 1 << 0;
        /**
         * Battery is too cold and won't charge regularly,
         * constant int value represented in {@link PowerStatusManager.FailureStatus}.
         */
        public static final int COLD = 1 << 1;
    }

    /**
     * <code>CriticalFailure</code> is a class defining constants for different critical failure status values
     */
    public static final class CriticalFailure {
        /**
         * No critical failures detected,
         * constant int value represented in {@link PowerStatusManager.CriticalFailureStatus}.
         */
        public static final int NONE = 0;
        /**
         * Battery gauge has failed or is not responding,
         * constant int value represented in {@link PowerStatusManager.CriticalFailureStatus}.
         */
        public static final int GAUGE_FAILURE = 1 << 0;
        /**
         * Battery authentication has failed,
         * constant int value represented in {@link PowerStatusManager.CriticalFailureStatus}.
         */
        public static final int AUTHENTICATION_FAILURE = 1 << 1;
        /**
         * Battery EEPROM is corrupted and non-recoverable,
         * constant int value represented in {@link PowerStatusManager.CriticalFailureStatus}.
         */
        public static final int EEPROM_CORRUPTED = 1 << 2;
    }
}