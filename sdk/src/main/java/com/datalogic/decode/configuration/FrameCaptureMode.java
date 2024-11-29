package com.datalogic.decode.configuration;

/**
 * The <code>FrameCaptureMode</code> is an enumeration defining the operating frame
 * capture mode.
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
