package com.datalogic.device.battery;

/**
 * The <code>BatteryStatus</code> provides information related to the battery lifetime and realtime values.
 */
public final class BatteryStatus
{
    /**
     * Returns the percentage of the state of health of the battery.
     *
     * @return <code>int</code>
     *         The percentage of the state of health of the battery.
     */
    public int getBatteryStateOfHealth()
    {
        return 0;
    }
    
    /**
     * Returns the value of the total amount of discharge current caused the charging cycles of the battery.
     *
     * @return <code>int</code>
     *         The total amount of discharge current in 0.1 Ah.
     */
    public int getTotalDischarge()
    {
        return 0;
    }
    
    /**
     * Returns the instantaneous value of the remaining available capacity of the battery.
     *
     * @return <code>int</code>
     *         The remaining available capacity of the battery in mAh.
     */
    public int getCapacityRemaining()
    {
        return 0;
    }

    /**
     * Returns last remembered value of charge in when battery became full/empty.
     *
     * @return <code>int</code>
     *         The last remembered value of charge in when battery became full/empty in mAh.
     */
    public int getCapacityFull()
    {
        return 0;
    }
      
    /**
     * Returns the value of the minimum temperature recorded by the battery.
     *
     * @return <code>int</code>
     *         The value of the minimum temperature recorded by the battery in 0.1 °C.
     */
    public int getTemperatureMin()
    {
        return 0;
    }
          
    /**
     * Returns the value of the maximum temperature recorded by the battery.
     *
     * @return <code>int</code>
     *         The value of the maximum temperature recorded by the battery in 0.1 °C.
     */
    public int getTemperatureMax()
    {
        return 0;
    }
              
    /**
     * Returns the value of the minimum voltage recorded by the battery.
     *
     * @return <code>int</code>
     *         The value of the minimum voltage recorded by the battery in mV.
     */
    public int getVoltageMin()
    {
        return 0;
    }
                  
    /**
     * Returns the value of the maximum voltage recorded by the battery.
     *
     * @return <code>int</code>
     *         The value of the maximum voltage recorded by the battery in mV.
     */
    public int getVoltageMax()
    {
        return 0;
    }
                      
    /**
     * Returns the value of the maximum current recorded by the battery.
     *
     * @return <code>int</code>
     *         The value of the maximum current recorded by the battery in mA.
     */
    public int getChargeCurrentMax()
    {
        return 0;
    }
                          
    /**
     * Returns the value of the maximum discharge current recorded by the battery.
     *
     * @return <code>int</code>
     *         The value of the maximum discharge current recorded by the battery in mA.
     */
    public int getDischargeCurrentMax()
    {
        return 0;
    }
                          
    /**
     * Returns the time left for battery to be considered empty.
     *
     * @return <code>int</code>
     *         The time left for battery to be considered empty in seconds.
     */
    public int getTimeToEmpty()
    {
        return 0;
    }

    /**
     * Returns the number of charge cycles.
     *
     * @return <code>int</code>
     *         The number of charge cycles.
     */
    public int getChargeCycles()
    {
        return 0;
    }
}
