package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>DecodingNotification</code> is the class that configures the
 * notification to produce on a successful read .
 */
public class DecodingNotification extends PropertyGroup {

	/**
	 * <code>goodReadCount</code> indicates the number of notifications to
	 * produce on a successful read.
	 */
	public NumericProperty goodReadCount;

	/**
	 * <code>goodReadDuration</code> is the duration of each notification on a
	 * successful read.
	 */
	public NumericProperty goodReadDuration;

	/**
	 * <code>goodReadInterval</code> is the delay between notifications on a
	 * successful read.
	 */
	public NumericProperty goodReadInterval;

	/**
	 * <code>goodReadAudioVolume</code> is the volume of the audio notification
	 * on a successfull read.
	 */
	public NumericProperty goodReadAudioVolume;

	/**
	 * <code>goodReadAudioFile</code> is the file used for the audio
	 * notification on a successfull read.
	 */
	public TextProperty goodReadAudioFile;

	/**
	 * <code>goodReadAudioMode</code> selects the scanner audio notification mode.
	 * That corresponds to one of the {@link ToneNotificationMode} values.
	 */
	public EnumProperty<ToneNotificationMode> goodReadAudioMode;

	/**
	 * <code>goodReadAudioChannel</code> selects the audio channel to use for the
         * scanner notification. That corresponds to one of the
         * {@link ToneNotificationChannel} values.
	 */
	public EnumProperty<ToneNotificationChannel> goodReadAudioChannel;

	/**
	 * <code>goodReadTimeout</code> specifies the delay (in milliseconds) after which the
	 * good read LEDs are disabled. This value is considered only when the
	 * <code>goodReadCount</code> is 1. The value range is between 20 and 5000 for
	 * normal scanning sessions. The maximum value is lowered to 500 in case of a scan mode
	 * different from SINGLE or when the target mode is set to RELEASE_SCAN.
	 */
	public NumericProperty goodReadTimeout;

	/**
	 * This is the constructor of DecodingNotification. All options are
	 * initialized by editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public DecodingNotification(PropertyGetter editor) {
	}

}
