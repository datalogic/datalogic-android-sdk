package com.datalogic.decode.configuration;

import com.datalogic.device.ErrorManager;
import com.datalogic.device.configuration.*;

/**
 * <code>ScannerProperties</code> is the scanner property container class.
 * 
 */
public class ScannerProperties extends PropertyGroup {

    /**
     * Provides configuration for decoding notifications.
     * {@see DecodingNotification}
     */
	public DecodingNotification dnotification;
    /**
     * Provides configuration for formatting functionalities.
     * {@see Formatting}
     */
	public Formatting format;
    /**
     * Provides configuration for good read notifications.
     * {@see GoodRead}
     */
	public GoodRead goodread;
    /**
     * Provides configuration related to scanner functionalities.
     * {@see ScannerOptions}
     */
	public ScannerOptions scannerOptions;
    /**
     * Provides configuration related to presentation mode functionalities.
     * {@see PresentationMode}
     */
	public PresentationMode presentationMode;
	/**
	 * Provides configuration related to Multi Scan functionalities.
	 * {@see MultiScan}
	 */	
	 public MultiScan multiScan;
    /**
     * Provides configuration for the Intent Wedge.
     * {@see IntentWedge}
     */
	public IntentWedge intentWedge;
    /**
     * Provides configuration for the Keyboard Wedge.
     * {@see KeyboardWedge}
     */
	public KeyboardWedge keyboardWedge;
    /**
     * Provides configuration for the display notification.
     * {@see DisplayNotification}
     */
	public DisplayNotification displayNotification;
    /**
     * Provides configuration for the Web wedge.
     * {@see WebWedge}
     */
    public WebWedge webWedge;

    /**
     * Controls the Code 39, Code 32 and Tri-Optic barcode reading capabilities.
     * {@see Code39}
     */
	public Code39 code39;
    /**
     * Controls the Code 128, GS1-128 and ISBT 128 barcode reading capabilities.
     * {@see Code128}
     */
	public Code128 code128;
    /**
     * Controls the EAN-8 barcode reading capabilities.
     * {@see Ean8}
     */
	public Ean8 ean8;
    /**
     * Controls the EAN-13 barcode reading capabilities.
     * {@see Ean13}
     */
	public Ean13 ean13;
    /**
     * Controls the UPC-A barcode reading capabilities.
     * {@see UpcA}
     */
	public UpcA upcA;
    /**
     * Controls the UPC-E barcode reading capabilities.
     * {@see UpcE}
     */
	public UpcE upcE;
    /**
     * Controls the UPC/EAN extensions reading capabilities.
     * {@see UpcEanExtensions}
     */
	public UpcEanExtensions upcEanExtensions;
    /**
     * Controls the Code 93 barcode reading capabilities.
     * {@see Code93}
     */
	public Code93 code93;
    /**
     * Controls the GS1 DataBar 14 barcode reading capabilities.
     * {@see Gs1DataBar_14}
     */
	public Gs1DataBar_14 gs1DataBar_14;
    /**
     * Controls the GS1 DataBar Expanded barcode reading capabilities.
     * {@see Gs1DataBar_Expanded}
     */
	public Gs1DataBar_Expanded gs1DataBar_Expanded;
    /**
     * Controls the GS1 DataBar Limited barcode reading capabilities.
     * {@see Gs1DataBar_Limited}
     */
	public Gs1DataBar_Limited gs1DataBar_Limited;
    /**
     * Controls the Interleaved 2 of 5 barcode reading capabilities.
     * {@see Interleaved25}
     */
	public Interleaved25 interleaved25;
    /**
     * Controls the Matrix 2 of 5 barcode reading capabilities.
     * {@see Matrix25}
     */
	public Matrix25 matrix25;
    /**
     * Controls the Discrete 2 of 5 barcode reading capabilities.
     * {@see Discrete25}
     */
	public Discrete25 discrete25;
    /**
     * Controls the Codabar barcode reading capabilities.
     * {@see Codabar}
     */
	public Codabar codabar;
    /**
     * Controls the MSI barcode reading capabilities.
     * {@see Msi}
     */
	public Msi msi;
    /**
     * Controls the admitted valid margins for linear barcodes.
     * {@see LinearQuietZones}
     */
	public LinearQuietZones linearQZ;

    /**
     * Controls the QR Code barcode reading capabilities.
     * {@see QRCode}
     */
	public QRCode qrCode;
    /**
     * Controls the Micro QR Code barcode reading capabilities.
     * {@see MicroQR}
     */
	public MicroQR microQr;
    /**
     * Controls the Aztec barcode reading capabilities.
     * {@see Aztec}
     */
	public Aztec aztec;
    /**
     * Controls the Data Matrix barcode reading capabilities.
     * {@see Datamatrix}
     */
	public Datamatrix datamatrix;
    /**
     * Controls the PDF417 barcode reading capabilities.
     * {@see Pdf417}
     */
	public Pdf417 pdf417;
    /**
     * Controls the Micro PDF417 barcode reading capabilities.
     * {@see Micropdf417}
     */
	public Micropdf417 micropdf417;
    /**
     * Controls the Maxicode barcode reading capabilities.
     * {@see Maxicode}
     */
	public Maxicode maxicode;
    /**
     * Controls the Australia Post barcode reading capabilities.
     * {@see PostalAustralian}
     */
	public PostalAustralian pAus;
    /**
     * Controls the Japan Post barcode reading capabilities.
     * {@see PostalJapan}
     */
	public PostalJapan pJap;
    /**
     * Controls the KIX barcode reading capabilities.
     * {@see PostalKix}
     */
	public PostalKix pKix;
    /**
     * Controls the Royal Mail barcode reading capabilities.
     * {@see PostalRoyalMail}
     */
	public PostalRoyalMail pRM;
    /**
     * Controls the US PLANET barcode reading capabilities.
     * {@see PostalUsPlanet}
     */
	public PostalUsPlanet pPlanet;
    /**
     * Controls the US POSTNET barcode reading capabilities.
     * {@see PostalUsPostnet}
     */
	public PostalUsPostnet pPostnet;
    /**
     * Controls the USPS 4-State barcode reading capabilities.
     * {@see PostalUsps4State}
     */
	public PostalUsps4State p4State;

    /**
     * Controls the Digimarc barcode &#8482; reading capabilities.
     * {@see Digimarc}
     */
	public Digimarc digimarc;

    /**
     * Controls the GS1 Composite barcode reading capabilities.
     * {@see Composite}
     */
    public Composite composite;

    /**
     * Controls the DotCode barcode reading capabilities.
     * {@see DotCode}
     */
    public DotCode dotcode;

    /**
     * Controls the reverse decoding mode for linear and 2D barcodes.
     * {@see Inverse}
     */
    public Inverse inverse;

    /**
     * Controls the frame capture feature.
     * {@see FrameCaptureConfiguration}
     */
    public FrameCaptureConfiguration frameCaptureConfiguration;

	/**
	 * Returns all the ScannerProperties initialized with the actual values.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode families and properties.
	 * @return A {@link ScannerProperties} instance.
	 */
	static public ScannerProperties edit(PropertyGetter editor) {
		return null;
	}

	/**
	 * Provides a way to store the properties through a PropertyEditor.
	 * 
	 * @param to
	 *            {@link PropertyEditor} an editor used to load the current barcode families and properties.
	 * @param persist
	 *            <code>boolean</code> if the property must be persistent or not across reboots.
	 * @return <code>int</code> {@link ConfigException#SUCCESS}vin case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	@Override
	public int store(PropertyEditor to, boolean persist) {
		return 0;
	}

	/**
	 * This is an empty constructor that will not be used. In the implementation a different one protected/private
	 * will be invoked. Leave it empty, do not implement. This avoids breaking code if the class is extended.
	 * @hide
	 */
	protected ScannerProperties(){}
}
