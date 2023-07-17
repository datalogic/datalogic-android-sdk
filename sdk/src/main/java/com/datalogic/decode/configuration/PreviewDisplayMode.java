package com.datalogic.decode.configuration;

/**
 * The <code>PreviewDisplayMode</code> is an enumeration defining the mode used
 * while showing the camera preview if the selected input device is a camera
 * (front or rear).
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>FIT_SCREEN</td>
 * <td>The preview will fit the screen in the smallest dimension</td>
 * </tr>
 * <tr>
 * <td>MANUAL</td>
 * <td>The preview will be positioned manually</td>
 * </tr>
 * </table>
 */
public enum PreviewDisplayMode {
    /**
     * Fit Screen.
     */
    FIT_SCREEN,
    /**
     * Manual.
     */
    MANUAL;
}
