package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>PresentationMode</code> is the class that configures the presentation mode functionalities.
 */
public class PresentationMode extends PropertyGroup {

	/**
	 * <code>presentationModeEnable</code> enables the use of presentation mode.
	 */
	public BooleanProperty presentationModeEnable;

	/**
	 * <code>presentationModeAimerEnable</code> enables the use of the aimer in presentation mode.
	 */
	public BooleanProperty presentationModeAimerEnable;

	/**
	 * <code>presentationModeSensitivity</code> set sensitivity in presentation mode.
	 */
	public NumericProperty presentationModeSensitivity;
	
	/**
	 * This is the constructor of PresentationMode. All properties values are initialized reading from 
	 * <code>editor</code>.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current presentation mode configuration.
	 */
	public PresentationMode(PropertyGetter editor) {}


}
