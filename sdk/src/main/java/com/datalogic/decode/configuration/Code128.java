package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Code128</code> is the class that configures the Code128 and GS1-128 Symbologies.
 * 
 */
public class Code128 extends SymbologyLengths {

	/**
	 * <code>gs1_128</code> enables or disables the GS1-128 symbology.
	 */  
	public BooleanProperty gs1_128;

	/**
	 * <code>gs1_128_userID</code> specifies the GS1-128 symbology identifier (if any).<br/>
	 * The symbology identifier is sent with the label when the
	 * global decode property {@link Formatting#sendCodeId} is set to
	 * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.
	 */
	public CharacterProperty gs1_128_userID;

	/**
	 * This is the constructor of Code128. All symbology options are initialized
	 * by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Code128(PropertyGetter editor) {
	}
}
