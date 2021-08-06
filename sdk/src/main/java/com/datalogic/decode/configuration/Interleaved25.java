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
	 * <code>itf14</code> enables or disables the ITF14 symbology.
	 * It could be used to include a GTIN.
	 * It always checks and transmits the checksum character.
	 */
	public BooleanProperty itf14;

	/**
	 * <code>aggressiveness</code> control the aggressiveness for the Interleaved 2/5 symbology.
	 */
	public EnumProperty<Interleaved25Aggressiveness> aggressiveness;

	/**
	 * This is the constructor of Interleaved25. All symbology options are
	 * initialized by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Interleaved25(PropertyGetter editor) {

	}
}
