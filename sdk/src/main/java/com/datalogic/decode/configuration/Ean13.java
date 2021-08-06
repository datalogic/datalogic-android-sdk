package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Ean13</code> is the class that configures the EAN-13 Symbology.
 */
public class Ean13 extends SymbologyBase {

	/**
	 * <code>sendChecksum</code> includes the checksum in the label
	 * transmission.
	 */
	public BooleanProperty sendChecksum;

	/**
	 * <code>sendSystemDigit</code> includes the system digit in the label
	 * transmission, it configures whether the first character should be transmitted.
	 */
	public BooleanProperty sendSystemDigit;

	/**
	 * <code>convertToISBN</code> allows to identify ISBN labels and append the
	 * check digit (per ISBN guidelines) to the end of the label.
	 */
	public BooleanProperty convertToISBN;

	/**
	 * <code>convertToISSN</code> allows to identify ISSN labels and append the
	 * check digit (per ISSN guidelines) to the end of the label.
	 */
	public BooleanProperty convertToISSN;

	/**
	 * <code>compositeEnable</code> allows to use EAN-13 labels in composite barcode.
	 */
	public BooleanProperty compositeEnable;

	/**
	 * <code>aggressiveness</code> control the aggressiveness for all the UPC/EAN symbologies.
	 */
	public EnumProperty<UpcEanAggressiveness> aggressiveness;

	/**
	 * This is the constructor of Ean13. All symbology options are initialized
	 * by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Ean13(PropertyGetter editor) {

	}
}
