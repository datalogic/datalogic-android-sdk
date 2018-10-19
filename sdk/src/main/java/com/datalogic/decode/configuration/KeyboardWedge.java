package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>KeyboardWedge</code> is the class that configures the Decode Wedge
 * capability with the keystroke mode.
 */
public class KeyboardWedge extends PropertyGroup {

	/**
	 * <code>enable</code> enables the keystroke mode. This means that the label
	 * is sent to the foreground application in the form of key events.
	 */
	public BooleanProperty enable;

	/**
	 * <code>onlyOnFocus</code> enables the input of the keystrokes only in input areas with
	 * active focus and an IME active, such as a touch keyboard. This means that the label
	 * will be sent to the foreground application in the form of key events only when previous
	 * conditions will be met. Instead, set to false, it will emulate keystrokes directly into the
	 * foreground activity. Be aware, keeping this deactivated could lead to undesired behaviors.
	 */
	public BooleanProperty onlyOnFocus;

	/**
	 * <code>wedgeMode</code> indicates the method by which the KeyboardWedge
	 * operates. The default value is {@link KeyWedgeMode#TEXT_INJECTION}.
	 */
	public EnumProperty<KeyWedgeMode> wedgeMode;

	/**
	 * This is the constructor of KeyboardWedge. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public KeyboardWedge(PropertyGetter editor) {
	}

}
