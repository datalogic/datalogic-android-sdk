package com.datalogic.cradle;

/**
 * This interface allows an the application to be notified about
 * insertion and extraction of the Unlock Key into/from the Cradle.
 * The {@link UnlockKeyStatus} notifies the listener about the 
 * position of the Unlock Key into the Cradle, among
 * {@link UnlockKeyStatus#UNLOCK_KEY_STATUS_INSERTED},
 * {@link UnlockKeyStatus#UNLOCK_KEY_STATUS_EXTRACTED},
 * {@link UnlockKeyStatus#UNLOCK_KEY_STATUS_UNKNOWN} (in case of errors),
 * or {@link UnlockKeyStatus#UNLOCK_KEY_STATUS_NOT_SUPPORTED}
 * (if the device or the cradle do not support this type of notification).
 */
public interface CradleUnlockKeyEventListener
{
	/**
	 * This method is called when the Unlock Key has been inserted
	 * into or extracted from the Cradle.
	 */
	public void onUnlockKeyEvent(UnlockKeyStatus state);		
}
