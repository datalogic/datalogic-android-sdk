package com.datalogic.decode.configuration;

/**
 * <code>Code128ExtendedAsciiMode</code> is an enumeration defining the Extended ASCII support for Code 128 barcodes.
 * This enumeration specifies the allowed options.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>DISABLED</td>
 * <td>Extended ASCII support disabled.</td>
 * </tr>
 * <tr>
 * <td>BASIC</td>
 * <td>Only single FNC4 code are evaluated.</td>
 * </tr>
 * <tr>
 * <td>FULL</td>
 * <td>Fully implement FNC4 evaluation.</td>
 * </tr>
 * </table>
 */
public enum Code128ExtendedAsciiMode {
    /**
     * Extended ASCII support disabled
     */
    DISABLED,
    /**
     * Basic Extended ASCII support, only single FNC4 code are evaluated
     */
    BASIC,
    /**
     * Full Extended ASCII support, fully implement FNC4 evaluation
     */
    FULL;
}
