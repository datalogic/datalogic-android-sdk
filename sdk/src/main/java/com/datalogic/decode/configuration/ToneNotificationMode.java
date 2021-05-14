package com.datalogic.decode.configuration;

/**
 * <code>ToneNotificationMode</code> is an enumeration defining the audio notification mode, subject to Good read rules.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>NONE</td>
 * <td>Turn off audio notification mechanism</td>
 * </tr>
 * <tr>
 * <td>BEEP</td>
 * <td>Play a simple beep sound</td>
 * </tr>
 * <tr>
 * <td>AUDIO_FILE</td>
 * <td>Play the desired audio file, specified by {@link DecodingNotification#goodReadAudioFile}, just one time</td>
 * </tr>
  * </tr>
 * <tr>
 * <td>VIPER</td>
 * <td>Play Viper beep sound, just one time</td>
 * </tr>
  * </tr>
 * <tr>
 * <td>BAROQUE</td>
 * <td>Play Baroque beep sound, just one time</td>
 * </tr>

 * </table>
 */
public enum ToneNotificationMode {
    /**
     * None
     */
	NONE,
	/**
	 * Play a beep
	 */
	BEEP,
	/**
	 * Play an audio tone of choice
	 */
	AUDIO_FILE,
	/**
	 * Play viper tone.
	 */
	VIPER,
	/**
	 * Play baroque tone.
	 */
	BAROQUE;
}
