package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>OCR</code> is the class that configure the MRZ reader.
 * 
 */
public class OCR extends SymbologyBase {

	/**
	 * <code>passportEnable</code> allows to read passport booklet in TD3 size.
	 * The data of the machine-readable zone consists of two rows of 44 characters each. 
	 */
	public BooleanProperty passportEnable;

	/**
	 * <code>idEnable</code> allows to read official travel document in TD1 size.
	 * The data of the machine-readable zone consists of three rows of 30 characters each. 
	 */
	public BooleanProperty idEnable;

	/**
	 * <code>confidence</code> allows to set minimum confidence used by the OCR 
	 * algorithm. An higher confidence decreases misdecoding probabilities.
	 */
	public NumericProperty confidence;
	
	/**
	 * <code>multiframe</code> specifies how many decoded frames must match 
	 * before accepting OCR data.
	 */
	public NumericProperty multiframe;

	/**
	 * This is the constructor of OCR. All symbology options are initialized by
	 * editor.
	 *
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public OCR(PropertyGetter editor) {
	}
}

