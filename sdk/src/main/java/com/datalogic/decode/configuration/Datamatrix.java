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
     * <code>operatingMode</code> control the operating mode.
     */
    public EnumProperty<DatamatrixOpMode> operatingMode;

    /**
     * <code>mirror</code> controls the mirror mode.
     * It controls the scanning capabilities of Data Matrix barcodes from mirror reflections.
     */
    public EnumProperty<DatamatrixMirror> mirror;

    /**
     * <code>gs1_datamatrix</code> enables or disables the GS1-DATAMATRIX symbology.
     */  
    public BooleanProperty gs1_datamatrix;

    /**
     * <code>aggressiveness</code> controls the aggressiveness for the Datamatrix symbology.
     */
    public EnumProperty<DatamatrixAggressiveness> aggressiveness;

    /**
     * <code>dmre</code> enables DataMatrix Rectangular Extended dimensions (DMRE).
     * New AIM specs introduce new Datamatrix format:
     * 8x48, 8x64, 12x48, 12x64, 16x64, 24x32, 24x36, 24x48, 24x64, 26x32, 26x40, 26x48, 26x64
     */
    public BooleanProperty dmre;

    /**
     * <code>gs1_dl_datamatrix</code> enables or disables the GS1-DIGITAL-LINK-DATAMATRIX symbology.
     */
    public BooleanProperty gs1_dl_datamatrix;

    /**
     * This is the constructor of Datamatrix. All symbology options are
     * initialized by editor.
     *
     * @param editor A {@link PropertyGetter} used to load the current barcode family.
     */
    public Datamatrix(PropertyGetter editor) {
    }

}
