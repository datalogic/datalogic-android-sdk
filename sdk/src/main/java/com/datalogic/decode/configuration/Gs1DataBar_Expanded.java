package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Gs1DataBar_Expanded</code> is the class that configures the GS1 DataBar
 * Expanded Symbology.
 * 
 */
public class Gs1DataBar_Expanded extends SymbologyLengths {

    /**
     * <code>convertToGs1_128</code> convert the Gs1DataBar_Expanded label to a sequence of one or more
     * GS1-128 barcodes.
     */
    public BooleanProperty convertToGs1_128;

	/**
	 * This is the constructor of Gs1DataBar_Expanded. All symbology options are
	 * initialized by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Gs1DataBar_Expanded(PropertyGetter editor) {
	}

}
