package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>SnapOcr</code> is the class that configures the Snap OCR feature, used to capture
 * and provide OCR text found in the scanner/camera frames.
 */
public class SnapOcr extends PropertyGroup {

	/**
	 * <code>enable</code> activates the Snap OCR feature.
	 */
	public BooleanProperty enable;

	/**
	 * <code>firstSelectionMode</code> specifies how the OCR text is selected.
	 */
	public EnumProperty<SnapOcrFirstSelectionMode> firstSelectionMode;

	/**
	 * <code>scanningPolicy</code> specifies the scanning policy.
	 */
	public EnumProperty<SnapOcrScanningPolicy> scanningPolicy;

	/**
	 * <code>roiSettings</code> specifies the settings used to define ROIs on the image, inside of which the
	 * OCR text is decoded. These settings are used only when the first selection mode is set to ROI_PROPOSE or
	 * ROI_SEND. This property can only contain an object of class {@link com.datalogic.decode.configuration.SnapOcrRoiSettings}.
	 */
	public BlobProperty roiSettings;

	/**
	 * <code>resultsSettings</code> specifies the settings related to the OCR results.
	 */
	public SnapOcrResultSettings resultsSettings;

	/**
	 * <code>uiCustomization</code> specifies the settings related to the UI.
	 */
	public SnapOcrUiCustomization uiCustomization;

	/**
	 * This is the constructor of SnapOcr.
	 */
	public SnapOcr(PropertyGetter editor) {

	}

}
