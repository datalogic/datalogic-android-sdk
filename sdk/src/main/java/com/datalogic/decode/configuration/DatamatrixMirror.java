package com.datalogic.decode.configuration;

/**
 * <code>DatamatrixMirror</code> is an enumeration defining the decoding mode for regular/mirror Data Matrix barcodes.
 * This enumeration specifies the allowed options.
 *
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>REGULAR ONLY</td>
 * <td>Only regular Data Matrix is allowed.</td>
 * </tr>
 * <tr>
 * <td>MIRROR ONLY</td>
 * <td>Only mirrored Data Matrix is allowed.</td>
 * </tr>
 * <tr>
 * <td>BOTH</td>
 * <td>Both regular and mirrored Data Matrix are allowed.</td>
 * </tr>
 * </table>
 */
public enum DatamatrixMirror{
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
