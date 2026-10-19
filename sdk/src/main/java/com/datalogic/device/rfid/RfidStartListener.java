package com.datalogic.device.rfid;

/**
 * This interface is used by the application to listen to the inventory started
 * event.
 */
public interface RfidStartListener {

	/**
	 * onInventoryStarted will be called when a inventory started event is fired. this
	 * event is fired when inventory session is started both by soft trigger and
	 * by hardware trigger.
	 */
	public void onInventoryStarted();
}
