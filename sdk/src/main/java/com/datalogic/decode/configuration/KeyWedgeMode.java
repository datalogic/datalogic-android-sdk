package com.datalogic.decode.configuration;

/**
 * <code>KeyWedgeMode</code> is an enumeration defining the
 * different {@link KeyboardWedge} input methodologies.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>TEXT_INJECTION</td>
 * <td>Inject the data, in form of text, directly in the text area</td>
 * </tr>
 * <tr>
 * <td>KEY_PRESSURE</td>
 * <td>Emulate the pressure of the keyboard keys</td>
 * </tr>
 * </table>
 */
public enum KeyWedgeMode {
    /**
     * Text Injection
     */
    TEXT_INJECTION,
    /**
     * Key Pressure
     */
    KEY_PRESSURE,
    /**
     * Commit Text
     */
    COMMIT_TEXT;
}
