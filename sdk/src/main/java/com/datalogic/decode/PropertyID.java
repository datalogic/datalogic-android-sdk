package com.datalogic.decode;

/**
 * <code>PropertyID</code> is the class that includes all the properties
 * identifiers.
 */
public class PropertyID {
	//
	// General Decoding definitions
	//

	/**
	  * This parameter controls the barcode illumination for capturing frames from displays or reflective surfaces. 
	  * The possibile configurations are: 
	  * <ul>
	  * <li> feature disabled that means "Illuminator alwayas enabled"
	  * <li> feature enabled that means "Illuminator adjusted according" to reflection in the previous acquired frames
	  * </ul>
	  */
	public final static int DISPLAY_MODE_ENABLE = 0x0006;
	/**
	  * This parameter enables barcode illumination when capturing frames.  
	  */
	public final static int ILLUMINATION_ENABLE = 0x0007;
	/**
	  * This parameter enables aim projection when capturing frames.  
	  */
	public final static int AIM_ENABLE = 0x0008;
	/**
	  * This parameter selects the scanner target beam mode.  
	  */
	public final static int TARGET_MODE = 0x0009;
	/**
	  * This parameter limits reading to targeted selection.  
	  */
	public final static int PICKLIST_ENABLE = 0x000A;
	/**
	  * This parameter enables the use of a target beam mode.  
	  */
	public final static int TARGET_MODE_ENABLE = 0x000B;
	/**
	  * This parameter selects the scanner image capture profile.  
	  */
	public final static int IMAGE_CAPTURE_PROFILE = 0x000C;
	/**
	  * This parameter allows to define a custom profile. It could be set with a number between 0-255.  
	  */
	public final static int CUSTOM_IMAGE_CAPTURE_PROFILE = 0x000D;
	/**
	  * This parameter selects the scanner illuminator to be used for decoding.  
	  */
	public final static int ILLUMINATION_TYPE = 0x000E;
	/**
	  * This parameter enables the use of the good read notification on a successful read.  
	  */
	public final static int GOOD_READ_ENABLE = 0x0010;
	/**
	  * This parameter enables the use of the green spot notification on a successful read.   
	  */
	public final static int GREEN_SPOT_ENABLE = 0x0011;
	/**
	  * This parameter enables the use of the vibrator notification on a successful read.   
	  */
	public final static int GOOD_READ_VIBRATE_ENABLE = 0x0012;
	 /**
	  * This parameter enables the use of the led notification on a successful read.   
	  */
	public final static int GOOD_READ_LED_ENABLE = 0x0013;
	 /**
	  * This parameter enables the removal of all characters in the range 0x00-0x1F and the single    
	  * character 0x7F from the scanned data. The length check for each symbology is evaluated before any 
	  * characters are removed. Characters in the code ID, prefix, suffix, or separator won't be removed.
	  */
	public final static int REMOVE_NON_PRINTABLE_CHARS = 0x0018;
	 /**
	  * This parameter indicates the number of notifications to produce on a successful read.    
	  */
	public final static int GOOD_READ_COUNT = 0x0020;
	 /**
	  * This parameter indicates the duration of each notification on a successful read.     
	  */
	public final static int GOOD_READ_DURATION = 0x0022;
	 /**
	  * This parameter selects the symbology identifier to be transmitted along with the scanned data.     
	  */
	public final static int SEND_CODE_ID = 0x0025;
	 /**
	  * This parameter is a string of Unicode characters sent immediatly before symbology identifier.      
	  */
	public final static int LABEL_PREFIX = 0x0026;
	 /**
	  * This parameter is a string of Unicode characters sent ent after the final character in data.      
	  */
	public final static int LABEL_SUFFIX = 0x0027;
	 /**
	  * This parameter is the time the target beam is on before scanner attempts to read. 
	  * <ul>
	  * <li> 0 = 0.25 seconds </li> 
	  * <li> 1 = 0.5 seconds </li>
	  * <li> 2 = 1 seconds </li>
	  * <li> 3 = 15 seconds </li>
	  * <li> 4 = 2 seconds </li>
	  * </ul>
	  */
	public final static int TARGET_TIMEOUT = 0x0029;
	 /**
	  * This parameter is the maximum time the scanner is on after trigger release when using 
	  * Release Scan target beam mode. If the value exceeds the range, the value is set at full scale.       
	  */
	public final static int TARGET_RELEASE_TIMEOUT = 0x002A;
	 /**
	  * This parameter is s a string of Unicode characters that replaces each occurrence of GS (ASCII code 0x1D) in the scanned data.       
	  */
	public final static int GS_SUBSTITUTION = 0x002C;
	 /**
	  * This parameter is the maximum time the scanner remains on without reading a barcode. 
	  * If the value exceeds the range, the value is set at full scale. 
	  * The amount of time is represented in milliseconds.      
	  */
	public final static int DECODE_TIMEOUT = 0x002D;
	 /**
	  * This parameter is the delay between notifications on a successful read.        
	  */
	public final static int GOOD_READ_INTERVAL = 0x002E;
	 /**
	  * This parameter is the volume of the audio notification on a successfull read.        
	  */
	public final static int GOOD_READ_AUDIO_VOLUME = 0x002F;
	 /**
	  * This parameter is the file used for the audio notification on a successfull read.        
	  */
	public final static int GOOD_READ_AUDIO_FILE = 0x0030;
	 /**
	  * This parameter activates the notification mechanism. 
	  * It enables the Display Notification capability via a displaying message. 
	  * This means that the decoded label is displayed through a pop-up message, an Android Toast, on the device's screen.        
	  */
	public final static int DISPLAY_NOTIFICATION_ENABLE = 0x0031;
	/**
	 * @hide
	 */
	public final static int GOOD_READ_AUDIO_TONE = 0x0032;
	 /**
	  * This parameter selects the scanner audio notification mode.     
	  */
	public final static int GOOD_READ_AUDIO_MODE = 0x0033;
	 /**
	  * This parameter selects the audio channel to use for the scanner notification.     
	  */
	public final static int GOOD_READ_AUDIO_CHANNEL = 0x0034;
	/**
	 * This parameter is the timeout to set during image decoding.
	 * The amount of time is represented in milliseconds.
	 */
	public final static int IMAGE_DECODE_TIMEOUT = 0x0035;
	/**
	 * This parameter is set to true to enable check of GS1 format for GS1 symbologies.
	 */
	public final static int GS1_CHECK = 0x0036;
	/**
	 * This parameter is set to true to convert the GS1 barcode string in the GS1 readable string format.
	 * It is used only if {@link #GS1_CHECK} is set to true.
	 */
	public final static int GS1_STRING_FORMAT = 0x0037;
	/**
	 * This parameter indicates the delay after which the good read LEDs are turned off. This is valid only in case of a single good read.
	 * The value range is between 20 and 5000 for  normal scanning sessions. The maximum value is lowered to 500 in case of a scan mode
	 * different from SINGLE or when the target mode is set to RELEASE_SCAN.
	 */
	public final static int GOOD_READ_TIMEOUT = 0x0038;
	 /**
	  * This parameter enables the ability to show an overlay in the case of a good read.
	  */
	public final static int GOOD_READ_OVERLAY_ENABLE = 0x0039;
	 /**
	  * This parameter selects the color of the overlay.
	  */
	public final static int GOOD_READ_OVERLAY_COLOR = 0x003A;
	 /**
	  * This parameter selects the shape of the overlay.
	  */
	public final static int GOOD_READ_OVERLAY_SHAPE_POLICY = 0x003B;
	 /**
	  * This parameter specifies the name of the custom overlay selected.
	  */
	public final static int GOOD_READ_OVERLAY_CUSTOM_SHAPE_NAME_PROFILE = 0x003C;
	 /**
	  * This parameter specifies in which position of the screen the overlay is shown, in portrait mode.
	  */
	public final static int GOOD_READ_OVERLAY_PORTRAIT_POSITION_POLICY = 0x003D;
	 /**
	  * This parameter specifies in which custom x coordinate of the screen (starting from the left) the overlay is shown, in portrait mode.
	  */
	public final static int GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_POSITION_X = 0x003E;
	 /**
	  * This parameter specifies in which custom y coordinate of the screen (starting from the top) the overlay is shown, in portrait mode.
	  */
	public final static int GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_POSITION_Y = 0x003F;
	 /**
	  * This parameter specifies the mode used to shown the overlay, in portrait mode.
	  */
	public final static int GOOD_READ_OVERLAY_PORTRAIT_DISPLAY_POLICY = 0x0040;
	 /**
	  * This parameter specifies the custom max width used for the overlay, in portrait mode.
	  */
	public final static int GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_SIZE_MAX_WIDTH = 0x0041;
	 /**
	  * This parameter specifies the custom max height used for the overlay, in portrait mode.
	  */
	public final static int GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_SIZE_MAX_HEIGHT = 0x0042;
	 /**
	  * This parameter specifies in which position of the screen the overlay is shown, in landscape mode.
	  */
	public final static int GOOD_READ_OVERLAY_LANDSCAPE_POSITION_POLICY = 0x0043;
	 /**
	  * This parameter specifies in which custom x coordinate of the screen (starting from the left) the overlay is shown, in landscape mode.
	  */
	public final static int GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_POSITION_X = 0x0044;
	 /**
	  * This parameter specifies in which custom y coordinate of the screen (starting from the top) the overlay is shown, in landscape mode.
	  */
	public final static int GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_POSITION_Y = 0x0045;
	 /**
	  * This parameter specifies the mode used to shown the overlay, in landscape mode.
	  */
	public final static int GOOD_READ_OVERLAY_LANDSCAPE_DISPLAY_POLICY = 0x0046;
	 /**
	  * This parameter specifies the custom max width used for the overlay, in landscape mode.
	  */
	public final static int GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_SIZE_MAX_WIDTH = 0x0047;
	 /**
	  * This parameter specifies the custom max height used for the overlay, in landscape mode.
	  */
	public final static int GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_SIZE_MAX_HEIGHT = 0x0048;
	 /**
	  * This parameter enables the ability to collect a defined number of barcodes in a single session and transmit them at the same time.       
	  */
	public final static int MULTISCAN_ENABLE = 0x0050;
	 /**
	  * This parameter defines the number of required labels to be read before automatically ending a good read transaction.     
	  */
	public final static int MULTISCAN_REQUIRED_LABELS = 0x0051;
	 /**
	  * This parameter defines whether to notify each successfully read label during Multi Scan operation.       
	  */
	public final static int MULTISCAN_NOTIFICATION_ENABLE = 0x0052;
	 /**
	  * This parameter selects the behaviour when partial results are present.     
	  */
	public final static int MULTISCAN_PARTIAL_RESULT_MODE = 0x0053;
	 /**
	  * This parameter sets the inverse mode for linear barcode symbologies.    
	  */
	public final static int INVERSE_1D_SYMBOLOGIES = 0x0060;
	 /**
	  * This parameter sets the inverse mode for 2D barcode symbologies.    
	  */
	public final static int INVERSE_2D_SYMBOLOGIES = 0x0061;
	 /**
	  * This parameter enables the use of presentation mode.       
	  */
	public final static int PRESENTATION_MODE_ENABLE = 0x0062;
	 /**
	  * This parameter enables the use of the aimer in presentation mode.      
	  */
	public final static int PRESENTATION_MODE_AIMER_ENABLE = 0x0063;
	 /**
	  * This parameter sets sensitivity in presentation mode.    
	  */
	public final static int PRESENTATION_MODE_SENSITIVITY = 0x0064;
	 /**
	  * This parameter selects the scan mode.    
	  */
	public final static int SCAN_MODE = 0x0065;
	 /**
	  * This parameter is the minimum time allowed between reads of the same barcode label. 
	  */
	public final static int DOUBLE_READ_TIMEOUT = 0x0066;
	 /**
	  * This parameter selects the scanner illumination pulse length. 
	  */
	public final static int ILLUMINATION_TIME = 0x0067;
	/**
	 * @hide
	 */
	public final static int LINEAR_RASTER = 0x0068;
	/**
	 * @hide
	 */
	public final static int FORCE_HW_ACCELERATION_DISABLED = 0x0069;
	/**
	 * This parameter enhances the Depth of Field.
	 */
	public final static int ENHANCE_DOF_ENABLE = 0x006A;
        /**
         * This parameter is set to specify the representation used for the GTIN format.
         */
	public final static int GTIN_FORMAT = 0x006B;
        /**
         * This parameter is set to specify the mode use to transmit GS1 label sets.
         * A label set consists of all the GS1 barcodes that have the same GTIN value.
         */
	public final static int GS1_LABEL_SET_TRANSMIT_MODE = 0x006C;
        /**
         * This parameter is set to specify the label set prefix to use when the
         * label set mode is set to <code>ALL_LABELS</code>.
         */
	public final static int GS1_LABEL_SET_PREFIX = 0x006D;
        /**
         * This parameter is set to specify the conversion used for GS1 2D barcodes.
         */
	public final static int GS1_2D_CONVERSION = 0x006E;
        /**
         * This parameter enables the injection of the barcodes from an external scanner source.
         */
	public final static int EXT_SCANNER_SOURCE_ENABLE = 0x006F;
        /**
         * This parameter allows using the standard formatter when the injection is enabled.
         */
	public final static int EXT_SCANNER_SOURCE_STANDARD_FORMATTER_ENABLE = 0x0070;
        /**
         * This parameter enables to format the read data as a readable hexadecimal string. Ignores other formatting options.
         */
	public final static int HEX_FORMAT = 0x0071;
        /**
         * This parameter enables scanner decoding.
         */
	public final static int ENABLE_SCANNER = 0x0072;
	/**
	 * @hide
	 */
	public final static int HW_ACCELERATION_FRAME_TO_SKIP = 0x0073;

	//
	// Code 39 definitions
	//
	/**
	 * This parameter enables or disables the symbology.       
	 */
	public final static int CODE39_ENABLE = 0x0100;
	 /**
	  * This parameter enables the reading of Code 39 barcode labels with short quiet zones.       
	  */
	public final static int CODE39_SHORT_QUIET_ZONES = 0x0101;
	 /**
	  * This parameter requires the use of checksum characters to verify a barcode.       
	  */
	public final static int CODE39_ENABLE_CHECK = 0x0102;
	 /**
	  * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).        
	  */
	public final static int CODE39_SEND_CHECK = 0x0103;
	 /**
	  * This parameter enables or disables the Full Ascii conversion.        
	  */
	public final static int CODE39_FULL_ASCII = 0x0105;
	 /**
	  * This parameter is one of the two configurable label lengths. It can be used
	  * as a single fixed accepted length, when {@link #CODE39_LENGTH_CONTROL} is set to ONE_FIXED.
	  * When TWO_FIXED is enabled, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  * 
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int CODE39_LENGTH1 = 0x0120;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #CODE39_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int CODE39_LENGTH2 = 0x0121;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int CODE39_LENGTH_CONTROL = 0x0122;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int CODE39_USER_ID = 0x0123;
	 /**
	  * This parameter controls the aggressiveness for the Code 39 symbology. 
	  */
	public final static int CODE39_AGGRESSIVENESS = 0x0124;

	//
	// Trioptic definitions
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int TRIOPTIC_ENABLE = 0x0108;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int TRIOPTIC_USER_ID = 0x0125;

	//
	// Code 32 definitions
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int CODE32_ENABLE = 0x0110;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int CODE32_USER_ID = 0x0127;

	//
	// Discrete 2/5 definitions
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int D25_ENABLE = 0x0200;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #D25_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int D25_LENGTH1 = 0x0220;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #D25_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  *    
	  */
	public final static int D25_LENGTH2 = 0x0221;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int D25_LENGTH_CONTROL = 0x0222;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int D25_USER_ID = 0x0223;

	//
	// Matrix 2/5 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int M25_ENABLE = 0x0208;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #M25_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int M25_LENGTH1 = 0x0224;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #D25_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int M25_LENGTH2 = 0x0225;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int M25_LENGTH_CONTROL = 0x0226;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int M25_USER_ID = 0x0227;
	 /**
	  * This parameter enables the reading of Matrix 2 of 5 barcode labels with short quiet zones.
	  */
	public final static int M25_SHORT_QUIET_ZONES = 0x022F;

	//
	// Interleaved 2/5 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int I25_ENABLE = 0x0210;
	 /**
	  * This parameter equires the use of checksum characters to verify a barcode.      
	  */
	public final static int I25_ENABLE_CHECK = 0x0212;
	 /**
	  * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).       
	  */
	public final static int I25_SEND_CHECK = 0x0213;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #I25_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int I25_LENGTH1 = 0x0228;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #I25_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int I25_LENGTH2 = 0x0229;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int I25_LENGTH_CONTROL = 0x022A;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int I25_USER_ID = 0x022B;
	 /**
	  * This parameter enables or disables the ITF14 symbology. It could be used to include a GTIN. It always checks and transmits the checksum character.       
	  */
	public final static int ITF14_ENABLE = 0x022C;
	 /**
	  * This parameter controls the aggressiveness for the Interleaved 2/5 symbology. 
	  */
	public final static int I25_AGGRESSIVENESS = 0x022D;
	 /**
	  * This parameter enables the reading of Interleaved 2 of 5 barcode labels with short quiet zones.
	  */
	public final static int I25_SHORT_QUIET_ZONES = 0x022E;

	//
	// Codabar definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int CODABAR_ENABLE = 0x0300;
	 /**
	  * This parameter equires the use of checksum characters to verify a barcode.      
	  */
	public final static int CODABAR_ENABLE_CHECK = 0x0302;
	 /**
	  * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).       
	  */
	public final static int CODABAR_SEND_CHECK = 0x0303;
	 /**
	  * This parameter enables/disables the transmission of the decoded star and stop characters. The start and stop characters will both be translated as A, B, C or D.        
	  */
	public final static int CODABAR_SEND_START = 0x0305;
	 /**
	  * This parameter restricts the decoding to only read labels that conform to CLSI specifications. Label length must be 14 and the data is split into fields of 1, 4, 5 and 4 characters separated by spaces.        
	  */
	public final static int CODABAR_CLSI = 0x0306;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #CODABAR_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int CODABAR_LENGTH1 = 0x0320;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #CODABAR_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int CODABAR_LENGTH2 = 0x0321;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int CODABAR_LENGTH_CONTROL = 0x0322;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int CODABAR_USER_ID = 0x0323;
	 /**
	  * This parameter enables the reading of Codabar barcode labels with short quiet zones.       
	  */
	public final static int CODABAR_SHORT_QUIET_ZONES = 0x0324;

	//
	// Code 93 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int CODE93_ENABLE = 0x0400;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #CODE93_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int CODE93_LENGTH1 = 0x0420;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #CODE93_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int CODE93_LENGTH2 = 0x0421;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int CODE93_LENGTH_CONTROL = 0x0422;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int CODE93_USER_ID = 0x0423;
	 /**
	  * This parameter enables the reading of Code 93 barcode labels with short quiet zones.
	  */
	public final static int CODE93_SHORT_QUIET_ZONES = 0x042B;

	//
	// Code 128 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int CODE128_ENABLE = 0x0408;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #CODE128_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int CODE128_LENGTH1 = 0x0424;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #CODE128_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int CODE128_LENGTH2 = 0x0425;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int CODE128_LENGTH_CONTROL = 0x0426;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int CODE128_USER_ID = 0x0427;
	 /**
	  * This parameter enables or disables the GS1 Code128 symbology.
	  */
	public final static int CODE128_GS1_ENABLE = 0x040C;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int CODE128_GS1_USER_ID   = 0x0428;
	 /**
	  * This parameter controls the aggressiveness for the Code128 symbology. 
	  */
	public final static int CODE128_AGGRESSIVENESS = 0x0429;
	 /**
	  * This parameter enables the reading of Code128 barcode labels with short quiet zones.       
	  */
	public final static int CODE128_SHORT_QUIET_ZONES = 0x042A;
	/**
	 * This parameter selects the support to the extended ASCII (ASCII code from 128 to 255).
	 */
	public final static int CODE128_EXTENDED_ASCII = 0x042C;
	/**
	 * This parameter controls the character set in use for the decoded label.
	 */
	public final static int CODE128_CHARACTER_SET_MODE = 0x042D;

	//
	// UPC-A definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int UPCA_ENABLE = 0x0500;
	 /**
	  * This parameter includes the checksum in the label transmission.       
	  */
	public final static int UPCA_SEND_CHECK = 0x0502;
	 /**
	  * This parameter includes the system digit in the label transmission. For UPC-A the system digit is always zero.        
	  */
	public final static int UPCA_SEND_SYS = 0x0503;
	 /**
	  * This parameter allows to expand the UPC-A labels to their EAN-13 equivalents. Any EAN-13 parameters will then apply to the result.        
	  */
	public final static int UPCA_TO_EAN13 = 0x0504;
	 /**
	  * This parameter allows to use UPC-A labels in composite barcode.        
	  */
	public final static int UPCA_COMPOSITE_ENABLE = 0x0505;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int UPCA_USER_ID = 0x0521;

	//
	// UPC-E definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int UPCE_ENABLE = 0x0508;
	 /**
	  * This parameter includes the checksum in the label transmission.       
	  */
	public final static int UPCE_SEND_CHECK = 0x050A;
	 /**
	  * This parameter includes the system digit in the label transmission. For UPC-E the system digit is always zero.       
	  */
	public final static int UPCE_SEND_SYS = 0x050B;
	 /**
	  * This parameter allows to expand the UPC-E labels to their UPC-A equivalents. Any UPC-A parameters will then apply to the result.         
	  */
	public final static int UPCE_TO_UPCA = 0x050C;
	 /**
	  * This parameter allows to use UPC-E labels in composite barcode.        
	  */
	public final static int UPCE_COMPOSITE_ENABLE = 0x050D;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int UPCE_USER_ID = 0x0523;
	 /**
	  * This parameter enables decoding of the UPC-E1 Symbology variation of UPC-E code.         
	  */
	public final static int UPCE1_ENABLE = 0x0509;

	//
	// EAN-13 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int EAN13_ENABLE = 0x0510;
	 /**
	  * This parameter includes the checksum in the label transmission.       
	  */
	public final static int EAN13_SEND_CHECK = 0x0512;
	 /**
	  * This parameter includes the system digit in the label transmission, it configures whether the first character should be transmitted.       
	  */
	public final static int EAN13_SEND_SYS = 0x0513;
	 /**
	  * This parameter allows to identify ISBN labels and append the check digit (per ISBN guidelines) to the end of the label.        
	  */
	public final static int EAN13_TO_ISBN = 0x0514;
	 /**
	  * This parameter allows to identify ISSN labels and append the check digit (per ISSN guidelines) to the end of the label.       
	  */
	public final static int EAN13_TO_ISSN = 0x0515;
	 /**
	  * This parameter allows to use EAN-13 labels in composite barcode.        
	  */
	public final static int EAN13_COMPOSITE_ENABLE = 0x0516;
        /**
         * This parameter allows to convert EAN-13 labels to GTIN.
         */
	public final static int EAN13_TO_GTIN = 0x0517;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int EAN13_USER_ID = 0x0525;

	//
	// EAN-8 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int EAN8_ENABLE = 0x0518;
	 /**
	  * This parameter includes the checksum in the label transmission.       
	  */
	public final static int EAN8_SEND_CHECK = 0x051A;
 
	 /**
	  * This parameter allows to expand the EAN-8 labels to their EAN-13 equivalents. Any EAN-13 parameters will then apply to the result.       
	  */
	public final static int EAN8_TO_EAN13 = 0x051B;
	 /**
	  * This parameter allows to use EAN-8 labels in composite barcode.        
	  */
	public final static int EAN8_COMPOSITE_ENABLE = 0x0528;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int EAN8_USER_ID = 0x0527;

	//
	// UPC/EAN Extensions definitions
	//
	 /**
	  * This parameter requires a 2 digit extension to be verified for a successful decode of a label.         
	  */
	public final static int EAN_EXT_ENABLE_2_DIGIT = 0x051C;
	 /**
	  * This parameter requires a 5 digit extension to be verified for a successful decode of a label.         
	  */
	public final static int EAN_EXT_ENABLE_5_DIGIT = 0x051D;
	 /**
	  * This parameter indicates that are read only barcode with the supplemental label. If the parameter is false are read barcodes with or without the supplemental labels.          
	  */
	public final static int EAN_EXT_REQUIRE = 0x051F;

	//
	// UPC/EAN Options
	//
	 /**
	  * This parameter enables the reading of UPC and EAN barcode labels with short quiet zones.       
	  */
	public final static int UPC_EAN_SHORT_QUIET_ZONES = 0x0520;
	 /**
	  * This parameter controls the aggressiveness for the UPC and EAN symbology. 
	  */
	public final static int UPC_EAN_AGGRESSIVENESS = 0x0526;

	//
	// MSI definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int MSI_ENABLE = 0x0608;
	 /**
	  * This parameter requires that a MSI label contains two check digits.        
	  */
	public final static int MSI_REQUIRE_2_CHECK = 0x060A;
	 /**
	  * This parameter includes the checksum in the label transmission.       
	  */
	public final static int MSI_SEND_CHECK = 0x060B;
	 /**
	  * This parameter allows to interpret the second check digit as module 11 instead of module 10.        
	  */
	public final static int MSI_CHECK_2_MOD_11 = 0x060C;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #MSI_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int MSI_LENGTH1 = 0x0624;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #MSI_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int MSI_LENGTH2 = 0x0625;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int MSI_LENGTH_CONTROL = 0x0626;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int MSI_USER_ID = 0x0627;
	 /**
	  * This parameter controls the aggressiveness for the MSI symbology. 
	  */
	public final static int MSI_AGGRESSIVENESS = 0x0628;
	 /**
	  * This parameter enables the reading of MSI barcode labels with short quiet zones.       
	  */
	public final static int MSI_SHORT_QUIET_ZONES = 0x0629;

	//
	// RSS-14 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int GS1_14_ENABLE = 0x0800;
	 /**
	  * This parameter convert the Gs1DataBar_14 label to a GS1-128 barcode.       
	  */
	public final static int GS1_14_GS1_128_MODE = 0x0803;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int GS1_14_USER_ID = 0x0821;

	//
	// RSS Limited definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int GS1_LIMIT_ENABLE = 0x0808;
	 /**
	  * This parameter convert the Gs1DataBar_Limited label to a GS1-128 barcode.        
	  */
	public final static int GS1_LIMIT_GS1_128_MODE = 0x080B;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int GS1_LIMIT_USER_ID = 0x0823;

	//
	// RSS Expanded definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int GS1_EXP_ENABLE = 0x0810;
	 /**
	  * This parameter convert the Gs1DataBar_Expanded label to a sequence of one or more GS1-128 barcodes.        
	  */
	public final static int GS1_EXP_GS1_128_MODE = 0x0813;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #GS1_EXP_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int GS1_EXP_LENGTH1 = 0x0824;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #GS1_EXP_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int GS1_EXP_LENGTH2 = 0x0825;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int GS1_EXP_LENGTH_CONTROL = 0x0826;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int GS1_EXP_USER_ID = 0x0827;

	//
	// Postal Code definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int US_POSTNET_ENABLE = 0x0910;
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int US_PLANET_ENABLE = 0x0911;
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int USPS_4STATE_ENABLE = 0x0913;
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int ROYAL_MAIL_ENABLE = 0x0915;
	 /**
	  * This parameter includes the Royal Mail checksum in the label transmission.       
	  */
	public final static int ROYAL_MAIL_SEND_CHECK = 0x0916;
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int AUSTRALIAN_POST_ENABLE = 0x0917;
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int KIX_CODE_ENABLE = 0x0918;
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int JAPANESE_POST_ENABLE = 0x0919;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int US_PLANET_CODE_USER_ID = 0x092A;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int US_POSTNET_CODE_USER_ID = 0x092B;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int USPS_4STATE_CODE_USER_ID = 0x092C;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int ROYAL_MAIL_CODE_USER_ID = 0x092E;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int AUSTRALIAN_CODE_USER_ID = 0x092F;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int KIX_CODE_USER_ID = 0x0930;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int JAPANESE_POST_CODE_USER_ID = 0x0931;

	//
	// PDF417 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int PDF417_ENABLE = 0x0A00;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #PDF417_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int PDF417_LENGTH1 = 0x0A20;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #PDF417_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int PDF417_LENGTH2 = 0x0A21;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int PDF417_LENGTH_CONTROL = 0x0A22;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int PDF417_USER_ID = 0x0A23;
	 /**
	  * This parameter controls the character set in use for the decoded label.  
	  */
	public final static int PDF417_CHARACTER_SET_MODE = 0x0A02;

	//
	// MicroPDF417 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int MICROPDF417_ENABLE = 0x0A08;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #MICROPDF417_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int MICROPDF417_LENGTH1 = 0x0A24;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #MICROPDF417_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int MICROPDF417_LENGTH2 = 0x0A25;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int MICROPDF417_LENGTH_CONTROL = 0x0A26;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int MICROPDF417_USER_ID = 0x0A27;
	 /**
	  * This parameter controls the character set in use for the decoded label.  
	  */
	public final static int MICROPDF417_CHARACTER_SET_MODE = 0x0A0A;

	//
	// UCC EAN Composite
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int COMPOSITE_ENABLE = 0x0A30;
	 /**
	  * This parameter controls UPC/EAN label recognition mode.   
	  */
	public final static int COMPOSITE_EAN_UPC_MODE = 0x0A32;
	 /**
	  * This parameter convert the Composite label to a sequence of one or more GS1-128 barcodes.    
	  */
	public final static int COMPOSITE_GS1_128_MODE = 0x0A33;
	 /**
	  * This parameter enable linear code transmission.        
	  */
	public final static int COMPOSITE_LINEAR_TRANSMISSION_ENABLE = 0x0A34;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int COMPOSITE_USER_ID = 0x0A53;

	//
	// DataMatrix definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int DATAMATRIX_ENABLE = 0x0B00;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #DATAMATRIX_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int DATAMATRIX_LENGTH1 = 0x0B20;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #DATAMATRIX_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int DATAMATRIX_LENGTH2 = 0x0B21;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int DATAMATRIX_LENGTH_CONTROL = 0x0B22;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int DATAMATRIX_USER_ID = 0x0B23;
	 /**
	  * This parameter controls the character set in use for the decoded label.  
	  */
	public final static int DATAMATRIX_CHARACTER_SET_MODE = 0x0B02;
	 /**
	  * This parameter control the operating mode.   
	  */
	public final static int DATAMATRIX_OPERATING_MODE = 0x0B03;
	 /**
	  * This parameter controls the mirror mode. It controls the scanning capabilities of Data Matrix barcodes from mirror reflections.    
	  */
	public final static int DATAMATRIX_MIRROR = 0x0B04;
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int DATAMATRIX_GS1_ENABLE = 0x0B05;
	 /**
	  * This parameter controls the aggressiveness for the Datamatrix symbology.
	  */
	public final static int DATAMATRIX_AGGRESSIVENESS = 0x0B06;
	 /**
	  * This parameter enables or disables DataMatrix Rectangular Extended dimensions (DMRE).
	  * New AIM specs introduce new Datamatrix format:
	  * 8x48, 8x64, 12x48, 12x64, 16x64, 24x32, 24x36, 24x48, 24x64, 26x32, 26x40, 26x48, 26x64
	  */
	public final static int DATAMATRIX_DMRE = 0x0B0A;
        /**
         * This parameter enables or disables the GS1-DIGITAL-LINK-DATAMATRIX symbology.
         */
	public final static int DATAMATRIX_GS1_DL_ENABLE = 0x0B0B;

	//
	// MaxiCode definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int MAXICODE_ENABLE = 0x0B08;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #MAXICODE_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int MAXICODE_LENGTH1 = 0x0B24;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #MAXICODE_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int MAXICODE_LENGTH2 = 0x0B25;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int MAXICODE_LENGTH_CONTROL = 0x0B26;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int MAXICODE_USER_ID = 0x0B27;

	//
	// QR Code definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int QRCODE_ENABLE = 0x0B10;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #QRCODE_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int QRCODE_LENGTH1 = 0x0B28;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #QRCODE_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int QRCODE_LENGTH2 = 0x0B29;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int QRCODE_LENGTH_CONTROL = 0x0B2A;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int QRCODE_USER_ID = 0x0B2B;
	 /**
	  * This parameter controls the character set in use for the decoded label.  
	  */
	public final static int QRCODE_CHARACTER_SET_MODE = 0x0B12;
	 /**
	  * This parameter enables or disables the GS1-QR Code symbology.        
	  */
	public final static int QRCODE_GS1_ENABLE = 0x0B13;
	 /**
	  * This parameter enables Wi-Fi configuration through Wi-Fi QR Code.      
	  */
	public final static int QRCODE_WIFI_ENABLE = 0x30E41;
	 /**
	  * This parameter enables device configuration through Scan2Deploy QR Codes.        
	  */
	public final static int QRCODE_S2D_ENABLE = 0x30E42;
	 /**
	  * This parameter controls the mirror mode.
	  */
	public final static int QRCODE_MIRROR = 0x0B07;
	 /**
	  * This parameter enables or disables Absolute Grid algorithm. It performs
	  * a geometric reconstruction of the QR Code grid by regularizing it. This algorithm is executed
	  * only when the standard one fails. It may slow down decoding rate.
	  */
	public final static int QRCODE_ABSOLUTE_GRID = 0x0B09;
        /**
         * This parameter enables or disables the GS1-DIGITAL-LINK-QR Code symbology.
         */
	public final static int QRCODE_GS1_DL_ENABLE = 0x0B15;

	//
	// Micro QR Code definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int MICRO_QR_ENABLE = 0x0B14;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #MICRO_QR_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int MICRO_QR_LENGTH1 = 0x0B30;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #MICRO_QR_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int MICRO_QR_LENGTH2 = 0x0B31;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int MICRO_QR_LENGTH_CONTROL = 0x0B32;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int MICRO_QR_USER_ID = 0x0B33;
	 /**
	  * This parameter controls the character set in use for the decoded label.  
	  */
	public final static int MICRO_QR_CHARACTER_SET_MODE = 0x0B16;

	//
	// Aztec Code definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int AZTEC_ENABLE = 0x0B18;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #AZTEC_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int AZTEC_LENGTH1 = 0x0B2C;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #AZTEC_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int AZTEC_LENGTH2 = 0x0B2D;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int AZTEC_LENGTH_CONTROL = 0x0B2E;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int AZTEC_USER_ID = 0x0B2F;
	 /**
	  * This parameter controls the character set in use for the decoded label.  
	  */
	public final static int AZTEC_CHARACTER_SET_MODE = 0x0B1A;

	//
	// Digimarc Barcode definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.
	  */
	public final static int DIGIMARC_ENABLE = 0x10000;
	 /**
	  * This paramater configures which data format is used for Digimarc barcode.
	  */
	public final static int DIGIMARC_DATAFORMAT = 0x10001;
	 /**
	  * This parameter determines the frequency for attempting to decode using Digimarc.
	  */
	public final static int DIGIMARC_PRIORITY = 0x10002;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  */
	public final static int DIGIMARC_USER_ID = 0x10003;

	//
	// DotCode definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int DOTCODE_ENABLE = 0x0C00;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #DOTCODE_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int DOTCODE_LENGTH1 = 0x0C20;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #DOTCODE_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int DOTCODE_LENGTH2 = 0x0C21;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int DOTCODE_LENGTH_CONTROL = 0x0C22;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int DOTCODE_USER_ID = 0x0C23;
	 /**
	  * This parameter controls the character set in use for the decoded label.  
	  */
	public final static int DOTCODE_CHARACTER_SET_MODE = 0x0C02;

	//
	// ISBT 128 definitions
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int ISBT_128_ENABLE = 0x0D00;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int ISBT_128_USER_ID = 0x0D01;
	 /**
	  * This parameter allows the concatenation of common concatenated pairs.
	  */
	public final static int ISBT_128_COMMONLY_CONCATENATED_PAIRS = 0x0D02;
	 /**
	  * This parameter defines the decoding mode for ISBT 128 barcodes.  
	  */
	public final static int ISBT_128_MODE = 0x0D03;

	//
	// Wedge - Keyboard, Intent mode & Web
	//
	 /**
	  * This parameter enables the the keystroke mode for the Decode Wedge capability.
	  */
	public final static int WEDGE_KEYBOARD_ENABLE = 0x11170;
	 /**
	  * This parameter enables the input of the keystrokes only in input areas with active focus and an IME active, such as a touch keyboard.
	  */
	public final static int WEDGE_KEYBOARD_ONLY_ON_FOCUS = 0x11171;
	 /**
	  * This parameter indicates the method by which the KeyboardWedge operates.  
	  */
	public final static int WEDGE_KEYBOARD_DELIVERY_MODE = 0x11172;
	/**
	 * @hide
	 */
	public final static int WEDGE_KEYBOARD_INJECTION2COMMIT = 0x11173;
	 /**
	  * This parameter enables the intent mode for the Decode Wedge capability.
	  */
	public final static int WEDGE_INTENT_ENABLE = 0x30D40;
	 /**
	  * This parameter is the intent action name. The default value is "com.datalogic.decodewedge.decode_action". 
	  */
	public final static int WEDGE_INTENT_ACTION_NAME = 0x30D41;
	 /**
	  * This parameter is the intent category name. The default value is "com.datalogic.decodewedge.decode_category". 
	  */
	public final static int WEDGE_INTENT_CATEGORY_NAME = 0x30D42;
	 /**
	  * This parameter indicates the method by which the intent is delivered.
	  */
	public final static int WEDGE_INTENT_DELIVERY_MODE = 0x30D43;
	 /**
	  * This parameter indicates the corresponding intent extra tag, associated to a byte array containing the read label. The default value is EXTRA_BARCODE_DATA. 
	  */
	public final static int WEDGE_INTENT_EXTRA_BARCODE_DATA = 0x30D44;
	 /**
	  * This parameter indicates the corresponding intent extra tag, associated to a string containing the type of read label. The default value is EXTRA_BARCODE_TYPE.   
	  */
	public final static int WEDGE_INTENT_EXTRA_BARCODE_TYPE = 0x30D45;
	 /**
	  * This parameter indicates the corresponding intent extra tag, associated to a string containing the read label. The default value is EXTRA_BARCODE_STRING. 
	  */
	public final static int WEDGE_INTENT_EXTRA_BARCODE_STRING = 0x30D46;
        /**
         * This parameter indicates if the empty intent values have to be excluded.
         */
	public final static int WEDGE_INTENT_EXCLUDE_EMPTY_VALUES = 0x30D47;
        /**
         * This parameter indicates the corresponding intent extra tag, associated to a string containing the barcode user ID. The default value is EXTRA_BARCODE_USER_ID.
         */
	public final static int WEDGE_INTENT_EXTRA_BARCODE_USER_ID = 0x30D48;
        /**
         * This parameter indicates the corresponding intent extra tag, associated to a string containing the barcode aim ID. The default value is EXTRA_BARCODE_AIM_ID.
         */
	public final static int WEDGE_INTENT_EXTRA_BARCODE_AIM_ID = 0x30D49;
        /**
         * This parameter enables the Decode Wedge capability for direct web browsing. 
         */
	public final static int WEDGE_WEB_ENABLE = 0x30E40;

	//
	// External formatting
	//
	/**
	 * @hide
	 */
	public final static int EXTERNAL_FORMATTING_ENABLE = 0x40000;

	//
	// Visual formatting
	//
	/**
	 * @hide
	 */
	public final static int VISUAL_FORMATTING_ENABLE = 0x40100;
	/**
	 * @hide
	 */
	public final static int VISUAL_FORMATTING_PATH = 0x40101;
	/**
	 * @hide
	 */
	public final static int VISUAL_FORMATTING_TIMEOUT = 0x40102;
	/**
	 * @hide
	 */
	public final static int VISUAL_FORMATTING_ACTIVE_ITEM = 0x40103;

	//
	// Frame capture
	//
	 /**
	  * This parameter enable the feauture that configures the scanner to capture store and provide frames.       
	  */
	public final static int FRAME_CAPTURE_ENABLE = 0x50000;
	 /**
	  * This parameter indicates the directory where will be stored the frames saved by the Scanner. Only directory under getExternalStorageDirectory() are supported (eg. /storage/emulated/0/).       
	  */
	public final static int FRAME_CAPTURE_FILE_PATH = 0x50001;
	 /**
	  * This parameter selects the format used for storing the frames captured by the Scanner.  
	  */
	public final static int FRAME_CAPTURE_FORMAT = 0x50002;
	 /**
	  * This parameter selects the Scanner frame capture mode.
	  */
	public final static int FRAME_CAPTURE_MODE = 0x50003;
	 /**
	  * This parameter enables the Scanner to store captured frames.        
	  */
	public final static int FRAME_CAPTURE_STORAGE_ENABLE = 0x50004;

	//
	// ECI Policy
	//
	 /**
	  * This parameter selects the policy used to handle ECI. 
	  */
	public final static int ECI_POLICY = 0x40200;

	//
	// OCR
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int OCR_ENABLE = 0x40300;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int OCR_USER_ID = 0x40301;
 
	 /**
	  * This parameter allows to read passport booklet in TD3 size. The data of the machine-readable zone consists of two rows of 44 characters each.        
	  */
	public final static int OCR_PASSPORT_ENABLE = 0x40302;
	 /**
	  * This parameter allows to read official travel document in TD1 size. The data of the machine-readable zone consists of three rows of 30 characters each.         
	  */
	public final static int OCR_ID_ENABLE = 0x40303;
	 /**
	  * This parameter allows to set minimum confidence used by the OCR algorithm. An higher confidence decreases misdecoding probabilities.          
	  */
	public final static int OCR_CONFIDENCE = 0x40304;
	 /**
	  * This parameter specifies how many decoded frames must match before accepting OCR data.           
	  */
	public final static int OCR_MULTIFRAME = 0x40305;

	//
	// Camera
	//
	/**
	 * This parameter indicates the input type to use for decoding.
	 */
	public final static int INPUT_TYPE = 0x40401;
	/**
	 * This parameter indicates the display mode in which to show the
	 * camera preview in case the input type is set to camera.
	 */
	public final static int PREVIEW_DISPLAY_MODE = 0x40402;
	/**
	 * This parameter indicates the Y coordinate of the preview shown
	 * in case of manual display mode and camera input type, when the
	 * device is positioned in portrait.
	 */
	public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_X = 0x40403;
	/**
	 * This parameter indicates the Y coordinate of the preview shown
	 * in case of manual display mode and camera input type, when the
	 * device is positioned in portrait.
	 */
	public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_Y = 0x40404;
	/**
	 * This parameter indicates the width of the preview shown
	 * in case of manual display mode and camera input type, when the
	 * device is positioned in portrait.
	 */
	public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_WIDTH = 0x40405;
	/**
	 * This parameter indicates the height of the preview shown
	 * in case of manual display mode and camera input type, when the
	 * device is positioned in portrait.
	 */
	public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_HEIGHT = 0x40406;
	/**
	 * This parameter indicates the X coordinate of the preview shown
	 * in case of manual display mode and camera input type, when the
	 * device is positioned in landscape.
	 */
	public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_X = 0x40407;
	/**
	 * This parameter indicates the Y coordinate of the preview shown
	 * in case of manual display mode and camera input type, when the
	 * device is positioned in landscape.
	 */
	public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_Y = 0x40408;
	/**
	 * This parameter indicates the width of the preview shown
	 * in case of manual display mode and camera input type, when the
	 * device is positioned in landscape.
	 */
	public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_WIDTH = 0x40409;
	/**
	 * This parameter indicates the height of the preview shown
	 * in case of manual display mode and camera input type, when the
	 * device is positioned in landscape.
	 */
	public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_HEIGHT = 0x4040A;
	/**
	 * This parameter indicates the zoom level applied to the camera preview.
	 */
	public final static int PREVIEW_ZOOM_LEVEL = 0x4040B;

	//
	// HAN XIN
	//
	//
	 /**
	  * This parameter enables or disables the symbology.       
	  */
	public final static int HAN_XIN_ENABLE = 0x40500;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #HAN_XIN_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int HAN_XIN_LENGTH1 = 0x40501;
	 /**
	  * This parameter is one of the two configurable label lengths.
	  * When {@link #HAN_XIN_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
	  * It can also represent the minor or major length value whenever RANGE is selected.
	  *
	  * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	  * biggest accepted length will be used.  
	  */
	public final static int HAN_XIN_LENGTH2 = 0x40502;
	 /**
	  * This parameter specifies how each L1 and L2 length values should be applied to a label. 
	  */
	public final static int HAN_XIN_LENGTH_CONTROL = 0x40503;
	 /**
	  * This parameter specifies the symbology identifier (if any).
	  * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
	  * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.  
	  */
	public final static int HAN_XIN_USER_ID = 0x40504;

	//
	// TLC39
	//
        /**
         * This parameter enables or disables the symbology.
         */
	public final static int TLC39_ENABLE = 0x40600;
        /**
         * This parameter is one of the two configurable label lengths.
         * When {@link #TLC39_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
         * It can also represent the minor or major length value whenever RANGE is selected.
         *
         * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
         * biggest accepted length will be used.
         */
	public final static int TLC39_LENGTH1 = 0x40601;
        /**
         * This parameter is one of the two configurable label lengths.
         * When {@link #TLC39_LENGTH_CONTROL} is set to TWO_FIXED, its value is one of the two possible accepted fixed lengths for a specific label.
         * It can also represent the minor or major length value whenever RANGE is selected.
         *
         * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
         * biggest accepted length will be used.
         */
	public final static int TLC39_LENGTH2 = 0x40602;
        /**
         * This parameter specifies how each L1 and L2 length values should be applied to a label.
         */
	public final static int TLC39_LENGTH_CONTROL = 0x40603;
        /**
         * This parameter specifies the symbology identifier (if any).
         * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to
         * USERDEFINED_IDENTIFIER_BEFORE_LABEL or USERDEFINED_IDENTIFIER_AFTER_LABEL.
         */
	public final static int TLC39_USER_ID = 0x40604;
        /**
         * This parameter enables linear code transmission.
         */
	public final static int TLC39_LINEAR_TRANSMISSION_ENABLE = 0x40605;

	//
	// SNAP OCR
	//
        /**
         * This parameter enables or disables the Snap Ocr feature.
         */
	public final static int SNAP_OCR_ENABLE = 0x40700;
        /**
         * This parameter specifies how the OCR text is selected.
         */
	public final static int SNAP_OCR_FIRST_SELECTION_MODE = 0x40701;
        /**
         * This parameter specifies how to send the OCR results, if they are concatenated
         * in the same result or divided in different results.
         */
	public final static int SNAP_OCR_RESULTS_COMBINATION = 0x40702;
        /**
         * This parameter is a String providing the separator between results,
         * only used in concatenated mode.
         */
	public final static int SNAP_OCR_RESULT_SEPARATOR = 0x40703;
        /**
         * This parameter specifies the settings used to define ROIs on the image, inside of which the
         * OCR text is decoded. These settings are used only when the first selection mode is set to ROI_PROPOSE or
         * ROI_SEND.
         */
	public final static int SNAP_OCR_ROI_SETTINGS = 0x40704;
        /**
         * This parameter specifies the scanning policy.
         */
	public final static int SNAP_OCR_SCANNING_POLICY = 0x40705;
        /**
         * This parameter is a regular expression used to filter any OCR text, excluding
         * the values that don't match the filter.
         */
	public final static int SNAP_OCR_REGEX_FILTER = 0x40706;
        /**
         * This parameter is used to setup the background color in the OCR result dialog.
         */
	public final static int SNAP_OCR_COLOR_BLOCK = 0x40707;
        /**
         * This parameter is used to setup the text color in the OCR result dialog.
         */
	public final static int SNAP_OCR_COLOR_TEXT = 0x40708;
        /**
         * This parameter is used to show or hide the reference ROI from
         * the preview and from the OCR result dialog.
         */
	public final static int SNAP_OCR_REFERENCE_ROI_VISIBILITY = 0x40709;
        /**
         * This parameter allows to show the ROI number as prefix inside the OCR
         * results, when enabled. The prefix is set in the format ROI_NUMBER:OCR_TEXT, where
         * ROI_NUMBER indicates the index of the ROI inside the ROI settings (starting from 1)
         * and OCR_TEXT is the original result.
         */
	public final static int SNAP_OCR_ROI_PREFIX_VISIBILITY = 0x4070A;
}
