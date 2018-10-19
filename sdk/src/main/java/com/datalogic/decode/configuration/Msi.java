package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Msi</code> is the class that configures the MSI Symbology.
 * 
 */
public class Msi extends SymbologyLengths {

	/**
	 * <code>sendChecksum</code> includes the checksum in the label
	 * transmission.
	 */
	public BooleanProperty sendChecksum;

	/**
	 * <code>require2Checksum</code> requires that a MSI label contains two
	 * check digits.
	 */
	public BooleanProperty require2Checksum;

	/**
	 * <code>checksum2Mod11</code> allows to interpret the second check digit as
	 * module 11 instead of module 10.
	 */
	public BooleanProperty checksum2Mod11;

	/**
	 * This is the constructor of Msi. All symbology options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Msi(PropertyGetter editor) {
	}
}
