package com.datalogic.decode.configuration;


/**
 * The <code>ECIPolicy</code> is an enumeration defining the policy
 * for the ECI protocoll. 
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>TRANSMIT</td>
 * <td>Transmit ECI escape sequence</td>
 * </tr>
 * <tr>
 * <td>REMOVE</td>
 * <td>Remove ECI escape sequence</td>
 * </tr>
 * <tr>
 * <td>EVALUATE</td>
 * <td>Evaluate ECI Identifier to encode barcode data</td>
 * </tr>
 * </table>
 */
public enum ECIPolicy {
	/**
	 * Transmit ECI escape sequence
	 */
	TRANSMIT,
	/**
	 * Remove ECI escape sequence
	 */
	REMOVE,
	/**
	 * Evaluate ECI Identifier to encode barcode data
	 */
	EVALUATE;
}
