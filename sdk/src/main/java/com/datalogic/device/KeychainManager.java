package com.datalogic.device;

import com.datalogic.device.DeviceException;

/**
 * The {@code KeychainManager} class provides access to the device keychain service,
 * allowing applications to manage certificates installed on the device.
 * <p>
 * Supported only on devices running Android 15 or later.
 * <p>
 * Obtain an instance by calling the constructor. The service connection is established
 * at construction time and a {@link com.datalogic.device.DeviceException} is thrown if
 * the underlying service is unavailable.
 * </p>
 */
public class KeychainManager {


    /**
     * This is the constructor of KeychainManager.
     *
     * @throws DeviceException in case of error.
     */
    public KeychainManager() {}

    /**
     * Installs a CA certificate into the device's trusted certificate store.
     * <p>
     * The certificate must be DER-encoded. Once installed, the certificate
     * is trusted system-wide for SSL/TLS connections and other certificate-chain
     * validation on the device.
     * </p>
     *
     * @param certBuffer the encoded CA certificate to install; must not be {@code null}.
     * @return {@code true} if the certificate was installed successfully, or if it
     *         was already installed, {@code false} otherwise.
     * @throws DeviceException if a communication error with the keychain service occurs.
     */
    public boolean installCaCertificate(byte[] certBuffer) throws DeviceException {
       return false;
    }

    /**
     * Removes a CA certificate from the device's trusted certificate store.
     * <p>
     * The certificate is identified by its encoded bytes, which are provided when the
     * certificate is installed. Once removed, the certificate is no longer
     * trusted system-wide for SSL/TLS connections and other certificate-chain
     * validation on the device.
     * </p>
     *
     * @param certBuffer the encoded CA certificate to remove; must not be {@code null} or empty.
     * @return {@code true} if the certificate was removed successfully,
     *         {@code false} otherwise.
     * @throws DeviceException if a communication error with the keychain service occurs.
     */
    public boolean removeCaCertificate(byte[] certBuffer) throws DeviceException {
        return false;
    }
}
