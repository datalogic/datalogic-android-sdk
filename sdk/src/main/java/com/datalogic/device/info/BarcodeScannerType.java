package com.datalogic.device.info;

/**
 * The <code>BarcodeScannerType</code> enumeration lists barcode scanner types.
 */
public enum BarcodeScannerType {
    /**
     * None
     */
	NONE,
	/** 
	 * Laser or 1D-ccd
	 *  */
	ONE_DIMENSIONAL_READER,
	/** 
	 * Imager or 2D
	 * */
	TWO_DIMENSIONAL_READER;
}
