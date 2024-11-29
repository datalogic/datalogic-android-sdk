package com.datalogic.decode.configuration;

/**
 * <code>ToneNotificationMode</code> is an enumeration defining the audio notification mode, subject to Good read rules.
 * 
 */
public enum ToneNotificationMode {
    /**
     * None
     */
	NONE,
	/**
	 * Play a beep.
	 */
	BEEP,
	/**
	 * Play an audio tone of choice, specified by {@link DecodingNotification#goodReadAudioFile}, just one time.
	 */
	AUDIO_FILE,
	/**
	 * Play viper tone.
	 */
	VIPER,
	/**
	 * Play baroque tone.
	 */
	BAROQUE,
	/**
	 * Play loud tone.
	 */
	LOUD,
	/**
	 * Play tweet tone.
	 */
	TWEET;

}
