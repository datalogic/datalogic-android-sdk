package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>Formatting</code> is the class that configures the properties related
 * to barcode text formatting.
 */
public class Formatting extends PropertyGroup {

	/**
	 * <code>sendCodeId</code> selects the symbology identifier to be
	 * transmitted along with the scanned data.
	 */
	public EnumProperty<SendCodeID> sendCodeId;

	/**
	 * <code>gsSubstitution</code> is a string of Unicode characters that
	 * replaces each occurrence of GS (ASCII code 0x1D) in the scanned data.
	 */
	public TextProperty gsSubstitution;

	/**
	 * <code>labelPrefix</code> is a string of Unicode characters sent
	 * immediatly before symbology identifier.
	 */
	public TextProperty labelPrefix;

	/**
	 * <code>labelSuffix</code> is a string of Unicode characters sent after the
	 * final character in data.
	 */
	public TextProperty labelSuffix;

	/**
	 * <code>removeNonPrintableChars</code> removes all characters in the range
	 * 0x00-0x1F and the single character 0x7F from the scanned data. The length check for
	 * each symbology is evaluated before any characters are removed. Characters in
	 * the code ID, prefix, suffix, or separator won't be removed.
	 */
	public BooleanProperty removeNonPrintableChars;

	/**
	 * <code>externalFormatting</code> enables the external formatting service.
	 */
	public BooleanProperty externalFormatting;

	/**
	 * <code>eciPolicy</code> selects the policy used to handle ECI.
	 */
	public EnumProperty<ECIPolicy> eciPolicy;

	/**
	 * This is the constructor of Formatting. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Formatting(PropertyGetter editor) {
	}

}
