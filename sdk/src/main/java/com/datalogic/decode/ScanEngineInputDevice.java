package com.datalogic.decode;

/**
 * Input device representing the Scan Engine. If this is set as the
 * current input device in the BarcodeManager, the frames will be
 * captured from the Scan Engine.
 */
public class ScanEngineInputDevice implements InputDevice {
    @Override
    public Type getType() {
        return Type.SCANENGINE;
    }

    @Override
    public String getName() { return "ScanEngine"; }
}
