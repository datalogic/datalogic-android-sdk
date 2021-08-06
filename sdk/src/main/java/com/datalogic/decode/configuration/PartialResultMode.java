package com.datalogic.decode.configuration;

/**
 * <code>PartialResultMode</code> is an enumeration defining the allowed mode to manage partial results when
 * Multi Scan mode is enabled.
 * 
 * Allowed values are:
 * <table border=2>
 * <tr>
 * <td>NEVER</td>
 * <td>Partial results are never returned.</td>
 * </tr>
 * <tr>
 * <td>TIMEOUT</td>
 * <td>Partial results are returned only when timeout event is received.</td>
 * </tr>
 * <tr>
 * <td>RELEASE</td>
 * <td>Partial results are returned only when trigger release event is received.</td>
 * </tr>
 * <tr>
 * <td>BOTH</td>
 * <td>Partial results are returned when timeout or trigger release events are received.</td>
 * </tr>
 * </table>
 */


public enum PartialResultMode {
	/**
	 * Partial results are never returned.
	 */
	NEVER,

	/**
	 * Partial results are returned on timeout event.
	 */
	TIMEOUT,

	/**
	 * Partial results are returned on trigger release event.
	 */
	RELEASE,

	/**
	 * Partial results are returned on timeout and trigger release events.
	 */
	BOTH;
}
