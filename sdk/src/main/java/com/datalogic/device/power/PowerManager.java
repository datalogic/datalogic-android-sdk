package com.datalogic.device.power;

import com.datalogic.device.BootType;
import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

/**
 * This class provides access to battery life related methods of the device.
 */
public class PowerManager {
	/**
	 * This is the constructor of PowerManager.
	 * 
	 * @throws DeviceException in case of error.
	 */
	public PowerManager() {
	}

	/**
	 * This function allows to set the device timeout before automatic
	 * suspension.
	 * 
	 * @param timeout
	 *            The {@link SuspendTimeout} value of the timeout.
	 * @param externalPower
	 *            The <code>boolean</code> value indicating if the timeout is meant for external AC
	 *            power or for internal battery.
	 * 
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setSuspendTimeout(SuspendTimeout timeout, boolean externalPower) {
		return 0;
	}

	/**
	 * This function allows to get the device screen off timeout before automatic
	 * suspension.
	 * 
	 * @param externalPower
	 *            The <code>boolean</code> value indicating if the requested timeout is the one running while
	 *            powered externally or while the only power source is the internal battery.
	 * @return The {@link SuspendTimeout} representing the active timeout.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public SuspendTimeout getSuspendTimeout(boolean externalPower) {
	    return null;
	}

	/**
	 * Reset the device. The device will be turned off, then turned on.
	 * 
	 * @param resetType
	 *            The {@link BootType} type of reboot to perform.
	 * @see com.datalogic.device.BootType
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int reboot(BootType resetType) {
		return 0;
	}

	/**
	 * This function allows setting a wakeup source. If the source is already
	 * set, no action is performed.
	 * 
	 * @param source
	 *        The {@link WakeupSource} that should activate the device from sleep and needs to be enabled.
	 * 
	 * @see com.datalogic.device.power.WakeupSource
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int activateWakeup(WakeupSource source) {
		return 0;
	}

	/**
	 * This function allows clearing a wakeup source from those previously set.
	 * If the source was not set, no action is performed.
	 * 
	 * @param source
	 *        The {@link WakeupSource} that should no longer wake up the device anymore.
	 * 
	 * @see com.datalogic.device.power.WakeupSource
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int clearWakeup(WakeupSource source) {
		return 0;
	}

	/**
	 * This function allows to know if a wakeup source is currently active.
	 * 
	 * @param source
	 *        The {@link WakeupSource} that should be checked, whether is currently active or not.
	 * 
	 * @see com.datalogic.device.power.WakeupSource
	 * @return <code>boolean</code> true if the source is active, false otherwise.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public boolean isWakeupActive(WakeupSource source) {
	    return false;
	}

	/**
	 * This function allows to know if a wakeup source is configurable on a target device.
	 * 
	 * @param source
	 *        The {@link WakeupSource} that should be checked, whether is supported or not.
	 * 
	 * @see com.datalogic.device.power.WakeupSource
	 * 
	 * @return <code>boolean</code> true if the source can be enabled or disabled, false otherwise.
	 */
	public boolean isWakeupSupported(WakeupSource source) {
		return false;
	}

	/**
	 * This function allows to know the source of the last wakeup.
	 * 
	 * @see com.datalogic.device.power.WakeupSource
	 * 
	 * @return The value of the last wakeup source as a {@link WakeupSource}, null in case no wake up source woke up the device.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton. 
	 */
	public WakeupSource getWakeupReason() {
	    return null;
	}

	/**
	 * This function allows to know the reason of last device power-off.
	 * 
	 * @return The {@link RebootReason} related to the reason of last device power-off event.
	 */
	public RebootReason getRebootReason() {
		return null;
	}
}
