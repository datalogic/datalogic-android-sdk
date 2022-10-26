package com.datalogic.device.configuration;

/**
* The <code>LoggerBufferSize</code> enumeration defines the possible Logger buffer sizes.
*/
public enum LoggerBufferSize {
    /**
     * Off.
     */
    LOGGER_BUFFER_SIZE_OFF(32768),
    /**
     * 64K bytes.
     */
    LOGGER_BUFFER_SIZE_64K(65536),
    /**
     * 256K bytes.
     */
    LOGGER_BUFFER_SIZE_256K(262144),
    /**
     * 1M bytes.
     */
    LOGGER_BUFFER_SIZE_1M(1048576),
    /**
     * 4M bytes.
     */
    LOGGER_BUFFER_SIZE_4M(4194304),
    /**
     * 16M bytes.
     */
    LOGGER_BUFFER_SIZE_16M(16777216);
    /**
     * @hide
     */
    private final int value;

    private static LoggerBufferSize[] allValues = values();

    /**
     * @hide
     */
    private LoggerBufferSize(int type_number) {
        this.value = type_number;
    }

    /**
     * Converts the WifiPowerSave to its integer corresponding value.
     *
     * @return int
     */
    public int toInt() {
        return value;
    }

    /**
     * Retrieves the corresponding WifiPowerSave value, from a valid integer.
     *
     * @param n
     *            <code>int</code>
     * @return WifiPowerSave the corresponding one.
     * */
    public static LoggerBufferSize fromInt(int n) {
        for (int i = 0; i < allValues.length; i++) {
            if (allValues[i].value == n)
                return allValues[i];
        }
        return LOGGER_BUFFER_SIZE_OFF;
    }

}
