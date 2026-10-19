package com.datalogic.device.rfid;

/**
 * This interface is used by the application to listen to the reader's read event.
 * This is intended to be used with the <code>addReadListener</code> method of the  {@link RfidManager} class.
 * More than one object instance can listen to the inventory events in an application.
 * More than one application can listen to inventory events in the system.
 */
public interface RfidReadListener {

	/**
	 * onRead method will be called when a read event is fired.
	 * 
	 * @param result
	 *            The data read as defined by {@link RfidResult}
	 * 
	 * @see RfidResult
	 */
	public void onRead(RfidResult result);
}
