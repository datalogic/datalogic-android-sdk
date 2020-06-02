package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the decoder's frame capture event.
 * This is intended to be used with the <code>addFrameCaptureListener</code> method of the <code>BarcodeManager</code> class.
 * More than one object instance can listen to the decoding events in an application.
 * More than one application can listen to decoding events in the system.
 *
 * @see com.datalogic.decode.BarcodeManager
 *
 *
 */
public interface FrameCaptureListener {

	/**
	 * onFrameCapture method will be called when a frame captured event is fired.
	 * 
	 * @param frame
	 *            The data read as defined by {@link CapturedFrame}
	 * 
	 * @see com.datalogic.decode.CapturedFrame
	 */
	public void onFrameCapture(CapturedFrame frame);

}
