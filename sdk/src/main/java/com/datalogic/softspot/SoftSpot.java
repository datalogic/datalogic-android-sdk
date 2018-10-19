package com.datalogic.softspot;

import android.content.Context;

/**
 * API to configure SoftSpot. All X/Y coordinates are based at the top-left of
 * the screen. The left of the screen is where X is 0, and the top of the screen
 * is where Y is 0.
 */
public class SoftSpot {
	/**
	 * X/Y screen coordinates. Used for current position, minimum, and maximum
	 * X/Y position values.
	 */
	public static class Point {
		public int x;
		public int y;

		public Point() {}

		public Point(int x, int y) {}
	}

	/**
	 * API will return the last known value if SoftSpot does not respond before
	 * the timeout.
	 */
	public static final long TIMEOUT_MILLIS = 1000;

	/**
	 * Create an object to communicate with SoftSpot.
	 *
	 * @param ctx
	 *            Required for broadcasting to SoftSpot.
	 */
	public SoftSpot(Context ctx) {}

	/**
	 * Minimum X/Y position<br>
	 * Changing scale will change this value.
	 *
	 * @return Minimum X/Y coordinates to set as position.
	 */
	public Point getPositionMin() {
		return null;
	}

	/**
	 * Maximum X/Y position<br>
	 * Changing scale will change this value.
	 *
	 * @return Maximum X/Y coordinates to set as position.
	 */
	public Point getPositionMax() {
		return null;
	}

	/**
	 * Current X/Y position
	 *
	 * @return Current X/Y position of SoftSpot. This is the central point of
	 *         SoftSpot.
	 */
	public Point getPosition() {
		return null;
	}

	/**
	 * Move SoftSpot
	 *
	 * @param point
	 *            X and Y coordinates to set as the center of SoftSpot.
	 */
	public void setPosition(Point point) {}

	/**
	 * Maximum scale multiplier
	 *
	 * @return The minimum scale multiplier used for SoftSpot size.
	 */
	public float getScaleMin() {
		return 0;
	}

	/**
	 * Minimum scale multiplier
	 *
	 * @return The maximum scale multiplier used for SoftSpot size.
	 */
	public float getScaleMax() {
		return 0;
	}

	/**
	 * Current scale multiplier
	 *
	 * @return The current scale multiplier used for SoftSpot size.
	 */
	public float getScale() {
		return 0;
	}

	/**
	 * Set the scale multiplier used for SoftSpot size.
	 *
	 * @param scalar
	 *            Scale multiplier to set SoftSpot size. A value that is not
	 *            between the minimum and maximum will be ignored.
	 */
	public void setScale(float scalar) {}

	/**
	 *  Get current lock state (can I move it around the screen on finger drag?)
	 *  @return Current lock state of SoftSpot
	 */
	public boolean getLockState() {
		return false;
	}

	/**
	 *  Set lock state of SoftSpot, it impacts SoftSpot motion ability on finger dragging events.
	 *  @param lockVal
	 *              Pass in 'true' to keep SoftSpot locked to its current position.
	 *              Pass in 'false' to allow SoftSpot to be moved around the screen.
	 */
	public void lock(boolean lockVal) {}

	/**
	 * Hide SoftSpot. A notification will be available to show again. If
	 * SoftSpot is not enabled, this will have no effect.
	 */
	public void hide() {}

	/**
	 * Show SoftSpot. If SoftSpot is not enabled, this will have no effect.
	 */
	public void show() {}

	/**
	 * When SoftSpot is enabled then it will either be currently showing, or a
	 * notification is available to show.
	 *
	 * @return True if SoftSpot is currently enabled. Otherwise SoftSpot is
	 *         disabled.
	 */
	public boolean isEnabled() {
		return false;
	}

	/**
	 * Set the current enabled state of SoftSpot.
	 *
	 * @param enable
	 *            True to enable SoftSpot, false to disable SoftSpot.
	 */
	public void setEnabled(boolean enable) {}

	/**
	 * Get the image in use for the given ActionType and ImageState values.
	 *
	 * @param actionType
	 *        	The type of action to retreive an image for.
	 * @param imageState
	 *			The state of the image to retrieve the image for.
	 */
	public ImageEnum getImage(ActionType actionType, ImageState imageState) {
		return null;
	}

	/**
	 * Set the image to use when SoftSpot has the given ActionType and ImageState values.
	 *
	 * @param actionType
	 *        	The type of action to set an image for.
	 * @param imageState
	 *			The state of the image for which the image should be set.
	 * @param imageEnum
	 * 			The image to set as active.
	 */
	public void setImage(ActionType actionType, ImageState imageState, ImageEnum imageEnum) {}

	/**
	 * Set the duration for how long the decoded image should be displayed
	 * on screen after a good read before switching back to the {@link ImageState#NORMAL} image.
	 *
	 * @param decodedDuration
	 *        	Enum value representing the number of seconds to display
	 *			the 'decoded' image for.
	 */
	public void setDecodedDuration(DecodedDuration decodedDuration) {}

	/**
	 * Toggle the vibrator on or off when SoftSpot is pressed or moved.
	 * Also, vibrate when SoftSpot is used to launch an application.
	 *
	 * @param enable
	 *        	set to true to enable vibrator. set to false to disable vibrator.
	 */
	public void setVibrator(boolean enable) {}
}
