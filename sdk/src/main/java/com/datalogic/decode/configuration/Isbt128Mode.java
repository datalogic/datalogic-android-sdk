package com.datalogic.decode.configuration;

/**
 * <code>Isbt128Mode</code> is an enumeration defining the decoding mode for ISBT 128 barcodes.
 * This enumeration specifies the allowed options.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>SINGLE ONLY</td>
 * <td>Only single ISBT 128 barcode is decoded.</td>
 * </tr>
 * <tr>
 * <td>CONCATENATED ONLY</td>
 * <td>Only concatenated ISBT 128 barcode is decoded.</td>
 * </tr>
 * <tr>
 * <td>BOTH</td>
 * <td>Both single and concatenated ISBT 128 barcode are allowed.</td>
 * </tr>
 * </table>
 */
public enum Isbt128Mode {
    /**
     * Single ISBT 128 barcode allowed
     */
    SINGLE_ONLY,
    /**
     * Concatenated ISBT 128 barcodes allowed
     */
    CONCATENATED_ONLY,
    /**
     * Single and Concatenated ISBT 128 allowed
     */
    BOTH;
}
