package com.datalogic.device.configuration;

/**
 * <code>ConfigException</code> is used for configuration related errors.
 */

public class ConfigException extends RuntimeException {
	/**
	 * Upper part
	 * @hide
	 */
	static final int CONF_EXCEPTION = -2;

	/**
	 * Success constant.
	 */
	public static final int SUCCESS = 0;

	/**
	 * It is a Barcode Service error.
	 */
	public static final int BARCODE_SERVICE_ERROR = (CONF_EXCEPTION<<16 | 0x0000);
	/**
	 * It is a null pointer error.
	 */
	public static final int NULL_POINTER_ERROR = (CONF_EXCEPTION<<16 | 0x0001);
	/**
	 * Generic error, mostly due to a wrong parameter passed to a SDK method.
	 */
	public static final int GENERIC_ERROR = (CONF_EXCEPTION<<16 | 0x0002);
	/**
	 * When it's not possible to call Datalogic service.
	 */
	public static final int REMOTE_CALL_ERROR = (CONF_EXCEPTION<<16 | 0x0003);
	/**
	 * Parameter identifier is not supported.
	 */
	public static final int ID_ERROR = (CONF_EXCEPTION<<16 | 0x0004);
	/**
	 * Parameter value is wrong.
	 */
	public static final int VALUE_ERROR = (CONF_EXCEPTION<<16 | 0x0005);
	/**
	 * An error occurred while saving the configuration.
	 */
	public static final int COMMIT_ERROR = (CONF_EXCEPTION<<16 | 0x0006);
	/**
	 * The scan engine is busy, cannot accept commands.
	 */
	public static final int DECODER_BUSY_ERROR = (CONF_EXCEPTION<<16 | 0x0007);
    /**
     * The property is not supported.
     */
    public static final int SUPPORT_ERROR = (CONF_EXCEPTION<<16 | 0x0008);
    /**
     * The property is read only.
     */
    public static final int ACCESS_VIOLATION_ERROR = (CONF_EXCEPTION<<16 | 0x0010);
    /**
     * The JSON configuration file has an error.
     */
    public static final int JSON_ERROR = (CONF_EXCEPTION<<16 | 0x0009);
    /**
     * The JSON resource file was not found.
     */
    public static final int JSON_NOT_FOUND = (CONF_EXCEPTION<<16 | 0x000A);
    /**
     * The application to the device of the configuration failed.
     * A revert to the previous permanent configuration was done.
     */
    public static final int APPLY_FAILED = (CONF_EXCEPTION<<16 | 0x000B);
    /**
     * The application to the device of the configuration failed.
     * A revert to the previous permanent configuration failed.
     * The configuration can be inconsistent. A reboot is suggested.
     */
    public static final int REVERT_FAILED = (CONF_EXCEPTION<<16 | 0x000C);
    /**
     * Store on database failed.
     */
    public static final int STORE_FAILED = (CONF_EXCEPTION<<16 | 0x000D);
    /**
     * Database not accesible.
     */
    public static final int SERVICE_NOT_AVAILABLE = (CONF_EXCEPTION<<16 | 0x000E);
    /**
     * The apply on the specific service failed.
     */
    public static final int SPECIFIC_APPLY_FAILED = (CONF_EXCEPTION<<16 | 0x000F);
	/**
	 * The specified name is already in use.
	 */
	public static final int DUPLICATE_NAME_ERROR = (CONF_EXCEPTION<<16 | 0x0011);
	/**
	 * Error saving the json file.
	 */
	public static final int SAVE_PROFILE_ERROR = (CONF_EXCEPTION<<16 | 0x0012);
	/**
	 * There is a defined rule with an application context that overlaps with that of the rule.
	 */
	public static final int OVERLAPPING_RULE_ERROR = (CONF_EXCEPTION<<16 | 0x0013);
	/**
	 * The specified object is not found.
	 */
	public static final int NOT_FOUND_ERROR = (CONF_EXCEPTION<<16 | 0x0014);
	/**
	 * There is already a manually loaded profile.
	 */
	public static final int PROFILE_ALREADY_LOADED_ERROR = (CONF_EXCEPTION<<16 | 0x0015);


	/**
	 * The error number returned by the Configuration Subsystem.
	 */
	public int error_number;

	/**
	 * The buffer of parameters IDs that caused error, returned by the
	 * Configuration Subsystem. Only if bad_id_length > 0, bad_id_buffer is
	 * meaningful.
	 */
	public int[] bad_id_buffer;

	/**
	 * The length of bad_id_buffer returned by the Configuration Subsystem.
	 */
	public int bad_id_length;

	/**
	 * Constructs a ConfigException object.
	 */
	public ConfigException() {
	}

	/**
	 * Constructs a ConfigException object.
	 *
	 * @param ex A {@link ConfigException} with an existing error code set.
	 */
	public ConfigException(ConfigException ex) {
	}

	/**
	 * Constructs a ConfigException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 *
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 */
	public ConfigException(String s) {
	}

	/**
	 * Constructs a ConfigException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 *
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 * @param number
	 *            <code>int</code> representing the error code number.
	 */
	public ConfigException(String s, int number) {
	}

	/**
	 * Constructs a ConfigException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 * 
	 * @param number
	 *            <code>int</code> representing the error code number.
	 */
	public ConfigException(int number) {
	}

	/**
	 * Constructs a ConfigException object that takes a
	 * <code>String</code> parameter containing the reason the exception was
	 * thrown.
	 *
	 * @param s
	 *            <code>String</code> indicating why the exception occurred.
	 * @param id_buff
	 *            A <code>int[]</code> containing all the IDs that generated an error.
	 * @param buff_length
	 *            <code>int</code> size of the array.
	 */
	public ConfigException(String s, int[] id_buff, int buff_length) {
	}

}
