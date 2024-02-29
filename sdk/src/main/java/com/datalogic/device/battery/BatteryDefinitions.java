package com.datalogic.device.battery;
import com.datalogic.device.Intents;

public class BatteryDefinitions {
	 
    /**
     * Unknown battery swap event,
     * constant int value for extra {@link Intents#EXTRA_BATTERY_EVENT_ID}
     * */
	public static final int BATTERY_SWAP_EVENT_UNKNOWN = 1;

    /**
     * Battery swap start event,
     * constant int value for extra {@link Intents#EXTRA_BATTERY_EVENT_ID}
     * */

    public static final int BATTERY_SWAP_EVENT_BEGIN = 2;
    /**
     * Battery swap end event,
     * constant int value for extra {@link Intents#EXTRA_BATTERY_EVENT_ID}
     * */
	public static final int BATTERY_SWAP_EVENT_END = 3; 
	
   
	public static String toString(int id) {
		return null;
    }
}

