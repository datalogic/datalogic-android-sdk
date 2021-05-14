package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Gs1DataBar_14</code> is the class that configures the GS1 DataBar-14
 * Symbology.
 * 
 */
public class Gs1DataBar_14 extends SymbologyBase {

    /**
     * <code>convertToGs1_128</code> convert the Gs1DataBar_14 label to a GS1-128 barcode.
     */
    public BooleanProperty convertToGs1_128;

	/**
	 * This is the constructor of Gs1DataBar_14. All symbology options are
	 * initialized by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Gs1DataBar_14(PropertyGetter editor) {
	}

}
