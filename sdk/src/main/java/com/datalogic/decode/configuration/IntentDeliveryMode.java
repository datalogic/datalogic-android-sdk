package com.datalogic.decode.configuration;

/**
 * <code>IntentDeliveryMode</code> is an enumeration defining the
 * method by which the intent is delivered.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>START_ACTIVITY</td>
 * <td>Intent delivered via StartActivity</td>
 * </tr>
 * <tr>
 * <td>START_SERVICE</td>
 * <td>Intent delivered via StartService</td>
 * </tr>
 * <tr>
 * <td>BROADCAST</td>
 * <td>Broadcast Intent</td>
 * </tr>
 * </table>
 */
public enum IntentDeliveryMode {
    /**
     * Sends an Intent using startActivity to invoke an Activity
     */
	START_ACTIVITY,
	/**
	 * Sends an Intent using startService to initiate operation of a Service
	 */
	START_SERVICE,
	/**
	 * Sends an Intent using broadcastIntent to invoke registered broadcast receivers
	 */
	BROADCAST;
}
