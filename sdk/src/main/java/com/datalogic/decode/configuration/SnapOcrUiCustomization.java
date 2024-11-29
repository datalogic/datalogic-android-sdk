package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>SnapOcrUiCustomization</code> is the class that configures the Snap OCR settings related to
 * the UI customization.
 */
public class SnapOcrUiCustomization extends PropertyGroup {

	/**
	 * <code>blockColor</code> is used to setup the background color in the OCR result dialog.
	 */
	public NumericProperty blockColor;

	/**
	 * <code>textColor</code> is used to setup the text color in the OCR result dialog.
	 */
	public NumericProperty textColor;

	/**
	 * <code>referenceRoiVisible</code> is used to show or hide the reference ROI from
	 * the preview and from the OCR result dialog.
	 */
	public BooleanProperty referenceRoiVisible;


	/**
	 * This is the constructor of SnapOcrUiCustomization.
	 */
	public SnapOcrUiCustomization(PropertyGetter editor) {
		
	}
}
