package com.datalogic.decode.configuration;

/**
 * <code>IlluminationTime</code> is an enumeration defining the allowed illumination time
 * can be used for scanning. Only some Scanners provides this feature.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>SHORT_PULSE</td>
 * <td>The short pulse illumination time is selected.</td>
 * </tr>
 * <tr>
 * <td>LONG_PULSE</td>
 * <td>The long pulse illumination time is selected.</td>
 * </tr>
 * </table>
 */
public enum IlluminationTime {
    /**
     * Short time illumination.
     */
    SHORT_PULSE,
    /**
     * Long time illumination.
     */
    LONG_PULSE;
    
    private static IlluminationTime[] allValues = values();
    
    public static IlluminationTime fromOrdinal(int n) {
        return allValues[n];
    }
}
