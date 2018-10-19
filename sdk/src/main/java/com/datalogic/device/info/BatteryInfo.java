package com.datalogic.device.info;

import com.datalogic.device.DeviceException;

/**
 * The <code>BatteryInfo</code> class stores battery's info.
 */
public class BatteryInfo {
	/**
	 * The estimated capacity of the main battery in mAh.
	 */
	public int capacity;
	/**
	 * The year the main battery was manufactured.
	 */
	public int year;
	/**
	 * The week the main battery was manufactured.
	 */
	public int week;
	/**
	 * The battery serial number.
	 */
	public String serialNumber;
	/**
	 * The battery manufacturer.
	 */
	public String manufacturer;

	/**
	 * Constructor of BatteryInfo.
	 * 
	 * @throws DeviceException in case of error.
	 */
	public BatteryInfo() {
	}

}
