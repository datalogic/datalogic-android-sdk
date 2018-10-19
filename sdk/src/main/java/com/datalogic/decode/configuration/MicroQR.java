package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>MicroQR</code> is the class that configures the Micro QR Code Symbology.
 * 
 */
public class MicroQR extends SymbologyLengths {

	/**
     * <code>characterSetMode</code> controls the character set in use for the decoded label.
     */
    public EnumProperty<CharacterSetMode> characterSetMode;

	/**
	 * This is the constructor of MicroQR. All symbology options are initialized
	 * by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public MicroQR(PropertyGetter editor) {
	}
}
