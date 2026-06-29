package com.datalogic.device.nfc;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;
import com.datalogic.device.configuration.NfcHostListenerTechFlags;
import com.datalogic.device.configuration.NfcTagDispatchBlockFlags;

/**
 * This class provides access to enable and disable the nfc adapter
 */
public class NfcManager {
	/**
	 * This is the constructor of NfcManager.
	 * 
	 * @throws DeviceException in case of error.
	 */
	public NfcManager() {
	}

	/**
	 * Get the current state of the NFC adapter.
	 *
	 * @return <code>boolean</code> indicating whether the NFC adapter is enabled or not.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public boolean getNfcAdapterEnabled() {
		return false;
	}

	/**
	 * @deprecated use {@link #setNfcAdapterEnabled(boolean)} instead.
	 */
	@Deprecated
	public int enableNfcAdapter(boolean enable) {
		return 0;
	}

	/**
	 * Enable the NFC adapter.
	 *
	 * @param enable
	 *            a <code>boolean</code> that indicates whether to enable or to disable the nfc adapter.
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setNfcAdapterEnabled(boolean enable) { return 0; }

	/**
	 * Get the current state of the Host Card Emulation (HCE) functionality of the NFC adapter.
	 *
	 * @return <code>boolean</code> indicating whether the HCE functionality of the NFC adapter is enabled or not.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public boolean getHostCardEmulationEnabled() {
		return false;
	}

	/**
	 * Enable the Host Card Emulation (HCE) functionality of the NFC adapter.
	 *
	 * @param enable a <code>boolean</code> that indicates whether to enable or to disable the HCE functionality.
	 *
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setHostCardEmulationEnabled(boolean enable){
		return 0;
	}

	/**
	 * Get the current NFC categories flags that the system is blocking.
	 *
	 * @return <code>int</code> indicating the NFC categories that the system is blocking,
	 * matching one or more of the {@link NfcTagDispatchBlockFlags} constants.
	 * May return -1 in case of error.
	 *
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int getTagDispatchBlockFlags() {
		return 0;
	}

	/**
	 * Set the NFC categories flags that the system should block.
	 *
	 * @param flags a <code>int</code> of flags representing the NFC categories to block, matching one or more of the {@link NfcTagDispatchBlockFlags} constants.
	 *
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setTagDispatchBlockFlags(int flags) {
		return 0;
	}
	/**
	 * Get the NFC technology flags that the system should listen to.

	 * @return <code>int</code> indicating the NFC categories that the system is listening to,
	 * matching one or more of the {@link NfcHostListenerTechFlags} constants.
	 * May return -1 in case of error.
	 */
	public int getHostListenerTechMask() {
		return 0;
	}

	/**
	 * Set the NFC technology flags that the system should listen to.
	 *
	 * @param flags a <code>int</code> of flags representing the NFC protocol type to enable,
	 *              matching one or more of the {@link NfcHostListenerTechFlags} constants.
	 *
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int setHostListenerTechMask(int flags) {
		return 0;
	}

}
