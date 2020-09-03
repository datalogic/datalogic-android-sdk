package com.datalogic.decode;

/**
 * <code>PropertyID</code> is the class that includes all the properties
 * identifiers.
 */
public class PropertyID {
	//
	// General Decoding definitions
	//
	public final static int DISPLAY_MODE_ENABLE = 0x0006;
	public final static int ILLUMINATION_ENABLE = 0x0007;
	public final static int AIM_ENABLE = 0x0008;
	public final static int TARGET_MODE = 0x0009;
	public final static int PICKLIST_ENABLE = 0x000A;
	public final static int TARGET_MODE_ENABLE = 0x000B;
	public final static int IMAGE_CAPTURE_PROFILE = 0x000C;
	public final static int CUSTOM_IMAGE_CAPTURE_PROFILE = 0x000D;
	public final static int ILLUMINATION_TYPE = 0x000E;
	public final static int GOOD_READ_ENABLE = 0x0010;
	public final static int GREEN_SPOT_ENABLE = 0x0011;
	public final static int GOOD_READ_VIBRATE_ENABLE = 0x0012;
	public final static int GOOD_READ_LED_ENABLE = 0x0013;
	public final static int REMOVE_NON_PRINTABLE_CHARS = 0x0018;
	public final static int GOOD_READ_COUNT = 0x0020;
	public final static int GOOD_READ_DURATION = 0x0022;
	public final static int SEND_CODE_ID = 0x0025;
	public final static int LABEL_PREFIX = 0x0026;
	public final static int LABEL_SUFFIX = 0x0027;
	public final static int TARGET_TIMEOUT = 0x0029;
	public final static int TARGET_RELEASE_TIMEOUT = 0x002A;
	public final static int GS_SUBSTITUTION = 0x002C;
	public final static int DECODE_TIMEOUT = 0x002D;
	public final static int GOOD_READ_INTERVAL = 0x002E;
	public final static int GOOD_READ_AUDIO_VOLUME = 0x002F;
	public final static int GOOD_READ_AUDIO_FILE = 0x0030;
	public final static int DISPLAY_NOTIFICATION_ENABLE = 0x0031;
	public final static int GOOD_READ_AUDIO_TONE = 0x0032;
	public final static int GOOD_READ_AUDIO_MODE = 0x0033;
	public final static int MULTISCAN_ENABLE = 0x0050;
	public final static int MULTISCAN_REQUIRED_LABELS = 0x0051;
	public final static int MULTISCAN_NOTIFICATION_ENABLE = 0x0052;
	public final static int INVERSE_1D_SYMBOLOGIES = 0x0060;
	public final static int INVERSE_2D_SYMBOLOGIES = 0x0061;

	//
	// Code 39 definitions
	//
	public final static int CODE39_ENABLE = 0x0100;
	public final static int CODE39_SHORT_QUIET_ZONES = 0x0101;
	public final static int CODE39_ENABLE_CHECK = 0x0102;
	public final static int CODE39_SEND_CHECK = 0x0103;
	public final static int CODE39_FULL_ASCII = 0x0105;
	public final static int CODE39_LENGTH1 = 0x0120;
	public final static int CODE39_LENGTH2 = 0x0121;
	public final static int CODE39_LENGTH_CONTROL = 0x0122;
	public final static int CODE39_USER_ID = 0x0123;

	//
	// Trioptic definitions
	//
	public final static int TRIOPTIC_ENABLE = 0x0108;
	public final static int TRIOPTIC_USER_ID = 0x0125;

	//
	// Pharmacode 39 definitions
	//
	public final static int CODE32_ENABLE = 0x0110;
	public final static int CODE32_USER_ID = 0x0127;

	//
	// Discrete 2/5 definitions
	//
	public final static int D25_ENABLE = 0x0200;
	public final static int D25_LENGTH1 = 0x0220;
	public final static int D25_LENGTH2 = 0x0221;
	public final static int D25_LENGTH_CONTROL = 0x0222;
	public final static int D25_USER_ID = 0x0223;

	//
	// Matrix 2/5 definitions
	//
	public final static int M25_ENABLE = 0x0208;
	public final static int M25_LENGTH1 = 0x0224;
	public final static int M25_LENGTH2 = 0x0225;
	public final static int M25_LENGTH_CONTROL = 0x0226;
	public final static int M25_USER_ID = 0x0227;

	//
	// Interleaved 2/5 definitions
	//
	public final static int I25_ENABLE = 0x0210;
	public final static int I25_ENABLE_CHECK = 0x0212;
	public final static int I25_SEND_CHECK = 0x0213;
	public final static int I25_LENGTH1 = 0x0228;
	public final static int I25_LENGTH2 = 0x0229;
	public final static int I25_LENGTH_CONTROL = 0x022A;
	public final static int I25_USER_ID = 0x022B;

	//
	// Codabar definitions
	//
	public final static int CODABAR_ENABLE = 0x0300;
	public final static int CODABAR_ENABLE_CHECK = 0x0302;
	public final static int CODABAR_SEND_CHECK = 0x0303;
	public final static int CODABAR_SEND_START = 0x0305;
	public final static int CODABAR_CLSI = 0x0306;
	public final static int CODABAR_LENGTH1 = 0x0320;
	public final static int CODABAR_LENGTH2 = 0x0321;
	public final static int CODABAR_LENGTH_CONTROL = 0x0322;
	public final static int CODABAR_USER_ID = 0x0323;

	//
	// Code 93 definitions
	//
	public final static int CODE93_ENABLE = 0x0400;
	public final static int CODE93_LENGTH1 = 0x0420;
	public final static int CODE93_LENGTH2 = 0x0421;
	public final static int CODE93_LENGTH_CONTROL = 0x0422;
	public final static int CODE93_USER_ID = 0x0423;

	//
	// Code 128 definitions
	//
	public final static int CODE128_ENABLE = 0x0408;
	public final static int CODE128_LENGTH1 = 0x0424;
	public final static int CODE128_LENGTH2 = 0x0425;
	public final static int CODE128_LENGTH_CONTROL = 0x0426;
	public final static int CODE128_USER_ID = 0x0427;
	public final static int CODE128_GS1_ENABLE = 0x040C;
	public final static int CODE128_GS1_USER_ID   = 0x0428;
	public final static int CODE128_AGGRESSIVENESS = 0x0429;
	public final static int CODE128_SHORT_QUIET_ZONES = 0x042A;

	//
	// UPC-A definitions
	//
	public final static int UPCA_ENABLE = 0x0500;
	public final static int UPCA_SEND_CHECK = 0x0502;
	public final static int UPCA_SEND_SYS = 0x0503;
	public final static int UPCA_TO_EAN13 = 0x0504;
	public final static int UPCA_USER_ID = 0x0521;

	//
	// UPC-E definitions
	//
	public final static int UPCE_ENABLE = 0x0508;
	public final static int UPCE_SEND_CHECK = 0x050A;
	public final static int UPCE_SEND_SYS = 0x050B;
	public final static int UPCE_TO_UPCA = 0x050C;
	public final static int UPCE_USER_ID = 0x0523;
	public final static int UPCE1_ENABLE = 0x0509;

	//
	// EAN-13 definitions
	//
	public final static int EAN13_ENABLE = 0x0510;
	public final static int EAN13_SEND_CHECK = 0x0512;
	public final static int EAN13_SEND_SYS = 0x0513;
	public final static int EAN13_TO_ISBN = 0x0514;
	public final static int EAN13_TO_ISSN = 0x0515;
	public final static int EAN13_USER_ID = 0x0525;

	//
	// EAN-8 definitions
	//
	public final static int EAN8_ENABLE = 0x0518;
	public final static int EAN8_SEND_CHECK = 0x051A;
	public final static int EAN8_TO_EAN13 = 0x051B;
	public final static int EAN8_USER_ID = 0x0527;

	//
	// UPC/EAN Extensions definitions
	//
	public final static int EAN_EXT_ENABLE_2_DIGIT = 0x051C;
	public final static int EAN_EXT_ENABLE_5_DIGIT = 0x051D;
	public final static int EAN_EXT_REQUIRE = 0x051F;

	//
	// UPC/EAN Options
	//
	public final static int UPC_EAN_SHORT_QUIET_ZONES = 0x0520;

	//
	// MSI definitions
	//
	public final static int MSI_ENABLE = 0x0608;
	public final static int MSI_REQUIRE_2_CHECK = 0x060A;
	public final static int MSI_SEND_CHECK = 0x060B;
	public final static int MSI_CHECK_2_MOD_11 = 0x060C;
	public final static int MSI_LENGTH1 = 0x0624;
	public final static int MSI_LENGTH2 = 0x0625;
	public final static int MSI_LENGTH_CONTROL = 0x0626;
	public final static int MSI_USER_ID = 0x0627;
	public final static int MSI_AGGRESSIVENESS = 0x0628;
	public final static int MSI_SHORT_QUIET_ZONES = 0x0629;

	//
	// RSS-14 definitions
	//
	public final static int GS1_14_ENABLE = 0x0800;
	public final static int GS1_14_GS1_128_MODE = 0x0803;
	public final static int GS1_14_USER_ID = 0x0821;

	//
	// RSS Limited definitions
	//
	public final static int GS1_LIMIT_ENABLE = 0x0808;
	public final static int GS1_LIMIT_GS1_128_MODE = 0x080B;
	public final static int GS1_LIMIT_USER_ID = 0x0823;

	//
	// RSS Expanded definitions
	//
	public final static int GS1_EXP_ENABLE = 0x0810;
	public final static int GS1_EXP_GS1_128_MODE = 0x0813;
	public final static int GS1_EXP_LENGTH1 = 0x0824;
	public final static int GS1_EXP_LENGTH2 = 0x0825;
	public final static int GS1_EXP_LENGTH_CONTROL = 0x0826;
	public final static int GS1_EXP_USER_ID = 0x0827;

	//
	// Postal Code definitions
	//
	public final static int US_POSTNET_ENABLE = 0x0910;
	public final static int US_PLANET_ENABLE = 0x0911;
	public final static int USPS_4STATE_ENABLE = 0x0913;
	public final static int ROYAL_MAIL_ENABLE = 0x0915;
	public final static int ROYAL_MAIL_SEND_CHECK = 0x0916;
	public final static int AUSTRALIAN_POST_ENABLE = 0x0917;
	public final static int KIX_CODE_ENABLE = 0x0918;
	public final static int JAPANESE_POST_ENABLE = 0x0919;
	public final static int US_PLANET_CODE_USER_ID = 0x092A;
	public final static int US_POSTNET_CODE_USER_ID = 0x092B;
	public final static int USPS_4STATE_CODE_USER_ID = 0x092C;
	public final static int ROYAL_MAIL_CODE_USER_ID = 0x092E;
	public final static int AUSTRALIAN_CODE_USER_ID = 0x092F;
	public final static int KIX_CODE_USER_ID = 0x0930;
	public final static int JAPANESE_POST_CODE_USER_ID = 0x0931;

	//
	// PDF417 definitions
	//
	public final static int PDF417_ENABLE = 0x0A00;
	public final static int PDF417_LENGTH1 = 0x0A20;
	public final static int PDF417_LENGTH2 = 0x0A21;
	public final static int PDF417_LENGTH_CONTROL = 0x0A22;
	public final static int PDF417_USER_ID = 0x0A23;
	public final static int PDF417_CHARACTER_SET_MODE = 0x0A02;

	//
	// MicroPDF417 definitions
	//
	public final static int MICROPDF417_ENABLE = 0x0A08;
	public final static int MICROPDF417_LENGTH1 = 0x0A24;
	public final static int MICROPDF417_LENGTH2 = 0x0A25;
	public final static int MICROPDF417_LENGTH_CONTROL = 0x0A26;
	public final static int MICROPDF417_USER_ID = 0x0A27;
	public final static int MICROPDF417_CHARACTER_SET_MODE = 0x0A0A;

	//
	// UCC EAN Composite
	//
	public final static int COMPOSITE_ENABLE = 0x0A30;
	public final static int COMPOSITE_EAN_UPC_MODE = 0x0A32;
	public final static int COMPOSITE_GS1_128_MODE = 0x0A33;
	public final static int COMPOSITE_USER_ID = 0x0A53;

	//
	// DataMatrix definitions
	//
	public final static int DATAMATRIX_ENABLE = 0x0B00;
	public final static int DATAMATRIX_LENGTH1 = 0x0B20;
	public final static int DATAMATRIX_LENGTH2 = 0x0B21;
	public final static int DATAMATRIX_LENGTH_CONTROL = 0x0B22;
	public final static int DATAMATRIX_USER_ID = 0x0B23;
	public final static int DATAMATRIX_CHARACTER_SET_MODE = 0x0B02;
	public final static int DATAMATRIX_OPERATING_MODE = 0x0B03;

	//
	// MaxiCode definitions
	//
	public final static int MAXICODE_ENABLE = 0x0B08;
	public final static int MAXICODE_LENGTH1 = 0x0B24;
	public final static int MAXICODE_LENGTH2 = 0x0B25;
	public final static int MAXICODE_LENGTH_CONTROL = 0x0B26;
	public final static int MAXICODE_USER_ID = 0x0B27;

	//
	// QR Code definitions
	//
	public final static int QRCODE_ENABLE = 0x0B10;
	public final static int QRCODE_LENGTH1 = 0x0B28;
	public final static int QRCODE_LENGTH2 = 0x0B29;
	public final static int QRCODE_LENGTH_CONTROL = 0x0B2A;
	public final static int QRCODE_USER_ID = 0x0B2B;
	public final static int QRCODE_CHARACTER_SET_MODE = 0x0B12;
	public final static int QRCODE_WIFI_ENABLE = 0x30E41;

	//
	// Micro QR Code definitions
	//
	public final static int MICRO_QR_ENABLE = 0x0B14;
	public final static int MICRO_QR_LENGTH1 = 0x0B30;
	public final static int MICRO_QR_LENGTH2 = 0x0B31;
	public final static int MICRO_QR_LENGTH_CONTROL = 0x0B32;
	public final static int MICRO_QR_USER_ID = 0x0B33;
	public final static int MICRO_QR_CHARACTER_SET_MODE = 0x0B16;

	//
	// Aztec Code definitions
	//
	public final static int AZTEC_ENABLE = 0x0B18;
	public final static int AZTEC_LENGTH1 = 0x0B2C;
	public final static int AZTEC_LENGTH2 = 0x0B2D;
	public final static int AZTEC_LENGTH_CONTROL = 0x0B2E;
	public final static int AZTEC_USER_ID = 0x0B2F;
	public final static int AZTEC_CHARACTER_SET_MODE = 0x0B1A;

	//
	// Digimarc Barcode definitions
	//
	public final static int DIGIMARC_ENABLE = 0x10000;

	//
	// DotCode definitions
	//
	public final static int DOTCODE_ENABLE = 0x0C00;
	public final static int DOTCODE_LENGTH1 = 0x0C20;
	public final static int DOTCODE_LENGTH2 = 0x0C21;
	public final static int DOTCODE_LENGTH_CONTROL = 0x0C22;
	public final static int DOTCODE_USER_ID = 0x0C23;
	public final static int DOTCODE_CHARACTER_SET_MODE = 0x0C02;

	//
	// ISBT 128 definitions
	//
	public final static int ISBT_128_ENABLE = 0x0D00;
	public final static int ISBT_128_USER_ID = 0x0D01;
	public final static int ISBT_128_COMMONLY_CONCATENATED_PAIRS = 0x0D02;
	public final static int ISBT_128_MODE = 0x0D03;

	//
	// Wedge - Keyboard, Intent mode & Web
	//
	public final static int WEDGE_KEYBOARD_ENABLE = 0x11170;
	public final static int WEDGE_KEYBOARD_ONLY_ON_FOCUS = 0x11171;
	public final static int WEDGE_KEYBOARD_DELIVERY_MODE = 0x11172;
	public final static int WEDGE_INTENT_ENABLE = 0x30D40;
	public final static int WEDGE_INTENT_ACTION_NAME = 0x30D41;
	public final static int WEDGE_INTENT_CATEGORY_NAME = 0x30D42;
	public final static int WEDGE_INTENT_DELIVERY_MODE = 0x30D43;
	public final static int WEDGE_INTENT_EXTRA_BARCODE_DATA = 0x30D44;
	public final static int WEDGE_INTENT_EXTRA_BARCODE_TYPE = 0x30D45;
	public final static int WEDGE_INTENT_EXTRA_BARCODE_STRING = 0x30D46;
	public final static int WEDGE_WEB_ENABLE = 0x30E40;

	//
	// External formatting
	//
	public final static int EXTERNAL_FORMATTING_ENABLE = 0x40000;

	//
	// ECI Policy
	//
	public final static int ECI_POLICY = 0x40200;

	//
	// Frame capture
	//
	public final static int FRAME_CAPTURE_ENABLE = 0x50000;
	public final static int FRAME_CAPTURE_FILE_PATH = 0x50001;
	public final static int FRAME_CAPTURE_FORMAT = 0x50002;
	public final static int FRAME_CAPTURE_MODE = 0x50003;
	public final static int FRAME_CAPTURE_STORAGE_ENABLE = 0x50004;
}
