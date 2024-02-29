package com.datalogic.device.input;

/**
 * This class stores a virtual key scan code entry.
 */
public class VScanEntry {
	/**
	 * The VScan code is the physical scan code. <br>
	 * Use com.datalogic.device.input.KeyboardManager.VScanCode constant
	 * identifiers for physical keys <br>
	 *
	 * @see com.datalogic.device.input.KeyboardManager.VScanCode
	 *
	 *
	 * @param vScanCode
	 *            It specifies the VScan code.
	 *
	 * @param vScanMeta
	 *            It specifies the VScan meta.
	 *
	 * @see com.datalogic.device.input.KeyboardManager.VScanCode
	 */
	public VScanEntry(int vScanCode, int vScanMeta) { }

	/**
	 * The VScan code is the physical scan code. <br>
	 * Use com.datalogic.device.input.KeyboardManager.VScanCode constant
	 * identifiers for physical keys <br>
	 *
	 * @see com.datalogic.device.input.KeyboardManager.VScanCode
	 *
	 *
	 * @param vScanCode
	 *            It specifies the VScan code.
	 *
	 * @see com.datalogic.device.input.KeyboardManager.VScanCode
	 *
	 */
	public VScanEntry(int vScanCode) { }

	/**
	 * Gets the internal VScan code value.
	 *
	 * @return the VScanCode as an integer value.
	 */
	public int getVScanCode() {
		return 0;
	}

	/**
	 * Gets the internal VScan meta value.
	 *
	 * @return the VScanMeta as an integer value.
	 */
	public int getVScanMeta() {
		return 0;
	}
}
