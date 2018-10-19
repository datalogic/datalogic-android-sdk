package com.datalogic.decode.configuration;

/**
 * <code>LengthControlMode</code> is an enumeration defining the operating length
 * control mode for each barcode family that has lengths. This enumeration specify how each L1 and L2 length values
 * should be applied to a label.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>NONE</td>
 * <td>Turn off label length check.</td>
 * </tr>
 * <tr>
 * <td>ONE_FIXED</td>
 * <td>Only L1 value will be used, the only labels with a fixed L1 length will be considered valid.</td>
 * </tr>
 * <tr>
 * <td>TWO_FIXED</td>
 * <td>Both L1 and L2 will be used, only labels with a fixed L1 or L2 length will be considered valid.</td>
 * </tr>
 * <tr>
 * <td>RANGE</td>
 * <td>Both L1 and L2 will be used. The only labels with a length that is ranging from the minor length, between L1 and L2, to the major, again between L1 and L2,
 * will be considered valid. If L1 is less than L2, L1 will be considered as the minor length of the desired range; otherwise the opposite.</td>
 * </tr>
 * </table>
 */
public enum LengthControlMode {
    /**
     * No control
     */
	NONE,
	/**
	 * One single fixed length control
	 */
	ONE_FIXED,
	/**
	 * Two fixed lengths control
	 */
	TWO_FIXED,
	/**
	 * Range length control
	 */
	RANGE;
}