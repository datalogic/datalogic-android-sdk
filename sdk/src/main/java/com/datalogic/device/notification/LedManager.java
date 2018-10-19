package com.datalogic.device.notification;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

/**
 * This class provides access to leds related methods of the device.
 */
public class LedManager {

	/**
	 * This is the constructor of LedManager.
	 * 
	 * @throws DeviceException in case of error.
	 */
	public LedManager() {
	}

	/**
	 * Blinking led method. This method start blinking a led without blocking
	 * the caller thread.
	 * 
	 * @param id
	 *            Specifies which {@link Led} to control.
	 * @param ARGB
	 *            <code>int</code> value that specifies the led color in RGB 24 bits format, following the standard components defined in
	 * {@link <a href="http://developer.android.com/reference/android/graphics/Color.html">android.graphics.Color</a>}.
	 * @see <a href="http://developer.android.com/reference/android/graphics/Color.html#rgb(int, int, int)">android.graphics.Color#rgb</a>
	 * @param count
	 *            <code>int</code> value that specifies how many on/off cycles should be performed before
	 *            the LED is turned off. If set to zero, then the LED is turned
	 *            off immediately. If set to -1, the LED is cycled until it is
	 *            explicitly turned off.
	 * @param onMS
	 *            <code>int</code> value that specifies how long (in ms) during an on/off cycle the LED
	 *            should be turned on. If set to zero, the LED is simply turned
	 *            off.
	 * @param offMS
	 *            <code>int</code> range that specifies how long (in ms) during an on/off cycle the LED
	 *            should be turned off. If set to zero, the LED remains on until
	 *            all cycles are complete.
	 * 
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int blinkLed(Led id, int ARGB, int count, int onMS, int offMS) {
		return 0;
	}

	/**
	 * Blinking led method. This method start blinking a led without blocking
	 * the caller thread.
	 * 
	 * @param id
	 *            Specifies which {@link Led} to control.
	 * @param count
	 *            <code>int</code> value that specifies how many on/off cycles should be performed before
	 *            the LED is turned off. If set to zero, then the LED is turned
	 *            off immediately. If set to -1, the LED is cycled until it is
	 *            explicitly turned off.
	 * @param onMS
	 *            <code>int</code> value that specifies how long (in ms) during an on/off cycle the LED
	 *            should be turned on. If set to zero, the LED is simply turned
	 *            off.
	 * @param offMS
	 *            <code>int</code> range that specifies how long (in ms) during an on/off cycle the LED
	 *            should be turned off. If set to zero, the LED remains on until
	 *            all cycles are complete.
	 * 
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int blinkLed(Led id, int count, int onMS, int offMS) {
		return 0;
	}

	/**
	 * Setting led method. This method turns on or off a led without blocking
	 * the caller thread.
	 * 
	 * @param id
	 *            Specifies which {@link Led} to control.
	 * @param enable
	 *            <code>boolean</code> value set to true to enable the LED, while set to false to disable
	 *            the LED.
	 * @param ARGB
	 *            <code>int</code> value that specifies the led color in RGB 24 bits format, following the standard components defined in
	 * {@link <a href="http://developer.android.com/reference/android/graphics/Color.html">android.graphics.Color</a>}.
	 * @see <a href="http://developer.android.com/reference/android/graphics/Color.html#rgb(int, int, int)">android.graphics.Color#rgb</a>
	 *
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setLed(Led id, boolean enable, int ARGB) {
		return 0;
	}

	/**
	 * Setting led method. This method turns on or off a led without blocking
	 * the caller thread.
	 * 
	 * @param id
	 *            Specifies which {@link Led} to control.
	 * @param enable
	 *            A <code>boolean</code> value set to true that enables the LED and a value of false that disables
	 *            the LED.
	 * 
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setLed(Led id, boolean enable) {
		return 0;
	}
}
