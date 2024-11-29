package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;
import com.datalogic.decode.*;

/**
 * The <code>GoodRead</code> class configures various types of notifications that are triggered
 * upon a successful read. It includes options for enabling or disabling different notification methods,
 * such as LED indicators, vibration, and an overlay on the screen.
 * <p>
 * The class provides properties for customizing each type of notification, allowing developers to
 * fine-tune the user experience based on their specific requirements.
 * </p>
 * <p>
 * The <code>GoodRead</code> class also includes an advanced notification mechanism called the "Good Read Overlay".
 * This overlay appears on the screen upon a successful read and can be customized in terms of color, shape, size, 
 * and position. The overlay is adaptable to both portrait and landscape modes, allowing for flexible configuration 
 * based on the device's orientation.
 * The portrait and landscape properties are not mutually exclusive; both sets of properties 
 * should be configured. Depending on the device's orientation, the appropriate properties will be applied 
 * (portrait settings for portrait mode and landscape settings for landscape mode).
 * The class {@link GoodReadOverlayManager} provides methods to manage custom images to be used as
 * overlay.
 * </p>
 */

public class GoodRead extends PropertyGroup {

	/**
	 * <code>goodReadEnable</code> requires the use of the good read
	 * notification on a successful read.
	 */
	public BooleanProperty goodReadEnable;

	/**
	 * <code>greenSpotEnable</code> requires the use of the green spot
	 * notification on a successful read.
	 */
	public BooleanProperty greenSpotEnable;

	/**
	 * <code>goodReadVibrateEnable</code> requires the use of the vibrator
	 * notification on a successful read.
	 */
	public BooleanProperty goodReadVibrateEnable;

	/**
	 * <code>goodReadLedEnable</code> requires the use of the led notification
	 * on a successful read.
	 */
	public BooleanProperty goodReadLedEnable;

	/**
	 * <code>goodReadOverlayEnable</code> requires the use of an overlay as notification
	 * on a successful read.
	 */
	public BooleanProperty goodReadOverlayEnable;

	/**
	 * <code>goodReadOverlayColor</code> selects which color to use on the overlay as notification
	 * on a successful read. If the property <code>GOOD_READ_OVERLAY_SHAPE_POLICY</code> is set to <code>FULL_SCREEN</code>
	 * once a code is decoded, the full screen of the device is painted with the color selected otherwise
	 * the color is applied on the whole image selected excluding the trasparent areas and painted on top 
	 * of the screen. The color of the selected image has no effect, only its opacity. This property uses an ARGB format (32bit 8bpc).
	 */
	public NumericProperty goodReadOverlayColor;

	/**
	 * <code>goodReaderOverlayShapePolicy</code> selects which shape to use on the overlay as notification
	 * on a successful read.
	 */
	public EnumProperty<GoodReadOverlayShapePolicy> goodReadOverlayShapePolicy;

	/**
	 * <code>goodReadOverlayCustomShapeNameProfile</code> selects which custom shape to use on the
	 * overlay as notification on a successful read.
	 */
	public TextProperty goodReadOverlayCustomShapeNameProfile;

	/**
	 * <code>goodReadOverlayPortraitPositionPolicy</code> selects which position to use for the
	 * overlay  in portrait mode.
	 */
	public EnumProperty<GoodReadOverlayPositionPolicy> goodReadOverlayPortraitPositionPolicy;

	/**
	 * <code>goodReadOverlayPortraitCustomPositionX</code> selects which custom position for the
	 * starting X coordinate (starting from the left) to use for the overlay in portrait mode.
	 */
	public NumericProperty goodReadOverlayPortraitCustomPositionX;

	/**
	 * <code>goodReadOverlayPortraitCustomPositionY</code> selects which custom position for the
	 * starting Y coordinate (starting from the top) to use for the overlay in portrait mode.
	 */
	public NumericProperty goodReadOverlayPortraitCustomPositionY;

	/**
	 * <code>goodReadOverlayPortraitDisplayPolicy</code> selects how to display the
	 * overlay in portrait mode.
	 */
	public EnumProperty<GoodReadOverlayDisplayPolicy> goodReadOverlayPortraitDisplayPolicy;

	/**
	 * <code>goodReadOverlayPortraitCustomSizeMaxWidth</code> defines the max custom width for the
	 * overlay to use in portrait mode.
	 */
	public NumericProperty goodReadOverlayPortraitCustomSizeMaxWidth;

	/**
	 * <code>goodReadOverlayPortraitCustomSizeMaxHeight</code> defines the max custom height for the
	 * overlay to use in portrait mode.
	 */
	public NumericProperty goodReadOverlayPortraitCustomSizeMaxHeight;

	/**
	 * <code>goodReadOverlayLandscapePositionPolicy</code> selects which position to use for the
	 * overlay in landscape mode.
	 */
	public EnumProperty<GoodReadOverlayPositionPolicy> goodReadOverlayLandscapePositionPolicy;

	/**
	 * <code>goodReadOverlayLandscapeCustomPositionX</code> selects which custom position for the
	 * starting X coordinate (starting from the left) to use for the overlay in landscape mode.
	 */
	public NumericProperty goodReadOverlayLandscapeCustomPositionX;

	/**
	 * <code>goodReadOverlayLandscapeCustomPositionY</code> selects which custom position for the
	 * starting Y coordinate (starting from the top) to use for the overlay in landscape mode.
	 */
	public NumericProperty goodReadOverlayLandscapeCustomPositionY;

	/**
	 * <code>goodReadOverlayLandscapeDisplayPolicy</code> selects which node to use for the
	 * overlay in landscape mode.
	 */
	public EnumProperty<GoodReadOverlayDisplayPolicy> goodReadOverlayLandscapeDisplayPolicy;

	/**
	 * <code>goodReadOverlayLandscapeCustomSizeMaxWidth</code> selects which custom width for the
	 * overlay to use in landscape mode.
	 */
	public NumericProperty goodReadOverlayLandscapeCustomSizeMaxWidth;

	/**
	 * <code>goodReadOverlayLandscapeCustomSizeMaxHeight</code> selects which custom height for the
	 * overlay to use in landscape mode.
	 */
	public NumericProperty goodReadOverlayLandscapeCustomSizeMaxHeight;

	/**
	 * This is the constructor of GoodRead. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public GoodRead(PropertyGetter editor) {
	}

}
