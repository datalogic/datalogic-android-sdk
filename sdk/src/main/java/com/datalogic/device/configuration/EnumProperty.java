package com.datalogic.device.configuration;

/**
 * <code>EnumProperty</code> is the class that implements the property of type
 * Enum.
 * 
 */
public class EnumProperty<E extends Enum<E>> extends Property<Enum<E>> {

	/**
	 * Constructor
	 * 
	 * @param index
	 */
	public EnumProperty(int index) {
		super(index);
	}

	/**
	 * Returns the class object corresponding to the Enum
	 * 
	 * @return Class representing the corresponding class, null in case
	 * of error.
	 */
	public Class<E> getEnum() {
		return null;
	}
}
