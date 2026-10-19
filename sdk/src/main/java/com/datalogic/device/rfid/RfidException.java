package com.datalogic.device.rfid;

/**
 * <code>RFIDException</code> is used for RFID reader related errors.
 */

public class RfidException extends RuntimeException {
	/**
	 * @hide
	 */
	private static final long serialVersionUID = 3471791344374538518L;
	/**
	 * Upper part
	 * @hide
	 */
	static final int RFID_EXCEPTION = -1;

	/**
	 * Success constant.
	 */
	public static final int SUCCESS = 0;

	/**
	 * It is a RFID Service error.
	 */
	public static final int RFID_SERVICE_ERROR = (RFID_EXCEPTION <<16 | 0x0000);
	/**
	 * It is a null pointer error.
	 */
	public static final int NULL_POINTER_ERROR = (RFID_EXCEPTION <<16 | 0x0001);
	/**
	 * Generic error, mostly due to a wrong parameter passed to a SDK method.
	 */
	public static final int GENERIC_ERROR = (RFID_EXCEPTION <<16 | 0x0002);
	/**
	 * When it's not possible to call Datalogic service.
	 */
	public static final int REMOTE_CALL_ERROR = (RFID_EXCEPTION <<16 | 0x0003);
	/**
	 * The RFID reader busy, cannot accept commands.
	 */
	public static final int READER_BUSY_ERROR = (RFID_EXCEPTION <<16 | 0x0004);
	/**
	 * The RFID reader is not initialized or not connected.
	 */
	public static final int READER_NOT_AVAILABLE_ERROR = (RFID_EXCEPTION <<16 | 0x0005);
	/**
	 * A scanr session cannot be started because a condition is not met.
	 */
	public static final int READER_CANNOT_START = (RFID_EXCEPTION <<16 | 0x0006);
	/**
	 * The RFID Service cannot register or unregister the required listener.
	 */
	public static final int LISTENER_ERROR = (RFID_EXCEPTION <<16 | 0x0007);
	/**
	 * The RFID Service doesn't support the requested operation.
	 */
	public static final int UNSUPPORTED_OPERATION_ERROR = (RFID_EXCEPTION <<16 | 0x0008);
	/**
	 * The RFID Service cannot perform the operatin because it didn't found the requested tag.
	 */
	public static final int TAG_NOT_FOUND_ERROR = (RFID_EXCEPTION <<16 | 0x0009);
	/**
	 * The RFID Service cannot perform an operation with not word addressable data.
	 */
	public static final int NOT_WORD_ADDRESSABLE_ERROR = (RFID_EXCEPTION <<16 | 0x000A);
	/**
	 * The RFID Service cannot perform an operation when the data container is smaller than the requested size.
	 */
	public static final int DATA_SIZE_MISMATCH_ERROR = (RFID_EXCEPTION <<16 | 0x000B);
	/**
	 * The RFID Service cannot perform an operation when communication with the RFID tag fails.
	 */
	public static final int COMMUNICATION_ERROR = (RFID_EXCEPTION <<16 | 0x000C);

	/**
	 * The error number returned by the RFID Reader Subsystem.
	 */
	public int error_number;

	/**
	 * Constructs a RFIDException object.
	 */
	public RfidException() {
		super();
		error_number = RFID_SERVICE_ERROR;
	}

	/**
	 * Constructs a RFIDException object.
	 *
	 * @param ex A {@link RfidException} with an existing error code set.
	 */
	public RfidException(RfidException ex) {
		super();
		error_number = ex.error_number;
	}

	/**
	 * Constructs a RFIDException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 *
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 */
	public RfidException(String s) {
		super("Decoder error: " + s);
		error_number = RFID_SERVICE_ERROR;
	}

	/**
	 * Constructs a RFIDException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 *
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 * @param number
	 *            <code>int</code> representing the error code number.
	 */
	public RfidException(String s, int number) {
		super("Decoder error" + stringifyCode(number) + ": " + s);
		error_number = number;
	}

	/**
	 * Constructs a RFIDException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 *
	 * @param number
	 *            <code>int</code> representing the error code number.
	 */
	public RfidException(int number) {
		super();
		error_number = number;
	}

	// Private method to return a meaningful string of the error code.
	private static String stringifyCode(int number) {
		switch (number) {
			case RFID_SERVICE_ERROR:
				return " [RFID SERVICE ERROR]";
			case NULL_POINTER_ERROR:
				return " [NULL POINTER ERROR]";
			case GENERIC_ERROR:
				return " [GENERIC ERROR]";
			case REMOTE_CALL_ERROR:
				return " [REMOTE CALL ERROR]";
			case READER_BUSY_ERROR:
				return " [READER BUSY ERROR]";
			case READER_NOT_AVAILABLE_ERROR:
				return " [READER NOT AVAILABLE ERROR]";
			case READER_CANNOT_START:
				return " [READER CANNOT START]";
			case LISTENER_ERROR:
				return " [LISTENER ERROR]";
			case UNSUPPORTED_OPERATION_ERROR:
				return " [UNSUPPORTED OPERATION ERROR]";
			case TAG_NOT_FOUND_ERROR:
				return " [TAG NOT FOUND ERROR]";
			default:
				return "";
		}
	}
}
