package com.datalogic.decode.configuration;

/**
 * <code>SendCodeID</code> is an enumeration defining the type of
 * identifier to be transmitted with the scanned data.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>DATALOGIC_IDENTIFIER_BEFORE_LABEL</td>
 * <td>ID + " " + data</td>
 * </tr>
 * <tr>
 * <td>AIM_IDENTIFIER_BEFORE_LABEL</td>
 * <td>] + ID + modifier + data</td>
 * </tr>
 * <tr>
 * <td>USERDEFINED_IDENTIFIER_BEFORE_LABEL</td>
 * <td>ID + data</td>
 * </tr>
 * <tr>
 * <td>DATALOGIC_IDENTIFIER_AFTER_LABEL</td>
 * <td>data + " " + ID</td>
 * </tr>
 * <tr>
 * <td>USERDEFINED_IDENTIFIER_AFTER_LABEL</td>
 * <td>data + ID</td>
 * </tr>
 * <tr>
 * <td>NONE</td>
 * <td>No identifier to be transmitted</td>
 * </tr>
 * </table>
 */
public enum SendCodeID {
    /**
     * No identifier is transmitted with the decoded label
     */
	NONE,
    /**
     * Transmit Datalogic legacy label identifier before the barcode data
     */
	DATALOGIC_IDENTIFIER_BEFORE_LABEL,
    /**
     * Transmit the AIM symbology identifier before the barcode data
     */
	AIM_IDENTIFIER_BEFORE_LABEL,
    /**
     * Transmit a user identifier label before the barcode data
     */
	USERDEFINED_IDENTIFIER_BEFORE_LABEL,
    /**
     * Transmit Datalogic legacy label identifier after the barcode data
     */
	DATALOGIC_IDENTIFIER_AFTER_LABEL,
    /**
     * Transmit a user identifier label after the barcode data
     */
	USERDEFINED_IDENTIFIER_AFTER_LABEL;
}
