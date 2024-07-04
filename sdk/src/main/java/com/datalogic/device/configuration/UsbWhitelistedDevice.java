package com.datalogic.device.configuration;

import com.datalogic.device.DeviceException;

/**
 * Class <code>UsbWhitelistedDevice</code> defines an USB whitelisted device.
 */
public class UsbWhitelistedDevice {
    
    /**
     * @hide
     * Default constructor
     *
     * */
    private UsbWhitelistedDevice(){}

    /**
     * @hide
     * Constructor
     *
     * @param vid
     *            <code>int</code> indicating USB device vid number in decimal format
     *
     * @param pid
     *            <code>int</code> indicating USB device pid number in decimal format
     *
     * @param name
     *            <code>String</code> indicating USB device name
     *
     * @param description
     *            <code>String</code> indicating USB device description
     *
     * @param persistence
     *            <code>int</code> indicating USB device whitelisting persistence
     *
     * */
    public UsbWhitelistedDevice(int vid, int pid, String name, String description, WhitelistingPersistence persistence) {}        

    /**
     * @hide
     * Constructor
     *
     * @param vid
     *            <code>String</code> indicating USB device vid number in hexadecimal format
     *
     * @param pid
     *            <code>String</code> indicating USB device pid number in hexadecimal format
     *
     * @param name
     *            <code>String</code> indicating USB device name
     *
     * @param description
     *            <code>String</code> indicating USB device description
     *
     * @param persistence
     *            <code>int</code> indicating USB device whitelisting persistence
     *
     * */
    public UsbWhitelistedDevice(String vid, String pid, String name, String description, WhitelistingPersistence persistence) {}

    /**
     * Constructor
     *
     * @param vid
     *            <code>int</code> indicating USB device vid number in decimal format
     *
     * @param pid
     *            <code>int</code> indicating USB device pid number in decimal format
     *
     * @param name
     *            <code>String</code> indicating USB device name
     *
     * @param description
     *            <code>String</code> indicating USB device description
     *
     * */
    public UsbWhitelistedDevice(int vid, int pid, String name, String description) {}


    /**
     * Constructor
     *
     * @param vid
     *            <code>String</code> indicating USB device vid number in hexadecimal format
     *
     * @param pid
     *            <code>String</code> indicating USB device pid number in hexadecimal format
     *
     * @param name
     *            <code>String</code> indicating USB device name
     *
     * @param description
     *            <code>String</code> indicating USB device description
     *
     * */
    public UsbWhitelistedDevice(String vid, String pid, String name, String description) {}

    /**
     * Retrieves the vid number in decimal format
     *
     * @return int
     *
     * */
    public int getVid() {
        return 0;
    }

    /**
     * Retrieves USB device pid number in decimal format
     *
     * @return int
     *
     * */
    public int getPid() {
        return 0;
    }

    /**
     * Retrieves the vid number in hexadecimal format
     *
     * @return String
     *
     * */
    public String getVidHex() {
        return null;
    }

    /**
     * Retrieves USB device pid number in hexadecimal format
     *
     * @return String
     *
     * */
    public String getPidHex() {
        return null;
    }

    /**
     * Retrieves USB device name
     *
     * @return String
     * 
     * */
    public String getName() {
        return null;
    }

    /**
     * Set USB device name
     *
     * @param name
	 *            <code>String</code> indicating USB device name
     * 
     * */
    public void setName(String name) {}

    /**
     * Retrieves USB device description
     *     
	 * @return String
     * 
     * */
    public String getDescription() {
        return null;
    }

    /**
     * Set USB device description
     *
     * @param description
	 *            <code>String</code> indicating USB device description
     * 
     * */
    public void setDescription(String description) {}

    /**
     * Retrieves USB device description
     *     
	 * @return WhitelistingPersistence
     * 
     * */
    public WhitelistingPersistence getPersistence() {
        return null;
    }
    
    /**
     * Set USB device persistence
     * @hide
     *
     * @param persistence
	 *            <code>WhitelistingPersistence</code> indicating USB device description
     * 
     * */
    public void setPersistence(WhitelistingPersistence persistence) {}
}