package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.BooleanProperty;
import com.datalogic.device.configuration.PropertyGetter;
import com.datalogic.device.configuration.PropertyGroup;

/**
 * <code>ExtScannerSource</code> is the class that configures the possibility to
 * receive barcode results from an external scanner.
 */
public class ExtScannerSource extends PropertyGroup {
	/**
	 * <code>enable</code> enables the injection of barcode results from an
	 * external scanner to the scanner service.
	 */
	public BooleanProperty enable;

	/**
	 * <code>standardFormatterEnable</code> enables the execution
	 * of the Standard Formatter during barcode injection.
	 */
	public BooleanProperty standardFormatterEnable;

	/**
	 * This is the constructor of ExtScannerSource. All options are initialized by
	 * editor.
	 *
	 * @param editor A {@link PropertyGetter} used to load the current configuration class.
	 */
	public ExtScannerSource(PropertyGetter editor) {
	}

}
