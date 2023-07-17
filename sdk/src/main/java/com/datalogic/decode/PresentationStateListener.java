package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the presentation mode state change event.
 * This is intended to be used with the <code>addPresentationStateListener</code> method of the <code>BarcodeManager</code> class.
 * More than one object instance can listen to the decoding events in an application.
 * More than one application can listen to decoding events in the system.
 *
 * @see com.datalogic.decode.BarcodeManager
 *
 *
 */
public interface PresentationStateListener {

	/**
	 * <code>onPresentationStateChange</code> method will be called when a presentation mode state change event is fired.
	 * 
	 * @param newState
	 *            The new {@link PresentationState presentation mode state}.
	 * 
	 * @see com.datalogic.decode.PresentationState
	 */
	public void onPresentationStateChange(PresentationState newState);

}