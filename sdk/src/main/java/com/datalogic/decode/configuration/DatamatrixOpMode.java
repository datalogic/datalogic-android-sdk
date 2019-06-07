package com.datalogic.decode.configuration;

/**
 * <code>DatamatrixOpMode</code> is an enumeration defining the allowed operating mode for datamatrix barcodes.
 * The operating mode can provide an improvement of decoding performance, but the decoding robustness
 * can decrease with the performance improvement. Therefore FAST and VERY FAST mode should be set only
 * in case of barcode printed with good quality. ROBUST and VERY ROBUST are suggested for DPM applications.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>VERY FAST</td>
 * <td>Best performance with lowest robustness.</td>
 * </tr>
 * <tr>
 * <td>FAST</td>
 * <td>Good performance.</td>
 * </tr>
 * <tr>
 * <td>ROBUST</td>
 * <td>Lower performance with good robustness.</td>
 * </tr>
 * <tr>
 * <td>VERY ROBUST</td>
 * <td>Worst performance with highest robustness.</td>
 * </tr>
 * </table>
 */
public enum DatamatrixOpMode {
    /**
     * Very fast decoding with very good quality.
     */
    VERY_FAST,
    /**
     * Fast decoding with good quality.
     */
    FAST,
    /**
     * Robust decoding.
     */
    ROBUST,
    /**
     * Very robust decoding with low performance.
     */
    VERY_ROBUST;
}
