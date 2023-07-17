package com.datalogic.decode.configuration;

/**
 * The <code>InputType</code> is an enumeration defining the input device to use
 * for capturing frames.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>SCANENGINE</td>
 * <td>Scan Engine</td>
 * </tr>
 * <tr>
 * <td>CAMERA_REAR</td>
 * <td>Rear Camera</td>
 * </tr>
 * <tr>
 * <td>CAMERA_FRONT</td>
 * <td>Front Camera</td>
 * </tr>
 * </table>
 */
public enum InputType {
    /**
     * Scan Engine.
     */
    SCANENGINE,
    /**
     * Rear Camera.
     */
    CAMERA_REAR,
    /**
     * Front Camera.
     */
    CAMERA_FRONT;
}
