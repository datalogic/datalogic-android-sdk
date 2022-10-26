package com.datalogic.device.wifi;

/**
 * The <b>WifiManager</b> class enables the user to control the Wi-Fi adapter behaviour. It also permits the
 * manipulation of arbitrary Wi-Fi profiles.
 */
public class WifiManager {

    /**
     * The policy for deciding when Wi-Fi should go to sleep (which will in turn switch to using the
     * mobile data as an Internet connection).
     */
    public enum SleepPolicy {
        /**
         * Sleep shortly after the turning off.
         */
        DEFAULT,
        /**
         * Sleep shortly after the turning off the device is on battery, and never go to sleep when
         * the device is plugged in.
         */
        NEVER_WHILE_PLUGGED,
        /**
         * Never go to sleep.
         */
        NEVER
    }

    /**
     * This is the constructor of the WifiManager class.
     *
     * @throws DeviceException in case of error.
     */
    public WifiManager() {
    }

    /**
     * Returns builder-pattern instance to be used to configure a Wi-Fi profile.
     *
     * @param essid ESSID of the network to which the profile will be bound. This is the only
     *              mandatory field for a profile (e.g. in the case the profile is only used to
     *              check for existence).
     * @return a newly created {@link WifiProfile.Builder} instance.
     */
    public WifiProfile.Builder profileBuilder(String essid) {
        return null;
    }

    /**
     * Gets the current policy for deciding when Wi-Fi should go to sleep (which will in turn switch
     * to using the mobile data as an Internet connection).
     *
     * @return a {@link SleepPolicy} status value.
     */
    public SleepPolicy getSleepPolicy() {
        return SleepPolicy.DEFAULT;
    }

    /**
     * Sets the current policy for deciding when Wi-Fi should go to sleep (which will in turn switch
     * to using the mobile data as an Internet connection).
     *
     * @param sleepPolicy the {@link SleepPolicy} policy to be used.
     */
    public void setSleepPolicy(SleepPolicy sleepPolicy) {
    }

    /**
     * Returns whether the Wi-Fi data connection should remain active even when higher priority
     * networks like Ethernet are active, to keep both networks. In the case where higher priority
     * networks are connected, Wi-Fi will be unused unless an application explicitly requests to use
     * it.
     *
     * @return a boolean value indicating if the Wi-Fi data connection should remain active.
     */
    public boolean getAlwaysRequested() {
        return false;
    }

    /**
     * Sets whether the Wi-Fi data connection should remain active even when higher priority
     * networks like Ethernet are active, to keep both networks. In the case where higher priority
     * networks are connected, Wi-Fi will be unused unless an application explicitly requests to use
     * it.
     *
     * @param alwaysRequested a boolean value indicating if the Wi-Fi data connection should remain
     *                        active.
     */
    public void setAlwaysRequested(boolean alwaysRequested) {
    }

    /**
     * Gets whether to notify the user of open networks or not.
     *
     * @return a boolean value indicating if open networks are notified to the user or not.
     */
    public boolean getNotifyAvailableNetworks() {
        return false;
    }

    /**
     * Sets whether to notify the user of open networks or not.
     *
     * @param notifyAvailableNetworks a boolean value indicating if open networks are notified to
     *                                the user or not.
     */
    public void setNotifyAvailableNetworks(boolean notifyAvailableNetworks) {
    }

}
