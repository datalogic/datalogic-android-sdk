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
	 * <code>gs1Check</code> enables a check to verify that the content of the barcode matches the GS1
	 * AIs format (<a href="https://ref.gs1.org/ai/">https://ref.gs1.org/ai/</a>), so that GS1 codes not well
	 * formatted will not be decoded.
	 */
	public BooleanProperty gs1Check;

	/**
	 * <code>gs1StringFormat</code> enables automatic formatting of the barcode content, based on the
	 * "GS1 Human Readable Interpretation (HRI)" rules 
	 * (<a href="https://www.gs1.org/docs/barcodes/HRI_Implementation_Guide.pdf">
	 * https://www.gs1.org/docs/barcodes/HRI_Implementation_Guide.pdf</a>), by dividing the code into the
	 * different fields and marking each 
	 * Application Identifier by enclosing it in parentheses. Example: "(01)195001101530000(17)140704(10)AB-123"
	 */
	public BooleanProperty gs1StringFormat;

	/**
	 * <code>gtinFormat</code> selects the format to use for the GTIN representation.
	 */
	public EnumProperty<GtinFormat> gtinFormat;

	/**
	 * <code>gs1LabelSetTransmitMode</code> selects the mode used to transmit GS1 label sets.
	 * A label set consists of all the GS1 barcodes that have the same GTIN value.
	 */
	public EnumProperty<Gs1LabelSetTransmitMode> gs1LabelSetTransmitMode;


	/**
	 * <code>gs1LabelSetPrefix</code> specifies the prefix of the label set used when
	 * the label set transmit mode is set to <code>ALL_LABELS</code>.
	 */
	public TextProperty gs1LabelSetPrefix;

	/**
	 * <code>gs1Conversion2d</code> selects the conversion used for GS1 2D barcodes.
	 */
	public EnumProperty<Gs1Conversion2d> gs1Conversion2d;

	/**
	 * <code>hexFormat</code> when enabled formats the read data as a readable hexadecimal string. Ignores other formatting options.
	 */
	public BooleanProperty hexFormat;

	/**
	 * This is the constructor of Formatting. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public Formatting(PropertyGetter editor) {
	}

}
