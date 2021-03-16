
package com.datalogic.decode;


public interface PresentationStateListener {

	/**
	 * onFrameSave method will be called when a frame saved event is fired.
	 * When a frame is not saved for an error onFrameSave will not be called, an exception, if enabled, will be thrown by the ErrorManager.
	 * 
	 * @param newState
	 *            The new state about presentation mode
	 * 
	 * @see com.datalogic.decode.PresentationState
	 */
	public void onPresentationStateChange(PresentationState newState);

}