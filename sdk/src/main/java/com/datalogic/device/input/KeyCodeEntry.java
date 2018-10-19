package com.datalogic.device.input;

/**
 * This class stores an Android KeyCode entry, as defined in {@link <a href="http://developer.android.com/reference/android/view/KeyEvent.html">KeyEvent</a>}
 */
public class KeyCodeEntry {
	/**
	 * This constructor initializes the key code and the meta state active flag.
	 * 
	 * @param keyCode
	 *            <code>int</code> it specifies the Android KeyEvent key code. Use android.view.KeyEvent keycode
	 *             constant identifiers.
	 * 
	 * @see <a href="http://developer.android.com/reference/android/view/KeyEvent.html#KEYCODE_0">android.view.KeyEvent.KEYCODE_*</a>
	 * 
	 * @param metaState
	 *            <code>int</code> it specifies meta state active flag as a bitmask.
	 * 
	 * @see <a href="http://developer.android.com/reference/android/view/KeyEvent.html#META_ALT_LEFT_ON">android.view.KeyEvent.META_*</a>
	 */
	public KeyCodeEntry(int keyCode, int metaState) {
	}

	/**
	 * This constructor initializes the meta state active flag bitmask to 0.
	 * 
	 * @param keyCode
	 *            <code>int</code> it specifies the Android KeyEvent key code.
	 * 
	 * @see <a href="http://developer.android.com/reference/android/view/KeyEvent.html#KEYCODE_0">android.view.KeyEvent.KEYCODE_*</a>
	 */
	public KeyCodeEntry(int keyCode) {
	}

	/**
	 * Gets the internal Android KeyCode value.
	 * 
	 * @return the KeyCode as an integer value.
	 */
	public int getKeyCode() {
		return 0;
	}

	/**
	 * Gets the internal Android meta state value.
	 * 
	 * @return the meta state as an integer value.
	 */
	public int getMetaState() {
		return 0;
	}
}
