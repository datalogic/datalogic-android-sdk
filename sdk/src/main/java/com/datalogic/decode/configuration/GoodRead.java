package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>GoodRead</code> is the class that configures which type of notification
 * is activated on a successful read.
 */
public class GoodRead extends PropertyGroup {

	/**
	 * <code>goodReadEnable</code> requires the use of the good read
	 * notification on a successful read.
	 */
	public BooleanProperty goodReadEnable;

	/**
	 * <code>greenSpotEnable</code> requires the use of the green spot
	 * notification on a successful read.
	 */
	public BooleanProperty greenSpotEnable;

	/**
	 * <code>goodReadVibrateEnable</code> requires the use of the vibrator
	 * notification on a successful read.
	 */
	public BooleanProperty goodReadVibrateEnable;

	/**
	 * <code>goodReadLedEnable</code> requires the use of the led notification
	 * on a successful read.
	 */
	public BooleanProperty goodReadLedEnable;

	/**
	 * This is the constructor of GoodRead. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public GoodRead(PropertyGetter editor) {
	}

}
