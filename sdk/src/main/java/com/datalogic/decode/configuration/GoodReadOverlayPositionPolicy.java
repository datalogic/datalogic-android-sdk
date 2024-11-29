package com.datalogic.decode.configuration;

/**
 * The <code>GoodReadOverlayPositionPolicy</code> is an enumeration defining which position to use for the
 * Good Read Overlay
 */
public enum GoodReadOverlayPositionPolicy {
    /**
     * Use a custom position define by the <code>GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_POSITION_X</code>,
	 * <code>GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_POSITION_Y</code>, <code>GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_POSITION_X</code>
	 * and <code>GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_POSITION_Y</code> properties.
     */
	CUSTOM,
	/**
	 * Shows the overlay on the top left corner of the screen.
	 */
	TOP_LEFT,
	/**
	 * Shows the overlay on the top center of the screen.
	 */
	TOP_CENTER,
	/**
	 * Shows the overlay on the top right corner of the screen.
	 */
	TOP_RIGHT,
	/**
	 * Shows the overlay on the middle left of the screen.
	 */
	MIDDLE_LEFT,
	/**
	 * Shows the overlay on the center of the screen.
	 */
	MIDDLE_CENTER,
	/**
	 * Shows the overlay on the middle left of the screen.
	 */
	MIDDLE_RIGHT,
	/**
	 * Shows the overlay on the bottom left of the screen.
	 */
	BOTTOM_LEFT,
	/**
	 * Shows the overlay on the bottom center of the screen.
	 */
	BOTTOM_CENTER,
	/**
	 * Shows the overlay on the bottom right corner of the screen.
	 */
	BOTTOM_RIGHT;
}
