package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the scan timeout
 * event.
 */
public interface TimeoutListener {

	/**
	 * onScanTimeout will be sent when a timeout event is fired. this event is
	 * fired when decoding session fails for timeout.
	 */
	public void onScanTimeout();
}
