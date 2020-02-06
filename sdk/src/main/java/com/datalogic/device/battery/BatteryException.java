package com.datalogic.device.battery;

/**
 * This exception is used for installer related errors.
 */

public class BatteryException extends RuntimeException {
    /**
     * Upper part
     * @hide
     */
    static final int BATTERY_EXCEPTION = -59;

    /**
     * Success constant.
     */
    public static final int SUCCESS = 0;

    /**
     * Null pointer error.
     */
    public static final int NULL_POINTER_ERROR = 1;
    /**
     * This error happens when the registration to receive battery events {@link com.datalogic.device.battery.DLBatteryManager#addBatteryEventListener} 
     * is done without having called {@link com.datalogic.device.battery.DLBatteryManager#initBatteryEvents}.
     */
    public static final int CONTEXT_UNKNOWN = 2;
    /**
     * Generic error, mostly due to a wrong parameter passed to a SDK method.
     */
    public static final int GENERIC_ERROR = 3;

    
    /**
     * The error number returned by the Installer's system services.
     */
    public int error_number;

    /**
     * Constructs an BatteryException object.
     */
    public BatteryException() {}

    /**
     * Constructs an BatteryException object that takes a
     * <code>String</code> parameter containing the reason the exception was
     * thrown.
     * 
     * @param s
     *            <code>String</code> indicating why the exception occurred.
     */
    public BatteryException(String s) {}

    /**
     * Constructs an BatteryException object that takes a
     * <code>String</code> parameter containing the reason the exception was
     * thrown.
     * 
     * @param s
     *            <code>String</code> indicating why the exception occurred.
     * @param number
     *            <code>int</code> indicating the error code number.
     */
    public BatteryException(String s, int number) {}

    /**
     * Constructs an BatteryException object that takes a
     * <code>String</code> parameter containing the reason the exception was
     * thrown.
     * 
     * @param number
     *            <code>int</code> indicating the error code number.
     */
    public BatteryException(int number) {}
}
