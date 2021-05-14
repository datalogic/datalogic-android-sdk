package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>QRCode</code> is the class that configures the QR Code Symbology.
 * 
 */
public class QRCode extends SymbologyLengths {

    /**
     * <code>characterSetMode</code> controls the character set in use for the decoded label.
     */
    public EnumProperty<CharacterSetMode> characterSetMode;

    /**
     * <code>wifiEnable</code> controls if the QR code Wi-Fi configuration format is enabled.
     */
    public BooleanProperty wifiEnable;

    /**
     * This is the constructor of QRCode. All symbology options are initialized
     * by editor.
     *
     * @param editor A {@link PropertyGetter} used to load the current barcode family.
     */
    public QRCode(PropertyGetter editor) {
    }
}
