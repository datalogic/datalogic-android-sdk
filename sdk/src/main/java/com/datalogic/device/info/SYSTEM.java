package com.datalogic.device.info;

import java.util.HashMap;
import android.graphics.Bitmap;
import com.datalogic.device.BootType;

/**
 * The <code>SYSTEM</code> class provides access to system info.
 */
public class SYSTEM {
	/**
	 *  The Version class contains strings and constants used for values
	 * in the {@link Version#ACTION_DEVICE_INFO} Intent.
	 */
	public static class Version {
		/**
		 * @hide
		 */
		public static final short SDK_VERSION_MAJOR = 1;
		/**
		 * @hide This changes frequently
		 */
		public static final short SDK_VERSION_MINOR = 17;

		/**
		 * Broadcast Action:  This is a <em>sticky broadcast</em> containing the
		 * device identification number, name and other information about the terminal.
		 *
		 * <p class="note">
		 * You can <em>not</em> receive this through components declared
		 * in manifests, only by explicitly registering for it with
		 * {@link <a href="http://developer.android.com/reference/android/content/Context.html#registerReceiver(android.content.BroadcastReceiver,
		 * android.content.IntentFilter)">Context.registerReceiver(BroadcastReceiver, IntentFilter)</a>}
		 *
		 * <p class="note">This is a protected intent that can only be sent
		 * by the system.
		 */
		public static final String ACTION_DEVICE_INFO =
				"com.datalogic.device.info.action.DEVICE_INFO";

		/**
		 * Extra for {@link Version#ACTION_DEVICE_INFO}: String containing the device name.
		 */
		public static final String EXTRA_DEVICE_NAME =
				"device_name";
		/**
		 * Extra for {@link Version#ACTION_DEVICE_INFO}: integer containing the device ID number.
		 */
		public static final String EXTRA_DEVICE_ID =
				"device_id";
		/**
		 * Extra for {@link Version#ACTION_DEVICE_INFO}: integer containing the device hardware revision.
		 */
		public static final String EXTRA_HW_REVISION =
				"device_hw_revision";
		/**
		 * Extra for {@link Version#ACTION_DEVICE_INFO}: String containing the device firmware version.
		 */
		public static final String EXTRA_FW_VERSION =
				"device_fw_version";
		/**
		 * Extra for {@link Version#ACTION_DEVICE_INFO}: String containing the device Datalogic SDK version.
		 */
		public static final String EXTRA_SDK_VERSION =
				"sdk_version";
		/**
		 * Extra for {@link Version#ACTION_DEVICE_INFO}: String containing the device's scan engine module ID.
		 */
		public static final String EXTRA_SCAN_ENGINE =
				"scan_engine_model";
	}

	/**
	 * Returns the type of boot.
	 * 
	 * @see com.datalogic.device.BootType
	 */
	public static final BootType BOOT_TYPE = getBootType();

	/**
	 * Returns the keyboard type identifier.
	 * 
	 * @see com.datalogic.device.info.KeyboardType
	 */
	public static final KeyboardType KEYBOARD_TYPE = getKeyboardType();

	/**
	 * Returns a number indicating the Datalogic SDK version in use at compile time.
	 * Future SDK releases will always have a greater number.
	 */
	public static final int SDK_VERSION_INT = (Version.SDK_VERSION_MAJOR << 16) + Version.SDK_VERSION_MINOR;

	/**
	 * Returns a String indicating the Datalogic SDK version in use at compile time.
	 */
	public static final String SDK_VERSION = "" + (Version.SDK_VERSION_MAJOR) + "."+ (Version.SDK_VERSION_MINOR);

	/**
	 * Returns a number indicating the installed Datalogic Services version on
	 * the device.
	 */
	public static final int SERVICES_VERSION_INT = getServicesInt();

	/**
	 * Returns a String indicating the installed Datalogic SDK add-on version on
	 * the device.
	 */
	public static final String SERVICES_VERSION = getServicesString();

	/**
	 * Returns the type of the barcode scanner.
	 * 
	 * @see com.datalogic.device.info.BarcodeScannerType
	 */
	public static final BarcodeScannerType BARCODE_SCANNER_TYPE = getScannerType();

	/**
	 * Returns the type of the Wi-Fi adapter.
	 * 
	 * @see com.datalogic.device.info.WiFiType
	 */
	public static final WiFiType WIFI_TYPE = getWiFiType();

	/**
	 * Returns the device image.
	 */
	public static final Bitmap DEVICE_IMAGE = getBitmapFromRes("device.png");

	/**
	 * Returns a number indicating the installed Datalogic SDK version on
	 * the device. Future SDK releases will always have a greater number.
	 */
	public static final int DEVICE_SDK_VERSION_INT = getSdkInt();

	/**
	 * Returns a String indicating the installed Datalogic SDK version on
	 * the device.
	 */
	public static final String DEVICE_SDK_VERSION = getSdkString();

	/**
	 * Retrieves BootType
	 * 
	 * @hide
	 */
	private static BootType getBootType() {
		return null;
	}

	/**
	 * Retrieves getKeyboardType
	 * 
	 * @hide
	 */
	private static KeyboardType getKeyboardType() {
		return null;
	}

	/**
	 * Returns statically SDK version number.
	 * 
	 * @hide
	 */
	private static int getSdkInt() {
		return (Version.SDK_VERSION_MAJOR << 16) + Version.SDK_VERSION_MINOR;
	}

	/**
	 * Returns statically Services version number.
	 * 
	 * @hide
	 */
	private static int getServicesInt() {
		return 0;
	}

	/**
	 * Returns statically SDK version String.
	 * 
	 * @hide
	 */
	private static String getSdkString() {
		return new String("" + (Version.SDK_VERSION_MAJOR) + "."
				+ (Version.SDK_VERSION_MINOR));
	}

	/**
	 * Returns statically Services version String.
	 * 
	 * @hide
	 */
	private static String getServicesString() {
		return new String("" + (SERVICES_VERSION_INT >> 16) + "."
				+ (0x0000FFFF & SERVICES_VERSION_INT));
	}

	/**
	 * Returns current ScannerType installed
	 * 
	 * @hide
	 */
	private static BarcodeScannerType getScannerType() {
		return null;
	}

	/**
	 * Returns current WifiType installed
	 * 
	 * @hide
	 */
	private static WiFiType getWiFiType() {
		return null;
	}

	/**
	 * This function returns system component version.
	 * 
	 * @return HashMap containing pairs of key and value Strings, associated to different software component versions.
	 */
	public static HashMap<String, String> getVersions() {
		return null;
	}

	/**
	 * @hide
	 * @param filename
	 *            Name of the image file with extension to fetch from the base
	 *            directory, currently /system/usr/<filename>
	 * @return
	 */
	private static Bitmap getBitmapFromRes(String filename) {
		return null;
	}
}
