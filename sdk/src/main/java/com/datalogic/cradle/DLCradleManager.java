package com.datalogic.cradle;

/**
 * This class provides access to Cradle related methods of the device.
 */
public class DLCradleManager
{
    /**
     * @hide
     * This is the constructor of CradleImpl.
     *
     * @throws Exception in case of error.
     */
    private DLCradleManager() {}

    /**
     * Returns an instance of the {@link DLCradleManager}.
     *
     * @return
     *         The Cradle Manager.
     */
    public static DLCradleManager getInstance()
    {
        return null;
    }

    /**
     * Returns the position of the Device related to the Cradle as instance of {@link InsertionState}.
     *
     * @return
     *         The {@link InsertionState} of the Device.
     */
    public InsertionState getInsertionState()
    {
        return null;
    }

    /**
     * Returns the available source power to charge the Device into the Cradle as instance of {@link AvailableSourcePower}.
     *
     * @return
     *         The {@link AvailableSourcePower} configured to charge the Device.
     */
    public AvailableSourcePower getAvailableSourcePowerLevel()
    {
        return null;
    }

    /**
     * Add an Insertion listener used to be notify about insertion and extraction events from the Cradle.
     *
     * @param listener
     *            The {@link CradleInsertionEventListener} to be added.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
    */
    public boolean addInsertionEventListener(CradleInsertionEventListener listener)
    {
        return false;
    }

    /**
     * Remove an Insertion listener previously added with the {@link #addInsertionEventListener(CradleInsertionEventListener listener)} method.
     *
     * @param listener
     *            The {@link CradleInsertionEventListener} to be removed.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    public boolean removeInsertionEventListener(CradleInsertionEventListener listener) 
    {
        return false;
    }

    /**
     * Add an Unlock Key Event listener used to be notify about Unlock Key events occurred on the Cradle.
     *
     * @param listener
     *            The {@link CradleUnlockKeyEventListener} to be added.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
    */
    public boolean addUnlockKeyEventListener(CradleUnlockKeyEventListener listener)
    {
        return false;
    }

    /**
     * Remove an Unlock Key Event listener previously added with the {@link #addUnlockKeyEventListener(CradleUnlockKeyEventListener listener)} method.
     *
     * @param listener
     *            The {@link CradleUnlockKeyEventListener} to be removed.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    public boolean removeUnlockKeyEventListener(CradleUnlockKeyEventListener listener) 
    {
        return false;
    }

    /**
     * Returns the current position related to the unlock key.
     *
     * @return
     *         The current {@link UnlockKeyStatus} of the unlock key.
     */
    public UnlockKeyStatus getUnlockKeyStatus()
    {
        return UnlockKeyStatus.UNLOCK_KEY_STATUS_UNKNOWN;
    }

    /**
     * Performs Cradle Firmware update procedure.
     *
     * @param binaryPath
     *            the <code>String</code> path where the binary file is stored.
     *
     * @param size
     *            the <code>String</code> dimension of the binary file.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    public int firmwareUpgrade(String binaryPath, long size)
    {
        return 0;
    }
}
