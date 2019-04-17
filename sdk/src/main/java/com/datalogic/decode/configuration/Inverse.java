package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Inverse</code> is the class that configures the inverse mode for the supported linear and 2D symbologies.
 */
public class Inverse extends PropertyGroup {

    /**
     * <code>linearSymbologies</code> set the inverse mode for linear barcode symbologies.
     */
    public EnumProperty<InverseMode> linearSymbologies;

    /**
     * <code>twoDimensionalSymbologies</code> set the inverse mode for 2D barcode symbologies.
     */
    public EnumProperty<InverseMode> twoDimensionalSymbologies;

    /**
     * This is the constructor of Inverse. All options are initialized by
     * editor.
     * 
     * @param editor A {@link PropertyGetter} used to load the current configuration.
     */
    public Inverse(PropertyGetter editor) {
    }
}
