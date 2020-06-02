package com.datalogic.decode;

import com.datalogic.decode.configuration.FrameCaptureMode;
import com.datalogic.decode.configuration.FrameCaptureFormat;

/**
 *       <code>SaveFrame</code> is a data structure passed by
 *       <code>FrameSaveListener.onFrameSave</code> to retrieve frame
 *       data from the decoder.
 */
public class SavedFrame {
    /**
     * @hide
     */
    public SavedFrame() {

    }
    /**
     * Returns the path where the frame is saved
     */
    public String getPath() {
        return null;
    }

    /**
     * Returns the timestamp of when the frame was captured
     */
    public long getTimestamp() {
        return 0;
    }

    /**
     * Returns the width of the frame
     */
    public int getWidth() {
        return 0;
    }

    /**
     * Returns the height of the frame
     */
    public int getHeight() {
        return 0;
    }

    /**
     * Returns the format of the frame as {@link FrameCaptureFormat}
     */
    public FrameCaptureFormat getFormat() {
        return null;
    }

    /**
     * Returns the capture mode of the frame as {@link FrameCaptureMode}
     */
    public FrameCaptureMode getMode() {
        return null;
    }

}