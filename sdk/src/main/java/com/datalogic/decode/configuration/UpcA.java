package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>UpcA</code> is the class that configures the UPC-A Symbology.
 * 
 */
public class UpcA extends SymbologyBase {

	/**
	 * <code>sendChecksum</code> includes the checksum in the label
	 * transmission.
	 */
	public BooleanProperty sendChecksum;

	/**
	 * <code>sendSystemDigit</code> includes the system digit in the label
	 * transmission. For UPC-A the system digit is always zero.
	 */
	public BooleanProperty sendSystemDigit;

	/**
	 * <code>convertToEan13</code> allows to expand the UPC-A labels to their
	 * EAN-13 equivalents. Any EAN-13 parameters will then apply to the result.
	 */
	public BooleanProperty convertToEan13;

	/**
	 * <code>compositeEnable</code> allows to use UPC-A labels in composite barcode.
	 */
	public BooleanProperty compositeEnable;

	/**
	 * <code>aggressiveness</code> control the aggressiveness for all the UPC/EAN symbologies.
	 */
	public EnumProperty<UpcEanAggressiveness> aggressiveness;

	/**
	 * This is the constructor of UpcA. All symbology options are initialized by
	 * default.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public UpcA(PropertyGetter editor) {
	}
}
