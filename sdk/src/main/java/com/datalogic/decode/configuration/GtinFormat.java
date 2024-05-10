package com.datalogic.decode.configuration;

/**
 * <code>GtinFormat</code> is an enumeration defining the format used when converting a barcode to its GTIN representation.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>GS1_DATABAR_14</td>
 * <td>GS1 DataBar 14 format.</td>
 * </tr>
 * <tr>
 * <td>GS1_128</td>
 * <td>GS1-128 format.</td>
 * </tr>
 * </table>
 */
public enum GtinFormat {
    /**
     * GS1 DataBar 14 format
     */
	GS1_DATABAR_14,
	/**
	 * GS1-128 format
	 */
	GS1_128;
}
