package com.datalogic.decode;

import com.datalogic.decode.ReadListener;
/**
 * <code>DecodeResult</code> is an interface passed by
 * {@link ReadListener#onRead(DecodeResult)} to retrieve scanned data from the
 * decoder.
 */
public interface DecodeResult {

	/**
	 * Returns the raw decoded data result from scanner as a byte array.
	 * @return <code>byte[]</code> the resultant array containing the raw information
	 *  directly read from the scanner.
	 */
	public byte[] getRawData();

	/**
	 * Returns the decoded result as a formatted String.
	 * @return <code>String</code> representing the decoded result.
	 */
	public String getText();

	/**
	 * Returns the {@link BarcodeID} of the read data.
	 * @return {@link BarcodeID} the corresponding one.
	 */
	public BarcodeID getBarcodeID();

}
