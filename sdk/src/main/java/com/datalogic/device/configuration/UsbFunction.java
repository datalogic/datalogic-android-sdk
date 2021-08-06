package com.datalogic.device.configuration;

/**
 * Enum <code>UsbFunction</code> defines the allowed values for settings the USB Trasfer Protocol in properties {@link PropertyID#USB_DEFAULT_FUNCTION} and {@link PropertyID#USB_CURRENT_FUNCTION}
 */
public enum UsbFunction {

    /**
     * Charge only
     */
    NONE,
    /**
     * Media Transfer Protocol
     */
    MTP,
    /**
     * Picture Transfer Protocol
     */
    PTP,
    /**
     * Ethernet su USB
     */
    RNDIS,
    /**
     * MIDI audio source
     */
    MIDI;
}
