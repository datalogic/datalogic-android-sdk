package com.datalogic.decode;

/**
 * <code>DecodeException</code> is used for decoder related errors.
 */

public class DecodeException extends RuntimeException {
	/**
	 * Upper part
	 * @hide
	 */
	static final int DEC_EXCEPTION = -1;

	/**
	 * Success constant.
	 */
	public static final int SUCCESS = 0;

	/**
	 * It is a Barcode Service error.
	 */
	public static final int BARCODE_SERVICE_ERROR = (DEC_EXCEPTION<<16 | 0x0000);
	/**
	 * It is a null pointer error.
	 */
	public static final int NULL_POINTER_ERROR = (DEC_EXCEPTION<<16 | 0x0001);
	/**
	 * Generic error, mostly due to a wrong parameter passed to a SDK method.
	 */
	public static final int GENERIC_ERROR = (DEC_EXCEPTION<<16 | 0x0002);
	/**
	 * When it's not possible to call Datalogic service.
	 */
	public static final int REMOTE_CALL_ERROR = (DEC_EXCEPTION<<16 | 0x0003);
	/**
	 * The scan engine is busy, cannot accept commands.
	 */
	public static final int DECODER_BUSY_ERROR = (DEC_EXCEPTION<<16 | 0x0004);
	/**
	 * The scan engine is not initialized or not connected.
	 */
	public static final int DECODER_NOT_AVAILABLE_ERROR = (DEC_EXCEPTION<<16 | 0x0005);
	/**
	 * A scan session cannot be started because a condition is not met.
	 */
	public static final int DECODER_CANNOT_START = (DEC_EXCEPTION<<16 | 0x0006);

	/**
	 * The error number returned by the Decoding Subsystem.
	 */
	public int error_number;

	/**
	 * Constructs a DecodeException object.
	 */
	public DecodeException() {
	}

	/**
	 * Constructs a DecodeException object.
	 * 
	 * @param ex A {@link DecodeException} with an existing error code set.
	 */
	public DecodeException(DecodeException ex) {
	}

	/**
	 * Constructs a DecodeException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 * 
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 */
	public DecodeException(String s) {
	}

	/**
	 * Constructs a DecodeException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 * 
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 * @param number
	 *            <code>int</code> representing the error code number.
	 */
	public DecodeException(String s, int number) {
	}

	/**
	 * Constructs a DecodeException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 * 
	 * @param number
	 *            <code>int</code> representing the error code number.
	 */
	public DecodeException(int number) {
	}
}
