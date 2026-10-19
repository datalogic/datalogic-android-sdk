package com.datalogic.device.rfid;

import com.datalogic.device.ErrorManager;
import com.datalogic.device.DeviceException;

/**
 * <code>RFIDManager</code> gives developers access to RFID-related
 * functionalities of the device.
 * <p>
 * To manage RFID inventory sessions with this class, use the following steps:
 * </p>
 * <ol>
 * <li>Obtain an instance of RfidManager with {@link #RfidManager()};
 * <li>Register the listeners needed in your application from the available ones: RFIDStartListener, RFIDReadListener, RFIDStopListener, and RFIDTimeoutListener;
 * <li>To begin an RFID reading session, call {@link #startInventory()}. Your registered
 * RFIDStartListener/RFIDReadListener/RFIDTimeoutListener will be called when a successful
 * read occurs or if the configured timeout expires, etc;
 * <li>Call {@link #stopInventory()} to end the reading session;
 * </ol>
 */

public class RfidManager {
    
    /**
     * Constructs an <code>RfidManager</code> instance and initializes the connection
     * with the underlying RFID system service.
     *
     * @throws RfidException
     *             If an error occurs during initialization of the RFID service,
     *             including service retrieval failure, unavailability, or
     *             unexpected runtime exceptions.
     * @throws DeviceException
     *             If the RFID service is not available, returns a null reference,
     *             or the feature is not supported or not initialized.
     */
    public RfidManager() {
    }

    /**
     * Registers a {@link RfidReadListener} to be notified when a read event is
     * triggered. Call {@link #removeReadListener} before the application
     * closes to properly shut down the listener.
     * 
     * @param listener
     *            The {@link RfidReadListener} that will be called when a
     *            reader's read event is fired.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int addReadListener(RfidReadListener listener) {
        return 0;
    }

    /**
     * Unregisters a {@link RfidReadListener} associated with the reader.
     * 
     * @param listener
     *            The {@link RfidReadListener} that will be no more notified.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int removeReadListener(RfidReadListener listener) {
        return 0;
    }

    /**
     * Registers a {@link RfidStartListener} to be notified when a inventory started
     * event is triggered. Call {@link #removeStartListener} before the
     * application closes to properly shut down the listener.
     * 
     * @param listener
     *            The {@link RfidStartListener} that will be called when a
     *            reader's started inventory event is fired.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int addStartListener(RfidStartListener listener) {
        return 0;
    }

    /**
     * Unregisters a {@link RfidStartListener} associated with the reader.
     * 
     * @param listener
     *            The {@link RfidStartListener} that will be no more notified.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int removeStartListener(RfidStartListener listener) {
        return 0;
    }

    /**
     * Registers a {@link RfidStopListener} to be notified when a inventory stopped
     * event is triggered. Call {@link #removeStopListener} before the
     * application closes to properly shut down the listener.
     * 
     * @param listener
     *            The {@link RfidStopListener} that will be called when a
     *            reader's stopped inventory event is fired.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int addStopListener(RfidStopListener listener) {
        return 0;
    }

    /**
     * Unregisters a {@link RfidStopListener} associated with the reader.
     * 
     * @param listener
     *            The {@link RfidStopListener} that will be no more notified.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int removeStopListener(RfidStopListener listener) {
        return 0;
    }

    /**
     * Registers a {@link RfidTimeoutListener} to be notified when a inventory
     * timeout event is triggered. Call {@link #removeTimeoutListener}
     * before the application closes to properly shut down the listener.
     * 
     * @param listener
     *            The {@link RfidTimeoutListener} that will be called when a
     *            reader's inventory timeout event is fired.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int addTimeoutListener(RfidTimeoutListener listener) {
        return 0;
    }

    /**
     * Unregisters a {@link RfidTimeoutListener} associated with the reader.
     * 
     * @param listener
     *            The {@link RfidTimeoutListener} that will be no more
     *            notified.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int removeTimeoutListener(RfidTimeoutListener listener) {
        return 0;
    }

    /**
     * Call this method to start an RFID inventory operation. <br>
     * The inventory process begins immediately upon invocation and continues until either: <br>
     * - the configured timeout (if set via the Configuration Manager) expires, or <br>
     * - the {@link #stopInventory()} method is explicitly called. <br>
     * <br>
    * 
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise an error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
    */
    public int startInventory() {
	return 0;
    }

    /**
     * Call this method to stop an ongoing RFID inventory operation. <br>
     * This method can be used to manually terminate the inventory process before the configured timeout expires. <br>
     * It is typically used in conjunction with {@link #startInventory()} to control the duration of the inventory session. <br>
     * <br>
     *
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
    */
    public int stopInventory() {
        return 0;
    }

    /**
     * Writes data to a specified memory bank of an RFID tag.
     * 
     * @param filter
     *            The {@link RfidFilter} used to select on which RFID tag to apply the operation.
     *            If <code>null</code>, no filtering is applied and the operation targets any tag in range.
     * @param password
     *            The {@link RfidPassword} that demonstrates the operation is authorized on the tag.
     *            If <code>null</code>, a default password of 4 bytes with value 0x00 is used.
     * @param bank
     *            The {@link RfidMemoryBankRegion} on which the data must be written.
     * @param address
     *            The address from which to start writing the data.
     * @param data
     *            The data to be written. The length of the data must be even, as RFID memory is word-addressable.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
    */
    public int write(RfidFilter filter, RfidPassword password, RfidMemoryBankRegion bank, int address, byte[] data) {
        return 0;
    }

    /**
     *  Writes data to the EPC memory bank of an RFID tag, only one RFID Tag must be in the writing area.
     *
     * @param password
     *            The {@link RfidPassword} that authorizes the operation on the tag.
     *            If <code>null</code>, a default password of 4 bytes with value 0x00 is used.
     * @param data
     *            The EPC data to be written to the tag.
     * @return <code>int</code> {@link RfidException#SUCCESS} if the operation completes successfully,
     * otherwise an error code defined in {@link RfidException}.
     * @throws RfidException
     * If an error occurs during the operation, and exceptions are enabled via the {@link ErrorManager} singleton.
     */
    public int writeEPC(RfidPassword password, byte[] data) {
        return 0;
    }


    /**
     * Reads data from a specified memory bank of an RFID tag.
     *
     * @param filter
     *            The {@link RfidFilter} used to select which RFID tag to apply the operation to.
     *            If <code>null</code>, no filtering is applied and the operation targets any tag in range.
     * @param password
     *            The {@link RfidPassword} that authorizes the read operation on the tag.
     *            If <code>null</code>, a default password of 4 bytes with value 0x00 is used.
     * @param bank
     *            The {@link RfidMemoryBankRegion} from which the data must be read.
     * @param address
     *            The starting address within the memory bank.
     * @param length
     *            The number of words to read from the memory bank.
     * @param data
     *            The output buffer that will contain the data read from the tag.
     *            Its size must be at least two times the required length, because RFID operation are word-based.
     * @return <code>int</code> {@link RfidException#SUCCESS} if the operation completes successfully,
     * otherwise an error code defined in {@link RfidException}.
     * @throws RfidException
     * If an error occurs during the operation, and exceptions are enabled via the {@link ErrorManager} singleton.
     */
    public int read(RfidFilter filter, RfidPassword password, RfidMemoryBankRegion bank, int address, int length, byte[] data) {
        return 0;
    }

    /**
    * Disables the RFID tag if it matches the filter and has the correct password.
    * 
    * @param filter
    *            The {@link RfidFilter} used to select on which RFID tag to apply the operation.
    * @param password
    *            The {@link RfidPassword} that demonstrates the operation is authorized on the tag.
    *            If <code>null</code>, a default password of 4 bytes with value 0x00 is used.
    * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
    * otherwise an error code, matching one of the {@link RfidException} error constants.
    * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
    */
    public int kill(RfidFilter filter, RfidPassword password) {
	return 0;
    }
    
    /**
    * Locks or unlocks specified objects on an RFID tag based on the provided filter and password.
    * 
    * @param filter
    *            The {@link RfidFilter} used to select on which RFID tag to apply the operation.
    * @param password
    *            The {@link RfidPassword} that demonstrates the operation is authorized on the tag.
    *            If <code>null</code>, a default password of 4 bytes with value 0x00 is used.
    * @param object
    *            The {@link RfidLockObject} enum used to select which objects to lock.
    * @param type
    *            The {@link RfidLockType} enum that defines how each object must be locked or unlocked.
    * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
    * otherwise an error code, matching one of the {@link RfidException} error constants.
    * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
    */
    public int lock(RfidFilter filter, RfidPassword password, RfidLockObject object, RfidLockType type) {
	return 0;
    }

    /**
     * Locks RFID UCODE9 tag based on the provided filter and password.
     *
     * @param filter
     *            The {@link RfidFilter} used to select on which RFID tag to apply the operation.
     * @param password
     *            The {@link RfidPassword} that demonstrates the operation is authorized on the tag.
     *            If <code>null</code>, a default password of 4 bytes with value 0x00 is used.
     * @return <code>int</code> {@link RfidException#SUCCESS} in case of success,
     * otherwise an error code, matching one of the {@link RfidException} error constants.
     * @throws RfidException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int lockU9(RfidFilter filter, RfidPassword password) {
       return 0;
    }

}
