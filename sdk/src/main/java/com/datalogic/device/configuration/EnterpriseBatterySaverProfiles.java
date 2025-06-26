package com.datalogic.device.configuration;

import java.util.List;

/**
 * <code>EnterpriseBatterySaverProfiles</code> implements the BlobProperty that allows to manage
 * the profiles for the Enterprise Battery Saver.<br>
 * The class is managed by the ConfigurationManager Blob Property
 * {@link PropertyID#POWER_ENTERPRISE_BATTERY_SAVER_PROFILES}.
 */
public class EnterpriseBatterySaverProfiles extends SerializableBlob {

    /**
     * Get the list of currently configured profiles.
     */
    public List<Profile> getProfiles() {
        return null;
    }

    /**
     * Add a profile to the list. If a profile with the same name already exists, it will be
     * replaced.
     * @param profile The profile to add.
     * @throws IllegalArgumentException if the profile is null.
     */
    public void add(Profile profile) {
    }

    /**
     * Remove a profile from the list, whose name is the same as the one passed as parameter.
     * @param profile The profile to remove.
     * @throws IllegalArgumentException if the profile is null.
     */
    public void remove(Profile profile) {
    }

    /**
     * Builder for the EnterpriseBatterySaverProfiles.
     */
    public static class Builder {

        /**
         * Create a new Builder for the EnterpriseBatterySaverProfiles object with an
         * initial empty list of profiles.
         */
        public Builder() {
        }

        /**
         * Add a profile to the list.
         * @param profile The profile to add.
         * @throws IllegalArgumentException if the profile is null.
         */
        public Builder addProfile(Profile profile) {
            return null;
        }

        /**
         * Build and return a newly created EnterpriseBatterySaverProfiles object. The created
         * object is guaranteed to be valid and ready to use.
         * @return The EnterpriseBatterySaverProfiles object.
         */
        public EnterpriseBatterySaverProfiles build() {
            return null;
        }

    }

    /**
     * The profile class.
     */
    public static class Profile {

        /**
         * The location of the profile.
         */
        public enum Location {
            /**
             * The profile is installed in the user space.
             */
            USERDATA,
            /**
             * The profile is installed in the enterprise space.
             */
            ENTERPRISE,
            /**
             * The profile is installed in the enterprise factory.
             */
            ENTERPRISE_FACTORY,
            /**
             * The profile is installed in the system space.
             */
            SYSTEM
        }

        /**
         * Constant for no frequency limit.
         */
        public static final int FREQUENCY_LIMIT_NONE = 0;

        /**
         * Constant for intermediate level of frequency limit: the frequency is limited to
         * the mean value between the minimum and maximum frequencies.
         */
        public static final int FREQUENCY_LIMIT_INTERMEDIATE = 1;

        /**
         * Constant for high level of frequency limit: the frequency is limited to the minimum
         * value.
         */
        public static final int FREQUENCY_LIMIT_AGGRESSIVE = 2;

        /**
         * Constant to disable the download-rate limit.
         */
        public static final int DOWNLOAD_RATE_LIMIT_NONE = -1;

        /**
         * Constant to apply a download-rate limit of 128 Kbps.
         */
        public static final int DOWNLOAD_RATE_LIMIT_128K = 131072;

        /**
         * Constant to apply a download-rate limit of 256 Kbps.
         */
        public static final int DOWNLOAD_RATE_LIMIT_256K = 262144;

        /**
         * Constant to apply a download-rate limit of 1 Mbps.
         */
        public static final int DOWNLOAD_RATE_LIMIT_1M = 1048576;

        /**
         * Constant to apply a download-rate limit of 5 Mbps.
         */
        public static final int DOWNLOAD_RATE_LIMIT_5M = 5242880;

        /**
         * Constant to apply a download-rate limit of 15 Mbps.
         */
        public static final int DOWNLOAD_RATE_LIMIT_15M = 15728640;

        /**
         * Constant to disable the background process limit and use the standard limit.
         */
        public static final int BACKGROUND_PROCESS_LIMIT_STANDARD = -1;

        /**
         * Constant to set the background process limit to have no background processes.
         */
        public static final int BACKGROUND_PROCESS_LIMIT_0 = 0;

        /**
         * Constant to set the background process limit to have at most one background process.
         */
        public static final int BACKGROUND_PROCESS_LIMIT_1 = 1;

        /**
         * Constant to set the background process limit to have at most two background processes.
         */
        public static final int BACKGROUND_PROCESS_LIMIT_2 = 2;

        /**
         * Constant to set the background process limit to have at most three background processes.
         */
        public static final int BACKGROUND_PROCESS_LIMIT_3 = 3;

        /**
         * Constant to set the background process limit to have at most four background processes.
         */
        public static final int BACKGROUND_PROCESS_LIMIT_4 = 4;

        /**
         * Returns the profile name.
         */
        public String getName() {
            return null;
        }

        /**
         * Returns whether the 5G is disabled.
         */
        public boolean getDisable5G() {
            return false;
        }

        /**
         * Returns the CPU frequency limit.
         */
        public int getCpuFrequencyLimit() {
            return 0;
        }

        /**
         * Returns the GPU frequency limit.
         */
        public int getGpuFrequencyLimit() {
            return 0;
        }

        /**
         * Returns whether the power save governor is used.
         */
        public boolean getUsePowerSaveGovernor() {
            return false;
        }

        /**
         * Returns whether the gold cluster is disabled.
         */
        public boolean getDisableGoldCluster() {
            return false;
        }

        /**
         * Returns the download rate limit in Kbps.
         */
        public int getDownloadRateLimitKbps() {
            return 0;
        }

        /**
         * Returns whether the mobile data is always active.
         */
        public boolean getMobileDataAlwaysActive() {
            return false;
        }

        /**
         * Returns whether activities are not kept.
         */
        public boolean getDontKeepActivities() {
            return false;
        }

        /**
         * Returns the background process limit.
         */
        public int getBackgroundProcessLimit() {
            return 0;
        }

        /**
         * Returns whether the adaptive brightness is enabled.
         */
        public boolean getAdaptiveBrightness() {
            return false;
        }

        /**
         * Returns whether Bluetooth is disabled.
         */
        public boolean getDisableBluetooth() {
            return false;
        }

        /**
         * Returns whether Wi-Fi is disabled.
         */
        public boolean getDisableWifi() {
            return false;
        }

        /**
         * Returns whether the Location service is disabled.
         */
        public boolean getDisableLocation() {
            return false;
        }

        /**
         * Returns whether the Telephony service is disabled.
         */
        public boolean getDisableTelephony() {
            return false;
        }

        /**
         * Returns whether the NFC is disabled.
         */
        public boolean getDisableNfc() {
            return false;
        }

        /**
         * Returns whether the halves brightness adjustment is enabled.
         */
        public boolean getHalvesBrightnessAdjustment() {
            return false;
        }

        /**
         * Returns the list of blacklisted applications.
         */
        public List<String> getApplicationsBlacklist() {
            return null;
        }

        /**
         * Returns the profile's install location.
         */
        public Location getInstallLocation() {
            return null;
        }

        /**
         * The builder for the Profile.
         */
        public static class Builder {

            /**
             * Create a new Builder for the Profile object, with the following default values:
             * <ul>
             *     <li>`name` unset</li>
             *     <li>`disable5G` set to `false`</li>
             *     <li>`cpuFrequencyLimit` set to `FREQUENCY_LIMIT_NONE`</li>
             *     <li>`gpuFrequencyLimit` set to `FREQUENCY_LIMIT_NONE`</li>
             *     <li>`usePowerSaveGovernor` set to `false`</li>
             *     <li>`downloadRateLimitKbps` set to `DOWNLOAD_RATE_LIMIT_NONE`</li>
             *     <li>`mobileDataAlwaysActive` set to `true`</li>
             *     <li>`adaptiveBrightness` set to `false`</li>
             *     <li>`disableBluetooth` set to `false`</li>
             *     <li>`disableWifi` set to `false`</li>
             *     <li>`disableLocation` set to `false`</li>
             *     <li>`disableTelephony` set to `false`</li>
             *     <li>`disableNfc` set to `false`</li>
             *     <li>`halvesBrightnessAdjustment` set to `false``</li>
             *     <li>`applicationsBlacklist` set to an empty list</li>
             *     <li>`installLocation` set to `USERDATA`</li>
             * </ul>
             * The name must be set before building the Profile object.
             */
            public Builder() {
            }

            /**
             * Set the profile name.
             * The name must be non empty and unique among all profiles. It is used to identify the
             * profile when creating an `ActivationItem`.
             * @param name The name of the profile.
             * @throws IllegalArgumentException if the name is empty or null.
             */
            public Builder withName(String name) {
                return null;
            }

            /**
             * Control if the 5G is disabled.
             */
            public Builder withDisable5G(boolean disable5G) {
                return null;
            }

            /**
             * Set the CPU frequency limit.
             * @param cpuFrequencyLimit The CPU frequency limit. Valid values are
             *                          {@link #FREQUENCY_LIMIT_NONE},
             *                          {@link #FREQUENCY_LIMIT_INTERMEDIATE},
             *                          {@link #FREQUENCY_LIMIT_AGGRESSIVE}.
             * @throws IllegalArgumentException if the value is not one of the above.
             */
            public Builder withCpuFrequencyLimit(int cpuFrequencyLimit) {
                return null;
            }

            /**
             * Set the GPU frequency limit.
             * @param gpuFrequencyLimit The GPU frequency limit. Values are the same as for the CPU
             *                          frequency limit (see {@link #withCpuFrequencyLimit(int)}).
             * @throws IllegalArgumentException if the value is not one of the above.
             */
            public Builder withGpuFrequencyLimit(int gpuFrequencyLimit) {
                return null;
            }

            /**
             * Control if the power save governor is used.
             * The power save governor is a CPU governor that is optimized for power
             * savings. It sets the CPU statically to the minimum frequency and
             * dynamically changes the CPU frequency based on the CPU load.
             * @param usePowerSaveGovernor true to use the power save governor, false otherwise.
             * @see <a href="https://www.kernel.org/doc/Documentation/cpu-freq/governors.txt">Governors</a>
             */
            public Builder withUsePowerSaveGovernor(boolean usePowerSaveGovernor) {
                return null;
            }

            /**
             * Set the download rate limit in Kbps.
             * Any non negative value is accepted but the following values are recommended:
             * <ul>
             *     <li>{@link #DOWNLOAD_RATE_LIMIT_NONE}</li>
             *     <li>{@link #DOWNLOAD_RATE_LIMIT_128K}</li>
             *     <li>{@link #DOWNLOAD_RATE_LIMIT_256K}</li>
             *     <li>{@link #DOWNLOAD_RATE_LIMIT_1M}</li>
             *     <li>{@link #DOWNLOAD_RATE_LIMIT_5M}</li>
             *     <li>{@link #DOWNLOAD_RATE_LIMIT_15M}</li>
             * </ul>
             * @param downloadRateLimitKbps The download rate limit in Kbps.
             * @throws IllegalArgumentException if the value is negative.
             */
            public Builder withDownloadRateLimitKbps(int downloadRateLimitKbps) {
                return null;
            }

            /**
             * Control if the mobile data is always active.
             * @param mobileDataAlwaysActive true to keep the mobile data always active, false
             *                               otherwise.
             */
            public Builder withMobileDataAlwaysActive(boolean mobileDataAlwaysActive) {
                return null;
            }

            /**
             * Control if the adaptive brightness is enabled.
             * @param adaptiveBrightness true to enable the adaptive brightness, false otherwise.
             */
            public Builder withAdaptiveBrightness(boolean adaptiveBrightness) {
                return null;
            }

            /**
             * Control if Bluetooth is disabled.
             * @param disableBluetooth true to disable Bluetooth, false otherwise.
             */
            public Builder withDisableBluetooth(boolean disableBluetooth) {
                return null;
            }

            /**
             * Control if Wi-Fi is disabled.
             * @param disableWifi true to disable Wifi, false otherwise.
             */
            public Builder withDisableWifi(boolean disableWifi) {
                return null;
            }

            /**
             * Control if the Location service is disabled.
             * @param disableLocation true to disable the location service, false otherwise.
             */
            public Builder withDisableLocation(boolean disableLocation) {
                return null;
            }

            /**
             * Control if the Telephony service is disabled.
             * @param disableTelephony true to disable the telephony service, false otherwise.
             */
            public Builder withDisableTelephony(boolean disableTelephony) {
                return null;
            }

            /**
             * Control if NFC is disabled.
             * @param disableNfc true to disable NFC, false otherwise.
             */
            public Builder withDisableNfc(boolean disableNfc) {
                return null;
            }

            /**
             * Control if the halves brightness adjustment is enabled.
             * @param halvesBrightnessAdjustment true to enable the halves brightness adjustment,
             *                                   false otherwise.
             */
            public Builder withHalvesBrightnessAdjustment(boolean halvesBrightnessAdjustment) {
                return null;
            }

            /**
             * Add an application to the blacklist.
             * The application is identified by its package name. The name must be non empty.
             * @param application The package name of the application to add to the blacklist.
             * @throws IllegalArgumentException if the name is empty or null.
             */
            public Builder addApplicationsBlacklist(String application) {
                return null;
            }

            /**
             * Set the profile's install location.
             * @param installLocation The install location of the profile (see {@link Location}).
             */
            public Builder withInstallLocation(Location installLocation) {
                return null;
            }

            /**
             * Build and return a newly created Profile object. The created object is
             * guaranteed to be valid and ready to use.
             * @return The Profile object.
             * @throws IllegalStateException if the name is not set or is empty.
             */
            public Profile build() {
                return null;
            }

        }

    }

}
