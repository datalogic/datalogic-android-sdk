package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>UpcE</code> is the class that configures the UPC-E Symbology.
 * 
 */
public class UpcE extends SymbologyBase {

	/**
	 * <code>sendChecksum</code> includes the checksum in the label
	 * transmission.
	 */
	public BooleanProperty sendChecksum;

	/**
	 * <code>sendSystemDigit</code> includes the system digit in the label
	 * transmission. For UPC-E the system digit is always zero.
	 */
	public BooleanProperty sendSystemDigit;

	/**
	 * <code>convertToUpcA</code> allows to expand the UPC-E labels to their
	 * UPC-A equivalents. Any UPC-A parameters will then apply to the result.
	 */
	public BooleanProperty convertToUpcA;

	/**
	 * <code>upce1ExtensionEnable</code> enables decoding of the UPC-E1 Symbology
	 * variation of UPC-E code.
	 */
	public BooleanProperty upce1ExtensionEnable;

	/**
	 * This is the constructor of UpcE. All symbology options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public UpcE(PropertyGetter editor) {
	}
}
