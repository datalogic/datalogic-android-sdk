package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>FrameCaptureConfiguration</code> is the class that configures the scanner to capture
 * store and provide frames.
 */
public class FrameCaptureConfiguration extends PropertyGroup {

	/**
	 * <code>enable</code> sets the intent mode.
	 */
	public BooleanProperty enable;

	/**
	 * <code>format</code> selects the format used for storing the frames captured
	 * by the Scanner.
	 */
	public EnumProperty<FrameCaptureFormat> format;

	/**
	 * <code>mode</code> selects the Scanner frame capture mode.
	 */
	public EnumProperty<FrameCaptureMode> mode;

	/**
	 * <code>storage</code> enables the Scanner to store captured frames.
	 */
	public BooleanProperty storage;

	/**
	 * <code>filePath</code> indicates the directory where will be stored the frames
	 * saved by the Scanner. Only directory under getExternalStorageDirectory() are
	 * supported (eg. /storage/emulated/0/).
	 */
	public TextProperty filePath;

	/**
	 * This is the constructor of FrameCaptureConfiguration. 
	 */
	public FrameCaptureConfiguration(PropertyGetter editor) {

	}

}
