package com.datalogic.device.location;

/**
 * The <code>LocationMode</code> enumeration defines different location systems that can be selectively
 * activated to help the Android LocationManager.
 */
public enum LocationMode {
	/**
	 * Indicates all the possible systems are turned off
	 */
	OFF,
	/**
	 * Indicates only the dedicated GPS system is activated
	 */
	SENSORS,
	/**
	 * Indicates only the localization mechanism based on networks will be
	 * activated
	 */
	NETWORK,
	/**
	 * Indicates all the possible systems are turned on: both GPS sensors and
	 * network assisted localization
	 */
	SENSORS_AND_NETWORK;
};
