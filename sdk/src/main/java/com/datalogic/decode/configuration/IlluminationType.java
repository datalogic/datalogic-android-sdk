package com.datalogic.decode.configuration;

/**
 * <code>IlluminationType</code> is an enumeration defining the allowed illumination type
 * can be used for scanning. Only some Scanners provides this feature.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>AUTO</td>
 * <td>The illumination type is selected according to the enabled symbologies.</td>
 * </tr>
 * <tr>
 * <td>RED</td>
 * <td>Red illumination is used for scanning.</td>
 * </tr>
 * <tr>
 * <td>WHITE</td>
 * <td>White illumination is used for scanning.</td>
 * </tr>
 * </table>
 */
public enum IlluminationType {
    /**
     * Red or white illumination according to the enabled symbologies.
     */
    AUTO,
    /**
     * Always red illumination.
     */
    RED,
    /**
     * Always white illumination.
     */
    WHITE;
}
