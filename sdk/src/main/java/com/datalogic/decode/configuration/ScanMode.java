package com.datalogic.decode.configuration;

/**
 * The <code>ScanMode</code> is an enumeration defining the operating scan
 * mode.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>SINGLE</td>
 * <td>
 * When pressing the trigger or virtually starting the decoder,
 * the device will scan until a barcode is read, the timeout
 * has been reached, the trigger is released or the decoder
 * has been virtually stopped.
 * </td>
 * </tr>
 * <tr>
 * <td>HOLD_MULTIPLE</td>
 * <td>
 * When pressing the trigger or virtually starting the decoder,
 * the device will scan continuously until the timeout from the
 * last decoding result has been reached, the trigger is released
 * or the decoder has been virtually stopped.
 * </td>
 * </tr>
 * <tr>
 * <td>PULSE_MULTIPLE</td>
 * <td>
 * Works similarly to HOLD_MULTIPLE but the scan is stopped after
 * releasing and pressing back the trigger. When virtually starting
 * the decoder the behavior is the same as HOLD_MULTIPLE.
 * </td>
 * </tr>
 * <tr>
 * <td>ALWAYS_ON</td>
 * <td>
 * Scanning is always enabled when this option is selected.
 * In this case, scanner properties different from the ScanMode
 * cannot be applied until the scan mode is set to a different
 * value.
 * </td>
 * </tr>
 * </table>
 */
public enum ScanMode {
	/**
	 * Single scan.
	 */
	SINGLE,

	/**
	 * Multiple scans by keeping the trigger pressed.
	 */
	HOLD_MULTIPLE,

	/**
	 * Multiple scans until the trigger is released and pressed again.
	 */
	PULSE_MULTIPLE,

	/**
	 * The scanner will be always enabled, scanning continuously.
	 */
	ALWAYS_ON;
}
