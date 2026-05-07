package com.datalogic.decode.configuration;

import com.datalogic.decode.BarcodeManager;
import com.datalogic.device.configuration.*;

/**
 * <code>ScanningPreview</code> is the class that allows to configure a preview source to
 * be activated in several different conditions:
 * <ul>
 *     <li>While decoding.</li>
 *     <li>Using an SDK method to start or stop the preview.</li>
 *     <li>Using an intent to start or stop the preview.</li>
 *     <li>Using the proximity sensor (if available) by specifying the range (in mm) in which
 *     the preview will be active.</li>
 * </ul>
 */
public class ScanningPreview extends PropertyGroup {
	/**
	 * <code>source</code> represents the source of the preview (where the frames come from).
	 */
	public EnumProperty<ScanningPreviewSource> source;

	/**
	 * <code>hideDelay</code> represents the amount of time (in ms) the preview will be shown after
	 * a barcode has been successfully decoded.
	 */
	public NumericProperty hideDelay;

	/**
	 * <code>activationByDecoding</code> represents if the preview will be turned on during decoding.
	 */
	public BooleanProperty activationByDecoding;

	/**
	 * <code>activationBySdk</code> represents if the preview will be turned on using the specific SDK methods
	 * ({@link BarcodeManager#startScanningPreview()} and {@link BarcodeManager#stopScanningPreview()}).
	 */
	public BooleanProperty activationBySdk;

	/**
	 * <code>activationByIntent</code> represents if the preview will be turned on using the specific intent actions
	 * in a broadcast intent ({@link BarcodeManager#ACTION_START_SCANNING_PREVIEW} and
	 * {@link BarcodeManager#ACTION_STOP_SCANNING_PREVIEW}).
	 */
	public BooleanProperty activationByIntent;

	/**
	 * <code>activationByProximity</code> represents if the preview will be turned on using a ToF range.
	 */
	public BooleanProperty activationByProximity;

	/**
	 * <code>activationByProximityLowThreshold</code> represents the low threshold of the ToF range (in mm) when the preview
	 * can be turned on by the ToF.
	 */
	public NumericProperty activationByProximityLowThreshold;

	/**
	 * <code>activationByProximityHighThreshold</code> represents the high threshold of the ToF range (in mm) when the preview
	 * can be turned on by the ToF.
	 */
	public NumericProperty activationByProximityHighThreshold;

	/**
	 * <code>displayMode</code> indicates the display mode in which to show the scanning preview.
	 */
	public EnumProperty<ScanningPreviewDisplayMode> displayMode;

	/**
	 * <code>displayModeManualPortraitX</code> indicates the X coordinate of the preview shown
	 * in case of manual display mode for the scanning preview, when the
	 * device is positioned in portrait.
	 */
	public NumericProperty displayModeManualPortraitX;

	/**
	 * <code>displayModeManualPortraitY</code> indicates the Y coordinate of the preview shown
	 * in case of manual display mode for the scanning preview, when the
	 * device is positioned in portrait.
	 */
	public NumericProperty displayModeManualPortraitY;

	/**
	 * <code>displayModeManualPortraitWidth</code> indicates the width of the preview shown
	 * in case of manual display mode for the scanning preview, when the
	 * device is positioned in portrait. The camera frames will retain their
	 * original aspect ratio but they will resize in order to fit inside the
	 * preview box specified by the width and height parameters.
	 */
	public NumericProperty displayModeManualPortraitWidth;

	/**
	 * <code>displayModeManualPortraitHeight</code> indicates the height of the preview shown
	 * in case of manual display mode for the scanning preview, when the
	 * device is positioned in portrait. The camera frames will retain their
	 * original aspect ratio but they will resize in order to fit inside the
	 * preview box specified by the width and height parameters.
	 */
	public NumericProperty displayModeManualPortraitHeight;

	/**
	 * <code>displayModeManualLandscapeX</code> indicates the X coordinate of the preview shown
	 * in case of manual display mode for the scanning preview, when the
	 * device is positioned in landscape.
	 */
	public NumericProperty displayModeManualLandscapeX;

	/**
	 * <code>displayModeManualLandscapeY</code> indicates the X coordinate of the preview shown
	 * in case of manual display mode for the scanning preview, when the
	 * device is positioned in landscape.
	 */
	public NumericProperty displayModeManualLandscapeY;

	/**
	 * <code>displayModeManualLandscapeWidth</code> indicates the width of the preview shown
	 * in case of manual display mode for the scanning preview, when the
	 * device is positioned in landscape. The camera frames will retain their
	 * original aspect ratio but they will resize in order to fit inside the
	 * preview box specified by the width and height parameters.
	 */
	public NumericProperty displayModeManualLandscapeWidth;

	/**
	 * <code>displayModeManualLandscapeHeight</code> indicates the height of the preview shown
	 * in case of manual display mode for the scanning preview, when the
	 * device is positioned in landscape. The camera frames will retain their
	 * original aspect ratio but they will resize in order to fit inside the
	 * preview box specified by the width and height parameters.
	 */
	public NumericProperty displayModeManualLandscapeHeight;

	/**
	 * <code>illuminationSource</code> indicates the illumination source used in the scanning preview.
	 * The source selected will be turned on only when the scanning preview is activated during decoding and
	 * only if the ILLUMINATION_ENABLE parameter is enabled.
	 */
	public EnumProperty<ScanningPreviewIlluminationSource> illuminationSource;

	/**
	 * This is the constructor of ScanningPreview. All options are initialized by
	 * editor.
	 *
	 * @param editor A {@link PropertyGetter} used to load the current configuration.
	 */
	public ScanningPreview(PropertyGetter editor) {
		
	}

}
