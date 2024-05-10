package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.BooleanProperty;
import com.datalogic.device.configuration.PropertyGetter;

/**
 * <code>Tlc39</code> is the class that configures the TLC 39 Symbology.
 *
 */
public class Tlc39 extends SymbologyLengths {

    /**
     * <code>linearTransmissionEnable</code> enable linear code transmission.
     */
    public BooleanProperty linearTransmissionEnable;

    /**
     * This is the constructor of Tlc39. All options are initialized by
     * editor.
     *
     * @param editor A {@link PropertyGetter} used to load the current configuration.
     */
    public Tlc39(PropertyGetter editor) {
    }
}
