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
}
