package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Codabar</code> is the class that configures the Codabar Symbology.
 * 
 */
public class Codabar extends SymbologyLengths {

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
	 * <code>sendStartStop</code> enables/disables the transmission of the
	 * decoded star and stop characters. The start and stop characters will both
	 * be translated as A, B, C or D.
	 */
	public BooleanProperty sendStartStop;

	/**
	 * <code>convertToCLSI</code> restricts the decoding to only read labels
	 * that conform to CLSI specifications. Label length must be 14 and the data
	 * is split into fields of 1, 4, 5 and 4 characters separated by spaces.
	 */
	public BooleanProperty convertToCLSI;

	/**
	 * This is the constructor of Codabar. All symbology options are initialized
	 * by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Codabar(PropertyGetter editor) {
	}
}
