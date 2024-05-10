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
     * <code>qrMirror</code> controls the mirror mode.
     */
    public EnumProperty<QRMirror> qrMirror;

    /**
     * <code>absoluteGrid</code> enables or disables Absolute Grid algorithm. It performs 
     * a geometric reconstruction of the QR Code grid by regularizing it. This algorithm is executed
     * only when the standard one fails. It may slow down decoding rate.
     */
    public BooleanProperty absoluteGrid;

    /**
     * <code>gs1_qrcode</code> enables or disables the GS1-DIGITAL_LINK-QRCODE symbology.
     */
    public BooleanProperty gs1_dl_qrcode;

    /**
     * This is the constructor of QRCode. All symbology options are initialized
     * by editor.
     *
     * @param editor A {@link PropertyGetter} used to load the current barcode family.
     */
    public QRCode(PropertyGetter editor) {
    }
}
