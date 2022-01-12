package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>LinearQuietZones</code> is the class that configures the admitted quiet zones for the supported linear symbologies.
 */
public class LinearQuietZones extends PropertyGroup {

	/**
	 * <code>upcEanReduced</code> enables the reading of UPC/EAN barcode labels with short quiet zones.
	 */
	public BooleanProperty upcEanReduced;

	/**
	 * <code>code39Reduced</code> enables the reading of Code 39 barcode labels with short quiet zones.
	 */
	public BooleanProperty code39Reduced;

	/**
	 * <code>code128Reduced</code> enables the reading of Code 128 barcode labels with short quiet zones.
	 */
	public BooleanProperty code128Reduced;

	/**
	 * <code>msiReduced</code> enables the reading of MSI barcode labels with short quiet zones.
	 */
	public BooleanProperty msiReduced;
	
	/**
     * <code>interleaved2of5Reduced</code> enables the reading of Interleaved 2 of 5 barcode labels with short quiet zones.
     */
    public BooleanProperty interleaved2of5Reduced;

    /**
     * <code>codabarReduced</code> enables the reading of Codabar barcode labels with short quiet zones.
     */
    public BooleanProperty codabarReduced;

    /**
     * <code>code93Reduced</code> enables the reading of Code 93 barcode labels with short quiet zones.
     */
    public BooleanProperty code93Reduced;

    /**
     * <code>matrix2of5Reduced</code> enables the reading of Matrix 2 of 5 barcode labels with short quiet zones.
     */
    public BooleanProperty matrix2of5Reduced;

	/**
	 * This is the constructor of LinearQuietZones. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current configuration.
	 */
	public LinearQuietZones(PropertyGetter editor) {
	}

}
