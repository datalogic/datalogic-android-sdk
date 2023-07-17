package com.datalogic.device.configuration;

import com.datalogic.device.ErrorManager;

/**
 * <code>TextProperty</code> is the class that implements the property of type
 * String.
 */
public class TextProperty extends Property<String> {

	/**
	 * This is the constructor of TextProperty.
	 * 
	 * @param index <code>int</code> the corresponding ID.
	 */
	public TextProperty(int index) {
		super(index);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int load(PropertyGetter from) {
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int store(PropertyEditor to) {
		return 0;
	}
}
