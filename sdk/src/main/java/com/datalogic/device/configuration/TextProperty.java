package com.datalogic.device.configuration;

import com.datalogic.device.ErrorManager;

/**
 * <code>TextProperty</code> is the class that implements the property of type
 * String.
 */
public class TextProperty extends Property<String> {

	/**
	 * Constructor
	 * 
	 * @param index
	 */
	public TextProperty(int index) {
		super(index);
	}

	/**
	 * Loads the property querying the PropertyGetter.
	 * 
	 * @param from The {@link PropertyGetter} called to synchronize the current values.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	@Override
	public int load(PropertyGetter from) {
		return 0;
	}

	/**
	 * Store the property value using the passed PropertyEditor.
	 * 
	 * @param to The {@link PropertyEditor} in charge of applying the desired values.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	@Override
	public int store(PropertyEditor to) {
		return 0;
	}
}
