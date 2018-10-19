package com.datalogic.device.input;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

/**
 * This class provides access to touch panel related methods of the device.
 */
public class TouchManager {
	/**
	 * This is the constructor of TouchManager.
	 *
	 * @throws DeviceException in case of error.
	 */
	public TouchManager() {
	}

	/**
	 * Locks or unlocks the input from touchscreen.
	 * 
	 * @param lock
	 *            <code>boolean</code> param that specifies whether or not the touchscreen will be locked.
	 * 
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int lockInput(boolean lock) {
		return 0;
	}

	/**
	 * Tells if the input from touchscreen is locked.
	 * 
	 * @return <code>boolean</code> it returns whether or not the touchscreen is locked.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public boolean isInputLocked() {
	    return true;
	}
}
