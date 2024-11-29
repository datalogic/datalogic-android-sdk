package com.datalogic.decode.configuration;

/**
 * The <code>SnapOcrResultsCombination</code> is an enumeration defining the way in which
 * the OCR results are combined.
 *
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>CONCATENATED</td>
 * <td>
 * Concatenates the OCR texts into a single result, with the separator specified.
 * </td>
 * </tr>
 * <tr>
 * <td>DIVIDED</td>
 * <td>
 * Each selected OCR text is sent as a separate result.
 * </td>
 * </tr>
 * </table>
 */
public enum SnapOcrResultsCombination {
    /**
     * Concatenates the OCR texts into a single result, with the separator specified.
     */
    CONCATENATED,

    /**
     * Each selected OCR text is sent as a separate result.
     */
    DIVIDED;
}
