package com.datalogic.device.configuration;
import java.util.ArrayList;
import java.util.List;

/**
 * <code>DatalogicScreensaver</code> implements the BlobProperty that allows to manage Screensaver configuration if `Datalogic Screensaver` app 
 * is used to show screensaver on the device.
 */
public class DatalogicScreensaver extends SerializableBlob {
    /**
     * Minimum value for {@link ScreensaverAnimation} duration in seconds.
     */
    public static final int DURATION_MIN_S = 0;
    /**
     * Maximum value for {@link ScreensaverAnimation} duration in seconds.
     */
    public static final int DURATION_MAX_S = 3600;
    /**
     * Default value for {@link ScreensaverAnimation} background.
     */
    public static final String DEFAULT_BACKGROUND_COLOR = "#00000000";

    /**
     * Constructor
     */
    public DatalogicScreensaver() {}

    /**
     * Constructor
     *
     * @param screensaver
     *            <code>List</code>
     */
    public DatalogicScreensaver(List<ScreensaverItem> screensaver) {}

    /**
     * Retrieve the list of screensavers.
     *
     * @return List </code>.
     */
    public List<ScreensaverItem> getScreensaverItems() {
        return null;
    }

    /**
     * Finds the index of a screensaver in the list.
     * @param item the screensaver to find
     */
    public int indexOf(ScreensaverItem item) {
        return 0;
    }

    /**
     * Add a list of screensavers to screensavers list
     *
     * @param items list of the screensaver to add
     */
    public void add(List<ScreensaverItem> items) {
        return;
    }

    /**
     * Add a screensaver to screensavers list
     * @param item screensaver to add
     */
    public void add(ScreensaverItem item) {
        return;
    }

    /**
     * Add a screensaver to screensavers list at a specific index.
     * @param index index where the item will be inserted
     * @param item screensaver to add
     */
    public void add(int index, ScreensaverItem item) {
        return;
    }

    /**
     * Remove a screensaver from screensavers list.
     *
     * @param item the screensaver to remove
     * @return <code>boolean</code>
     */
    public boolean remove(ScreensaverItem item) {        
        return false;
    }

    /**
     * Moves a screensaver item to a specified position in the list.
     * If the specified position is out of bounds, it will be adjusted to the nearest valid index
     * (0 if below the lower bound, or the last index if above the upper bound).
     *
     * @param item the screensaver item to move
     * @param position the target position for the item
     * @return <code>true</code> if the move was successful; <code>false</code> if the item was not found in the list
     */
    public boolean move(ScreensaverItem item, int position) {       
        return false;
    }

    /**
     * Clear screensavers list
     */
    public void clear() {}


    /**
     * Builder class for constructing instances of {@link DatalogicScreensaver}.
     * This class provides methods to add screensaver items and build a {@link DatalogicScreensaver} object.
     */
    public static class Builder {

        private final List<ScreensaverItem> screensaverItems = new ArrayList<>();

        /**
         * Adds a {@link ScreensaverItem} to the list of screensavers.
         *
         * @param items The {@link ScreensaverItem} to add. Type: <code>ScreensaverItem</code>
         * @return The current Builder instance for chaining. Type: <code>Builder</code>
         */
        public Builder addScreensaverItem(ScreensaverItem items) {
            screensaverItems.add(items);
            return this;
        }

        /**
         * Builds and returns a new {@link DatalogicScreensaver} instance with the configured screensaver items.
         *
         * @return A new {@link DatalogicScreensaver} instance. Type: <code>DatalogicScreensaver</code>
         */
        public DatalogicScreensaver build() {
            return new DatalogicScreensaver(screensaverItems);
        }
    }

}
