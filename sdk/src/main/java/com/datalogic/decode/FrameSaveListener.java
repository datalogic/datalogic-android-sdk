package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the decoder's frame save event.
 * This is intended to be used with the <code>addFrameSaveListener</code> method of the <code>BarcodeManager</code> class.
 * The listener is active only when the properties <code>FRAME_CAPTURE_ENABLE</code> and <code>FRAME_CAPTURE_STORAGE_ENABLE</code> are set to <code>true</code>.
 * The path is set by the property <code>FRAME_CAPTURE_FILE_PATH</code>, only paths in the public storage location are supported (e.g., /storage/emulated/0/).
 * More than one object instance can listen to the decoding events in an application.
 * More than one application can listen to decoding events in the system.
 *
 * @see com.datalogic.decode.BarcodeManager
 *
 */
public interface FrameSaveListener {

	/**
	 * onFrameSave method will be called when a frame saved event is fired.
	 * When a frame is not saved for an error onFrameSave will not be called, an exception, if enabled, will be thrown by the ErrorManager.
	 * 
	 * @param frame
	 *            The data read as defined by {@link SavedFrame}
	 * 
	 * @see com.datalogic.decode.SavedFrame
	 */
	public void onFrameSave(SavedFrame frame);

}
