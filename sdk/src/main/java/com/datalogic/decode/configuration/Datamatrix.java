package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Datamatrix</code> is the class that configures the Data Matrix
 * Symbology.
 * 
 */
public class Datamatrix extends SymbologyLengths {

	/**
     * <code>characterSetMode</code> controls the character set in use for the decoded label.
     */
    public EnumProperty<CharacterSetMode> characterSetMode;

    /**
	 * This is the constructor of Datamatrix. All symbology options are
	 * initialized by editor.
	 *
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Datamatrix(PropertyGetter editor) {
	}

}
