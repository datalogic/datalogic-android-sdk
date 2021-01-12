package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Composite</code> is the class that configures the EAN.UCC Composite
 * and GS1 Composite Symbologies.
 * 
 * The class provides controls over Composite barcode labels (CC-A, CC-B, CC-C and GS1 Composite).
 */
public class Composite extends SymbologyBase {

    /**
     * <code>upcEanMode</code> controls UPC/EAN label recognition mode.
     */
    public EnumProperty<UpcEanCompositeMode> upcEanMode;

    /**
     * <code>convertToGs1_128</code> convert the Composite label to a sequence of one or more
     * GS1-128 barcodes.
     */
    public BooleanProperty convertToGs1_128;

    /**
     * <code>linearTransmissionEnable</code> enable linear code transmission.
     */
    public BooleanProperty linearTransmissionEnable;

    /**
     * This is the constructor of Composite. All options are initialized by
     * editor.
     * 
     * @param editor A {@link PropertyGetter} used to load the current configuration.
     */
    public Composite(PropertyGetter editor) {
    }

}
