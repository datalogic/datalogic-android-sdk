package com.datalogic.decode.configuration;

/**
 * <code>InverseMode</code> is an enumeration defining the decoding mode for regular/reverse barcodes.
 * This enumeration specifies the allowed options.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>REGULAR ONLY</td>
 * <td>Only regular decoding mode is allowed.</td>
 * </tr>
 * <tr>
 * <td>REVERSE ONLY</td>
 * <td>Only reverse decoding mode is allowed.</td>
 * </tr>
 * <tr>
 * <td>BOTH</td>
 * <td>Both regular and reverse decoding mode are allowed.</td>
 * </tr>
 * </table>
 */
public enum InverseMode {
    /**
     * Regular decoding mode
     */
    REGULAR_ONLY,
    /**
     * Reverse decoding mode
     */
    REVERSE_ONLY,
    /**
     * Regular and Reverse
     */
    BOTH;
}
