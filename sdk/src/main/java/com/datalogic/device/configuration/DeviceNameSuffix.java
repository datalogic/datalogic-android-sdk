package com.datalogic.device.configuration;

/**
 * Enum {@link DeviceNameSuffix} defines the possible suffixes for setting the property {@link PropertyID#DEVICE_NAME_SUFFIX}.
 * This value is added to the property {@link PropertyID#DEVICE_NAME_BASE} to build a unique device name.
 */ 
public enum DeviceNameSuffix {

    /**
     * No suffix added to {@link PropertyID#DEVICE_NAME_BASE} to build the DeviceName.
     */
    NONE,
    /**
     * Serial Number is added as suffix to {@link PropertyID#DEVICE_NAME_BASE} to build the DeviceName.
     */
    SERIAL_NUMBER,
    /**
     * MAC Address is added as suffix to {@link PropertyID#DEVICE_NAME_BASE} to build the DeviceName.
     */
    MAC_ADDRESS,
    /**
     * Last 6 characters of the MAC Address are added as suffix to {@link PropertyID#DEVICE_NAME_BASE} to build the DeviceName.
     */
    NIC_SPECIFIC_MAC_ADDRESS;
    
}
