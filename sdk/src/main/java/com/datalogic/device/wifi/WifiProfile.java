package com.datalogic.device.wifi;

import android.net.Uri;

/**
 * The <b>WifiProfile</b> class is used to both represent a valid Wi-Fi profile <strong>and</strong>
 * manipulate it (e.g. add, remove, check for existence, etc...). Profiles are created through a
 * builder-pattern.
 */
public class WifiProfile {

    /**
     * @hide
     */
    public enum Authentication {
        OPEN, WEP40, WEP104, WPAPSK, WPAEAP
    }

    /**
     * Enumeration of the valid EAP methods to use for WPA/WPA2 EAP authentication.
     */
    public enum EapMethod {
        NONE, PEAP, TLS, TTLS, PWD, SIM, AKA, AKA_PRIME
    }

    /**
     * Enumeration of the valid EAP phase-2 methods to use for WPA/WPA2 EAP authentication.
     */
    public enum EapPhase2 {
        NONE, PAP, MSCHAP, MSCHAPV2, GTC
    }

    /**
     * @hide
     */
    public enum Address {
        DHCP, STATIC
    }

    /**
     * Enumeration of the valid encodings for the user-certificate to be used for the EAP authentication.
     */
    public enum CertificateType {
        NONE, BASE64, KEYSTORE_ALIAS
    }

    /**
     * @hide
     */
    public enum Proxy {
        NONE, MANUAL, AUTO_CONFIG
    }

    /**
     * @hide
     */
    private WifiProfile() {
    }

    /**
     * Connect to the Wi-Fi profile whose ESSID matches the one represented by the {@link WifiProfile} instance.
     *
     * @return a boolean value indicating the outcome of the operation.
     */
    public boolean connect() {
        return false;
    }

    /**
     * Disconnect from the Wi-Fi profile whose ESSID matches the one represented by the {@link WifiProfile} instance.
     *
     * @return a boolean value indicating the outcome of the operation.
     */
    public boolean disconnect() {
        return false;
    }

    /**
     * Tell whether the Wi-Fi profile whose ESSID matches the one represented by the {@link WifiProfile} instance
     * is currently connected.
     *
     * @return a boolean value indicating the profile connection state.
     */
    public boolean isConnected() {
        return false;
    }

    /**
     * Add a new Wi-Fi profile or updates any existing one whose ESSID matches the one represented by the
     * {@link WifiProfile} instance.
     *
     * @return a boolean value indicating the outcome of the operation.
     */
    public boolean addOrUpdate() {
        return false;
    }

    /**
     * Remove the Wi-Fi profile whose ESSID matches the one represented by the {@link WifiProfile} instance.
     *
     * @return a boolean value indicating the outcome of the operation.
     */
    public boolean remove() {
        return false;
    }

    /**
     * Tell whether the Wi-Fi a profile whose ESSID matches the one represented by the {@link WifiProfile} instance
     * is configured (but not necessarily in use).
     *
     * @return a boolean value indicating if the profile exists.
     */
    public boolean exists() {
        return false;
    }

    /**
     * The <b>WifiProfile.Builder</b> class is used create and manipulate Wi-Fi profiles.
     */
    public static final class Builder {

        /**
         * @hide
         */
        private Builder() {
        }

        /**
         * Sets the Wi-Fi profile priority for associating.
         *
         * @param priority the priority to be assigned to the Wi-Fi profile.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder hasPriority(int priority) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile hidden state. This is a clue for the Wi-Fi supplicant in when
         * the ESSID is hidden from the Wi-Fi infrastructure beacons.
         *
         * @param isHiddenSsid whether profile ESSID is hidden or not.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder hasHiddenEssid(boolean isHiddenSsid) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to use an <strong>OPEN</strong> authentication scheme.
         *
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withOpen() {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to use an <strong>WEP-40</strong> authentication scheme.
         *
         * @param key the 40-bit key to be used for authentication, as a 10 character-long hex
         *            string, or generic passphrase.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withWep40(String key) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to use an <strong>WEP-104</strong> authentication scheme.
         *
         * @param key the 104-bit key to be used for authentication, as a 26 character-long hex
         *            string, or generic passphrase.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withWep104(String key) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to use an <strong>WPA-PSK/WPA2-PSK</strong> authentication scheme.
         *
         * @param passphrase the 256-bit key to be used for authentication, as a 64 character-long hex
         *                   string, or generic passphrase.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withWpaPsk(String passphrase) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to use an <strong>WPA-EAP/WPA2-EAP</strong> authentication scheme.
         *
         * @param method            {@link EapMethod} EAP method to be used for authentication.
         * @param phase2            {@link EapPhase2} EAP phase-2 method to be used for authentication.
         * @param identity          EAP identity.
         * @param anonymousIdentity EAP anonymous identity. This is used as the unencrypted identity with certain {@link EapMethod} types.
         * @param password          EAP identify password.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withWpaEap(EapMethod method, EapPhase2 phase2, String identity, String anonymousIdentity, String password) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile CA certificate.
         *
         * <strong>Note:</strong> calling this method could be necessary for certain {@link EapMethod} types.
         *
         * @param caCertificate String representation of the <b>X.509</b> certificate to be used for
         *                      the authentication.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withCaCertificate(String caCertificate) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile user certificate.
         *
         * <strong>Note:</strong> calling this method could be necessary for certain {@link EapMethod} types.
         *
         * @param userCertificateType     {@link CertificateType} type of user certificate.
         * @param userCertificate         String representation or alias of the <b>X.509</b> certificate to be used for
         *                                the authentication.
         * @param userCertificatePassword Password to access the keystore holding the certificate.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withUserCertificate(CertificateType userCertificateType, String userCertificate, String userCertificatePassword) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to used a dynamically-assigned IP address.
         *
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withDhcp() {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to used a manually-assigned static IP address.
         *
         * @param ipAddress         IP Address to be assigned to the device.
         * @param prefixLength      IP netmask in form of prefix-length (from 1 to 32).
         * @param gateway           Default gateway to access the Internet.
         * @param domainNameServers Domain name servers to be used for name resolution.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withIpAddress(String ipAddress, int prefixLength, String gateway, String[] domainNameServers) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to used a manually-assigned static IP address. Google's DNSes will
         * be used for name resolution.
         *
         * @param ipAddress    IP Address to be assigned to the device.
         * @param prefixLength IP netmask in form of prefix-length (from 1 to 32).
         * @param gateway      Default gateway to access the Internet.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withIpAddress(String ipAddress, int prefixLength, String gateway) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile <strong>not</strong> to use proxy.
         *
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withNoProxy() {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to use a manually-configured static proxy.
         *
         * @param host          Address of the host to be used as proxy.
         * @param port          Port of the host to be used as proxy.
         * @param exclusionList Hosts to exclude using the proxy on connections for. These hosts
         *                      can use wildcards such as *.example.com..
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withManualProxy(String host, int port, String[] exclusionList) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to use a manually-configured static proxy.
         *
         * @param host Address of the host to be used as proxy.
         * @param port Port of the host to be used as proxy.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withManualProxy(String host, int port) {
            return this;
        }

        /**
         * Sets the Wi-Fi profile to use a PAC-based automatic proxy.
         *
         * @param pacUri URI from whence the PAC script will be downloaded and runt.
         * @return This {@link Builder} object to allow for chaining of calls to set methods.
         */
        public Builder withAutomaticProxy(Uri pacUri) {
            return this;
        }

        /**
         * Creates a {@link WifiProfile} with the configuration supplied to this builder.
         */
        public WifiProfile build() {
            return null;
        }

    }

}
