package com.datalogic.device.configuration;

import com.datalogic.device.ErrorManager;

/**
 * <code>PropertyGetter</code> is the interface to get properties from/to the
 * underlying subsystem.
 */

public interface PropertyGetter {

	/**
	 * Gets one or more label programming parameters of type String.
	 * 
	 * @param id_buffer
	 *            The <code>int[]</code> of identifiers for parameters to get.
	 * @param value_buffer
	 *            The <code>String[]</code> of values associated to the passed IDs to get.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int getPropertyStrings(int[] id_buffer, String[] value_buffer);

	/**
	 * Gets one or more label programming parameters of type Integer.
	 * 
	 * @param id_buffer
	 *            The <code>int[]</code> of identifiers for parameters to get.
	 * @param value_buffer
	 *            The <code>int[]</code> of values associated to the passed IDs to get.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int getPropertyInts(int[] id_buffer, int[] value_buffer);

	/**
	 * Gets one or more property ranges for the passed programming parameters.
	 * 
	 * @param id_buffer
	 *            The <code>int[]</code> of identifiers for parameters to look for.
	 * @param property_ranges
	 *            The <code>int[][]</code> array of ranges associated to the passed IDs, that will be filled in.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
    public int getPropertyRanges(int[] id_buffer, int[][] property_ranges);

	/**
	 * Retrieves the availability, the support, for the passed programming parameters.
	 * 
	 * @param id_buffer
	 *            The <code>int[]</code> of identifiers for parameters to look for.
	 * @param availability_buffer
	 *            The <code>boolean[]</code> of the passed IDs' availability, that will be filled in.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
   public int getPropertyAvailability(int[] id_buffer, boolean[] availability_buffer);
}
