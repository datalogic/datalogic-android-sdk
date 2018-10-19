package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>MultiScan</code> is the class that configures the Multi Scan functionality.
 * 
 */
public class MultiScan extends PropertyGroup {

	/**
	 * <code>enable</code> activates the Multi Scan.
	 */
	public BooleanProperty enable;

	/**
	 * <code>labelCount</code> defines the number of required labels to be read
	 * before automatically ending a good read transaction. The decoding session is ended successfully
	 * and all the collected labels are returned together, only if the labelCount is reached.
	 */
	public NumericProperty labelCount;

	/**
	 * <code>notifyOnEachLabel</code> defines whether to notify each successfully read label during
	 * Multi Scan operation.
	 */
	public BooleanProperty notifyOnEachLabel;

	/**
	 * This is the constructor of MultiScan. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current configuration class.
	 */
	public MultiScan(PropertyGetter editor) {
	}

}
