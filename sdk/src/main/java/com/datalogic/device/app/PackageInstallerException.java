package com.datalogic.device.app;

/**
 * This exception is used for installer related errors.
 */

public class PackageInstallerException extends RuntimeException {

	/**
	 * Success constant.
	 */
	public static final int SUCCESS = 0;

	/**
	 * Installer Service error.
	 */
	public static final int INSTALLER_SERVICE_ERROR = (-59<<16 | 0x0001);

    /**
	 * Null pointer error.
	 */
	public static final int NULL_POINTER_ERROR = (-59<<16 | 0x0002);

	/**
	 * Generic error, mostly due to a wrong parameter passed to a SDK method.
	 */
	public static final int GENERIC_ERROR = (-59<<16 | 0x0003);

	/**
	 * It's not possible to call the remote service.
	 */
	public static final int REMOTE_CALL_ERROR = (-59<<16 | 0x0004);

    /**
	 * The application is already installed.
	 */
	public static final int ALREADY_INSTALLED = (-59<<16 | 0x0005);

    /**
	 * The apk file doesn't exist.
	 */
	public static final int INVALID_PATH = (-59<<16 | 0x0006);

    /**
	 * IO exception.
	 */
	public static final int IO_ERROR = (-59<<16 | 0x0007);

    /**
	 * Security exception.
	 */
	public static final int SECURITY_ERROR = (-59<<16 | 0x0008);

    /**
	 * IllegalArgumentException exception.
	 */
	public static final int SESSION_PARAM_ERROR = (-59<<16 | 0x0009);

    /**
	 * The application is not installed.
	 */
	public static final int NOT_INSTALLED = (-59<<16 | 0x0000A);

    /**
	 * The passed list is empty.
	 */
	public static final int EMPTY_LIST = (-59<<16 | 0x0000B); 

    /**
	 * The installed version is higher than that of the .apk intended for the upgrade.
	 */
	public static final int UPGRADE_VERSION_ERROR = (-59<<16 | 0x000C); 

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_PENDING_USER_ACTION.
	 */
	public static final int PENDING_USER_ACTION = (-59<<16 | 0x000D);

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_FAILURE.
	 */
	public static final int FAILURE = (-59<<16 | 0x000E); 

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_FAILURE_BLOCKED.
	 */
	public static final int FAILURE_BLOCKED = (-59<<16 | 0x000F);  

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_FAILURE_CONFLICT.
	 */
	public static final int FAILURE_CONFLICT = (-59<<16 | 0x0010);  

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_FAILURE_INCOMPATIBLE.
	 */
	public static final int FAILURE_INCOMPATIBLE = (-59<<16 | 0x0011); 

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_FAILURE_INVALID.
	 */
	public static final int FAILURE_INVALID = (-59<<16 | 0x0012);  

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_FAILURE_STORAGE.
	 */
	public static final int FAILURE_STORAGE = (-59<<16 | 0x0013);  

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_FAILURE_ABORTED.
	 */
	public static final int FAILURE_ABORTED = (-59<<16 | 0x0014);

    /**
	 * The commit has been refused with android.content.pm.PackageInstaller.STATUS_FAILURE_INCOMPATIBLE.
	 */
	public static final int UNKNOWN_ERROR = (-59<<16 | 0x0015);   

    /**
	 * App not found.
	 */
	public static final int APK_NOT_FOUND = (-59<<16 | 0x0016); 

	/**
	 * Remote service not bound.
	 */
	public static final int UNBOUND_SERVICE = (-59<<16 | 0x0017); 

	/**
	 * Apk is not the appropriate to upgrade the current application.
	 */
	public static final int APK_NOT_CURRENT_APP = (-59<<16 | 0x00019);

	/**
	 * Wrong sequence of call on a PackageInstallerSession.
	 */
	public static final int SESSION_WRONG_STATE = (-59<<16 | 0x0001A); 

	/**
	 * The error number returned by the Installer's system services.
	 */
	public int error_number;

	/**
	 * Constructs an PackageInstallerException object.
	 */
	public PackageInstallerException() {
    }

	/**
	 * Constructs an GENERIC_ERROR PackageInstallerException object.
	 * The <code>String</code> parameter is concatenated to the exception message.
	 *
	 * @param s
	 *            <code>String</code> String concatenated to the error message.
	 */
	public PackageInstallerException(String s) {
    }

	/**
	 * Constructs an PackageInstallerException object that takes a
	 * <code>int</code> parameter containing the reason the exception was
	 * thrown. The <code>String</code> prameter is concatenated to the exception message.
	 *
	 * @param s
	 *            <code>String</code> String concatenated to the error message.
	 * @param number
	 *            <code>int</code> indicating the error code number.
	 */
	public PackageInstallerException(String s, int number) {
    }

	/**
	 * Constructs an PackageInstallerException object that takes a
	 * <code>int</code> parameter containing the reason the exception was
	 * thrown.
	 *
	 * @param number
	 *            <code>int</code> indicating the error code number.
	 */
	public PackageInstallerException(int number) {
    }

	// Method to return a meaningful string of the error code.
	public static String stringifyCode(int number) {		
		return null;
	}
}
