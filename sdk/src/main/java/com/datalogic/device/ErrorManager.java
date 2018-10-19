package com.datalogic.device;

import java.util.List;

import com.datalogic.decode.DecodeException;
import com.datalogic.device.configuration.ConfigException;

/**
 * This class provides access to error configuration related methods of the device. Through this class, Datalogic exceptions can be enabled; otherwise
 * the standard error notification mechanism will be used, relying on simple integer return values. Only the specific exceptions, defined by this SDK, can be controlled
 * can be controlled by this class, standard Java Exceptions are not subject to the configuration specified by the ErrorManager.
 * 
 * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/lang/Exception.html">Exception</a>
 * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/lang/RuntimeException.html">RuntimeException</a>
 * @see ConfigException
 * @see DecodeException
 * @see DeviceException
 */
public class ErrorManager {

	/**
	 * Enables the exception notification system. In case of error, a specific RuntimeException will be thrown.
	 * 
	 * @param enable
	 * 		It specifies whether or not the custom Exception will be thrown.
	 * 
	 * @return <code>int</code>
	 * 		In case of success {@link DeviceException#SUCCESS} is returned.
	 * 
	 * @see ConfigException
	 * @see DecodeException
	 * @see DeviceException
	 */
	public static int enableExceptions(boolean enable) {
		return DeviceException.SUCCESS;
	}

	/**
	 * Tells if the error signaling mechanism, base on exceptions, is enabled.
	 * 
	 * @return <code>boolean</code> It returns whether or not the exception mechanism is enabled. 
	 */
	public static boolean areExceptionsEnabled() {
		return false;
	}

	/**
	 * Provides more informations regarding the last error occurred.
	 * 
	 * @return {@link <a href="http://docs.oracle.com/javase/6/docs/api/java/lang/Exception.html">Exception</a>} retrieves the last error occurred
	 * during the operating cycle. The exception may be cast to {@link ConfigException} or {@link DecodeException} or {@link DeviceException}. Null
	 * in case of no known exception occurred.
	 * 
	 * @see ConfigException
	 * @see DecodeException
	 * @see DeviceException
	 */
	public static Exception getLastError() {
		return null;
	}

	/**
	 * Provides a {@link <a href="http://docs.oracle.com/javase/6/docs/api/java/util/List.html">List</a>} containing all the errors occurred,
	 * since the last {@link #clearErrors()} invocation.
	 * 
	 * @return {@link <a href="http://docs.oracle.com/javase/6/docs/api/java/util/List.html">List</a>}<{@link <a href="http://docs.oracle.com/javase/6/docs/api/java/lang/Exception.html">Exception</a>}>
	 * collecting all arised errors. Any single exception contained in the list may be cast to {@link ConfigException} or {@link DecodeException} or {@link DeviceException}.
	 * 
	 * @see ConfigException
	 * @see DecodeException
	 * @see DeviceException
	 */
	public static List<Exception> getErrors() {
		return null;
	}

	/**
	 * Clear and empty the internal buffer that is in charge to collect all the occurred errors.
	 * 
	 * @return <code>int</code>
	 * 		In case of success {@link DeviceException#SUCCESS} is returned.
	 */
	public static int clearErrors() {
		return DeviceException.SUCCESS;
	}
}
