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
     * <code>DatamatrixOpMode</code> control the operating mode.
     */
    public EnumProperty<DatamatrixOpMode> operatingMode;

    /**
     * <code>gs1_datamatrix</code> enables or disables the GS1-DATAMATRIX symbology.
     */  
    public BooleanProperty gs1_datamatrix;

    /**
     * <code>DatamatrixMirror </code> control the mirror mode.
     */
    public EnumProperty<DatamatrixMirror> mirror;

    /**
     * This is the constructor of Datamatrix. All symbology options are
     * initialized by editor.
     *
     * @param editor A {@link PropertyGetter} used to load the current barcode family.
     */
    public Datamatrix(PropertyGetter editor) {
    }

}
