package com.datalogic.itemtracking;

/**
 * This exception is used to handle errors related to item tracking.
 * It provides predefined error constants and constructors to create exceptions
 * with custom messages and specific error codes.
 */
public class ItemTrackingException extends RuntimeException {
	/**
	 * Constant representing a successful operation.
	 */
	public static final int SUCCESS = 0;
	/**
	 * Constant representing a generic error.
	 */
	public static final int GENERIC_ERROR = -1;
	/**
	 * Constant indicating an error when calling the internal service.
	 */
	public static final int REMOTE_CALL_ERROR = -2;
	/**
	 * Constant indicating an error when attempting to call a session method
	 * after the session has been released.
	 */
	public static final int SESSION_RELEASED_ERROR = -3;

	/**
	 * The error number returned by system services.
	 * This field identifies the specific type of error that occurred.
	 * Applications can use this field to implement custom error handling logic.
	 *
	 * Example:
	 * <pre>
	 * try {
	 *     // Some item tracking operation
	 * } catch (ItemTrackingException e) {
	 *     if (e.error_number == ItemTrackingException.REMOTE_CALL_ERROR) {
	 *         // Handle remote call error
	 *     }
	 * }
	 * </pre>
	 */
	public int error_number;

	/**
	 * @hide
	 * Constructs an ItemTrackingException object.
	 */
	private ItemTrackingException() {
	}
}
