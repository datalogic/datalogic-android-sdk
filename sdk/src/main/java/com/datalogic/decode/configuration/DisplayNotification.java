package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>DisplayNotification</code> is the class that configures the Display Notification
 * capability via a displaying message. This means that the decoded label is displayed through a pop-up
 * message, an Android Toast, on the device's screen.
 */
public class DisplayNotification extends PropertyGroup {

	/**
	 * <code>enable</code> activates the notification mechanism.
	 */
	public BooleanProperty enable;

	/**
	 * This is the constructor of DisplayNotification. All options are initialized by
	 * editor.
	 * 
	 * @param editor A {@link PropertyGetter} used to load the current barcode family.
	 */
	public DisplayNotification(PropertyGetter editor) {
	}

}
