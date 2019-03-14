package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the scan init
 * event.
 */
public interface InitListener {

	/**
	 * onScanInit will be sent when a init event is fired. this event is
	 * fired when the scanner service is completely initialized.
	 */
	public void onScanInit();
}
