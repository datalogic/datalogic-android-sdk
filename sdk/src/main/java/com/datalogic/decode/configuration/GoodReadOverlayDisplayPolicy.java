package com.datalogic.decode.configuration;

/**
 * The <code>GoodReadOverlayDisplayPolicy</code> is an enumeration defining how to display the
 * Good Read Overlay.
 */
public enum GoodReadOverlayDisplayPolicy {
	/**
	 * Display the overlay to fit the screen. The ratio of the image is kept.
	 */
	FIT,
	/**
	 * Display the overlay using its original dimension.
	 */
	ORIGINAL,
	/**
	 * Display the overlay using the custom size defined by <code>GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_SIZE_MAX_WIDTH</code>,
	 * <code>GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_SIZE_MAX_HEIGHT</code>, <code>GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_SIZE_MAX_WIDTH</code>
	 * and <code>GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_SIZE_MAX_HEIGHT</code>. To keep the ratio of the image used, the most restrictive requirement is enforced and the other dimension is set to mantain the correct aspect ratio.
	 */
	CUSTOM_SIZE;
}
