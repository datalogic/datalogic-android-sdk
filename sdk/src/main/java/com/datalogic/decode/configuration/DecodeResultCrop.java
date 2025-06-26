package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.BooleanProperty;
import com.datalogic.device.configuration.PropertyGetter;
import com.datalogic.device.configuration.PropertyGroup;
import com.datalogic.device.configuration.NumericProperty;

/**
 * <code>DecodeResultCrop</code> is the class that allows to configure the
 * decode result in order to include a crop of the decoded barcode or OCR.
 */
public class DecodeResultCrop extends PropertyGroup {
	/**
	 * <code>barcodeEnable</code> allows to show the cropped image corresponding to the decoded
	 * barcode. The image is shown as a Bitmap provided in the decode result.
	 */
	public BooleanProperty barcodeEnable;

	/**
	 * <code>snapOcrEnable</code> allows to show the cropped image corresponding to the decoded
	 * barcode. The image is shown as a Bitmap provided in the decode result.
	 */
	public BooleanProperty snapOcrEnable;

	/**
	 * <code>margin</code> allows to select the amount of pixels to include as margin
	 * in the cropped image that is shown as a Bitmap in the decode result.
	 */
	public NumericProperty margin;

	/**
	 * <code>entireFrame</code> allows to send the entire frame shown as a Bitmap in the decode result.
	 */
	public BooleanProperty entireFrame;

	/**
	 * This is the constructor of DecodeResultCrop. All options are initialized by
	 * editor.
	 *
	 * @param editor A {@link PropertyGetter} used to load the current configuration.
	 */
	public DecodeResultCrop(PropertyGetter editor) {
		
	}

}
