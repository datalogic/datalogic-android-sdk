package com.datalogic.decode;

import java.util.List;

import com.datalogic.device.ErrorManager;
import com.datalogic.device.configuration.ConfigException;
import com.datalogic.device.configuration.PropertyEditor;

/**
 * <code>BarcodeManager</code> gives developers access to decoder related
 * methods of the device.
 * <p>
 * To decode bar codes with this class, use the following steps:
 * </p>
 * <ol>
 * <li>Obtain an instance of BarcodeManager with {@link #BarcodeManager()}.
 * <li>To begin a decode session, call {@link #startDecode()}. Your registered
 * StartListener/ReadListener/TimeoutListener will be called when a successful
 * decode occurs or if the configured timeout expires, etc..
 * <li>Call {@link #stopDecode()} to end the decode session.
 * </ol>
 * <li><b>Important:</b> Call {@link #release()} to release all registered
 * StartListener/ReadListener/TimeoutListener/StopListener.
 */
public class BarcodeManager implements PropertyEditor {
	/**
	 * Barcode start decode intent action. It is possible to start a capture
	 * session in order to scan a barcode from an application, sending a
	 * specific broadcast intent. <br>
	 * <br>
	 * Example:<br>
	 * <code>public int startDecodingIntent() {</code><br>
	 * <code> &nbsp&nbspIntent myintent = new Intent();</code><br>
	 * <code> &nbsp&nbspmyintent.setAction(ACTION_START_DECODE);</code><br>
	 * <code>}</code><br>
	 * Otherwise application can associate this intent to a physical key code
	 * through the KeyboardManager mapIntent method.
	 * 
	 * @see com.datalogic.device.input.KeyboardManager#mapIntent
	 * @see com.datalogic.device.input.VScanEntry
	 * @see <a href="http://developer.android.com/reference/android/content/Intent.html">android.content.Intent</a>
	 */
	public final static String ACTION_START_DECODE = "com.datalogic.decode.action.START_DECODE";
	/**
	 * Barcode stop decode intent action. When an application sends this
	 * broadcast intent, the system stops scanning. <br>
	 * <br>
	 * Example:<br>
	 * <code>public int stopDecodingIntent() {</code><br>
	 * <code> &nbsp&nbspIntent myintent = new Intent();</code><br>
	 * <code> &nbsp&nbspmyintent.setAction(ACTION_STOP_DECODE);</code><br>
	 * <code>}</code><br>
	 */
	public final static String ACTION_STOP_DECODE = "com.datalogic.decode.action.STOP_DECODE";

	/**
	 * Android keycode representing the scanning functionality, in accordance
	 * with
	 * {@link <a href="http://developer.android.com/reference/android/view/KeyEvent.html">android.view.KeyEvent</a>}
	 * .<br>
	 * It is possible to associate a device generic button to the scanning
	 * functionality through the mapping mechanism and the
	 * {@link com.datalogic.device.input.VScanEntry}, this means a
	 * specific scan code can be mapped to the desired Android keycode.
	 * 
	 * @see com.datalogic.device.input.VScanEntry
	 * @see com.datalogic.device.input.KeyCodeEntry
	 * @see com.datalogic.device.input.KeyboardManager#mapKeyCode
	 * @see <a href="http://developer.android.com/reference/android/view/KeyEvent.html">android.view.KeyEvent</a>
	 */
	public final static int KEYCODE_BARCODE = getBarcodeKeycode();

	/**
	 * This is the constructor of BarcodeManager.
	 * 
	 * @throws DecodeException in case of error.
	 */
	public BarcodeManager() {
	}

	/**
	 * Gets the list of supported input devices.
	 *
	 * @return The list of input devices available.
	 */
	public List<InputDevice> getSupportedInputDevices() {
		return null;
	}

	/**
	 * Gets the input device in use.
	 *
	 * @return The current input device.
	 */
	public InputDevice getCurrentInputDevice() {
		return null;
	}

	/**
	 * Sets the input device in use.
	 *
	 * @param currentInputDevice
	 *            The input device to set.
	 */
	public void setCurrentInputDevice(InputDevice currentInputDevice) {
		
	}

	/**
	 * Checks if the Scanner Service is correctly initialized.
	 * 
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public boolean isInitialized() {
		return false;
	}

	/**
	 * Registers a {@link ReadListener} to be notified when a read event is
	 * triggered. Call {@link #removeReadListener} before the application
	 * closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link ReadListener} that will be called when a
	 *            decoder's read event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int addReadListener(ReadListener listener) {
		return 0;
	}

	/**
	 * Unregisters a {@link ReadListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link ReadListener} that will be no more notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int removeReadListener(ReadListener listener) {
		return 0;
	}

	/**
	 * Registers a {@link StartListener} to be notified when a scan started
	 * event is triggered. Call {@link #removeStartListener} before the
	 * application closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link StartListener} that will be called when a
	 *            decoder's started scan event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int addStartListener(StartListener listener) {
		return 0;
	}

	/**
	 * Unregisters a {@link StartListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link StartListener} that will be no more notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int removeStartListener(StartListener listener) {
		return 0;
	}

	/**
	 * Registers a {@link StopListener} to be notified when a scan stopped
	 * event is triggered. Call {@link #removeStopListener} before the
	 * application closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link StopListener} that will be called when a
	 *            decoder's stopped scan event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int addStopListener(StopListener listener) {
		return 0;
	}

	/**
	 * Unregisters a {@link StopListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link StopListener} that will be no more notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int removeStopListener(StopListener listener) {
		return 0;
	}

	/**
	 * Registers a {@link TimeoutListener} to be notified when a scan
	 * timeout event is triggered. Call {@link #removeTimeoutListener}
	 * before the application closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link TimeoutListener} that will be called when a
	 *            decoder's scan timeout event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int addTimeoutListener(TimeoutListener listener) {
		return 0;
	}

	/**
	 * Unregisters a {@link TimeoutListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link TimeoutListener} that will be no more
	 *            notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int removeTimeoutListener(TimeoutListener listener) {
		return 0;
	}

	/**
	 * Registers a {@link InitListener} to be notified when a event of completed
	 * Scanner initialization is triggered. Call {@link #removeInitListener} before
	 * the application closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link InitListener} that will be called when a
	 *            decoder's init event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int addInitListener(InitListener listener) {
		return 0;
	}

	/**
	 * Unregisters a {@link InitListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link InitListener} that will be no more notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int removeInitListener(InitListener listener) {
		return 0;
	}
	

	/**
	 * Registers a {@link DeinitListener} to be notified when a event of Scanner
	 * de-initiliazion is triggered. Call {@link #removeDeinitListener} before
	 * the application closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link DeinitListener} that will be called when a
	 *            decoder's de-init event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int addDeinitListener(DeinitListener listener) {
		return 0;
	}

	/**
	 * Unregisters a {@link DeinitListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link DeinitListener} that will be no more notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int removeDeinitListener(DeinitListener listener) {
		return 0;
	}

	/**
	 * Registers a {@link FrameCaptureListener} to be notified when a frame capture event is
	 * triggered. Call {@link #removeFrameCaptureListener} before the application
	 * closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link FrameCaptureListener} that will be called when a
	 *            decoder's read event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int addFrameCaptureListener(FrameCaptureListener listener) {
		return 0;
	}

	/**
	 * Unregisters a {@link FrameCaptureListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link FrameCaptureListener} that will be no more notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int removeFrameCaptureListener(FrameCaptureListener listener) {
		return 0;
	}

	/**
	 * Registers a {@link FrameSaveListener} to be notified when a frame save event is
	 * triggered. Call {@link #removeFrameSaveListener} before the application
	 * closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link FrameSaveListener} that will be called when a
	 *            decoder's read event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int addFrameSaveListener(FrameSaveListener listener) {
		return 0;
	}

	/**
	 * Unregisters a {@link FrameSaveListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link FrameSaveListener} that will be no more notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int removeFrameSaveListener(FrameSaveListener listener) {
		return 0;
	}
/**
	 * Registers a {@link PresentationStateListener} to be notified when a frame save event is
	 * triggered. Call {@link #removeFrameSaveListener} before the application
	 * closes to properly shut down the listener.
	 * 
	 * @param listener
	 *            The {@link PresentationStateListener} that will be called when a
	 *            decoder's read event is fired.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
public int addPresentationStateListener(PresentationStateListener listener) {
	return 0;
}

/**
	 * Unregisters a {@link PresentationStateListener} associated with the decoder.
	 * 
	 * @param listener
	 *            The {@link PresentationStateListener} that will be no more notified.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
public int removePresentationStateListener(PresentationStateListener listener) {
	return 0;
}
	/**
	 * Removes and clears all the registered listeners, in case some application
	 * did not call removal methods.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int release() {
		return 0;
	}

	/**
	 * Call this method to start decoding. <br>
	 * If the trigger is already active, the present timeout is reset to the new
	 * value and the count starts again. <br>
	 * <br>
	 *      Example:<br>
	 *      <code>public int startDecodingForFiveSeconds(BarcodeManager decoder) {</code>
	 * <br>
	 *      <code> &nbsp&nbspdecoder.startDecode(5000);</code><br>
	 *      <code>}</code><br>
	 * 
	 * @param timeout
	 *            <code>int</code> representing the amount of time, in milliseconds,
	 *             to continue the attempt to acquire data. If data has not been
	 *             obtained after this time period, then the decoder is deactivated.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int startDecode(int timeout) {
		return 0;
	}

	/**
	 * Call this method to start decoding. <br>
	 * Default timeout or the one set through the SDK will be applied. <br>
	 * <br>
	 *      Example:<br>
	 *      <code>public int startDecoding(BarcodeManager decoder) {</code>
	 * <br>
	 *      <code> &nbsp&nbspdecoder.startDecode();</code><br>
	 *      <code>}</code><br>
	 * 
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int startDecode() {
		return 0;
	}

	/**
	 * This stops any data acquisition currently in progress. <br>
	 * <br>
	 *             Example:<br>
	 *             <code>public int abortDecoding(BarcodeManager decoder) {</code>
	 * <br>
	 *             <code> &nbsp&nbspdecoder.stopDecode();</code><br>
	 *             <code>}</code><br>
	 * 
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int stopDecode() {
		return 0;
	}

	/**
	 * Call this method to simulate a trigger button pressure. <br>
	 * The method does not always start immediately a capture, instead it behaves like pressing scan button.
	 *
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int pressTrigger() {
		return 0;
	}

	/**
	 * Call this method to simulate a release of a the trigger button. <br>
	 * The method does not always stop immediately a capture, instead it behaves like releasing scan button.
	 * 
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int releaseTrigger() {
		return 0;
	}

	/**
	 * Enables or disables a barcode symbology type.
	 * <br>
	 *             Note: <br>
	 *             when the decoding configuration changes due a call to this
	 *             method, it is not saved in a persistent way across system
	 *             reboot. <br>
	 * <br>
	 *             Example:<br>
	 *             <code>public int enableCode39(BarcodeManager decoder) {</code>
	 * <br>
	 *             <code> &nbsp&nbspdecoder.enableSymbology(Symbology.CODE39, true);</code>
	 * <br>
	 *             <code>}</code><br>
	 * 
	 * @param barcodeType
	 *            Indicates the type of data whose enable setting is to be
	 *            altered. (one of the barcode type in the
	 *            {@link Symbology} class).
	 * @param enable
	 *            <code>boolean</code> specifies whether or not the data type will be enabled. If
	 *            false, the data type is disabled, otherwise it is enabled.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} or {@link ConfigException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int enableSymbology(Symbology barcodeType, boolean enable) {
		return 0;
	}

	/**
	 * Enables or disables all supported symbologies.
	 * <br>
	 *             Note: <br>
	 *             when the decoding configuration changes due a call to this
	 *             method, it is not saved in a persistent way across system
	 *             reboot. <br>
	 * <br>
	 *             Example:<br>
	 *             <code>public int enableAll() {</code><br>
	 *             <code> &nbsp&nbspdecoder.enableAllSymbologies(true);</code><br>
	 *             <code>}</code><br>
	 * 
	 * @param enable
	 *            <code>boolean</code> specifies whether or not the symbologies will be enabled. If
	 *            false, the symbologies are disabled, otherwise they are
	 *            enabled.
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} or {@link ConfigException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int enableAllSymbologies(boolean enable) {
		return 0;
	}

	/**
	 * Set factory defaults for all barcode symbology types.
	 * <br>
	 *             Note: <br>
	 *             when the decoding configuration changes due a call to this
	 *             method, it is not saved in a persistent way across system
	 *             reboot. <br>
	 * <br>
	 *             Example:<br>
	 *             <code>public int setAllDefaults(BarcodeManager decoder) {</code>
	 * <br>
	 *             <code> &nbsp&nbspdecoder.setDefaults();</code><br>
	 *             <code>}</code><br>
	 * 
	 * @return <code>int</code> {@link DecodeException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DecodeException} error constants.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setDefaults() {
		return 0;
	}

	/**
	 * Returns current enable setting for a particular barcode symbology. <br>
	 * <br>
	 *             Example:<br>
	 *             <code>public boolean isCode39Enabled(BarcodeManager decoder) {</code>
	 * <br>
	 *             <code> &nbsp&nbspreturn decoder.isSymbologyEnabled(Symbology.CODE39);</code>
	 * <br>
	 *             <code>}</code><br>
	 * 
	 * @param barcodeType
	 *            This gets the current enable setting for a particular data
	 *            type. (one of the barcode typein the {@link Symbology}
	 *            class).
	 * @return <code>boolean</code> False is returned if the particular data type is disabled, and
	 *         true is returned otherwise.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */

	public boolean isSymbologyEnabled(Symbology barcodeType) {
	    return true;
	}

	/**
	 * Return true if the device's decoder is able to read a particular barcode
	 * symbology. <br>
	 * <br>
	 *             Example:<br>
	 *             <code>public boolean isQRSupported(BarcodeManager decoder) {</code>
	 * <br>
	 *             <code> &nbsp&nbspreturn decoder.isSymbologySupported(Symbology.QRCODE);</code>
	 * <br>
	 *             <code>}</code><br>
	 * 
	 * @param barcodeType
	 *            Barcode type is one of the {@link Symbology}.
	 * @return <code>boolean</code> False is returned if the decoder is not able to read the
	 *         particular barcode type, and true is returned otherwise.
	 * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */

	public boolean isSymbologySupported(Symbology barcodeType) {
	    return true;
	}

	/**
	 * Gets one or more label programming parameters of type String.
	 * 
	 * @param id_buffer
	 *            The <code>int[]</code> of identifiers for parameters to get.
	 * @param value_buffer
	 *            The <code>String[]</code> of values associated to the passed IDs to get.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	 @Override
	public int getPropertyStrings(int[] id_buffer, String[] value_buffer) {
		return 0;
	}

	 /**
	  * Gets one or more label programming parameters of type Integer.
	  * 
	  * @param id_buffer
	  *            The <code>int[]</code> of identifiers for parameters to get.
	  * @param value_buffer
	  *            The <code>int[]</code> of values associated to the passed IDs to get.
	  *
	  * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	  * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	  * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	  */
	 @Override
	 public int getPropertyInts(int[] id_buffer, int[] value_buffer) {
		 return 0;
	 }

	 /**
	  * Sets one or more label programming parameters of type Integer.
	  * 
	  * @param id_buffer
	  *            The <code>int[]</code> of identifiers for parameters to set.
	  * @param value_buffer
	  *            The <code>int[]</code> of values associated to the passed IDs to set.
	  * 
	  * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	  * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	  * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	  */
	 @Override
	 public int setPropertyInts(int[] id_buffer, int[] value_buffer) {
		 return 0;
	 }

	 /**
	  * Sets one or more label programming parameters of type String.
	  * 
	  * @param id_buffer
	  *            The <code>int[]</code> identifiers for parameters to set.
	  * @param value_buffer
	  *            The <code>String[]</code> of values associated to the passed IDs to set.
	  * 
	  * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	  * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	  * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	  */
	 @Override
	 public int setPropertyStrings(int[] id_buffer, String[] value_buffer) {
		 return 0;
	 }

	/**
	 * Saves the configuration. The configuration is saved in a persistent way
	 * across system reboot.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	@Override
	public int commitProperties() {
		return 0;
	}

	/**
	 * Gets one or more property ranges for the passed programming parameters.
	 * 
	 * @param id_buffer
	 *            The <code>int[]</code> of identifiers for parameters to look for.
	 * @param property_ranges
	 *            The <code>int[][2]</code> array of ranges associated to the passed IDs, that will be filled in.
	 *	      Each element will be filled with the range of the admissible values described by min and max value.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int getPropertyRanges(int[] id_buffer, int[][] property_ranges) {
		return 0;
	}

	/**
	 * Retrieves the availability, the support, for the passed programming parameters.
	 * 
	 * @param id_buffer
	 *            The <code>int[]</code> of identifiers for parameters to look for.
	 * @param availability_buffer
	 *            The <code>boolean[]</code> of the passed IDs' availability, that will be filled in.
	 * 
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int getPropertyAvailability(int[] id_buffer, boolean[] availability_buffer) {
		return 0;
	}

	/**
	 * Internal method used to retrieve the right integer representing the
	 * KeyEvent.KEYCODE_BARCODE It hides the implementation. (avoids hard coding
	 * a constant)
	 * 
	 * @hide
	 */
	private static int getBarcodeKeycode() {
		return 0;
	}

}
