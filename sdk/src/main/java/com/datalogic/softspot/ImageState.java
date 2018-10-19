package com.datalogic.softspot;

/**
 * <code>ImageState</code> is an enumeration defining constants for different states
 * SoftSpot can be in.
 */
public enum ImageState {
	/** Normal state, nothing scanned yet */
	NORMAL,
	/** Barcode has been recently decoded */
	DECODED;
};