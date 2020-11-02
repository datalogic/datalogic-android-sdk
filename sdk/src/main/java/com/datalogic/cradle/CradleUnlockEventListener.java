package com.datalogic.cradle;

/**
 * This interface allows an the application to be notified about Cradle Lever open event
 * (device unlocked from the Cradle) and Cradle Lever closed event (device locked into the Cradle).
 * The {@link LeverStatus} notifies the listener about the position of the Cradle Lever, among
 * {@link LeverStatus#LEVER_STATUS_OPEN},
 * {@link LeverStatus#LEVER_STATUS_CLOSE},
 * {@link LeverStatus#LEVER_STATUS_UNKNOWN} (in case of errors),
 * or {@link LeverStatus#LEVER_STATUS_NOT_SUPPORTED}
 * (if the device or the cradle do not support this type of notification).
 */
public interface CradleUnlockEventListener
{
	/**
	 * This method is called when the Level change its status.
	 */
	public void onUnlockEvent(LeverStatus state);		
}
