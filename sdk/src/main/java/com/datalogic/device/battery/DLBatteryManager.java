package com.datalogic.device.battery;

import java.util.List;

import com.datalogic.device.DeviceException;

/**
 * The <code>DLBatteryManager</code> allows to read specific battery parameters.
 * Lifetime and realtime values can be read through the {@link BatteryStatus} and manufacturer information can be read through the {@link ManufacturerInfo}. This class is also used to retrieve information and setup the current charging profile between the ones available, through the {@link ChargingProfile}.
 */
public final class DLBatteryManager
{
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
     * properties of type <code>int</code>, call getStringProperty() instead.
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
}
