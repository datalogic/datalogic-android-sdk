package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

public class Pharmacode extends SymbologyBase {

    /**
     * <code>barNumMin</code> defines the minimum number of bars allowed
     * for a valid Pharmacode symbol.
     */
    public NumericProperty barNumMin;

    /**
     * <code>barNumMax</code> defines the maximum number of bars allowed
     * for a valid Pharmacode symbol.
     */
    public NumericProperty barNumMax;


    /**
     * This is the constructor of Pharmacode. All symbology options are
     * initialized by editor.
     *
     * @param editor A {@link PropertyGetter} used to load the current barcode family.
     */
    public Pharmacode(PropertyGetter editor) {

    }
}
