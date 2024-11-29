package com.datalogic.decode.configuration;

/**
 * The <code>SnapOcrFirstSelectionMode</code> is an enumeration defining the first
 * selection mode for the Snap OCR.
 *
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>ALWAYS_SELECT</td>
 * <td>
 * Always asks the user to select the text.
 * </td>
 * </tr>
 * <tr>
 * <td>ROI_PROPOSE</td>
 * <td>
 * Proposes all the text found in defined ROIs.
 * </td>
 * </tr>
 * <tr>
 * <td>PICKLIST_PROPOSE</td>
 * <td>
 * Searches for the closest bounding box result near the center of the image.
 * Result is proposed and require user confirmation.
 * </td>
 * </tr>
 * <tr>
 * <td>ROI_SEND</td>
 * <td>
 * Automatically sends all the text found in defined ROIs.
 * </td>
 * </tr>
 * <tr>
 * <td>PICKLIST_SEND</td>
 * <td>
 * Searches for the closest bounding box result near the center of the image.
 * Result automatically is sent.
 * </td>
 * </tr>
 * </table>
 */
public enum SnapOcrFirstSelectionMode {
    /**
     * Always asks the user to select the text.
     */
    ALWAYS_SELECT,

    /**
     * Proposes all the text found in defined ROIs.
     */
    ROI_PROPOSE,

    /**
     * Searches for the closest bounding box result near the center of the image.
     * Result is proposed and require user confirmation.
     */
    PICKLIST_PROPOSE,

    /**
     * Automatically sends all the text found in defined ROIs.
     */
    ROI_SEND,

    /**
     * Searches for the closest bounding box result near the center of the image.
     * Result automatically is sent.
     */
    PICKLIST_SEND;
}
