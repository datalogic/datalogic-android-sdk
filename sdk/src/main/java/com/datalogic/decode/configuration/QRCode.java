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
     * <code>wifiEnable</code> enables Wi-Fi configuration through Wi-Fi QR Code.
     */
    public BooleanProperty wifiEnable;

   /**
    * <code>gs1_qrcode</code> enables or disables the GS1-QR Code symbology.
    */
    public BooleanProperty gs1_qrcode;

    /**
     * <code>s2dEnable</code> enables device configuration through Scan2Deploy QR Codes.
     */
    public BooleanProperty s2dEnable;

    /**
     * This is the QRCode constructor. All symbology options are initialized
     * by editor.
     *
     * @param editor A {@link PropertyGetter} used to load the current barcode family.
     */
    public QRCode(PropertyGetter editor) {
    }
}
