package com.datalogic.decode;

import com.datalogic.device.ErrorManager;
import com.datalogic.device.configuration.ConfigException;
import com.datalogic.device.configuration.PropertyGetter;

/**
 * <code>BarcodeDefaults</code> provides methods to retrieve default decoder
 * properties.
 */
public class BarcodeDefaults implements PropertyGetter {

	/**
	 * This is the constructor of BarcodeDefaults.
	 */
	public BarcodeDefaults() {
	}

	/**
	 * Retrieves the default Property integer values associated to specific IDs.
	 * 
	 * @param id_buffer
	 *            A <code>int[]</code> buffer containing numeric IDs.
	 * @param value_buffer
	 *            A <code>int[]</code> buffer containing all the corresponding values associated to the passed IDs.
	 *            It will be filled in during the operation.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	@Override
	public int getPropertyInts(int[] id_buffer, int[] value_buffer) {
		return 0;
	}

	/**
	 * Retrieves the default Property String values associated to specific IDs.
	 * 
	 * @param id_buffer
	 *            A <code>int[]</code> buffer containing numeric IDs.
	 * @param value_buffer
	 *            A <code>String[]</code> buffer containing all the corresponding values associated to the passed IDs.
	 *            It will be filled in during the operation.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	@Override
	public int getPropertyStrings(int[] id_buffer, String[] value_buffer) {
		return 0;
	}

	/**
	 * Gets one or more property ranges for the passed programming parameters.
	 * 
	 * @param id_buffer
	 *            The <code>int[]</code> of identifiers for parameters to look for.
	 * @param property_ranges
	 *            The <code>int[][2]</code> array of ranges associated to the passed IDs, that will be filled in.
	 *	      Each element will be filled with the range of the admissible values described by min and max value.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
    public int getPropertyRanges(int[] id_buffer, int[][] property_ranges) {
		return 0;
    }

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
    public int getPropertyAvailability(int[] id_buffer, boolean[] availability_buffer) {
		return 0;
    }
}
