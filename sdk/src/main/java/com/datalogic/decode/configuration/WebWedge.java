package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>WebWedge</code> is the class that configures the Decode Wedge
 * capability for direct web browsing.
 * Each time a label is decoded successfully and a valid URL is found, the available and
 * selected Internet web browsing application will be launched pointing to the desired URL.
 */
public class WebWedge extends PropertyGroup {

	/**
	 * <code>enable</code> activates the direct web browsing.
	 */
	public BooleanProperty enable;

	/**
	 * This is the constructor of WebWedge. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current configuration.
	 */
	public WebWedge(PropertyGetter editor) {
	}

}
