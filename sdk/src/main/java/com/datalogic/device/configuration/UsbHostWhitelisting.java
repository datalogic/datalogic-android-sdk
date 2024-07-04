package com.datalogic.device.configuration;
import java.util.List;
/**
 * <code>UsbHostWhitelisting</code> implements the BlobProperty that allows to manage USB host whitelisting.<br>
 * The class is managed by the ConfigurationManager Blob Properties {@link PropertyID#USB_HOST_WHITELISTING} and {@link PropertyID#USB_PREDEFINED_HOST_WHITELISTING}.
 */
public class UsbHostWhitelisting extends SerializableBlob {

    /**
     * Constructor
     */
    public UsbHostWhitelisting() {}

    /**
     * Constructor
     *
     * @param devices
     *            <code>List</code>
     */
    public UsbHostWhitelisting(List<UsbWhitelistedDevice> devices) {}


    /**
     * Retrieve the whole whitelist content.
     *
     * @return <List>HashMap</code>.
     * */
    public List<UsbWhitelistedDevice> getWhitelistedDevices() {
        return null;
    }

    /**
     * Add a list of devices to whitelist.
     * @param usbWhitelistedDevices list of the devices to whitelist
     * */
    public void add(List<UsbWhitelistedDevice> usbWhitelistedDevices) {}

    /**
     * Add a device to whitelist.
     * @param usbWhitelistedDevice device to whitelist
     * */
    public void add(UsbWhitelistedDevice usbWhitelistedDevice) {}

    /**
     * Remove a devices from whitelist. Devices is removed checking only vid and pid.
     * @param usbWhitelistedDevice device to whitelist.
     * */
    public boolean remove(UsbWhitelistedDevice usbWhitelistedDevice) {
        return false;
    }

    /**
     * Get a device from whitelist by vid and pid.
     * @param vid
     *          <code>String</code>
     * @param pid
     *          <code>String</code>
     * @return <code>UsbWhitelistedDevice</code>
     * */
    public UsbWhitelistedDevice get(int vid, int pid) {
        return null;
    }

    /**
     * Clear whitelist.
     * This will not effect in case of {@link PropertyID#USB_PREDEFINED_HOST_WHITELISTING}.
     * */
    public void clear() {}

}

