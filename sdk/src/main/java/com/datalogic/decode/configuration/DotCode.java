package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;
import com.datalogic.decode.PropertyID;

/**
 * <code>DotCode</code> is the class that configures the Dot Code.
 * 
 */
public class DotCode extends SymbologyLengths {

    /**
     * <code>characterSetMode</code> controls the character set in use for the decoded label.
     */
    public EnumProperty<CharacterSetMode> characterSetMode;

    /**
     * This is the constructor of DotCode. All symbology options are initialized
     * by editor.
     * 
     * @param editor A {@link PropertyGetter} used to load the current barcode family.
     */
    public DotCode(PropertyGetter editor) {
    }
}
