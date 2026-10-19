package com.datalogic.device.rfid;

/**
 * <code>RFIDPassword</code> represents the password used to authenticate RFID operation
 */
public class RfidPassword {

	/**
	 * Constructs an <code>RFIDPassword</code> with the specified password.
	 *
	 * @param password
	 *            A byte array representing the RFID password. Must be exactly 4 bytes long.
	 * @throws NullPointerException
	 *            If {@code password} is {@code null}.
	 * @throws IllegalArgumentException
	 *            If the length of {@code password} is not 4 bytes.
	 */
	public RfidPassword(byte[] password) throws NullPointerException, IllegalArgumentException {
	}


	/**
	 * Returns the RFID password.
	 *
	 * @return A byte array containing the RFID password.
	 */
	public byte[] getPassword() {
		return new byte[1];
	}
}
