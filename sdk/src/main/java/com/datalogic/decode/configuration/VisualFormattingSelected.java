package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.SerializableBlob;

/**
 * Class defining the Visual Formatter item to be selected.
 */
public class VisualFormattingSelected extends SerializableBlob  {
    /**
     * Default constructor. The item name can be set to null or empty to deselect the current
     * visual formatting item. In case of multiple items with the same name, the project name
     * and id can be specified, otherwise the first item found will be selected.
     *
     * @param itemName The name of the item to select.
     * @param projectName The name of the project to select.
     * @param projectId The id of the project to select.
     */
    public VisualFormattingSelected(String itemName, String projectName, String projectId) {
        
    }

    /**
     * Gets the name of the item to select (null or empty to deselect the current item).
     * @return The item name.
     */
    public String getItemName() {
        return null;
    }

    /**
     * Sets the name of the item to select (null or empty to deselect the current item).
     * @param itemName The item name
     */
    public void setItemName(String itemName) {
        
    }

    /**
     * Gets the name of the project to select.
     * @return The project name.
     */
    public String getProjectName() {
        return null;
    }

    /**
     * Sets the name of the project to select.
     * @param projectName The project name.
     */
    public void setProjectName(String projectName) {
        
    }

    /**
     * Gets the id of the project to select.
     * @return The project id.
     */
    public String getProjectId() {
        return null;
    }

    /**
     * Sets the id of the project to select.
     * @param projectId The project id.
     */
    public void setProjectId(String projectId) {
        
    }
}
