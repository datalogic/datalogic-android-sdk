package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the decoder's frame save event.
 * This is intended to be used with the <code>addFrameSaveListener</code> method of the <code>BarcodeManager</code> class.
 * More than one object instance can listen to the decoding events in an application.
 * More than one application can listen to decoding events in the system.
 *
 * @see com.datalogic.decode.BarcodeManager
 *
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
