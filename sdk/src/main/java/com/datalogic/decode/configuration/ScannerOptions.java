package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>ScannerOptions</code> is the class that configures the scanner target
 * beam and other scanner functionalities.
 */
public class ScannerOptions extends PropertyGroup {

	/**
	 * <code>displayModeEnable</code> barcode illumination management for capturing frames from displys or reflective surfaces.
	 * The possibile configurations are: 
	 *  - feature disabled. Illuminator alwayas enabled;
	 *  - feature enabled. Illuminator adjusted according to reflection in the previous acquired frames.
	 */
	public BooleanProperty displayModeEnable;

	/**
	 * <code>illuminationEnable</code> enables barcode illumination when capturing frames.
	 */
	public BooleanProperty illuminationEnable;

	/**
	 * <code>aimEnable</code> enables aim projection when capturing frames.
	 */
	public BooleanProperty aimEnable;

	/**
	 * <code>targetMode</code> selects the scanner target beam mode.
	 */
	public EnumProperty<BeamMode> targetMode;

	/**
	 * <code>picklistEnable</code> limits reading to targeted selection.
	 */
	public BooleanProperty picklistEnable;

	/**
	 * <code>targetModeEnable</code> enables the use of a target beam mode.
	 */
	public BooleanProperty targetModeEnable;

	/**
	 * <code>targetTimeout</code> is time the target beam is on before scanner
	 * attempts to read. 0=0.25 seconds, 1 to 4= 0.5 to 2 seconds. If the value
	 * exceeds the range, the value is set at full scale.
	 */
	public NumericProperty targetTimeout;

	/**
	 * <code>targetReleaseTimeout</code> is the maximum time the scanner is on after
	 * trigger release when using Release Scan target beam mode. If the value
	 * exceeds the range, the value is set at full scale.
	 */
	public NumericProperty targetReleaseTimeout;

	/**
	 * <code>decodeTimeout</code> is the maximum time the scanner remains on
	 * without reading a barcode. If the value exceeds the range, the value is
	 * set at full scale. The amount of time is represented in milliseconds.
	 */
	public NumericProperty decodeTimeout;

	/**
	 * <code>imageCaptureProfile</code> selects the scanner image capture profile.
	 */
	public EnumProperty<ImageCaptureProfile> imageCaptureProfile;

	/**
	 * This is the constructor of ScannerOptions. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public ScannerOptions(PropertyGetter editor) {
	}

}
