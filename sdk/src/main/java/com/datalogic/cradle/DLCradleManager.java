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
     * @deprecated use the public constructor
     * @return
     *         The Cradle Manager.
     */
    @Deprecated
    public static DLCradleManager getInstance()
    {
        return null;
    }

    /**
     * Returns the position of the Device related to the Cradle as instance of {@link InsertionState}.
     * @deprecated use {@link DLCradleManager#getProperty} and {@link DLCradleManager.Properties#INSERTION_STATE}.
     * @return
     *         The {@link InsertionState} of the Device.
     */
    @Deprecated
    public InsertionState getInsertionState()
    {
        return null;
    }

    /**
     * Returns the available source power to charge the Device into the Cradle as instance of {@link AvailableSourcePower}.
     * @deprecated use {@link DLCradleManager#getProperty} and {@link DLCradleManager.Properties#AVAILABLE_SOURCE_POWER_LEVEL}.
     * @return
     *         The {@link AvailableSourcePower} configured to charge the Device.
     */
    @Deprecated
    public AvailableSourcePower getAvailableSourcePowerLevel()
    {
        return null;
    }

    /**
     * Add an Insertion listener used to be notify about insertion and extraction events from the Cradle.
     * If property {@link DLCradleManager.Properties#INSERTION_STATE} is not supported, this listener cannot be added.
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
     * If property {@link DLCradleManager.Properties#INSERTION_STATE} is not supported, this listener cannot be removed.
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
     * Add a Failure listener used to be notify about failure events occurred on the Cradle.
     * If property {@link DLCradleManager.Properties#ACTIVE_FAILURES} is not supported, this listener cannot be added.
     * @param listener
     *            The {@link CradleFailureEventListener} to be added.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
    */
    public boolean addFailureEventListener(CradleFailureEventListener listener)
    {
        return false;
    }

    /**
     * Remove a Failure listener previously added with the {@link #addFailureEventListener(CradleFailureEventListener listener)} method.
     * If property {@link DLCradleManager.Properties#ACTIVE_FAILURES} is not supported, this listener cannot be removed.
     * @param listener
     *            The {@link CradleFailureEventListener} to be removed.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    public boolean removeFailureEventListener(CradleFailureEventListener listener) 
    {
        return false;
    }

    /**
     * Add an Unlock Key Event listener used to be notify about Unlock Key events occurred on the Cradle.
     * If property {@link DLCradleManager.Properties#UNLOCK_KEY_STATUS} is not supported, this listener cannot be added.
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
     * If property {@link DLCradleManager.Properties#UNLOCK_KEY_STATUS} is not supported, this listener cannot be removed.
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
     * Add a Unlock listener used to be notify about Lever status changed events occurred on the Cradle.
     * If property {@link DLCradleManager.Properties#LEVER_STATUS} is not supported, this listener cannot be added.
     * @param listener
     *            The {@link CradleUnlockEventListener} to be added.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
    */
    public boolean addUnlockEventListener(CradleUnlockEventListener listener)
    {
        return false;
    }

    /**
     * Remove an Unlock listener previously added with the {@link #addUnlockEventListener(CradleUnlockEventListener listener)} method.
     * If property {@link DLCradleManager.Properties#LEVER_STATUS} is not supported, this listener cannot be removed.
     * @param listener
     *            The {@link CradleUnlockEventListener} to be removed.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    public boolean removeUnlockEventListener(CradleUnlockEventListener listener) 
    {
        return false;
    }

    /**
     * Reboot the Cradle.
     *
     * @return int
     *            Returns 1 if the cradle has been rebooted sucessfully, error otherwise.
     * 
     * @throws DeviceException in case of error.
     */
    public int rebootCradle()
    {
        return 0;
    }

    /**
     * Returns the Cradle type.
     * @deprecated use {@link DLCradleManager#getProperty} and {@link DLCradleManager.Properties#CRADLE_TYPE}.
     * @return
     *         {@link Type} of the Cradle where the device is inserted in.
     */
    @Deprecated
    public Type getType(){
        return null;
    }
    
    /**
     * Returns the Cradle slot index where the device is inserted in. 
     * This value is persistent in the cradle memory and it couldn't be changed.
     * @deprecated use {@link DLCradleManager#getProperty} and {@link DLCradleManager.Properties#SLOT_INDEX}.
     * @return
     *         {@link Integer} of the Cradle slot index where the device is inserted in.
     */
    @Deprecated
    public int getSlotIndex(){
        return 0;
    }

    /**
     * Returns the current insertion count for this Cradle slot
     * @deprecated use {@link DLCradleManager#getProperty} and {@link DLCradleManager.Properties#INSERTIONS_COUNT}.
     * @return
     *         {@link Integer} of the current insertion count for this Cradle slot.
     */
    @Deprecated
    public int getInsertionCount(){
        return 0;
    }

    /**
     * Returns the current position related to the Cradle lever.
     * @deprecated use {@link DLCradleManager#getProperty} and {@link DLCradleManager.Properties#LEVER_STATUS}.
     * @return
     *         The current {@link LeverStatus} of the Cradle.
     */
    @Deprecated
    public LeverStatus getLeverStatus()
    {
        return LeverStatus.LEVER_STATUS_UNKNOWN;
    }

    /**
     * Sets the new position related to the Cradle lever.
     * @deprecated use {@link DLCradleManager#lockDevice}
     * @param levelStatus
     *            The required {@link LeverStatus} of the Cradle lever.
     *
     * @return <code>boolean</code> true in case of success, false otherwise.
     */
    @Deprecated
    public boolean setLeverStatus(LeverStatus levelStatus)
    {
        return false;
    }

    /**
     * Lock or unlock the device into the cradle
     * @param lock <code>true</code> to lock the device, <code>false</code> to unlock the device.
     */
    public void lockDevice(boolean lock) {
        return;
    }

    /**
     * Returns the current position related to the unlock key.
     * @deprecated use {@link DLCradleManager#getProperty} and {@link DLCradleManager.Properties#UNLOCK_KEY_STATUS}.
     * @return
     *         The current {@link UnlockKeyStatus} of the unlock key.
     */
    @Deprecated
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
     * 
     * @throws DeviceException in case of error.
     */
    public int firmwareUpgrade(String binaryPath, long size)
    {
        return 0;
    }

    /**
     * Abort Cradle Firmware update procedure
     *
     * @return <code>Integer</code> true in case of success, false otherwise.
     */
    public int firmwareUpgradeAbort()
    {
        return 0;
    }

    /**
     * return if fast charge is supported by the Cradle.
     * @deprecated use {@link DLCradleManager#getProperty} and {@link DLCradleManager.Properties#FAST_CHARGE_STATUS}.
     */
    @Deprecated
    public boolean isFastChargeSupported() {
        return false;
    }

    /**
     * Sets the state of a specific LED on the cradle.
     * This method allows enabling or disabling a specific LED identified by its ID.
     * The LED color can also be set using an ARGB value.
     *
     * @param ledId The {@link CradleLed} representing the LED to be controlled.
     * @param colorARGB The ARGB color value to set for the LED.
     * @param enable <code>true</code> to enable the LED, <code>false</code> to disable it.
     * @return <code>true</code> if the operation was successful, <code>false</code> otherwise.
     */
    public boolean setLed(CradleLed ledId, int colorARGB, boolean enable) {
        return false;
    }

    /**
     * Blinks a specific LED on the cradle.
     * This method allows blinking a specific LED identified by its ID. The blink count,
     * duration of the ON state, and duration of the OFF state can be configured.
     * @param id The {@link CradleLed} representing the LED to be blinked.
     * @param colorArgb The ARGB color value to set for the LED during blinking.
     * @param blinkCount The number of times the LED should blink. Range: [0 : 65535]. If set to 0, the LED will blink indefinitely.
     * @param onDurationMs The duration (in milliseconds) the LED stays ON during each blink. Range: [0 : 65535].
     * @param offDurationMs The duration (in milliseconds) the LED stays OFF during each blink. Range: [0 : 65535].
     * @return <code>true</code> if the operation was successful, <code>false</code> otherwise.
     */
    public boolean blinkLed(CradleLed id, int colorArgb, int blinkCount, int onDurationMs, int offDurationMs) {
        return false;
    }

    /**
     * Checks if a specific LED is supported by the cradle.
     * This method verifies whether the cradle supports a specific LED identified by its ID.
     * @param id The {@link CradleLed} representing the LED to be checked.
     * @return <code>true</code> if the LED is supported, <code>false</code> otherwise.
     */
    public boolean isLedSupported(CradleLed id) {
        return false;
    }

    /**
     * Checks if the specified property is supported by the cradle.
     * This method verifies whether the given property identifier, defined in the {@link Properties} class,
     * is supported by the cradle. If the property is supported, it can be accessed or modified depending
     * on its read-only status.
     *
     * @param propertyId The identifier of the property to check, as defined in {@link Properties}.
     * @return <code>true</code> if the property is supported, <code>false</code> otherwise.
     */
    public boolean isPropertySupported(int propertyId) {
        return false;
    }

    /**
     * Checks if the specified property is read-only.
     * This method determines whether the given property identifier, defined in the {@link Properties} class,
     * is read-only. Read-only properties can only be accessed but not modified.
     * @param propertyId The identifier of the property to check, as defined in {@link Properties}.
     * @return <code>true</code> if the property is read-only, <code>false</code> otherwise.
     */
    public boolean isPropertyReadOnly(int propertyId) {
        return false;
    }

    /**
     * Retrieves the value of the specified property.
     * This method fetches the value of the property identified by the given property ID, as defined in
     * the {@link Properties} class. If the property is not found or an error occurs, the default value
     * provided is returned.
     * @param propertyId The identifier of the property to retrieve, as defined in {@link Properties}.
     * @param defaultValue The default value to return if the property is not found.
     * @return The value of the property, or the default value if the property is not found.
     */
    public <T> T getProperty(int propertyId, T defaultValue) {
        return null;
    }

    /**
     * Sets the value of the specified property.
     * This method updates the value of the property identified by the given property ID, as defined in
     * the {@link Properties} class. If the property is read-only or unsupported, the operation will fail.
     * @param propertyId The identifier of the property to set, as defined in {@link Properties}.
     * @param value The new value to assign to the property.
     */
    public <T> void setProperty(int propertyId, T value) {}

    /**
     * This class contains all the cradle properties identifiers.
     * The properties defined in this class represent various attributes and states of the cradle.
     * These identifiers are used to interact with the cradle's properties through the methods:
     * <ul>
     *  <li>{@link DLCradleManager#isPropertyReadOnly} - Checks if a property is read-only.</li>
     *  <li>{@link DLCradleManager#isPropertySupported} - Checks if a property is supported by the cradle.</li>
     *  <li>{@link DLCradleManager#getProperty} - Retrieves the value of a property.</li>
     *  <li>{@link DLCradleManager#setProperty} - Sets the value of a property.</li>
     * </ul>
     */
    public static class Properties {
        /**
         * Property that represents cradle type.
         * This property is read-only.
         * Type: {@link Type}
         */
        public static final int CRADLE_TYPE = 0;
        /**
         * Property that represents the slot index.
         * The slot index is used to identify the cradle slot in which the device is inserted.
         * It is not the same as the {@link Properties#SLOT_ID} which can be assigned arbitrarily and it cannot be changed.
         * This property is read-only.
         * Type: {@link Integer}
         */
        public static final int SLOT_INDEX = 1;
        /**
         * Property that represents the cradle firmware version.
         * This property is read-only.
         * Type: {@link Integer}
         */
        public static final int FIRMWARE_VERSION = 2;
        /**
         * Property that represents the cradle bootloader version.
         * This property is read-only.
         * Type: {@link Integer}
         */
        public static final int BOOTLOADER_VERSION = 3;
        /**
         * Property that represents the cradle hardware revision.
         * This property is read-only.
         * Type: {@link Integer}
         */
        public static final int HARDWARE_REVISION = 4;
        /**
         * Property that represents the cradle serial number.
         * This property is read-only.
         * Type: {@link String}
         */
        public static final int SERIAL_NUMBER = 5;
        /**
         * Property that represents the cradle part number.
         * This property is read-only.
         * Type: {@link String}
         */
        public static final int PART_NUMBER = 6;
        /**
         * Property that represents the cradle manufacture date.
         * This property is read-only.
         * Type: {@link String}
         */
        public static final int MANUFACTURE_DATE = 7;
        /**
         * Property that represents the cradle WLC firmware version.
         * This property is read-only.
         * Type: {@link Integer}
         */
        public static final int WLC_FIRMWARE_VERSION = 8;
        /**
         * Property that represents the device insertion state.
         * This property is read-only.
         * Type: {@link InsertionState}
         */
        public static final int INSERTION_STATE = 9;
        /**
         * Property that represents the state of cradle lever.
         * This property is read-only.
         * Type: {@link LeverStatus}
         */
        public static final int LEVER_STATUS = 10;
        /**
         * Property that represents the state of the unlock key.
         * This property is read-only.
         * Type: {@link UnlockKeyStatus}
         */
        public static final int UNLOCK_KEY_STATUS = 11;
        /**
         * Property that represents the available source power level in the cradle.
         * This property is read-only.
         * Type: {@link AvailableSourcePower}
         */
        public static final int AVAILABLE_SOURCE_POWER_LEVEL = 12;
        /**
         * Property that represents the fast charge status when device is charged by cradle
         * Fast charge status depends by {@link Properties#FAST_CHARGE_DISABLE} and
         * {@link Properties#DAISY_CHAIN_CONNECTED}.
         * This property is read-only.
         * Type: {@link Boolean}
         */
        public static final int FAST_CHARGE_STATUS = 13;
        /**
         * Property that represents if the cradle is connected in daisy chain.
         * This affects {@link Properties#FAST_CHARGE_STATUS}.
         * This property is read-only.
         * Type: {@link Boolean}
         */
        public static final int DAISY_CHAIN_CONNECTED = 14;
        /**
         * Property that represents the failures currently active in the cradle.
         * This property is read-only.
         * Type: List<{@link Failure}>
         */
        public static final int ACTIVE_FAILURES = 15;
        /**
         * Property that represents the last failures occurred in the cradle.
         * Only the last occurence for each failure type is shown.
         * This property is read-only.
         * Type: List<{@link FailureOccurrence}>
         */
        public static final int LAST_OCCURRED_FAILURES = 16;
        /**
         * Property that represents the number of occurrence for a certain failure.
         * This property is read-only.
         * Type: Map<{@link Failure}, Integer>
         */
        public static final int FAILURE_COUNTERS = 17;
        /**
         * Property that represents the enabled cradle failures.
         * The cradle signals these failures using its LED indicators.
         * This property is read and write.
         * Type: List<{@link Failure}>
         */
        public static final int ENABLED_FAILURES = 18;
        /**
         * Property that represents the number of times device has been inserted in the current slot.
         * This property is read-only.
         * Type: {@link Integer}
         */
        public static final int INSERTIONS_COUNT = 19;
        /**
         * Property that represents the timeout after which the cradle locks the device following an unlock.
         * Timeout is in seconds.
         * Range: [5, 420].
         * This property is read and write.
         * Type: {@link Integer}
         */
        public static final int RELOCK_TIMEOUT = 20;
        /**
         * Property that represents whether fast charge is disabled or not.
         * This affects {@link Properties#FAST_CHARGE_STATUS}.
         * This property is read and write.
         * Type: {@link Boolean}
         */
        public static final int FAST_CHARGE_DISABLE = 21;
        /**
         * Property that represents if cradle led is enabled when cradle is unlocking the device.
         * This property is read and write.
         * Type: {@link Boolean}
         */
        public static final int LED_ON_UNLOCK = 22;
        /**
         * Property that represents the smoothness level of the LED transitions in the cradle.
         * The smoothness level determines how gradual or abrupt the LED changes appear.
         * This property is read and write.
         * Type: {@link Integer}
         */
        public static final int LED_SMOOTHNESS = 23;
        /**
         * Property that represents the slot id of the cradle. 
         * This property is used to identify arbitrarily the slot in which the device is inserted.
         * Instead of {@link Properties#SLOT_INDEX} slot ID could be assigned arbitrarily.
         * This property is read and write.
         * Type: {@link Integer}
         */
        public static final int SLOT_ID = 24;
        /**
         * Represents a customizable area of cradle memory that can be read and written by the user.
         * The custom area is structured as a key-value map, where keys are integers and values are objects:
         * <ul>
         *  <li> Keys start from {@link Properties#CUSTOM_AREA_BASE} and increment sequentially for each new key. </li>
         *  <li> Values can be any primitive type or a class implementing {@link java.io.Serializable}. </li>
         * </ul>
         * <p>
         * In case of custom class, to ensure clean serialization and avoid hidden dependencies, always define the serializable 
         * class as top-level (external) classes in its own files.
         * <p>
         * Example Usage:
         * <pre>
         * DLCradleManager dlCradleManager = new DLCradleManager();
         *
         * // Set properties:
         * dlCradleManager.setProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE, "foo"); // Set a string
         * dlCradleManager.setProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE + 1, 10); // Set an integer
         * dlCradleManager.setProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE + 2, true); // Set a boolean
         * dlCradleManager.setProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE + 3, new int[]{10, 20, 30}); // Set an array
         * dlCradleManager.setProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE + 4, new CustomClass(100, true, "foo")); // Set a custom class
         *
         * // Get properties:
         * String stringValue = dlCradleManager.getProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE, null);
         * int integerValue = dlCradleManager.getProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE + 1, null);
         * boolean booleanValue = dlCradleManager.getProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE + 2, null);
         * int[] arrayValue = dlCradleManager.getProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE + 3, null);
         * CustomClass customValue = dlCradleManager.getProperty(DLCradleManager.Properties.CUSTOM_AREA_BASE + 4, null);
         *
         * // Example of a custom class:
         * public class CustomClass implements Serializable {
         *     private int a;
         *     private boolean b;
         *     private String c;
         *
         *     public CustomClass(int a, boolean b, String c) {
         *         this.a = a;
         *         this.b = b;
         *         this.c = c;
         *     }
         *
         *     public String toString() {
         *         return String.format("CustomClass{a=%d, b=%b, c='%s'}", a, b, c);
         *     }
         * }
         * </pre>
         * <p>
         * This property is read and write.
         * Type: {@link Object}
         */
        public static final int CUSTOM_AREA_BASE = 1000;
    }
}
