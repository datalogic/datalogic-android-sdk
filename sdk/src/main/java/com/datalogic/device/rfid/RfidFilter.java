package com.datalogic.device.rfid;

/**
 * Class {@code RfidFilter} defines a comparison rule used to select
 * which RFID tags an operation should be applied to.
 * <p>
 * The filter matches a portion of a tag's memory against a provided
 * byte sequence. Only tags whose memory content matches the filter
 * criteria are affected by subsequent RFID operations.
 * <p>
 * This concept is typically used for selective read, write,
 * or lock operations.
 */

public class RfidFilter {

    /**
     * Constructs an <code>RFIDFilter</code> with the specified parameters.
     * 
     * @param region
     *            The {@link RfidMemoryBankRegion} specifying the memory bank region to compare.
     * @param address
     *            The address within the memory bank region to start the comparison, expressed in words (1 word = 2 bytes).
     * @param dataToCompare
     *            The data to compare against the RFID tag's memory. The length of the data must be even, as RFID memory is word-addressable.
     * @throws NullPointerException
     *            If {@code dataToCompare} is {@code null}.
     * @throws IllegalArgumentException
     *            If the length of {@code dataToCompare} is not even.
     */
    public RfidFilter(RfidMemoryBankRegion region, int address, byte[] dataToCompare) throws NullPointerException, IllegalArgumentException {
    }

    /**
     * Returns the memory bank region used for filtering the RFID tag.
     *
     * @return The {@link RfidMemoryBankRegion} specifying the memory bank region to compare.
     */
    public RfidMemoryBankRegion getRegion() {
        return RfidMemoryBankRegion.EPC;
    }

    /**
     * Returns the address (in words) within the memory bank region where the comparison starts.
     *
     * @return The address as an integer, expressed in words.
     */
    public int getAddress() {
        return 0;
    }

    /**
     * Returns the data used for comparison against the RFID tag's memory.
     *
     * @return A byte array containing the data to compare.
     */
    public byte[] getData() {
        return null;
    }

}
