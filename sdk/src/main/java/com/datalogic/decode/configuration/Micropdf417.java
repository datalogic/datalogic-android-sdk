package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Micropdf417</code> is the class that configures the MicroPDF-417
 * Symbology.
 * 
 */
public class Micropdf417 extends SymbologyLengths {

	/**
     * <code>characterSetMode</code> controls the character set in use for the decoded label.
     */
    public EnumProperty<CharacterSetMode> characterSetMode;

    /**
	 * This is the constructor of Micropdf417. All symbology options are
	 * initialized by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Micropdf417(PropertyGetter editor) {
	}
}
