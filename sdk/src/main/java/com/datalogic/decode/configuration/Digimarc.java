package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Digimarc</code>&#174; is the class that configures the Digimarc barcode &#8482; reading capability.
 * The technology requires specific devices equipped with certain Datalogic scan engines.
 */
public class Digimarc extends SymbologyBase {

	/**
	 * <code>dataFormat</code> This paramater configures which data format is used for Digimarc barcode.
	 */
	public EnumProperty<DigimarcDataFormat> dataFormat;

	/**
	 * <code>priority</code> This parameter configures the frequency used to try to decode using Digimarc, lower values are higher priority for Digimarc.
	 */
	public NumericProperty priority;

	/**
	 * This is the constructor of Digimarc. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current reading technology.
	 */
	public Digimarc(PropertyGetter editor) {
	}

}
