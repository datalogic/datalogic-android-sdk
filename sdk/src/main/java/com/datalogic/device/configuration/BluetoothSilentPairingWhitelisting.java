package com.datalogic.device.configuration;

import java.util.List;
import java.util.Map;
/**
 * <code>BluetoothSilentPairingWhitelisting</code> implements the class that manages the silent pairing devices whitelisting.
 * The class is managed by the ConfigurationManager BlobProperty {@link PropertyID#BT_SILENT_PAIRING_WHITELISTING}.
 */
public class BluetoothSilentPairingWhitelisting extends SerializableBlob {

    public enum IdentifierType {
        /**
         * Bluetooth device MAC Address.
         */
        MAC_ADDRESS,
        /**
         * Bluetooth device Organization Unique Identifier.
         */        
        OUI,
        /**
         * Bluetooth device name.
         */                
        NAME
    }

    /**
     * Constructor
     */
    public BluetoothSilentPairingWhitelisting() {
    }

    /**
     * Constructor
     *
     * @param value
     *            <code>Map</code>
     */
    public BluetoothSilentPairingWhitelisting(Map<String, IdentifierType> value) {
    }

    /**
     * Retrieve a map containing all whitelisted devices.
     *
     * @return <code>Map</code>.
     * */
    public Map<String, IdentifierType> get() {
        return null;
    }

    /**
     * Revoke all whitelisted devices.
     * */
    public void clear() {
        return;
    }

    /**
     * Retrieve a list containing the devices whitelisted by name.
     *
     * @return <code>List</code>.
     * */
    public List<String> getByName() {
        return null;
    }

    /**
     * Retrieve a list containing the devices whitelisted by MAC address.
     *
     * @return <code>List</code>.
     * */
    public List<String> getByMac() {
        return null;
    }

    /**
     * Retrieve a list containing the devices whitelisted by OUI identifier.
     *
     * @return <code>List</code>.
     * */
    public List<String> getByOui() {
        return null;
    }

    /**
     * Whitelist a new device identified with the given name.
     * If the entry already exists, the value will not be updated.
     * The device name can also be provided as a regular expression (regex),
     * allowing for more flexible matching of device names.
     * This feature enables the addition of multiple devices that match a certain pattern,
     * rather than requiring an exact name match.
     * <p>
     * The advantage of supporting regular expressions is that it allows for more flexible and dynamic whitelisting,
     * such as adding devices that share a common naming pattern without having to specify each name individually.
     *
     * @param deviceName
     *            <code>String</code> - The device name can be provided as a plain string or as a regular expression (regex).
     *            If a regex is used, any device whose name matches the pattern will be added to the whitelist.
     * @return <code>boolean</code> - Returns <code>true</code> if the entry has been successfully added to the whitelist;
     *         otherwise, <code>false</code>.
     */
    public boolean addByName(String deviceName) {
        return true;
    }

    /**
     * Whitelist a new device identified with the given MAC address. If the entry already exists, the value will not be updated.
     *
     * @param macAddress
     *            <code>String</code>
     * @return <code>boolean</code> retrieves true if the entry has been successfully added to the whitelist; otherwise, false.
     * */
    public boolean addByMac(String macAddress) {
        return true;
    }

    /**
     * Whitelist a new device identified with the given OUI ID. If the entry already exists, the value will not be updated.
     *
     * @param ouiIdentifier
     *            <code>String</code>
     * @return <code>boolean</code> retrieves true if the entry has been successfully added to the whitelist; otherwise, false.
     * */
    public boolean addByOui(String ouiIdentifier) {
        return true;
    }

    /**
     * Remove from the whitelist a device with the given name.
     * If the entry doesn't exist, nothing happens and the method returns false.
     * If the device name is provided as a regular expression (regex),
     * the method will remove the whitelist entry that matches the given regex,
     * but only if the whitelist was previously configured with a regex for device names.
     * <p>
     * The ability to use a regex allows for the removal of a specific whitelisting rule that was previously added using a regex,
     * providing flexibility in managing device whitelisting based on patterns.
     *
     * @param deviceName
     *            <code>String</code> - The device name can be provided as a plain string or as a regular expression (regex).
     *            If a regex was used when adding devices to the whitelist, this method will remove the specific whitelisting rule for that regex pattern.
     * @return <code>boolean</code> - Returns <code>true</code> if the whitelist entry associated with the given name or regex has been successfully removed;
     *         otherwise, <code>false</code>.
     */
    public boolean removeByName(String deviceName) {
        return true;
    }

    /**
     * Remove from the whitelist a device with the given MAC address. If the entry doesn't exists, nothing happens and the method returns false.
     *
     * @param macAddress
     *            <code>String</code>
     * @return <code>boolean</code> retrieves true if the entry has been successfully removed from the whitelist; otherwise, false.
     * */
    public boolean removeByMac(String macAddress) {
        return true;
    }

    /**
     * Remove from the whitelist a device with the given OUI ID. If the entry doesn't exists, nothing happens and the method returns false.
     *
     * @param ouiIdentifier
     *            <code>String</code>
     * @return <code>boolean</code> retrieves true if the entry has been successfully removed from the whitelist; otherwise, false.
     * */
    public boolean removeByOui(String ouiIdentifier) {
        return true;
    }

    /**
     * Check if a device identified with the given name is whitelisted.
     *
     * @param deviceName
     *            <code>String</code>
     * @return <code>boolean</code> tells if the device is whitelisted.
     * */
    public boolean hasByName(String deviceName) {
        return true;
    }

    /**
     * Check if a device identified with the given MAC Address is whitelisted.
     *
     * @param macAddress
     *            <code>String</code>
     * @return <code>boolean</code> tells if the device is whitelisted.
     * */
    public boolean hasByMac(String macAddress) {
        return true;
    }

    /**
     * Check if a device identified with the given OUI ID is whitelisted.
     *
     * @param ouiIdentifier
     *            <code>String</code>
     * @return <code>boolean</code> tells if the device is whitelisted.
     * */
    public boolean hasByOui(String ouiIdentifier) {
        return true;
    }

    /**
     * Check if a device identified with the given name, MAC address or OUI ID is whitelisted. The OUI ID is retrieved from the MAC address.
     *
     * @param macAddress
     *            <code>String</code>
     * @param deviceName
     *            <code>String</code>
     * @return <code>boolean</code> tells if the device is whitelisted.
     * */
    public boolean hasDevice(String macAddress, String deviceName) {
        return false;
    }

}
