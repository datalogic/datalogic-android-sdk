package com.datalogic.device.configuration;

import com.datalogic.device.ErrorManager;

/**
 * <code>NumericProperty</code> is the class that implements the property of
 * type Integer.
 * 
 */
public class NumericProperty extends Property<Integer> {
	/**
	 * Constructor
	 * 
	 * @param index
	 *            <code>int</code>
	 * @param min
	 *            <code>int</code>
	 * @param max
	 *            <code>int</code>
	 */
	public NumericProperty(int index, int min, int max) {
		super(index);
	}

	/**
	 * Constructor
	 * 
	 * @param index
	 *            <code>int</code>
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public NumericProperty(int index) {
		super(index);
	}

	/**
	 * Sets the desired value.
	 * 
	 * @param value
	 *            <code>Integer</code>
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 */
	@Override
	public int set(Integer value) {
		return 0;
	}

	/**
	 * Get min limit
	 * 
	 * @return int
	 */
	public int getMin() {
		return 0;
	}

	/**
	 * Get max limit
	 * 
	 * @return int
	 */
	public int getMax() {
		return 0;
	}
}
