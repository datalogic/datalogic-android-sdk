package com.datalogic.device.power;


/**
 * The <code>RebootReason</code> enumeration is the class that includes the reboot reason related to Power off.
 * 
 */
public enum RebootReason {
	/**
	 * Unknown device reboot 
	 */
	UNKNOWN, //
	/**
	 * Power button by menu used to power-off the device
	 */
	POWER_KEY, //
	/**
	 * Hardware Reset button used to reset the device
	 */
	HW_RESET_BUTTON; //
}
