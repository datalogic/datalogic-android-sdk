package com.datalogic.decode.configuration;

/**
 * The <code>BeamMode</code> is an enumeration defining the operating beam
 * mode. This enumeration applies both for scanner targeting pattern and
 * laser/long range spot beam.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>TARGET_TIMEOUT</td>
 * <td>Turn off targeting pattern after timeout</td>
 * </tr>
 * <tr>
 * <td>RELEASE_SCAN</td>
 * <td>Turn off targeting pattern after trigger release</td>
 * </tr>
 * </table>
 */
public enum BeamMode {
    /**
     * A timeout turns off the aiming pattern
     */
	TARGET_TIMEOUT,
	/**
	 * The release of scan button turns off the aiming pattern
	 */
	RELEASE_SCAN;
}
