package com.datalogic.decode.configuration;

/**
 * The <code>SnapOcrTextBlockFormat</code> is an enumeration defining how an OCR text block
 * is defined. Depending on the definition of the text block, regular expressions apply to
 * any of the blocks separately and the final selection by UI is able to select based on
 * the text blocks defined.
 *
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>PARAGRAPH</td>
 * <td>
 * Every text block represents a paragraph detected in the text.
 * </td>
 * </tr>
 * <tr>
 * <td>LINE</td>
 * <td>
 * Every text block represents a line detected in the text.
 * </td>
 * </tr>
 * <tr>
 * <td>WORD</td>
 * <td>
 * Every text block represents a word detected in the text.
 * </td>
 * </tr>
 * </table>
 */
public enum SnapOcrTextBlockFormat {
    /**
     * Every text block represents a paragraph detected in the text.
     */
    PARAGRAPH,

    /**
     * Every text block represents a line detected in the text.
     */
    LINE,

    /**
     * Every text block represents a word detected in the text.
     */
    WORD;
}
