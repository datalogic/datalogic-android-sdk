package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Interleaved25</code> is the class that configures the Interleaved 2/5
 * Symbology.
 * 
 */
public class Interleaved25 extends SymbologyLengths {

	/**
	 * <code>enableChecksum</code> requires the use of checksum characters to
	 * verify a barcode.
	 */
	public BooleanProperty enableChecksum;

	/**
	 * <code>sendChecksum</code> includes the checksum in the label transmission
	 * (if checksum is required with enableChecksum).
	 */
	public BooleanProperty sendChecksum;

	/**
	 * This is the constructor of Interleaved25. All symbology options are
	 * initialized by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Interleaved25(PropertyGetter editor) {

	}
}
