package com.datalogic.decode.configuration;

/**
 * The <code>DigimarcDataFormat</code> is an enumeration defining the format
 * used for Digimarc barcode.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>COMPATIBLE</td>
 * <td>This mode reports Digimarc Barcode data as if it came from a traditional data carrier (UPC or EAN, for example)</td>
 * </tr>
 * <tr>
 * <td>ENHANCED</td>
 * <td>This mode is based on the COMPATIBLE and report more complex Digimarc Barcode payloads as if they came from a GS1
 * DataBar with relevant GS1 Application Identifier.</td>
 * </tr>
 * <tr>
 * <td>NATIVE</td>
 * <td>This mode reports all Digimarc Barcode results as coming from its own, unique symbology</td>
 * </tr>
 * </table>
 */
public enum DigimarcDataFormat {
	/**
	 * This mode reports Digimarc Barcode data as if it came from a traditional data carrier
	 */
	COMPATIBLE,
	/**
	 * This mode is based on the COMPATIBLE and report more complex Digimarc Barcode payloads
	 */
	ENHANCED,
	/**
	 * This mode reports all Digimarc Barcode results as coming from its own, unique symbology
	 */
	NATIVE;

	private static final DigimarcDataFormat[] ALL_VALUES = values();

	public static DigimarcDataFormat fromOrdinal(int n) {
		return ALL_VALUES[n];
	}
}
