package com.datalogic.device.configuration;

import com.datalogic.device.ErrorManager;

/**
 * <code>PropertyEditor</code> is the interface to get and set properties
 * from/to the underlying subsystem.
 */

public interface PropertyEditor extends PropertyGetter {

	/**
	 * Sets one or more label programming parameters of type Integer.
	 * 
	 * @param id_buffer
	  *            The <code>int[]</code> of identifiers for parameters to set.
	  * @param value_buffer
	  *            The <code>int[]</code> of values associated to the passed IDs to set.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setPropertyInts(int[] id_buffer, int[] value_buffer);

	/**
	 * Sets one or more label programming parameters of type String.
	 * 
	 * @param id_buffer
	  *            The <code>int[]</code> identifiers for parameters to set.
	  * @param value_buffer
	  *            The <code>String[]</code> of values associated to the passed IDs to set.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setPropertyStrings(int[] id_buffer, String[] value_buffer);

	/**
	 * Saves the configuration. The configuration is saved in a persistent way
	 * across system reboots.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int commitProperties();
}
