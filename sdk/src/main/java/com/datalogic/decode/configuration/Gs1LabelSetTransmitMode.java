package com.datalogic.decode.configuration;

/**
 * <code>Gs1LabelSetTransmitMode</code> is an enumeration defining the mode used to transmit GS1 label sets.
 * A label set consists of all the GS1 barcodes that have the same GTIN value.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>DISABLED</td>
 * <td>Disabled.</td>
 * </tr>
 * <tr>
 * <td>FIRST_LABEL</td>
 * <td>Send only the first GS1 label found with a given GTIN.
 * The same label can be sent if the double read timeout has expired without decoding it.</td>
 * </tr>
 * <tr>
 * <td>ALL_LABELS</td>
 * <td>Send all the labels found with a given GTIN, adding a prefix to identify the same label set.
 * The same label set can be sent if the double read timeout has expired without decoding it.</td>
 * </tr>
 * <tr>
 * <td>PRIORITIZE_2D_LABEL</td>
 * <td>Send 2D label with a given GTIN if decoded, otherwise send the 1D label if found and if the double read timeout has expired.</td>
 * </tr>
 * </table>
 */
public enum Gs1LabelSetTransmitMode {
    /**
     * Disabled.
     */
	DISABLED,
	/**
	 * Send only the first GS1 label found with a given GTIN.
	 * The same label can be sent if the double read timeout has expired without decoding it.
	 */
	FIRST_LABEL,
	/**
	 * Send all the labels found with a given GTIN, adding a prefix to identify the same label set.
	 * The same label set can be sent if the double read timeout has expired without decoding it.
	 */
	ALL_LABELS,
	/**
	 * Send 2D label with a given GTIN if decoded, otherwise send the 1D label if found and if the double read timeout has expired.
	 */
	PRIORITIZE_2D_LABEL;
}
