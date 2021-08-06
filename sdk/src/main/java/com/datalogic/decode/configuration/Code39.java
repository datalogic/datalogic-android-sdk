	package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Code39</code> is the class that configures the Code39, Code32 and TriOptic Symbologies.
 * 
 */
public class Code39 extends SymbologyLengths {

	/**
	 * <code>enableChecksum</code> requires the use of checksum characters to
	 * verify a barcode.
	 */
	public BooleanProperty enableChecksum;

	/**
	 * <code>sendChecksum</code> includes the checksum in the label transmission
	 * (if checksum is required with enableChecksum).
	 */
	public BooleanProperty sendChecksum;

	/**
	 * <code>fullAscii</code> enables or disables the Full Ascii conversion.
	 */
	public BooleanProperty fullAscii;
	
	/**
	 * <code>code32</code> enables or disables the Code 32 symbology conversion.
	 */  
	public BooleanProperty code32;

	/**
	 * <code>code32_userID</code> specifies the Code 32 symbology identifier (if any).<br/>
	 * The symbology identifier is sent with the label when the
	 * global decode property {@link Formatting#sendCodeId} is set to
	 * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.
	 */
	public CharacterProperty code32_userID;

	/**
	 * <code>trioptic</code> enables or disables the Trioptic Code 39 symbology.
	 */  
	public BooleanProperty trioptic;

	/**
	 * <code>trioptic_userID</code> specifies the Trioptic Code 39 symbology identifier (if any).<br/>
	 * The symbology identifier is sent with the label when the
	 * global decode property {@link Formatting#sendCodeId} is set to
	 * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.
	 */
	public CharacterProperty trioptic_userID;

	/**
	 * <code>aggressiveness</code> controls the aggressiveness for the Code 39 symbology.
	 */
	public EnumProperty<Code39Aggressiveness> aggressiveness;
	
	/**
	 * This is the constructor of Code39. All symbology options are initialized
	 * by editor.
	 *
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Code39(PropertyGetter editor) {
	}
}
