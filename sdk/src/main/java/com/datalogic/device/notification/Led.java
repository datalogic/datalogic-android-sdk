package com.datalogic.device.notification;

/**
 * The <code>Led</code> enumeration lists the LED type identifiers can be used to manage the LEDs on the device with {@link LedManager} interface.
 * </br></br>
 * Depending on the device, LEDs can be single-color, two-color (red and green) or RGB.</br>
 * Moreover, some of the LEDs defined by this interface could be not supported in some devices. </br>
 * </br>
 * <b>NOTE:</b> SDK v1.38 introduced the {@link #LED_SCANNER} as interface extension of {@link #LED_GOOD_READ}. So, even when they are both supported, they refer to the same physical LED.</br>
 * </br>
 * For further details on how to manage LEDs, refer to the comprehensive SDK examples:
 * </br>
 * <ul>
 *    <li> Source code in <a href="https://github.com/datalogic/android-samples-astudio/blob/master/Java/DeviceSampleAPI/app/src/main/java/com/datalogic/examples/devicesampleapi/NotificationActivity.java">Java</a> (NotificationActivity.java)
 *    <li> Source code in <a href="https://github.com/datalogic/android-samples-astudio/blob/master/Kotlin/DeviceSampleAPI/app/src/main/java/com/datalogic/examples/devicesampleapi/NotificationActivity.kt">Kotlin</a> (NotificationActivity.kt)
 * </ul>
 */
public enum Led {
	/**
	 * Good read LED is the LED used by the decoder to notify the good read event (typically it is as single color green LED).
     * </br>
     * @deprecated Deprecated in SDK v1.38. If supported, {@link #LED_SCANNER} should be used instead.
	 */
	@Deprecated
	LED_GOOD_READ,
	/**
	 * Green Spot LED is the scan engine GreenSpot™  LED  projected on the decoded barcode used by the decoder to notify the good read event (typically it is as single color green LED).
	 */
	LED_GREEN_SPOT,
	/**
	 * Notification LED is the general LED used for Android notifications (typically it is an rgb LED)
	 */
	LED_NOTIFICATION,
	/**
	 * Scanner LED is the LED used by the decoder to notify scanning in progress or the good read event (typically it is a bicolor red/green LED).
	 */
	LED_SCANNER;
};

