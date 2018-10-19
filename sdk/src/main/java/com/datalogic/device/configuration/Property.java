package com.datalogic.device.configuration;

import java.util.ArrayList;

import com.datalogic.device.ErrorManager;

/**
 * <code>Property</code> is the abstract class that represents a generic Property of type T.
 */
public abstract class Property<T> {

	/**
	 * Constructor of Property.
	 * 
	 * @param id <code>int</code> a corresponding numeric ID.
	 */
	public Property(int id) {
	}

	/**
	 * Gets the generic object associated to the Property.
	 * 
	 * @return T The bare associated value.
	 */
	public T get() {
		return null;
	}

	/**
	 * Sets the generic object.
	 * 
	 * @param value The value to be set.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 */
	public int set(T value) {
		return 0;
	}

	/**
	 * Returns whether a Property is supported or not.
	 * 
	 * @return <code>boolean</code> value representing whether the Property is supported or not.
	 */
	public boolean isSupported() {
		return false;
	}

	/**
	 * Retrieves the associated internal numeric ID.
	 * 
	 * @return <code>int</code> The internal ID, as a number.
	 */
	public int getId() {
		return 0;
	}

	/**
	 * Loads the property with the current set values, through a PropertyGetter.
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
	 * Stores the Property value, applying them.
	 * 
	 * @param to The {@link PropertyEditor} in charge of applying the desired values.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int store(PropertyEditor to) {
		return 0;
	}

	/**
	 * Finds the corresponding Property matching the passed ID, in a list of Properties.
	 * 
	 * @param list The {@link ArrayList} containing all the Properties.
	 * @param id The <code>int</code> representing the ID that should be found.
	 * @return Property corresponding to the passed ID, null in case of error.
	 */
	public static Property findPropertybyId(ArrayList<Property> list, int id) {
		return null;
	}

	/**
	 * Stores and applies all the Properties and their current associated values.
	 * 
	 * @param to The {@link PropertyEditor} used to store all the values.
	 * @param list The {@link ArrayList} containing the Properties.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public static int storelist(PropertyEditor to, ArrayList list) {
		return 0;
	}

	/**
	 * Loads and sync the current set values into all the Properties contained in the passed list.
	 * 
	 * @param from The {@link PropertyGetter} used to sync all the active values associated to the Properties.
	 * @param list The {@link ArrayList} containing the Properties to be loaded.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public static int loadlist(PropertyGetter from, ArrayList list) {
		return 0;
	}
}
