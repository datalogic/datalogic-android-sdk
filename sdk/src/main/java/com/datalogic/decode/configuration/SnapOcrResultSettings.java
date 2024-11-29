package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>SnapOcrResultSettings</code> is the class that configures the Snap OCR settings related to
 * the OCR results.
 */
public class SnapOcrResultSettings extends PropertyGroup {

	/**
	 * <code>resultsCombination</code> specifies how to send the OCR results, if they are concatenated
	 * in the same barcode result or divided in different results.
	 */
	public EnumProperty<SnapOcrResultsCombination> resultsCombination;

	/**
	 * <code>resultSeparator</code> is a String providing the separator between results,
	 * only used in concatenated mode.
	 */
	public TextProperty resultSeparator;

	/**
	 * <code>regexFilter</code> is a regular expression used to filter any OCR text, excluding
	 * the values that don't match the filter.
	 */
	public TextProperty regexFilter;

	/**
	 * <code>roiPrefixVisible</code> allows to show the ROI number as prefix inside the OCR
	 * results, when enabled. The prefix is set in the format ROI_NUMBER:OCR_TEXT, where
	 * ROI_NUMBER indicates the index of the ROI inside the ROI settings (starting from 1)
	 * and OCR_TEXT is the original result.
	 */
	public BooleanProperty roiPrefixVisible;

	/**
	 * This is the constructor of SnapOcrResultSettings.
	 */
	public SnapOcrResultSettings(PropertyGetter editor) {
		
	}
}
