package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the scan started
 * event.
 */
public interface StartListener {

	/**
	 * onScanStarted will be called when a scan started event is fired. this
	 * event is fired when decoding session is started both by soft trigger and
	 * by hardware trigger.
	 */
	public void onScanStarted();
}
