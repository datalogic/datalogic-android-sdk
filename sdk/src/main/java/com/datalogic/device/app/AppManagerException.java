package com.datalogic.device.app;

/**
 * This exception is used for AppManager related errors.
 */

public class AppManagerException extends RuntimeException {

	/**
	 * Success constant.
	 */
	public static final int SUCCESS = 0;

	/**
	 * Installer Service error.
	 */
	public static final int INSTALLER_SERVICE_ERROR = -3866623;

    /**
	 * Null pointer error.
	 */
	public static final int NULL_POINTER_ERROR = -3866622;

    /**
	 * Invalid argument error.
	 */
    public static final int INVALID_ARGUMENT_ERROR = -3866597;

    /**
	 * Package not found error.
	 */
     public static final int PACKAGE_NOT_FOUND_ERROR = -3866596;

    /**
 	 * There are no permissions declared to be granted.
 	 */
      public static final int NO_PERMISSIONS_TO_BE_GRANTED = -3866595;

    /**
   	 * There are no permissions declared to be granted.
   	 */
        public static final int PERMISSION_NOT_GRANTED_ERROR = -3866582;


	/**
	 * Generic error, mostly due to a wrong parameter passed to a SDK method.
	 */
	public static final int GENERIC_ERROR = -3866621;

	/**
	 * It's not possible to call the remote service.
	 */
	public static final int REMOTE_CALL_ERROR = -3866620;

    /**
	 * IO exception.
	 */
	public static final int IO_ERROR = -3866617;

    /**
	 * Security exception.
	 */
	public static final int SECURITY_ERROR = -3866616;

    /**
	 * IllegalArgumentException exception.
	 */
	public static final int SESSION_PARAM_ERROR = -3866615;

    /**
	 * The application is not installed.
	 */
	public static final int NOT_INSTALLED = -3866614;

    /**
	 * The passed list is empty.
	 */
	public static final int EMPTY_LIST = -3866613;

    /**
	 * App not found.
	 */
	public static final int APK_NOT_FOUND = -3866602;

	/**
	 * Remote service not bound.
	 */
	public static final int UNBOUND_SERVICE = -3866601;

	/**
	 * The error number returned by the Installer's system services.
	 */
	public int error_number;

	/**
	 * @hide
	 * Constructs an AppManagerException object.
	 */
	private AppManagerException() {
	}

	// Method to return a meaningful string of the error code.
	public static String stringifyCode(int number) {
		return null;
	}
}
