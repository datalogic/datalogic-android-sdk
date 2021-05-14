package com.datalogic.device;

/**
 * This exception is used for device related errors.
 */

public class DeviceException extends RuntimeException {
	/**
	 * Upper part
	 * @hide
	 */
	static final int DEV_EXCEPTION = -3;

	/**
	 * Success constant.
	 */
	public static final int SUCCESS = 0;

	/**
	 * It is a Device Service error.
	 */
	public static final int DEVICE_SERVICE_ERROR = (DEV_EXCEPTION<<16 | 0x0000);
	/**
	 * It is a null pointer error.
	 */
	public static final int NULL_POINTER_ERROR = (DEV_EXCEPTION<<16 | 0x0001);
	/**
	 * Generic error, mostly due to a wrong parameter passed to a SDK method.
	 */
	public static final int GENERIC_ERROR = (DEV_EXCEPTION<<16 | 0x0002);
	/**
	 * When it's not possible to call Datalogic service.
	 */
	public static final int REMOTE_CALL_ERROR = (DEV_EXCEPTION<<16 | 0x0003);
	/**
	 * It is an Input Service error.
	 */
	public static final int INPUT_SERVICE_ERROR = (DEV_EXCEPTION<<16 | 0x0004);
	/**
	 * It is an Power Service error.
	 */
	public static final int POWER_SERVICE_ERROR = (DEV_EXCEPTION<<16 | 0x0005);
	/**
	 * It is an Notification Service error.
	 */
	public static final int NOTIFICATION_SERVICE_ERROR = (DEV_EXCEPTION<<16 | 0x0006);
	/**
	 * It is an Location Service error.
	 */
	public static final int LOCATION_SERVICE_ERROR = (DEV_EXCEPTION<<16 | 0x0007);
	/**
	 * It is a Wakeup Source error.
	 */
	public static final int WAKEUP_SOURCE_ERROR = (DEV_EXCEPTION<<16 | 0x0008);

	/**
	 * The error number returned by the Device's system services.
	 */
	public int error_number;

	/**
	 * Constructs a DeviceException object.
	 */
	public DeviceException() {
	}

	/**
	 * Constructs a DeviceException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 * 
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 */
	public DeviceException(String s) {
	}

	/**
	 * Constructs a DeviceException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 * 
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 * @param number
	 *            <code>int</code> indicating the error code number.
	 */
	public DeviceException(String s, int number) {
	}

	/**
	 * Constructs a DeviceException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 * 
	 * @param number
	 *            <code>int</code> indicating the error code number.
	 */
	public DeviceException(int number) {
	}

}
