package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>UpcEanExtensions</code> is the class that configures the UPC/EAN
 * Extensions.
 */
public class UpcEanExtensions extends PropertyGroup {

	/**
	 * <code>require</code> indicates that are read only barcode with the
	 * supplemental label. If the parameter is false are read barcodes with or
	 * without the supplemental labels.
	 */
	public BooleanProperty require;

	/**
	 * <code>enable2Digit</code> requires a 2 digit extension to be verified for
	 * a successful decode of a label.
	 */
	public BooleanProperty enable2Digit;

	/**
	 * <code>enable5Digit</code> requires a 5 digit extension to be verified for
	 * a successful decode of a label
	 */
	public BooleanProperty enable5Digit;

	/**
	 * This is the constructor of UpcEanExtensions. All options are initialized
	 * by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public UpcEanExtensions(PropertyGetter editor) {
	}

}
