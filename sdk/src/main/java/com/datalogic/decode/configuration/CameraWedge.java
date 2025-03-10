package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.BooleanProperty;
import com.datalogic.device.configuration.EnumProperty;
import com.datalogic.device.configuration.PropertyGetter;
import com.datalogic.device.configuration.PropertyGroup;
import com.datalogic.device.configuration.NumericProperty;

/**
 * <code>CameraWedge</code> is the class that allows to configure the scanner
 * to act in place of the rear camera of the device. This means that, when the
 * camera wedge is enabled and an app using the rear camera is opened, it will
 * start the scanner instead of using the standard rear camera of the device.
 * With the scanner active, the  barcodes that are decoded will be shown back in
 * the preview of the rear camera opened by the application. This allows for an
 * integration of the scanner with application2 that normally take advantage of
 * the rear camera for decoding.
 */
public class CameraWedge extends PropertyGroup {
	/**
	 * <code>enable</code> sets the camera wedge mode, allowing the scanner to substitute
	 * the rear camera of the device.
	 */
	public BooleanProperty enable;

	/**
	 * <code>barcodeType</code> represents the symbology of the barcode generated by the camera wedge.
	 */
	public EnumProperty<CameraWedgeBarcodeType> barcodeType;

	/**
	 * <code>maxBarcodePersistence</code> represents the maximum amount of time (in milliseconds) a generated
	 * barcode is shown in the camera frames. After this time has expired, the camera frames
	 * with come back to show only the background.
	 */
	public NumericProperty maxBarcodePersistence;

	/**
	 * <code>minBarcodePersistence</code> represents the minimum amount of time (in milliseconds) a generated
	 * barcode is shown in the camera frames. If another barcode is decoded before the time
	 * has expired, it will be shown only after the expiration.
	 */
	public NumericProperty minBarcodePersistence;

	/**
	 * <code>barcodeOrientation</code> represents the orientation of the barcode generated by the camera wedge.
	 */
	public EnumProperty<CameraWedgeBarcodeOrientation> barcodeOrientation;

	/**
	 * <code>barcodeSize</code> represents the size in pixels of the barcode generated by the camera wedge.
	 * For barcodes that have different width and height, the size refers to the biggest
	 * value between them.
	 */
	public NumericProperty barcodeSize;

	/**
	 * <code>barcodePosition</code> represents the position of the barcode generated by the camera wedge.
	 */
	public EnumProperty<CameraWedgeBarcodePosition> barcodePosition;

	/**
	 * In case of custom positioning, <code>barcodeCustomPositionX</code> represents the position of
	 * the barcode generated by the camera wedge on the X coordinate.<br/>
	 * <b>NOTE:</b> The camera frame is considered as being rotated clockwise
	 * by 90 degrees, which means that the starting coordinate will be on the top
	 * right of the screen in portrait orientation. In this configuration, an
	 * increase of the X coordinate causes the barcode to move down on the vertical axis
	 * of the screen.
	 */
	public NumericProperty barcodeCustomPositionX;

	/**
	 * In case of custom positioning, <code>barcodeCustomPositionY</code> represents the position of
	 * the barcode generated by the camera wedge on the Y coordinate.
	 * <b>NOTE:</b> The camera frame is considered as being rotated clockwise
	 * by 90 degrees, which means that the starting coordinate will be on the top
	 * right of the screen in portrait orientation. In this configuration, an
	 * increase of the Y coordinate causes the barcode to move left on the horizontal axis
	 * of the screen.
	 */
	public NumericProperty barcodeCustomPositionY;

	/**
	 * <code>backgroundColor</code> represents the background color of the frames containing a
	 * barcode generated by the camera wedge.
	 */
	public NumericProperty backgroundColor;

	/**
	 * <code>barcodeColor</code> represents the barcode color of the frames containing a
	 * barcode generated by the camera wedge.
	 */
	public NumericProperty barcodeColor;

	/**
	 * This is the constructor of CameraWedge. All options are initialized by
	 * editor.
	 *
	 * @param editor A {@link PropertyGetter} used to load the current configuration.
	 */
	public CameraWedge(PropertyGetter editor) {
		
	}

}
