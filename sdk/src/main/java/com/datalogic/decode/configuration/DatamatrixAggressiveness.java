package com.datalogic.decode.configuration;

/**
 * <code>DatamatrixAggressiveness</code> is an enumeration defining the allowed aggressive mode for Datamatrix barcodes.
 * The aggressive mode can provide an improvement of decoding performance, but the decoding robustness
 * can decrease with the performance improvement. Therefore LOW aggressive mode should be set
 * in case of barcode printed with good quality. HIGH is suggested to improve performance in case
 * of barcode printed with poor quality.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>LOW</td>
 * <td>Low aggressiveness with high robustness.</td>
 * </tr>
 * <tr>
 * <td>HIGH</td>
 * <td>High aggressiveness, but robustness worsening.</td>
 * </tr>
 * </table>
 */
public enum DatamatrixAggressiveness {
    /**
     * Low aggressiveness for decoding good quality barcodes.
     */
    LOW,
    /**
     * High aggressiveness for decoding poor quality barcodes.
     */
    HIGH;
}
