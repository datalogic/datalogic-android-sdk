package com.datalogic.device.nfc;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

/**
 * This class provides access to enable and disable the nfc adapter
 */
public class NfcManager {
	/**
	 * This is the constructor of NfcManager.
	 * 
	 * @throws DeviceException in case of error.
	 */
	public NfcManager() {
	}

	/**
	 * Enables the nfc adapter.
	 * 
	 * @param enable
	 *            a <code>boolean</code> that indicates whether to enable or to disable the nfc adapter.
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int enableNfcAdapter(boolean enable) {
		return 0;
	}
}
