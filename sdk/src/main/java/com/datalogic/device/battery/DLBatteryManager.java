package com.datalogic.device.battery;

import android.content.Context;
import java.util.List;

import com.datalogic.device.DeviceException;
import com.datalogic.device.battery.BatteryEventListener;
import com.datalogic.device.ErrorManager;

/**
 * The <code>DLBatteryManager</code> allows to read specific battery parameters.
 * Lifetime and realtime values can be read through the {@link BatteryStatus} and manufacturer information can be read through the {@link ManufacturerInfo}. This class is also used to retrieve information and setup the current charging profile between the ones available, through the {@link ChargingProfile}.
 */
public final class DLBatteryManager
{
    /**
     * @hide
     * This is the constructor of DLBatteryManager.
     * 
     * @throws DeviceException in case of error.
     */
    private DLBatteryManager() {}

    /**
     * Returns an instance of the {@link DLBatteryManager}.
     *
     * @return
     *         The Battery Manager.
     */
    public static DLBatteryManager getInstance()
    {
        return null;
    }

    /**
     * Prepare the DlBatteryManager to receive events from the Android PowerManger Service. <br>
     * If not called the {@link #addBatteryEventListener} fails with error {@link BatteryException#CONTEXT_UNKNOWN}.
     *
     * @param context
     *         The context of the caller.
     */
    public void initBatteryEvents(Context context) {}

    /**
     * Reads the battery manufacturer info.
     *
     * @return
     *         A {@link com.datalogic.device.battery.ManufacturerInfo}
     *         object containing all battery manufacturer info.
     */
    public ManufacturerInfo getManufacturerInfo()
    {
        return null;
    }
    
    /**
     * Reads the battery status.
     *
     * @return
     *         A {@link com.datalogic.device.battery.BatteryStatus}
     *         object containing all battery status.
     */
    public BatteryStatus getBatteryStatus()
    {
        return null;
    }
    
    /**
     * Gets the supported charging profiles in this device. You can use one
     * of the returning objects to setup the desired charging profile.
     *
     * @return
     *         A list of {@link com.datalogic.device.battery.ChargingProfile}
     *         objects, each representing one of the supported charging profile.
     *         The list can be empty in case no charging profile is supported in the
     *         current device.
     */
    public List<ChargingProfile> getSupportedChargingProfiles()
    {
        return null;
    }
        
    /**
     * Sets the current charging profile. This setting is persistent to
     * device reboots or even factory resets.
     *
     * @param chargingProfile
     *         The {@link com.datalogic.device.battery.ChargingProfile}
     *         to set.
     */
    public void setCurrentChargingProfile(ChargingProfile chargingProfile)
    {
    }
    
    /**
     * Gets the current charging profile setup in this device.
     *
     * @return
     *         The {@link com.datalogic.device.battery.ChargingProfile}
     *         currently setup in this device.
     */
    public ChargingProfile getCurrentChargingProfile()
    {
        return null;
    }

    /**
     * Reads the integer value of a specific battery property. This value is present
     * as one of the properties of the {@link BatteryInfo}. Call this method only with
     * {@link BatteryInfo} related to properties of type <code>int</code>. For
     * properties of type <code>String</code>, use getStringProperty() instead.
     *
     * @param prop
     *         The required {@link BatteryInfo}.
     *
     * @return <code>int</code>
     *         The value of the specified property, or throws an
     *         <code>Exception</code> in case of failure.
     */
    public int getIntProperty(BatteryInfo prop)
    {
        return 0;
    }

    /**
     * Reads the String value of a specific battery property. This value is present
     * as one of the properties of the {@link BatteryInfo}. Call this method only with
     * {@link BatteryInfo} related to properties of type <code>String</code>. For
     * properties of type <code>int</code>, call getIntProperty() instead.
     *
     * @param prop
     *         The required {@link BatteryInfo}.
     *
     * @return <code>String</code>
     *         The value of the specified property, or throws an
     *         <code>Exception</code> in case of failure.
     */
    public String getStringProperty(BatteryInfo prop)
    {
        return null;
    }

    /**
    * Registers a {@link BatteryEventListener} to be notified of the BatteryManager events. <br>
    * A call to addBatteryEventListener will fail with error {@link BatteryException#CONTEXT_UNKNOWN}
    * if {@link #initBatteryEvents} has not been not previously called to register the client's context. <br>
    * Call {@link #removeBatteryEventListener} before the application
    * closes to properly shut down the listener and avoid memory leaks.
    * 
    * @param listener
    *            The {@link BatteryEventListener} that will be called to signal a {@link BatteryEvent}
    * @return <code>int</code> {@link BatteryException#SUCCESS} in case of success,
    * otherwise a possible error code, matching one of the {@link BatteryException} error constants.
    * @throws
    *            BatteryException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
    */
    public int addBatteryEventListener(BatteryEventListener listener) {
        return 0;
    }

    /**
     * Unregisters a {@link BatteryEventListener} associated with the BatteryManager.
     * 
     * @param listener
     *            The {@link BatteryEventListener} that will be no more notified.
     * @return <code>int</code> {@link BatteryException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link BatteryException} error constants.
     * @throws
     *            BatteryException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int removeBatteryEventListener(BatteryEventListener listener) {
        return 0;
    }
}
