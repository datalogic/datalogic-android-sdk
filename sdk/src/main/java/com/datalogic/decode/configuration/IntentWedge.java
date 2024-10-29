package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>IntentWedge</code> is the class that configures the Decode Wedge
 * capability with the intent mode. This means that the label is sent to the
 * foreground application in the form of an implicit intent. In order to
 * retrieve the label type string, "com.datalogic.decodewedge.label_type" is the
 * name argument to be used with Intent.getStringExtra(). In order to retrieve
 * the output data as string, "com.datalogic.decodewedge.data_string" is the
 * name argument to be used with Intent.getStringExtra() . In case of
 * concatenated barcodes, the decode data is concatenated and sent out as a
 * single string. In order to retrieve the output data as a list of byte arrays,
 * "com.datalogic.decodewedge.decode_data" is the name argument to be used with
 * Intent.getSerializableExtra(). For barcode symbologies that support
 * concatenation, the decode data is stored in multiple byte arrays (one byte
 * array per bar code). Clients can get data in each byte array by passing an
 * index.
 */
public class IntentWedge extends PropertyGroup {

	/**
	 * When the IntentWedge is sent to a listening application, the decoded label is dispatched
	 * under a specific byte array extra with the following name, by default.
	 */
	public final static String EXTRA_BARCODE_DATA = "com.datalogic.decode.intentwedge.barcode_data";

	/**
	 * When the IntentWedge is sent to a listening application, the decoded label type is dispatched
	 * under a specific String extra with the following name, by default.
	 */
	public final static String EXTRA_BARCODE_TYPE = "com.datalogic.decode.intentwedge.barcode_type";

	/**
	 * When the IntentWedge is sent to a listening application, the decoded label is dispatched
	 * under a specific String extra with the following name, by default.
	 */
	public final static String EXTRA_BARCODE_STRING = "com.datalogic.decode.intentwedge.barcode_string";

	/**
	 * When the IntentWedge is sent to a listening application, the decoded label user id is dispatched
	 * under a specific String extra with the following name, by default.
	 */
	public final static String EXTRA_BARCODE_USER_ID = "com.datalogic.decode.intentwedge.barcode_user_id";

	/**
	 * When the IntentWedge is sent to a listening application, the decoded label AIM id is dispatched
	 * under a specific String extra with the following name, by default.
	 */
	public final static String EXTRA_BARCODE_AIM_ID = "com.datalogic.decode.intentwedge.barcode_aim_id";

	/**
	 * <code>enable</code> sets the intent mode.
	 */
	public BooleanProperty enable;

	/**
	 * <code>action</code> is the intent action name. The default value is
	 * "com.datalogic.decodewedge.decode_action".
	 */
	public TextProperty action;

	/**
	 * <code>category</code> is the intent category name. The default value is
	 * "com.datalogic.decodewedge.decode_category".
	 */
	public TextProperty category;

	/**
	 * <code>deliveryMode</code> indicates the method by which the intent is
	 * delivered. The default value is INTENT_DELIVERY_MODE_ENUM.BROADCAST.
	 */
	public EnumProperty<IntentDeliveryMode> deliveryMode;

	/**
	 * <code>extraBarcodeData</code> indicates the corresponding intent extra tag, associated to a byte array containing the read label.
	 * The default value is {@link IntentWedge#EXTRA_BARCODE_DATA}.
	 */
	public TextProperty extraBarcodeData;

	/**
	 * <code>extraBarcodeType</code> indicates the corresponding intent extra tag, associated to a string containing the type of read label.
	 * The default value is {@link IntentWedge#EXTRA_BARCODE_TYPE}.
	 */
	public TextProperty extraBarcodeType;

	/**
	 * <code>extraBarcodeString</code> indicates the corresponding intent extra tag, associated to a string containing the read label.
	 * The default value is {@link IntentWedge#EXTRA_BARCODE_STRING}.
	 */
	public TextProperty extraBarcodeString;

	/**
	 * <code>excludeEmptyValues</code> is set to true to exclude the empty strings in the intent wedge fields.
	 * This considers all extras' names and the category, while the action is always included in the intent.
	 * The default value is false.
	 */
	public BooleanProperty excludeEmptyValues;

	/**
	 * <code>extraBarcodeUserId</code> indicates the corresponding intent extra tag, associated to a string containing the user id of the read label.
	 * The default value is {@link IntentWedge#EXTRA_BARCODE_USER_ID}.
	 */
	public TextProperty extraBarcodeUserId;

	/**
	 * <code>extraBarcodeAimId</code> indicates the corresponding intent extra tag, associated to a string containing the AIM id of the read label.
	 * The default value is {@link IntentWedge#EXTRA_BARCODE_AIM_ID}.
	 */
	public TextProperty extraBarcodeAimId;

	/**
	 * This is the constructor of IntentWedge. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public IntentWedge(PropertyGetter editor) {

	}

}
