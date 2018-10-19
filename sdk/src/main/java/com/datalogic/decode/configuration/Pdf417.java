package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Pdf417</code> is the class that configures the PDF 417 Symbology.
 * 
 */
public class Pdf417 extends SymbologyLengths {

	/**
     * <code>characterSetMode</code> controls the character set in use for the decoded label.
     */
    public EnumProperty<CharacterSetMode> characterSetMode;

    /**
	 * This is the constructor of Pdf417. All symbology options are initialized
	 * by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Pdf417(PropertyGetter editor) {
	}

}
