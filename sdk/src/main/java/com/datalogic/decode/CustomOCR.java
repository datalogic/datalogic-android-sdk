package com.datalogic.decode;

import com.datalogic.decode.DecodeException;
import com.datalogic.device.ErrorManager;

/**
 * Class representing a custom OCR configuration installed in the device.
 */
public class CustomOCR {
    /**
     * @hide
     */
    CustomOCR() {
        
    }

    /**
     * Returns the name that uniquely identifies this custom OCR configuration.
     * @return The configuration name.
     */
    public String getName() {
        return null;
    }


    /**
     * Returns the description of this custom OCR configuration.
     * @return The configuration description.
     */
    public String getDescription() {
        return null;
    }

    /**
     * Checks if this custom OCR configuration is enabled.
     * @return True if the configuration is enabled, false otherwise.
     */
    public boolean isEnabled() {
        return false;
    }

    /**
     * Enables / disables this custom OCR configuration.
     * @param enabled True to enable the configuration, false to disable it.
     * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
     * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
     * @throws DecodeException in case the configuration could not be enabled / disabled,
     * when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int setEnabled(boolean enabled) {
        return 0;
    }
}
