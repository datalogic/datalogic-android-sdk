package com.datalogic.device.configuration;

import java.util.ArrayList;

import com.datalogic.device.ErrorManager;

/**
 * <code>PropertyGroup</code> contains properties and/or other property groups.
 */
public class PropertyGroup {

	/**
	 * This is an empty constructor, in the implementation MUST be implemented.
	 * @hide
	 */
	protected PropertyGroup(){}

	/**
	 * Load the properties values contained by this property from the
	 * PropertyGetter.
	 * 
	 * @param from The {@link PropertyGetter} called to synchronize the current values.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int load(PropertyGetter from) {
		return 0;
	}

	/**
	 * Store the properties values contained by this property into the
	 * PropertyEditor.
	 * 
	 * @param to The {@link PropertyEditor} in charge of applying the desired values.
	 * @param persist <code>boolean</code> if true the configuration is saved in a persistent way across
	 *            system reboots.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int store(PropertyEditor to, boolean persist) {
		return 0;
	}

	/**
	 * Tells if this property group is supported by the underling decoding
	 * hardware.
	 * 
	 * @return true if at least one contained property is supported by the
	 *         underling decoding hardware. <br>
	 *         If this property group doesn't contain any property, this method
	 *         returns false.
	 */
	public boolean isSupported() {
		return false;
	}

	/**
     * Tells if this property group is completely supported by the underling decoding
     * hardware.
     * 
     * @return true if all contained property are supported by the
     *         underling decoding hardware. <br>
     *         If this property group doesn't contain any property, this method
     *         returns false.
     */
	public boolean isFullySupported() {
        return false;
	}

	/**
	 * Returns the properties contained by this group.
	 * 
	 * @return the properties in as ArrayList. <br>
	 *         It is null if there are no properties in this group.
	 */
	public ArrayList<Property> getProperties() {
		return null;
	}

	/**
	 * Returns the property groups contained by this group.
	 * 
	 * @return the property groups in as ArrayList. <br>
	 *         It is null if there are no other property groups in this group.
	 */
	public ArrayList<PropertyGroup> getGroups() {
		return null;
	}

}
