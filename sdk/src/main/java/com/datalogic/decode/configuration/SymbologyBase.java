package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>SymbologyBase</code> is the Symbologies Properties parent class.
 * 
 */
class SymbologyBase extends PropertyGroup {

	/**
	 * <code>enable</code> enables or disables the symbology.
	 */
	public BooleanProperty enable;

	/**
	 * <code>userID</code> specifies the symbology identifier (if any).<br/>
	 * The symbology identifier is sent with the label when the
	 * global decode property {@link Formatting#sendCodeId} is set to
	 * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.
	 */
	public CharacterProperty userID;

	/**
	 * This is an empty constructor that will not be used. In the implementation a different one protected/private
	 * will be invoked. Leave it empty, do not implement. This avoids breaking code if the class is extended.
	 * @hide
	 */
	protected SymbologyBase(){}
}
