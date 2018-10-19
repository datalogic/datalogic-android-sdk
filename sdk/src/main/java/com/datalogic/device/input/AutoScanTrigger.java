package com.datalogic.device.input;

import java.util.List;

/**
 * Interface representing a trigger that automatically executes a specific
 * action (scan by default) when entering a defined range.
 */
public interface AutoScanTrigger extends Trigger
{
    /**
     * Class representing a specific AutoScan range, constituted by
     * an id and a name.
     */
    public class Range
    {

        /**
         * Leave the constructor but limit its visibility to package.
         * Avoid calls on constructor!
         * @hide
         */
        Range(int id, String name) {}

        /**
         * Gets the range ID.
         * @return <code>int</code>
         *         The range ID.
         */
        public int getId()
        {
            return 0;
        }

        /**
         * Gets the range name.
         * @return <code>String</code>
         *         The range name.
         */
        public String getName()
        {
            return null;
        }
    }

    /**
     * Returns the list of supported ranges.
     * @return List of {@link Range} objects.
     */
    public List<Range> getSupportedRanges();

    /**
     * Sets the current range between the ones supported.
     * @param range
     *        The range to set.
     * @return <code>boolean</code>
     *         true if the range has been set successfully, false otherwise.
     */
    public boolean setCurrentRange(Range range);

    /**
     * Gets the currently set range between the ones supported.
     * @return
     *         The current range.
     */
    public Range getCurrentRange();
}
