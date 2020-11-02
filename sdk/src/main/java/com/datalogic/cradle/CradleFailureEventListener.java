package com.datalogic.cradle;

/**
 * This interface allows an the application to be notified about
 * occured on the Cradle.The {@link Failure} notifies the listener
 * about Cradle failures among
 * {@link Failure#FAILURE_BAD_LEVER_POSITION},
 * {@link Failure#FAILURE_SOLENOID_OVERTEMPERATURE},
 * {@link Failure#FAILURE_WLC_EOC_TIMEOUT},
 * {@link Failure#FAILURE_WLC_FOD},
 * {@link Failure#FAILURE_WLC_TX},
 * {@link Failure#FAILURE_WRONG_DAISY_CHAIN_CONFIG},
 * or  {@link Failure#FAILURE_UNKNOWN} (in case of errors).
 */
public interface CradleFailureEventListener
{
	/**
	 * This method is called when a failure occured on the Cradle.
	 */
	public void onFailureEvent(Failure error, boolean status);		
}
