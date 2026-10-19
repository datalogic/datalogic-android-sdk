package com.datalogic.os.network;

import java.util.List;

import com.datalogic.device.DeviceException;

/**
 * The {@code NetworkManager} class provides access to network-related services
 * on the device, including the ability to inspect DHCP options received on
 * network interfaces.
 * <p>
 * Obtain an instance by calling the constructor. The service connection is established
 * at construction time and a {@link DeviceException} is thrown if the underlying
 * service is unavailable.
 * </p>
 *
 */
public class NetworkManager {

    /**
     * Listener interface used to receive notifications about network events, such as
     * DHCP options received on a network interface.
     */
    public interface NetworkEventListener {
        /**
         * Called when DHCP options are available for a network interface. The listener
         * is invoked with the current DHCP options as soon as it is registered, and
         * again whenever they change.
         *
         * @param interfaceName The name of the network interface the options were received on.
         * @param options The list of DHCP options.
         */
        void onDhcpOptions(String interfaceName, List<DhcpOption> options);
    }

    /**
     * This is the constructor of NetworkManager.
     *
     * @throws DeviceException in case of error.
     */
    public NetworkManager() {}

    /**
     * Add a listener to receive notifications about network events. The listener
     * will be invoked with the current data as soon as it is registered.
     *
     * @param listener The listener to add.
     * @return {@code true} if the listener was successfully added, {@code false} otherwise.
     */
    public boolean addNetworkEventListener(NetworkEventListener listener) {
        return false;
    }

    /**
     * Remove a previously registered listener.
     *
     * @param listener The listener to remove.
     * @return {@code true} if the listener was successfully removed, {@code false} otherwise.
     */
    public boolean removeNetworkEventListener(NetworkEventListener listener) {
        return false;
    }
}
