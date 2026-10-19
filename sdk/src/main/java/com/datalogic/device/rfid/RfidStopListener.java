package com.datalogic.device.rfid;

/**
 * This interface is used by the application to listen to the inventory stopped
 * event.
 */
public interface RfidStopListener {

	/**
	 * onInventoryStopped will be sent when a inventory stopped event is fired. this event
	 * is fired when inventory session is stopped both by soft trigger and by
	 * hardware trigger.
	 */
	public void onInventoryStopped();
}
