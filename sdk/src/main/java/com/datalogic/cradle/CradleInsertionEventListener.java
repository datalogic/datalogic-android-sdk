package com.datalogic.cradle;

/**
 * This interface allows an the application to be notified about
 * insertion and extraction of the device from the Cradle.
 * The {@link InsertionState} notifies the listener about the 
 * position of the device into/out of the Cradle, among
 * {@link InsertionState#INSERTED_CORRECTLY},
 * {@link InsertionState#INSERTED_WRONGLY},
 * {@link InsertionState#EXTRACTED},
 * {@link InsertionState#INSERTION_UNKNOWN} (in case of errors),
 * or {@link InsertionState#DEVICE_INSERTION_NOT_SUPPORTED}
 * (if the device or the cradle do not support this type of notification).
 */
public interface CradleInsertionEventListener
{
	/**
	 * This method is called when the device has been inserted
	 * into or extracted from the Cradle.
	 */
	public void onInsertionEvent(InsertionState state);		
}
