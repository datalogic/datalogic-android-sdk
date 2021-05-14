package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Aztec</code> is the class that configures the Aztec Code.
 * 
 */
public class Aztec extends SymbologyLengths {

	/**
     * <code>characterSetMode</code> controls the character set in use for the decoded label.
     */
    public EnumProperty<CharacterSetMode> characterSetMode;

    /**
	 * This is the constructor of Aztec. All symbology options are initialized
	 * by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Aztec(PropertyGetter editor) {
	}
}
