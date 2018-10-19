package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the scan stopped
 * event.
 */
public interface StopListener {

	/**
	 * onScanStopped will be sent when a scan stopped event is fired. this event
	 * is fired when decoding session is stopped both by soft trigger and by
	 * hardware trigger.
	 */
	public void onScanStopped();
}
