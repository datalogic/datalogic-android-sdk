package com.datalogic.decode.configuration;

/**
 * <code>Interleaved25Aggressiveness</code> is an enumeration defining the allowed aggressive mode for Interleaved 2/5 barcodes.
 * The aggressive mode can provide an improvement of decoding performance, but the decoding robustness
 * can decrease with the performance improvement. Therefore LOW and VERY LOW aggressive mode should be set only
 * in case of barcode printed with good quality. HIGH and VERY HIGH are suggested to improve performance in case
 * of barcode printed with very poor quality.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>VERY_LOW</td>
 * <td>Very low aggressiveness with very high robustness.</td>
 * </tr>
 * <tr>
 * <td>LOW</td>
 * <td>Low aggressiveness with high robustness.</td>
 * </tr>
 * <tr>
 * <td>MEDIUM</td>
 * <td>Balance between performance and robustness.</td>
 * </tr>
 * <tr>
 * <td>HIGH</td>
 * <td>High aggressiveness, but robustness worsening.</td>
 * </tr>
 * <tr>
 * <td>VERY HIGH</td>
 * <td>Worst robustness to improve performance to decode barcode printed with very poor quality.</td>
 * </tr>
 * </table>
 */
public enum Interleaved25Aggressiveness {
    /**
     * Very low aggressiveness for decoding very good quality barcodes.
     */
    VERY_LOW,
    /**
     * Low aggressiveness for decoding good quality barcodes.
     */
    LOW,
    /**
     * Medium aggressiveness for decoding barcodes with a balances robustness.
     */
    MEDIUM,
    /**
     * High aggressiveness for decoding poor quality barcodes.
     */
    HIGH,
    /**
     * Very high aggressiveness for decoding very poor quality barcodes.
     */
    VERY_HIGH;
}
