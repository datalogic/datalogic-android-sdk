package com.datalogic.decode.configuration;

/**
 * The <code>ImageCaptureProfile</code> is an enumeration defining the scanner profile
 * for image capture.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>AUTOMATIC_BY_ENABLED_SYMBOLOGIES</td>
 * <td>Capture frames according to the enabled symbologies</td>
 * </tr>
 * <tr>
 * <td>MOTION_TOLERANCE</td>
 * <td>Capture frames taking into account the motion</td>
 * </tr>
 * <tr>
 * <td>REFLECTIONS_TOLERANCE</td>
 * <td>Capture frames taking into account possible reflections</td>
 * </tr>
 * </table>
 */
public enum ImageCaptureProfile {
    /**
     * The profile is set according to the enabled symbologies
     */
	AUTOMATIC_BY_ENABLED_SYMBOLOGIES,
    /**
     * The profile improves the performance taking into account the motion
     */
	MOTION_TOLERANCE,
	/**
	 * The profile improves the performance taking into account possible reflections
	 */
	REFLECTIONS_TOLERANCE;
}
