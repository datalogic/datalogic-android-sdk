package com.datalogic.device.location;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

/**
 * The <code>LocationManager</code> class provides access to geo-location related methods of the device.
 */
public class LocationManager {
	/**
	 * This is the constructor of LocationManager.
	 *
	 * @throws DeviceException in case of error.
	 */
	public LocationManager() {
	}

	/**
	 * Set the GPS location provider mode.
	 * 
	 * @param mode
	 *            {@link LocationMode} indicates the mode to use by the location provider.
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setLocationMode(LocationMode mode) {
		return 0;
	}
}
