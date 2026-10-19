package com.datalogic.device.rfid;

/**
 * The <code>MemoryBankRegion</code> is an enumeration defining the various region of the memory of a tag.
 */
public enum RfidMemoryBankRegion {
	
	/**
	* RESERVED: Contains the kill and access passwords.
	*/
	RESERVED,
	/**
	* EPC: Contains CRC (Cyclic Redundancy Check), Protocol-Control Bits, and EPC (Electronic Product Code).
	*/
	EPC,
	/**
	* TID: Contains an 8-bit class identifier and identifying information.
	*/
	TID,
	/**
	* USER: Contains user-specific data storage.
	*/
	USER;


	private static RfidMemoryBankRegion[] allValues = values();

	public static RfidMemoryBankRegion fromOrdinal(int n) {
		return allValues[n];
	}
}
