package com.datalogic.device.power;

/**
 * The <code>SuspendTimeout</code> enumeration defines different available display sleep timeouts.
 */
public enum SuspendTimeout {
	/**
	 * Endless timeout, screen will not turn off
	 */
	NEVER, //
	/**
	 * Fifteen seconds
	 */
	SECONDS_15, //
	/**
	 * Thirty seconds
	 */
	SECONDS_30, //
	/**
	 * One minute
	 */
	MINUTES_1, //
	/**
	 * Two minutes
	 */
	MINUTES_2, //
	/**
	 * Three minutes
	 */
	MINUTES_3, //
	/**
	 * Four minutes
	 */
	MINUTES_4, //
	/**
	 * Five minutes
	 */
	MINUTES_5, //
	/**
	 * Ten minutes
	 */
	MINUTES_10, //
	/**
	 * Fifteen minutes
	 */
	MINUTES_15, //
	/**
	 * Twenty minutes
	 */
	MINUTES_20, //
	/**
	 * Thirty minutes
	 */
	MINUTES_30; //

	/**
	 * Converts the SuspendTimeout to the corresponding number of seconds.
	 * 
	 * @return <code>int</code> a number representing the amount of seconds associated.
	 */
	public int toSeconds() {
		return 0;
	}

	/**
	 * Converts an amount of seconds to the right SuspendTimeout value, if
	 * available.
	 * 
	 * @param seconds
	 *            <code>int</code> the amount of seconds
	 * @return {@link SuspendTimeout} the corresponding or the most close SuspendTimeout value. If no
	 *         corresponding value is found, NEVER will be chosen.
	 */
	public static SuspendTimeout fromSeconds(int seconds) {
		return null;
	}
}
