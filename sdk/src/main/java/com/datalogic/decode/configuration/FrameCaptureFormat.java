package com.datalogic.decode.configuration;

/**
 * The <code>FrameCaptureFileType</code> is an enumeration defining the file type
 * for the frames captured by the Scanner.
 *
 */
public enum FrameCaptureFormat {
	/**
	 * Frames captured by the Scanner are stored as Greyscale 8bpp
	 */
	GREYSCALE8BPP,
	/**
	 * Frames captured by the Scanner are stored as jpeg
	*/
	JPEG,
	/**
	 * Frames captured by the Scanner are stored as bitmap
	 */
	BITMAP;

	private static FrameCaptureFormat[] allValues = values();

	public static FrameCaptureFormat fromOrdinal(int n) {
		return allValues[n];
	}
}
