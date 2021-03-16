package com.datalogic.decode.configuration;

/**
 * <code>ToneNotificationChannel</code> is an enumeration defining the audio channel to use for
 * the scanner notification, subject to Good read rules.
 * 
 * The type is one of:
 * <table border=2>
 * <tr>
 * <td>SCANNER</td>
 * <td>The audio channel used by the scanner (default). While using this channel, the volume is controlled by the {@link DecodingNotification#goodReadAudioVolume} property.</td>
 * </tr>
 * <tr>
 * <td>MUSIC</td>
 * <td>The music audio channel. While using this channel, the volume is controlled by the <a href="https://developer.android.com/reference/android/media/AudioManager#STREAM_MUSIC"><b>STREAM_MUSIC</b></a> channel and subsequently modified by the {@link DecodingNotification#goodReadAudioVolume} property.</td>
 * </tr>
 * <tr>
 * <td>VOICE_CALL</td>
 * <td>The voice call audio channel. While using this channel, the volume is controlled by the <a href="https://developer.android.com/reference/android/media/AudioManager#STREAM_VOICE_CALL"><b>STREAM_VOICE_CALL</b></a> channel and subsequently modified by the {@link DecodingNotification#goodReadAudioVolume} property.</td>
 * </tr>
 * <tr>
 * <td>ALARM</td>
 * <td>The alarm audio channel. While using this channel, the volume is controlled by the <a href="https://developer.android.com/reference/android/media/AudioManager#STREAM_ALARM"><b>STREAM_ALARM</b></a> channel and subsequently modified by the {@link DecodingNotification#goodReadAudioVolume} property.</td>
 * </tr>
 * <tr>
 * <td>RING</td>
 * <td>The phone ring audio channel. While using this channel, the volume is controlled by the <a href="https://developer.android.com/reference/android/media/AudioManager#STREAM_RING"><b>STREAM_RING</b></a> channel and subsequently modified by the {@link DecodingNotification#goodReadAudioVolume} property.</td>
 * </tr>
 * </table>
 */
public enum ToneNotificationChannel {
	/**
	 * Scanner
	 */
	SCANNER,
	/**
	 * Music
	 */
	MUSIC,
	/**
	 * Voice call
	 */
	VOICE_CALL,
	/**
	 * Alarm
	 */
	ALARM,
	/**
	 * Ring
	 */
	RING;
}
