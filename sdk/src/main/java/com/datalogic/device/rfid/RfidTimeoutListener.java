package com.datalogic.device.rfid;

/**
 * This interface is used by the application to listen to the inventory timeout
 * event.
 */
public interface RfidTimeoutListener {

	/**
	 * onInventoryTimeout will be sent when a timeout event is fired. this event is
	 * fired when inventory session fails for timeout.
	 */
	public void onInventoryTimeout();
}
