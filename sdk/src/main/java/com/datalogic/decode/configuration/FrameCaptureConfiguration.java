package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;
import com.datalogic.decode.*;

/**
 * <code>FrameCaptureConfiguration</code> is the class responsible for configuring the scanner to capture,
 * store, and provide frames during barcode scanning operations. This configuration allows to specify
 * how the scanner should handle frame capture, including the format, storage options, and
 * the location where captured frames will be saved.
 * <p>
 * The frame capture can be monitored using two types of listeners:
 * <ul>
 *   <li>{@link FrameCaptureListener}: This listener is used to receive frames captured by the scanner in real time.
 *   It is added using the <code>addFrameCaptureListener</code> method of the {@link BarcodeManager}.</li>
 *   <li>{@link FrameSaveListener}: This listener is used to monitor when frames are saved to the file system.
 *   It is added using the <code>addFrameSaveListener</code> method of the {@link BarcodeManager}.</li>
 * </ul>
 * </p>
 */
public class FrameCaptureConfiguration extends PropertyGroup {

	/**
	 * <code>enable</code> actives the capture of the frames.
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
	 * If <code>enable</code> and <code>storage</code> are both set to <code>true</code>, the frame are saved in the location defined by <code>filePath</code>
	 * (even if no {@link FrameSaveListener} is registered).
	 */
	public BooleanProperty storage;

	/**
	 * <code>filePath</code> indicates the directory where will be stored the frames
	 * saved by the Scanner. Only directories under <code>getExternalStorageDirectory()</code> are
	 * supported (eg. /storage/emulated/0/).
	 */
	public TextProperty filePath;

	/**
	 * This is the constructor of FrameCaptureConfiguration.
	 */
	public FrameCaptureConfiguration(PropertyGetter editor) {

	}

}
