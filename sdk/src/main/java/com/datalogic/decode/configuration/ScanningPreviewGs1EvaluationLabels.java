package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

import java.util.List;

/**
 * Class defining the labels checked in the content of the barcode decoded from the scanning preview,
 * when GS1 evaluation is enabled.
 */
public class ScanningPreviewGs1EvaluationLabels extends SerializableBlob  {
    /**
     * A single label of the list.
     */
    public static class Label {
        /**
         * Default constructor.
         *
         * @param name Name shown in the UI for this label.
         * @param applicationIdentifier Application identifier of this label.
         *                              It can be kept as null or as an empty
         *                              string if it doesn't exist.
         * @param remoteIdentifier Used to univocally identify the item
         *                         when querying the remote server.
         *                         It can be kept as null or as an empty
         *                         string if it doesn't exist.
         * @param priority The priority in which to show this label
         *                 in the UI.
         * @throws IllegalArgumentException in case the name is null or an empty string or
         *                                  if the priority is a negative number..
         */
        public Label(String name, String applicationIdentifier,
                            String remoteIdentifier, int priority) {
            
        }

        /**
         * Gets the name of this label.
         * @return Name shown in the UI for this label.
         */
        public String getName() {
            return null;
        }

        /**
         * Sets the name of this label.
         * @param name Name shown in the UI for this label.
         * @throws IllegalArgumentException if the name is null or an empty string.
         */
        public void setName(String name) {
            
        }

        /**
         * Gets the application identifier of this label.
         * @return Application identifier of this label.
         */
        public String getApplicationIdentifier() {
            return null;
        }

        /**
         * Sets the application identifier of this label.
         * @param applicationIdentifier Application identifier of this label.
         *                              It can be kept as null or as an empty
         *                              string if it doesn't exist.
         */
        public void setApplicationIdentifier(String applicationIdentifier) {
            
        }

        /**
         * Gets the identifier used to univocally identify the item
         * when querying the remote server.
         * @return The identifier used to univocally identify the item
         *         when querying the remote server.
         */
        public String getRemoteIdentifier() {
            return null;
        }

        /**
         * Sets the identifier used to univocally identify the item
         * when querying the remote server.
         * @param remoteIdentifier Used to univocally identify the item
         *                         when querying the remote server.
         *                         It can be kept as null or as an empty
         *                         string if it doesn't exist.
         */
        public void setRemoteIdentifier(String remoteIdentifier) {
            
        }

        /**
         * Gets the priority in which to show this label in the UI.
         * @return The priority in which to show this label in the UI.
         */
        public int getPriority() {
            return 0;
        }

        /**
         * Sets the priority in which to show this label in the UI.
         * @param priority The priority in which to show this label in the UI.
         * @throws IllegalArgumentException if the priority is a negative number.
         */
        public void setPriority(int priority) {
            
        }
    }

    /**
     * Get an unmodifiable list with the currently configured labels.
     * @return The list of labels.
     */
    public List<Label> getLabels() {
        return null;
    }

    /**
     * Add a label to the list. If a label with the same name already exists, it will be
     * replaced.
     *
     * @param label The label to add.
     * @throws IllegalArgumentException if the label is null or contains invalid values
     * (for example a priority value that is already found in the current labels).
     */
    public void add(Label label) {
        
    }

    /**
     * Remove a label from the list, whose name is the same as the one passed as parameter.
     *
     * @param labelName The name of the label to remove.
     * @throws IllegalArgumentException if the label name is null.
     */
    public void remove(String labelName) {
        
    }

    /**
     * Remove all label from the list.
     */
    public void clear() {
        
    }
}
