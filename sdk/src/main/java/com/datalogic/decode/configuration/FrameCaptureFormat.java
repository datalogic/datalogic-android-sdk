package com.datalogic.decode.configuration;

/**
 * The <code>FrameCaptureFileType</code> is an enumeration defining the file type
 * for the frames captured by the Scanner.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>GREYSCALE8BPP</td>
 * <td>Frames captured by the Scanner are encoded as Greyscale 8bpp</td>
 * </tr>
 * <tr>
 * <td>JPEG</td>
 * <td>Frames captured by the Scanner are encoded as jpeg </td>
 * </tr>
 * <tr>
 * <td>BITMAP</td>
 * <td>Frames captured by the Scanner are encoded as bitmap </td>
 * </tr>
 * </table>
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
