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
	 * This is the constructor of LinearQuietZones. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current configuration.
	 */
	public LinearQuietZones(PropertyGetter editor) {
	}

}
