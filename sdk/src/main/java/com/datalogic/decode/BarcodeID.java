package com.datalogic.decode;

/**
 * <code>BarcodeID</code> is an enumeration class defining constants for different decoded barcode types.
 * 
 */
public enum BarcodeID {
	/**
	 * The decoded data is not recognized
	 */
	NOT_DEFINED, //
	/**
	 * Code 39
	 */
	CODE39, //
	/**
	 * Discrete 2/5
	 */
	DISCRETE25, //
	/**
	 * Matrix 2/5
	 */
	MATRIX25, //
	/**
	 * Interleaved 2/5
	 */
	INTERLEAVED25, //
	/**
	 * Codabar
	 */
	CODABAR, //
	/**
	 * Code 93
	 */
	CODE93, //
	/**
	 * Code 128
	 */
	CODE128, //
	/**
	 * UPC-A
	 */
	UPCA, //
	/**
	 * UPC-A + 2
	 */
	UPCA_ADDON2, //
	/**
	 * UPC-A + 5
	 */
	UPCA_ADDON5, //
	/**
	 * UPC-E
	 */
	UPCE, //
	/**
	 * UPC-E + 2
	 */
	UPCE_ADDON2, //
	/**
	 * UPC-E + 5
	 */
	UPCE_ADDON5, //
	/**
	 * UPC-E1
	 */
	UPCE1, //
	/**
	 * UPC-E1 + 2
	 */
	UPCE1_ADDON2, //
	/**
	 * UPC-E1 + 5
	 */
	UPCE1_ADDON5, //
	/**
	 * EAN-13
	 */
	EAN13, //
	/**
	 * EAN-13 + 2
	 */
	EAN13_ADDON2, //
	/**
	 * EAN-13 + 5
	 */
	EAN13_ADDON5, //
	/**
	 * EAN-8
	 */
	EAN8, //
	/**
	 * EAN-8 + 2
	 */
	EAN8_ADDON2, //
	/**
	 * EAN-8 + 5
	 */
	EAN8_ADDON5, //
	/**
	 * MSI
	 */
	MSI, //
	/**
	 * GS1 Databar-14
	 */
	GS1_14, //
	/**
	 * GS1 Databar Limited
	 */
	GS1_LIMIT, //
	/**
	 * GS1 Databar Expanded
	 */
	GS1_EXP, //
	/**
	 * PDF-417.
	 */
	PDF417, //
	/**
	 * Data Matrix
	 */
	DATAMATRIX, //
	/**
	 * Maxicode
	 */
	MAXICODE, //
	/**
	 * Trioptic
	 */
	TRIOPTIC, //
	/**
	 * Code 32
	 */
	CODE32, //
	/**
	 * MicroPDF417
	 */
	MICROPDF417, //
	/**
	 * QR Code
	 */
	QRCODE, //
	/**
	 * Aztec Code
	 */
	AZTEC, //
	/**
	 * Postal Planet
	 */
	POSTAL_PLANET, //
	/**
	 * Postal Postnet
	 */
	POSTAL_POSTNET, //
	/**
	 * Postal USPS 4-State
	 */
	POSTAL_4STATE, //
	/**
	 * Postal Royal Mail
	 */
	POSTAL_ROYALMAIL, //
	/**
	 * Postal Australian
	 */
	POSTAL_AUSTRALIAN, //
	/**
	 * Postal Kix
	 */
	POSTAL_KIX, //
	/**
	 * Postal Japan
	 */
	POSTAL_JAPAN, //
	/**
	 * GS1-128
	 */
	GS1_128, //
	/**
	 * Code 39 Full ASCII
	 */
	CODE39_FULLASCII, //
	/**
	 * ISBN (ISBN-10 & ISBN-13)
	 */
	EAN13_ISBN, //
	/**
	 * ISSN
	 */
	EAN13_ISSN, //
	/**
	 * Micro QR Code
	 */
	MICRO_QR, //
	/**
	 * GS1 Composite GS1-128 with CC-A
	 */
	COMPOSITE_GS1_128_A, //
	/**
	 * GS1 Composite GS1-128 with CC-B
	 */
	COMPOSITE_GS1_128_B, //
	/**
	 * GS1 Composite GS1-128 with CC-C
	 */
	COMPOSITE_GS1_128_C, //
	/**
	 * GS1 Composite GS1 DataBar with CC-A
	 */
	COMPOSITE_GS1_14_A, //
	/**
	 * GS1 Composite GS1 DataBar with CC-B
	 */
	COMPOSITE_GS1_14_B, //
	/**
	 * GS1 Composite GS1 DataBar Limited with CC-A
	 */
	COMPOSITE_GS1_LIMIT_A, //
	/**
	 * GS1 Composite GS1 DataBar Limited with CC-B
	 */
	COMPOSITE_GS1_LIMIT_B, //
	/**
	 * GS1 Composite GS1 DataBar Expanded with CC-A
	 */
	COMPOSITE_GS1_EXP_A, //
	/**
	 * GS1 Composite GS1 DataBar Expanded with CC-B
	 */
	COMPOSITE_GS1_EXP_B, //
	/**
	 * GS1 Composite CC-A part, transmitted after EAN/UPC
	 */
	COMPOSITE_CC_A, //
	/**
	 * GS1 Composite CC-B part, transmitted after EAN/UPC
	 */
	COMPOSITE_CC_B, //
	/**
	 * DotCode
	 */
	DOTCODE, //
	/**
	 * ISBT 128
	 */
	ISBT_128, //
	/**
	 * ISBT 128 Concatenated
	 */
	ISBT_128_CONCATENATED, //
	/**
	 * GS1-Data Matrix
	 */
	GS1_DATAMATRIX, //
	/**
	 * GS1-QR Code
	 */
	GS1_QRCODE, //
	/**
	 * ITF14
	 */
	ITF14, //
	/**
	 * OCR
	 */
	OCR, //
	/**
	 * HAN XIN
	 */
	HAN_XIN, //
	/**
	 * TLC 39
	 */
	TLC39,
	/**
	 * GS1 DigitalLink QR Code
	 */
	GS1_DL_QRCODE,
	/**
	 * GS1 DigitalLink Data Matrix
	 */
	GS1_DL_DATAMATRIX;

}
