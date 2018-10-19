package com.datalogic.device.input;

/**
 * Interface representing a trigger associated by default with the scan action.
 */
public interface Trigger
{
    /**
     * Return the unique scan code associated with the trigger.
     *
     * @return <code>int</code> the scan code.
     */
    public int getScanCode();

    /**
     * Return the name associated with the trigger.
     *
     * @return <code>int</code> the trigger name.
     */
    public String getName();

    /**
     * Return the unique ID associated with the trigger.
     *
     * @return <code>int</code> the trigger unique ID.
     */
    public int getId();

    /**
     * Enables or disables the trigger by specifying a <code>boolean</code> value.
     *
     * @param enabled
     *         <code>boolean</code> that specifies whether or not the trigger will be enabled.
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    public boolean setEnabled(boolean enabled);

    /**
     * Checks if the trigger is enabled.
     *
     * @return <code>boolean</code> true in case the trigger is enabled, false otherwise or in case of failure.
     */
    public boolean isEnabled();
}
