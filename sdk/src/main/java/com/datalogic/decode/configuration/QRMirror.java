package com.datalogic.decode.configuration;

/**
 * <code>QRMirror</code> is an enumeration defining the decoding mode for regular/mirror QR barcodes.
 * This enumeration specifies the allowed options.
 *
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>REGULAR ONLY</td>
 * <td>Only regular QR Code is allowed.</td>
 * </tr>
 * <tr>
 * <td>MIRROR ONLY</td>
 * <td>Only mirrored QR Code is allowed.</td>
 * </tr>
 * <tr>
 * <td>BOTH</td>
 * <td>Both regular and mirrored QR Codes are allowed.</td>
 * </tr>
 * </table>
 */

public enum QRMirror{
    /**
     * Regular decoding mode
     */
    REGULAR_ONLY,
    /**
     * Mirror decoding mode
     */
    MIRROR_ONLY,
    /**
     * Regular and Mirror
     */
    BOTH;
}
