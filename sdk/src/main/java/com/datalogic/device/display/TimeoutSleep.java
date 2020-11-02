package com.datalogic.device.display;

/**
 * The <code>TimeoutSleep</code> enumeration defines the possible value for 2nd display sleep timeout.
 */
public enum TimeoutSleep {
    SLEEP_15_SEC(15000),
    SLEEP_30_SEC(30000),
    SLEEP_1_MIN(60000),
    SLEEP_2_MIN(120000),
    SLEEP_3_MIN(180000),
    SLEEP_4_MIN(240000),
    SLEEP_5_MIN(300000),
    SLEEP_10_MIN(600000),
    SLEEP_15_MIN(900000),
    SLEEP_20_MIN(1200000),
    SLEEP_30_MIN(1800000),
    NEVER_SLEEP(2147483647);

    /**
     * @hide
     * */
    private final int code;
    /**
     * @hide
     */
    private static TimeoutSleep[] allValues = values();

    /**
     * @hide
     * */
    private TimeoutSleep(int code){
        this.code=code;
    }

    /**
     * Converts a TimeoutSleep to its integer corresponding value.
     * 
     * @return int
     * */
    public int toInt(){
        return this.code;
    }

    /**
     * Retrieves the corresponding TimeoutSleep value, from a valid integer.
     * 
     * @param n
     *            <code>int</code>
     * @return TimeoutSleep the corresponding one. Returns NEVER_SLEEP when the input is not included in the enum set.
     * */
    public static TimeoutSleep fromInt(int n){
        for(int i = 0; i < allValues.length; i++) {
            if (allValues[i].code == n)
                return allValues[i];
        }
        return NEVER_SLEEP;
    }
}
