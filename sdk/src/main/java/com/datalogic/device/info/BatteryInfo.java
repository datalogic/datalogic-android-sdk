package com.datalogic.device.info;

import com.datalogic.device.DeviceException;

/**
 * The <code>BatteryInfo</code> class stores battery's info.
 * @deprecated This object has been deprecated from Datalogic SDK v1.13, because it is going away in a future release.
 *             Information about Battery Manufacturing can be retrieved using {@link com.datalogic.device.battery.ManufacturerInfo} instead.
 */
@Deprecated
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
