package com.datalogic.decode.configuration;

/**
 * <code>Gs1Conversion2d</code> is an enumeration defining the conversion used for GS1 2D barcodes.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>DISABLED</td>
 * <td>No conversion.</td>
 * </tr>
 * <tr>
 * <td>GS1_128</td>
 * <td>Convert the barcode to GS1-128 format.</td>
 * </tr>
 * <tr>
 * <td>GTIN</td>
 * <td>Take only the GTIN portion of the barcode and convert it to GTIN format.</td>
 * </tr>
 * <tr>
 * <td>UPCA_EAN13_COMPATIBILITY</td>
 * <td>Take only the GTIN portion of the barcode and convert it to the shortest option between GTIN, EAN13 and UPCA.</td>
 * </tr>
 * <tr>
 * <td>SHORTEST_UPC_EAN_COMPATIBILITY</td>
 * <td>Take only the GTIN portion of the barcode and convert it to the shortest option between GTIN, EAN13, UPCA, EAN8 and UPCE.</td>
 * </tr>
 * </table>
 */
public enum Gs1Conversion2d {
    /**
     * No conversion.
     */
	DISABLED,
	/**
	 * Convert the barcode to GS1-128 format.
	 */
	GS1_128,
	/**
	 * Take only the GTIN portion of the barcode and convert it to GTIN format.
	 */
	GTIN,
	/**
	 * Take only the GTIN portion of the barcode and convert it to the shortest
	 * option between GTIN, EAN13 and UPCA.
	 */
	UPCA_EAN13_COMPATIBILITY,
	/**
	 * Take only the GTIN portion of the barcode and convert it to the shortest
	 * option between GTIN, EAN13, UPCA, EAN8 and UPCE.
	 */
	SHORTEST_UPC_EAN_COMPATIBILITY;
}
