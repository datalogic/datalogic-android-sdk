package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the scan deinit
 * event.
 */
public interface DeinitListener {

	/**
	 * onScanDeinit will be sent when a deinit event is fired. this event is
	 * fired when the scanner service is completely deinitialized.
	 */
	public void onScanDeinit();
}
