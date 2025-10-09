package com.datalogic.cradle;

/**
 * This class provides information about the failure type and the date and time of occurrence for failures
 * occurred in the Cradle.
 */
public class FailureOccurrence {
    /**
     * @hide
     *
     * Constructor
     */
    public FailureOccurrence(Failure failureType, Time appereanceTime, Time disappereanceTime) {
    }

    /**
     * Retrieve the failure type.
     *
     * @return <code>{@link Failure}</code>
     *         The failure type.
     */
    public Failure getFailureType() {
        return null;
    }

    /**
     * Retrieve the time when the failure has been raised by the Cradle.
     *
     * @return <code>{@link Time}</code>
     *         Date and time information related to the raised failure.
     */
    public Time getAppereanceTime() {
        return null;
    }

    /**
     * Retrieve the time when the failure has been solved by the Cradle.
     *
     * @return <code>{@link Time}</code>
     *         Date and time information related to the raised failure.
     */
    public Time getDisappereanceTime() {
        return null;
    }

}