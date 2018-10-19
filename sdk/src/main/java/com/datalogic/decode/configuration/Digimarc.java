package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Digimarc</code>&#174; is the class that configures the Digimarc barcode &#8482; reading capability.
 * The technology requires specific devices equipped with certain Datalogic scan engines.
 */
public class Digimarc extends PropertyGroup {

	/**
	 * <code>enable</code> activates the Digimarc barcode &#8482; reading functionalities.
	 */
	public BooleanProperty enable;

	/**
	 * This is the constructor of Digimarc. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current reading technology.
	 */
	public Digimarc(PropertyGetter editor) {
	}

}
