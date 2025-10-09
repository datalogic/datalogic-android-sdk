package com.datalogic.cradle;

/**
 * This class contains informations about RTC (Real Time Clock) date and time of the Cradle.
 * This class is also used by {@link FailureOccurrence} in order to retrive information about when a failure appeared and disappeared 
 * */
public class Time {
    /**
     * @hide
     * Time Constructor
     */
    public Time() {

    }

    /**
     * Retrieves the hour of the Cradle Time.
     *
     * @return <code>int</code>
     *         The hour of the Cradle Time.
     */
    public int getHour() {
        return 0;
    }

    /**
     * Retrieves the minutes of the Cradle Time.
     *
     * @return <code>int</code>
     *         The minutes of the Cradle Time.
     */
    public int getMinutes() {
        return 0;
    }

    /**
     * Retrieves the day of the Cradle Time.
     *
     * @return <code>int</code>
     *         The day of the Cradle Time.
     */
    public int getDay() {
        return 0;
    }

    /**
     * Retrieves the month of the Cradle Time.
     *
     * @return <code>int</code>
     *         The month of the Cradle Time.
     */
    public int getMonth() {
        return 0;
    }

    /**
     * Retrieves the year of the Cradle Time.
     *
     * @return <code>int</code>
     *         The year of the Cradle Time.
     */
    public int getYear() {
        return 0;
    }

    /**
     * Retrieve the Date and Time information as
     * String in the format hh:mm dd/mm/yyyy.
     *
     * @return <code>String</code>
     *         The String representing the date and time.
     */
    @Override
    public String toString() {
        return null;
    }
}
