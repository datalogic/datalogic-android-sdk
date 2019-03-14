package com.datalogic.softspot;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;

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
	 * Constraints defining the frame to restrict SoftSpot's movement. Constraints can be specified using
	 * pixel values or as proportions of the screen. For the latter, 0.0 refers to the far left/top, while
	 * 1.0 refers to the very bottom/right.
	 */
	public static class WorkingArea {
		/**
		 * Left bound, in pixels.
		 */
		public int leftPixels = -1;

		/**
		 * Upper bound, in pixels
		 */
		public int topPixels = -1;

		/**
		 * Right bound, in pixels. Must be >= <code>leftPixels</code>.
		 */
		public int rightPixels = -1;

		/**
		 * Lower bound, in pixels. Must be >= <code>topPixels</code>.
		 */
		public int bottomPixels = -1;

		/**
		 * Left bound, proportional to the screen. 0 = far left, 1 = far right.
		 */
		public float left = -1;

		/**
		 * Upper bound, proportional to the screen. 0 = far top, 1 = far bottom.
		 */
		public float top = -1;

		/**
		 * Right bound, proportional to the screen. 0 = far left, 1 = far right. Must be >= <code>left</code>.
		 */
		public float right = -1;

		/**
		 * Lower bound, proportional to the screen. 0 = far top, 1 = far bottom. Must be >= <code>top</code>.
		 */
		public float bottom = -1;

		/**
		 * Determines how the working area reacts to screen rotations.
		 */
		public RotationBehavior rotationBehavior = RotationBehavior.HOLD_IN_PLACE;

		/**
		 * <code>RotationBehavior</code> is an enumeration defining constants for different
		 * ways the <code>WorkingArea</code> can behave when rotating the device.
		 */
		public enum RotationBehavior {
			/**
			 * The area will be reevaluated to appear to stay in place. This is the default.<br>
			 * For example, if the <code>WorkingArea</code> is set with a <code>topPixels</code> of 50px,
			 * rotating the device counterclockwise will result in the area starting 50px from the new left,
			 * because that was the old top.
			 */
			HOLD_IN_PLACE,
			/**
			 * The size of each side proportional to the screen stays the same. <br>
			 * For example, if your screen has dimensions 500x1000 px. If your <code>WorkingArea</code> is set with a
			 * <code>left</code> of 0.2 and a <socde>right</socde> of 1.0, then the area will 400px wide. Rotating the
			 * device 90 degrees will make the area 800 px now.
			 */
			MAINTAIN_PROPORTIONS
		}

		/**
		 * Create a <code>WorkingArea</code> specifying pixels values.
		 *
		 * @param leftPixels
		 *          Left bound, in pixels.
		 * @param topPixels
		 *          Upper bound, in pixels.
		 * @param rightPixels
		 *          Right bound, in pixels. Must be >= <code>leftPixels</code>.
		 * @param bottomPixels
		 *          Lower bound, in pixels. Must be >= <code>topPixels</code>.
		 */
		public WorkingArea(int leftPixels, int topPixels, int rightPixels, int bottomPixels) {
		}

		/**
		 * Create a <code>WorkingArea</code> specifying proportions on the screen.
		 *
		 * @param left
		 *          Left bound, proportional to the screen. 0 = far left, 1 = far right.
		 * @param top
		 *          Upper bound, proportional to the screen. 0 = far top, 1 = far bottom.
		 * @param right
		 *          Right bound, proportional to the screen. 0 = far left, 1 = far right. Must be >= <code>left</code>.
		 * @param bottom
		 *          Lower bound, proportional to the screen. 0 = far top, 1 = far bottom. Must be >= <code>top</code>.
		 */
		public WorkingArea(float left, float top, float right, float bottom) {
		}

		public WorkingArea(int leftPixels, int topPixels, int rightPixels, int bottomPixels,
		                   float left, float top, float right, float bottom,
		                   RotationBehavior rotationBehavior) {
		}

		/**
		 * Width of the <code>WorkingArea</code>.
		 *
		 * @return The width of the <code>WorkingArea</code>, in pixels.
		 */
		public float widthPixels() {
			return 0.0f;
		}

		/**
		 * Height of the <code>WorkingArea</code>.
		 *
		 * @return The height of the <code>WorkingArea</code>, in pixels.
		 */
		public float heightPixels() {
			return 0.0f;
		}

		/**
		 * Width of the <code>WorkingArea</code>.
		 *
		 * @return The width of the <code>WorkingArea</code>, relative to the screen.
		 */
		public float width() {
			return 0.0f;
		}

		/**
		 * Height of the <code>WorkingArea</code>.
		 *
		 * @return The height of the <code>WorkingArea</code>, relative to the screen.
		 */
		public float height() {
			return 0.0f;
		}
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
	 * Get Area that SoftSpot can move within<br>
	 *
	 * @return WorkingArea specifying the area that SoftSpot can move within.
	 */
	public WorkingArea getWorkingArea() {
		return null;
	}

	/**
	 * Restrict SoftSpot to a square region on the screen<br>
	 *
	 * @param area
	 *             WorkingArea describing how to restrict SoftSpot.
	 */
	public void setWorkingArea(WorkingArea area) {}

	/**
	 * Reset the working area to the whole screen.
	 */
	public void clearWorkingArea() {}

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
	 * Minimum scale multiplier
	 *
	 * @return The minimum scale multiplier used for SoftSpot size.
	 */
	public float getScaleMin() {
		return 0;
	}

	/**
	 * Maximum scale multiplier
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
	 * Copy the image located at the given filepath, then assigns the custom imageEnum to use that image.<
	 * Image will be downsampled if too large.
	 *
	 * @param imageEnum
	 *          The ImageEnum to set the new image to. Must be a custom slot.
	 * @param imageFile
	 *          Image in external storage to be copied.
	 */
	public void setCustomImage(ImageEnum imageEnum, File imageFile) throws FileNotFoundException {}

	/**
	 * Copy the image in the byte array, then assigns the custom imageEnum to use that image.<
	 * Image will be downsampled if too large.
	 *
	 * @param imageEnum
	 *          The ImageEnum to set the new image to. Must be a custom slot.
	 * @param data
	 *          Byte array containing the image to be copied.
	 */
	public void setCustomImage(ImageEnum imageEnum, byte[] data) throws NullPointerException {}

	/**
	 * Delete the custom image for the given ImageEnum.<br>
	 * It's icon will be changed back to the default number icons.
	 *
	 * @param imageEnum
	 *          The slot for the custom image to be deleted. Must be a custom slot.
	 */
	public void clearCustomImage(ImageEnum imageEnum) {}

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

	/**
	 * Is vibration enabled when using SoftSpot?
	 *
	 * @return True if SoftSpot vibration effects are enabled.
	 */
	public boolean getVibrator() {
		return false;
	}
}
