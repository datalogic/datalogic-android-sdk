package com.datalogic.device.rfid;

/**
 * <code>RFIDResult</code> is an interface passed by
 * {@link RfidReadListener#onRead(RfidResult)} to retrieve RFID data from the
 * reader during inventory.
 */
public interface RfidResult {
    /**
    * Retrieves the Received Signal Strength Indicator (RSSI) value of the RFID tag.
    * 
    * @return <code>int</code> representing the RSSI value.
    */
    public int getRSSI();

    /**
    * Retrieves the Electronic Product Code (EPC) of the RFID tag.
    * 
    * @return <code>byte[]</code> containing the EPC data.
    */
    public byte[] getEPC();

}
