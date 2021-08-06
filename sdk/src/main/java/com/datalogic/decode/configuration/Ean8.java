package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Ean8</code> is the class that configures the EAN-8 Symbology.
 * 
 */
public class Ean8 extends SymbologyBase {

	/**
	 * <code>sendChecksum</code> includes the checksum in the label
	 * transmission.
	 */
	public BooleanProperty sendChecksum;

	/**
	 * <code>convertToEan13</code> allows to expand the EAN-8 labels to their
	 * EAN-13 equivalents. Any EAN-13 parameters will then apply to the result.
	 */
	public BooleanProperty convertToEan13;

	/**
	 * <code>compositeEnable</code> allows to use EAN-8 labels in composite barcode.
	 */
	public BooleanProperty compositeEnable;

	/**
	 * <code>aggressiveness</code> control the aggressiveness for all the UPC/EAN symbologies.
	 */
	public EnumProperty<UpcEanAggressiveness> aggressiveness;

	/**
	 * This is the constructor of Ean8. All symbology options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Ean8(PropertyGetter editor) {
	}
}
