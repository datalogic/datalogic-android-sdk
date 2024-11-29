package com.datalogic.decode.configuration;

/**
 * The <code>GoodReadOverlayShapePolicy</code> is an enumeration defining which shape to use for the
 * Good Read Overlay
 */
public enum GoodReadOverlayShapePolicy {
	/**
	* Use a custom image define by the <code>GOOD_READ_OVERLAY_CUSTOM_SHAPE_NAME_PROFILE</code> property.
	*/
	CUSTOM,
	/**
	 * A rectangle covering the whole screen of the device is used as overlay. Custom size or position configs have no effect using this value.
	 */
	FULL_SCREEN,
	/**
	 * Use the Datalogic's logo as overlay image.
	 */
	DL_LOGO;
}
