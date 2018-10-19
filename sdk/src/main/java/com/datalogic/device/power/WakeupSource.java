package com.datalogic.device.power;


/**
 * The <code>WakeupSource</code> enumeration is the class that includes the power wakeup
 * sources.
 * 
 */
public enum WakeupSource {
	/**
	 * Power button, used to turn on and off the device
	 */
	POWER_KEY, //
	/**
	 * Real-Time clock alarm
	 */
	RTC_ALARM, //
	/**
	 * A generic charging power source
	 */
	POWER_IN, //
	/**
	 * The left trigger button
	 */
	TRIG_LEFT, //
	/**
	 * The right trigger button
	 */
	TRIG_RIGHT, //
	/**
	 * The back trigger button
	 */
	TRIG_PISTOL, //
	/**
	 * The front trigger button
	 */
	TRIG_FRONT, //
	/**
	 * Wifi data
	 */
	WIFI, //
	/**
	 * Cellular data or call
	 */
	WWAN, //
	/**
	 * Accelerometer sensor
	 */
	ACCELEROMETER, //
	/**
	 * Touch event on the screen
	 */
	TOUCH, //
	/**
	 * The AutoScan trigger
	 */
	TRIG_AUTOSCAN; //
}
