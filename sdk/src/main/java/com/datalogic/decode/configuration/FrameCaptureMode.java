package com.datalogic.decode.configuration;

/**
 * The <code>FrameCaptureMode</code> is an enumeration defining the operating frame
 * capture mode.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>DECODED</td>
 * <td>Only decoded frames captured by the Scanner are retrieved</td>
 * </tr>
 * <tr>
 * <td>NOT_DECODED</td>
 * <td>Only not decoded frames captured by the Scanner are retrieved</td>
 * </tr>
 * <tr>
 * <td>ALL_IMAGES</td>
 * <td>All frames are retrieved</td>
 * </tr>
 * </table>
 */
public enum FrameCaptureMode {
    /**
     * All frames are retrieved 
     */
	ALL_IMAGES,
	/**
	 * Only decoded frames captured by the Scanner are retrieved
	 */
	DECODED,
	/**
	 * Only not decoded frames captured by the Scanner are retrieved
	 */
	NOT_DECODED;

	private static FrameCaptureMode[] allValues = values();

	public static FrameCaptureMode fromOrdinal(int n) {
		return allValues[n];
	}
}
