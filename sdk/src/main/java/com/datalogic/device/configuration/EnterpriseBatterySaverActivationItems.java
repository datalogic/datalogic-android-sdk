package com.datalogic.device.configuration;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

/**
 * <code>EnterpriseBatterySaverActivationItems</code> implements the BlobProperty that allows to manage
 * the activation items for the Enterprise Battery Saver.
 * <br>
 * The class is managed by the ConfigurationManager Blob Property
 * {@link PropertyID#POWER_ENTERPRISE_BATTERY_SAVER_ACTIVATION_ITEMS}.
 */
public class EnterpriseBatterySaverActivationItems extends SerializableBlob {

    /**
     * Gets the available activation items.
     * @return The available activation items.
     */
    public List<ActivationItem> getActivationItems() {
        return null;
    }

    /**
     * Sets the available activation items.
     * @param activationItems The activation items to set.
     * @throws IllegalArgumentException if the activation items list is null.
     */
    public void setActivationItems(List<ActivationItem> activationItems) {
    }

    /**
     * Adds an activation item to the list. If an activation item with the same name already exists,
     * it will be replaced.
     * @param activationItem The activation item to add.
     * @throws IllegalArgumentException if the activation item is null.
     */
    public void add(ActivationItem activationItem) {
    }

    /**
     * Removes an activation item from the list, whose name matches the one of the activation item
     * passed as parameter.
     * @param activationItem The activation item to remove.
     * @throws IllegalArgumentException if the activation item is null.
     */
    public void remove(ActivationItem activationItem) {
    }

    /**
     * Builder for the EnterpriseBatterySaverActivationItems.
     */
    public static class Builder {

        /**
         * Create a new Builder for the EnterpriseBatterySaverActivationItems object with an
         * initial empty list of activation-items.
         */
        public Builder() {
        }

        /**
         * Adds an activation item to the list.
         * @param activationItem The activation item to add.
         * @throws IllegalArgumentException if the activation item is null.
         */
        public Builder addActivationItem(ActivationItem activationItem) {
            return null;
        }

        /**
         * Build and return a newly created EnterpriseBatterySaverActivationItems object. The created
         * object is guaranteed to be valid and ready to use.
         * @return The EnterpriseBatterySaverActivationItems object.
         */
        public EnterpriseBatterySaverActivationItems build() {
            return null;
        }

    }

    /**
     * Represents an activation item.
     */
    public static class ActivationItem {

        /**
         * An activation item is used to trigger a profile when a condition is met.
         * The condition is dependent on the type, which can be one of the following (in
         * decreasing order of priority):
         * <ul>
         *     <li>Power source</li>
         *     <li>Pocket mode</li>
         *     <li>Battery level</li>
         *     <li>Time interval</li>
         *     <li>Connection</li>
         *     <li>Always on</li>
         * </ul>
         * When multiple activation items are defined, they are evaluated with the priority
         * of the order in the list above. The first one that matches the condition will be
         * triggered.
         */
        public enum Type {
            /***
             * The activation item is automatically triggered and represents the default state
             * of the device.
             */
            ALWAYS_ON,
            /***
             * The activation item is triggered when the battery level is below or equal to the
             * specified value.
             */
            BATTERY_LEVEL,
            /***
             * The activation item is triggered when the power source is one of the ones specified in
             * the `FLAG_POWER_SOURCE_XXX` mask.
             */
            POWER_SOURCE,
            /***
             * The activation item is triggered when the device is in a specific time interval.
             */
            TIME_INTERVAL,
            /***
             * The activation item is triggered when the pocket mode is in the state described by the
             * `active` parameter.
             */
            POCKET_MODE,
            /***
             * The activation item is triggered when the device is connected to one of the connection
             * types specified in the `FLAG_CONNECTED_XXX` mask.
             */
            CONNECTION
        }

        /**
         * Mask for the power source types.
         */
        public static final int FLAG_POWER_SOURCE_USB = 1;
        public static final int FLAG_POWER_SOURCE_AC = 1 << 1;
        public static final int FLAG_POWER_SOURCE_WIRELESS = 1 << 2;
        public static final int FLAG_POWER_SOURCE_WIRED_DOCK = 1 << 3;
        public static final int FLAG_POWER_SOURCE_WIRELESS_DOCK = 1 << 4;

        /**
         * Mask for the connection types.
         */
        public static final int FLAG_CONNECTED_WLAN = 1;
        public static final int FLAG_CONNECTED_WWAN = 1 << 1;

        /**
         * Constants for the days of the week (ISO-8601).
         */
        public static final int WEEK_DAY_MONDAY = 1;
        public static final int WEEK_DAY_TUESDAY = 2;
        public static final int WEEK_DAY_WEDNESDAY = 3;
        public static final int WEEK_DAY_THURSDAY = 4;
        public static final int WEEK_DAY_FRIDAY = 5;
        public static final int WEEK_DAY_SATURDAY = 6;
        public static final int WEEK_DAY_SUNDAY = 7;

        /**
         * Returns the name of the activation item.
         */
        public String getName() {
            return null;
        }

        /**
         * Returns the profile name of the activation item.
         */
        public String getProfileName() {
            return null;
        }

        /**
         * Returns the type of the activation item. See {@link Type} for the list of
         * supported types.
         */
        public Type getType() {
            return null;
        }

        /**
         * Returns the representation of the internal parameters of the activation item. The
         * parameters are represented as a map of key-value pairs, and their actual values
         * depend on the type of the activation item.
         */
        public Map<String, String> getParams() {
            return null;
        }

        /**
         * Builds the ActivationItem object.
         */
        public static class Builder {

            /**
             * Creates a new Builder for the ActivationItem object, with the following default
             * values:
             * <ul>
             *     <li>`name` and `profileName` unset,</li>
             *     <li>type equal to `ALWAYS_ON`.</li>
             * </ul>
             * The name and profile name must be set before building the object.
             */
            public Builder() {
            }

            /**
             * Sets the name of the activation item.
             * The name must be non empty and unique among all activation items.
             * @param name The name of the activation item.
             * @throws IllegalArgumentException if the name is empty or null.
             */
            public Builder withName(String name) {
                return null;
            }

            /**
             * Sets the profile name of the activation item.
             * It need to match the name of a profile already defined. When the activation item
             * is triggered, the profile will be activated.
             * @param profileName The name of the profile.
             * @throws IllegalArgumentException if the profile name is empty or null.
             */
            public Builder withProfileName(String profileName) {
                return null;
            }

            /**
             * Configures the activation item to be always on, i.e. it will be always triggered
             * when present.
             * This is the default state of the device.
             */
            public Builder withAlwaysOn() {
                return null;
            }

            /**
             * Configures the activation item to be triggered when the battery level is below or
             * equal to the specified value.
             * @param batteryLevel The battery level, in percentage (0-100).
             * @throws IllegalArgumentException if the battery level is not in the range 0-100.
             */
            public Builder withBatteryLevel(int batteryLevel) {
                return null;
            }

            /**
             * Configures the activation item to be triggered the power source is one of the
             * ones specified in the mask.
             * @param powerSourceMask The power source types mask. Valid values are
             *                        {@link #FLAG_POWER_SOURCE_USB},
             *                        {@link #FLAG_POWER_SOURCE_AC},
             *                        {@link #FLAG_POWER_SOURCE_WIRELESS},
             *                        {@link #FLAG_POWER_SOURCE_WIRED_DOCK} and
             *                        {@link #FLAG_POWER_SOURCE_WIRELESS_DOCK}.
             */
            public Builder withPowerSource(int powerSourceMask) {
                return null;
            }

            /**
             * Configures the activation item to be triggered when the device is in a specific
             * time interval.
             * @param dayOfWeekStart The start day of the week (1-7, where 1 is Monday and 7 is Sunday).
             * @param timeStart The start time of the interval.
             * @param dayOfWeekEnd The end day of the week (1-7, where 1 is Monday and 7 is Sunday).
             * @param timeEnd The end time of the interval.
             * @throws IllegalArgumentException if the start time is after the end time or if the days of
             * the week are not in the range 1-7.
             */
            public Builder withTimeInterval(int dayOfWeekStart,
                                            LocalTime timeStart,
                                            int dayOfWeekEnd,
                                            LocalTime timeEnd) {
                return null;
            }

            /**
             * Configures the activation item to be triggered the pocket mode is in the state
             * described by the `active` parameter.
             * @param active If true, the activation item is triggered when the pocket mode is
             *               active. If false, it is triggered when the pocket mode is inactive.
             */
            public Builder withPocketMode(boolean active) {
                return null;
            }

            /**
             * Configures the activation item to be triggered when the device is connected to
             * one of the connection types specified in the mask.
             * @param connectionMask The connection types mask. Valid values are
             *                       {@link #FLAG_CONNECTED_WLAN} and {@link #FLAG_CONNECTED_WWAN}.
             */
            public Builder withConnection(int connectionMask) {
                return null;
            }

            /**
             * Builds and return a newly created ActivationItem object. The created object is
             * guaranteed to be valid and ready to use.
             * @return The ActivationItem object.
             * @throws IllegalStateException if the activation item is not properly configured.
             */
            public ActivationItem build() {
                return null;
            }

        }

    }

}
