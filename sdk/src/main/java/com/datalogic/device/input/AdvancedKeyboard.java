package com.datalogic.device.input;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

import java.util.List;

/**
 * Class exposing advanced keyboard methods.
 */
public class AdvancedKeyboard {
    /**
     * Interface representing a listener of keyboard action events. It can be
     * registered and unregistered using methods in the the {@link AdvancedKeyboard}
     * class.
     */
    public interface ActionEventListener
    {
        /**
         * Method called when a specific action key has been pressed / released.
         * @param actionId
         *        The ID associated with the action key.
         * @param pressed
         *        True if the action key has been pressed, false if it has been
         *        released.
        */
        void onAction(int actionId, boolean pressed);
    }

    /**
     * Interface representing a listener of keyboard layout change events. It can be
     * registered and unregistered using methods in the the {@link AdvancedKeyboard}
     * class.
     */
    public interface LayoutChangeEventListener
    {
        /**
         * Method called when the keyboard layout has changed.
         * @param layoutId
         *        The ID of the new layout. A value of 0 represents the default
         *        layout.
         */
        void onLayoutChanged(int layoutId);
    }

    /**
     * Interface representing a listener of keyboard multitap events. It can be
     * registered and unregistered using methods in the the {@link AdvancedKeyboard}
     * class.
     */
    public interface MultitapEventListener
    {
        /**
         * Method called when a multitap key is under selection but the key has
         * not yet been confirmed.
         * @param index
         *        Index of the selected key in the char array.
         * @param multitapKeys
         *        Array of all multitap chars associated to the multitap key.
         */
        void onMultitapSelecting(int index, char[] multitapKeys);

        /**
         * Method called when a multitap key is selected. The same key will
         * generate an input event.
         * @param index
         *        Index of the selected key in the char array.
         * @param multitapKeys
         *        Array of all multitap chars associated to the multitap key.
         */
        void onMultitapSelected(int index, char[] multitapKeys);
    }

    /**
     * Read-only properties related to the currently configured keyboard.
     */
    public enum Property {
        /**
         * Name of the installed keyboard configuration.
         * Exposed as a <code>String</code> parameter.
         */
        NAME,
        /**
         * Description of the installed keyboard configuration.
         * Exposed as a <code>String</code> parameter.
         */
        DESCRIPTION,
        /**
         * Author of the installed keyboard configuration.
         * Exposed as a <code>String</code> parameter.
         */
        AUTHOR,
        /**
         * Version of the installed keyboard configuration.
         * Exposed as an <code>int</code> parameter.
         */
        VERSION,
        /**
         * Revision of the installed keyboard configuration.
         * Exposed as an <code>int</code> parameter.
         */
        REVISION,
        /**
         * Creation date of the installed keyboard configuration.
         * Exposed as a <code>String</code> parameter, with format
         * <code>HH:mm:ss yyyy-MM-dd</code> (for details see
         * {@link <a href="http://developer.android.com/reference/java/text/SimpleDateFormat.html">SimpleDateFormat</a>}).
         */
        DATE;

        /**
         * Converts the property to its integer corresponding value.
         *
         * @return
         *         Integer value of this property.
         */
        public int toInt() {
            return 0;
        }

        /**
         * Retrieves the corresponding Property value from a valid integer.
         *
         * @param value
         *        Integer to use as input in the conversion.
         * @return
         *         The corresponding property.
         */
        public static Property fromInt(int value) {
            return null;
        }
    }

    /**
     * Enumerative representing the persistence type of the installed keyboard
     * configuration.
     */
    public enum PersistenceType {
        /**
         * The keyboard configuration is persistent to device reboots. Any type
         * of data reset (enterprise or factory) will remove this configuration.
         */
        REBOOT_PERSISTENT,
        /**
         * The keyboard configuration is persistent to enterprise reset. Only a
         * factory reset can remove this configuration.
         */
        ENTERPRISE_RESET_PERSISTENT,
        /**
         * The keyboard configuration is persistent to factory reset. This is
         * the case of the default keyboard configuration.
         */
        FACTORY_RESET_PERSISTENT;

        /**
         * Converts the PersistenceType to its integer corresponding value.
         *
         * @return
         *         Integer value of this persistence type.
         */
        public int toInt() {
            return 0;
        }

        /**
         * Retrieves the corresponding PersistenceType value from a valid integer.
         *
         * @param value
         *        Integer to use as input in the conversion.
         * @return
         *         The corresponding persistence type.
         */
        public static PersistenceType fromInt(int value) {
            return null;
        }
    }

    /**
     * Enumerative representing the type of notification to use in order to
     * represent visually the current layout in which the keyboard is. This is
     * not in use in case of the default layout but only for the additional
     * layouts possibly available in the keyboard.
     */
    public enum LayoutNotificationType {
        /**
         * Do not show any type of notification.
         */
        NONE,
        /**
         * Shows only color LEDs related to the currently selected layout.
         * If the layout color is not associated to any LED, nothing will be
         * shown.
         */
        ONLY_LED,
        /**
         * Shows the currently selected layout in the notification bar only.
         */
        ONLY_STATUS_BAR,
        /**
         * Shows all available types of notification.
         */
        ALL;

        /**
         * Converts the LayoutNotificationType to its integer corresponding value.
         *
         * @return
         *         Integer value of this layout notification type.
         */
        public int toInt() {
            return 0;
        }

        /**
         * Retrieves the corresponding LayoutNotificationType value from a valid integer.
         *
         * @param value
         *        Integer to use as input in the conversion.
         * @return
         *         The corresponding install type.
         */
        public static LayoutNotificationType fromInt(int value) {
            return null;
        }
    }

    /**
     * Class that stores the info related to the installed keyboard
     * configuration. It can be retrieved by using the
     * {@link #getInfo() getInfo} method.
     */
    public class Info {
        /**
         * @hide
         */
        Info() {

        }

        /**
         * Gets the name of the currently installed keyboard configuration.
         * @return
         *         Keyboard configuration name.
         */
        public String getName() {
            return null;
        }

        /**
         * Gets the description of the currently installed keyboard configuration.
         * @return
         *         Keyboard configuration description.
         */
        public String getDescription() {
            return null;
        }

        /**
         * Gets the author of the currently installed keyboard configuration.
         * @return
         *         Keyboard configuration author.
         */
        public String getAuthor() {
            return null;
        }

        /**
         * Gets the version of the currently installed keyboard configuration.
         * @return
         *         Keyboard configuration version.
         */
        public int getVersion() {
            return 0;
        }

        /**
         * Gets the revision of the currently installed keyboard configuration.
         * @return
         *         Keyboard configuration revision.
         */
        public int getRevision() {
            return 0;
        }

        /**
         * Gets the creation date of the currently installed keyboard
         * configuration.
         * @return
         *         Keyboard configuration creation date.
         */
        public String getDate() {
            return null;
        }

        /**
         * Gets the persistence type of the currently installed keyboard
         * configuration.
         * @return
         *         Keyboard configuration persistence type.
         */
        public PersistenceType getPersistenceType() {
            return null;
        }
    }

    /**
     * Class that stores the resources related to the installed keyboard
     * configuration. It can be retrieved by using the
     * {@link #getResources() getResources} method.
     */
    public class Resources {
        /**
         * @hide
         */
        Resources() {

        }

        /**
         * Gets the keyboard image stored in the configuration, as a byte array.
         * @return
         *         Keyboard configuration image.
         */
        public byte[] getImage() {
            return null;
        }

        /**
         * Gets the image format.
         * @return
         *         A string representing the image format in use. Currently, the
         *         only supported format is <code>"PNG"</code>.
         */
        public String getImageFormat() {
            return null;
        }

        /**
         * Gets the full keyboard configuration as a JSON string. This includes
         * all the keyboard mapping and additional keyboard parameters.
         * @return
         *         Keyboard configuration as JSON string.
         */
        public String getJson() {
            return null;
        }
    }

    /**
     * Class that stores the configuration related some keyboard parameters.
     * It can be retrieved by using the {@link #getConfiguration() getConfiguration}
     * method and modified back using the
     * {@link #setConfiguration(Configuration) setConfiguration} method.
     */
    public class Configuration {
        /**
         * @hide
         */
        Configuration() {

        }

        /**
         * Gets the keyboard multitap delay used to define after how much time
         * from the first multitap key press the associated character will be
         * submitted to the UI.
         * @return
         *         Keyboard multitap delay (in milliseconds).
         */
        public int getMultitapDelay() {
            return 0;
        }

        /**
         * Gets the layout notification type.
         * @return
         *         The layout notification type.
         */
        public LayoutNotificationType getLayoutNotificationType() {
            return null;
        }

        /**
         * Checks if the keyboard backlight control is enabled.
         * @return
         *         True if the backlight control is enabled, false otherwise.
         */
        public boolean isBacklightControlEnabled() {
            return false;
        }

        /**
         * Gets the keyboard backlight brightness. This is effective only when
         * the backlight control is enabled.
         * @return
         *         The keyboard backlight brightness.
         */
        public int getBacklightBrightness() {
            return 0;
        }

        /**
         * Gets the keyboard backlight timeout in milliseconds.
         * In case of inactivity, the keyboard backlight will turn off after
         * this amount of time.
         * @return
         *         The backlight timeout.
         */
        public int getBacklightTimeout() {
            return 0;
        }

        /**
         * Checks if the multitap notification is enabled. This notification is
         * visible after a multitap key is pressed, showing the list of all multitap
         * characters related to that key and the currently selected one. The
         * notification automatically disappears after the multitap delay has
         * been reached.
         * @return
         *         True if the multitap notification is enabled, false otherwise.
         */
        public boolean isMultitapNotificationEnabled() {
            return false;
        }

        /**
         * Checks if the backlight notification is enabled. This notification is
         * visible after the backlight up or down keys are pressed, showing the
         * currently backlight brightness level and allowing the user to edit it
         * directly through the touch scren. The notification automatically
         * disappears after the backlight timeout has been reached.
         * @return
         *         True if the backlight notification is enabled, false otherwise.
         */
        public boolean isBacklightNotificationEnabled() {
            return false;
        }

        /**
         * Sets the keyboard multitap delay used to define after how much time
         * from the first multitap key press the associated character will be
         * submitted to the UI.
         * @param multitapDelay
         *        The keyboard multitap delay to set (in milliseconds). It must
         *        be more than 0.
         */
        public void setMultitapDelay(int multitapDelay) {

        }

        /**
         * Sets the layout notification type.
         * @param layoutNotificationType
         *        The layout notification type to set.
         */
        public void setLayoutNotificationType(LayoutNotificationType layoutNotificationType) {

        }

        /**
         * Sets the parameter to enable or disable the keyboard backlight control.
         * @param backlightControlEnabled
         *        True to enable the backlight control, false to disable it.
         */
        public void setBacklightControlEnabled(boolean backlightControlEnabled) {

        }

        /**
         * Sets the keyboard backlight brightness. This is effective only when
         * the keyboard baclight control is enabled.
         * @param backlightBrightness
         *        The backlight brightness (in the range 0-100).
         */
        public void setBacklightBrightness(int backlightBrightness) {

        }

        /**
         * Sets the keyboard backlight inactivity timeout.
         * In case of inactivity, the keyboard backlight will turn off after
         * this amount of time.
         * @param backlightTimeout
         *        The backlight timeout.
         */
        public void setBacklightTimeout(int backlightTimeout) {

        }

        /**
         * Enables or disables the multitap notification. This notification is
         * visible after a multitap key is pressed, showing the list of all multitap
         * characters related to that key and the currently selected one. The
         * notification automatically disappears after the multitap delay has
         * been reached.
         * @param multitapNotificationEnabled
         *        True to enable the multitap notification, false to disable it.
         */
        public void setMultitapNotificationEnabled(boolean multitapNotificationEnabled) {

        }

        /**
         * Enables or disables the backlight notification. This notification is
         * visible after the backlight up or down keys are pressed, showing the
         * currently backlight brightness level and allowing the user to edit it
         * directly through the touch scren. The notification automatically
         * disappears after the backlight timeout has been reached.
         * @param backlightNotificationEnabled
         *        True to enable the backlight notification, false to disable it.
         */
        public void setBacklightNotificationEnabled(boolean backlightNotificationEnabled) {

        }
    }

    /**
     * Class that stores the info related to a keyboard overlay
     * configuration. The list of available overlays can be
     * retrieved by using the {@link #getOverlays} method.
     */
    public class Overlay {
        /**
         * @hide
         */
        Overlay() {
            
        }

        /**
         * Gets the name of the keyboard overlay.
         * @return
         *         Keyboard overlay name.
         */
        public String getName() {
            return null;
        }

        /**
         * Gets the description of the keyboard overlay.
         * @return
         *         Keyboard overlay description.
         */
        public String getDescription() {
            return null;
        }

        /**
         * Gets the author of the keyboard overlay.
         * @return
         *         Keyboard overlay author.
         */
        public String getAuthor() {
            return null;
        }

        /**
         * Gets the version of the keyboard overlay.
         * @return
         *         Keyboard overlay version.
         */
        public int getVersion() {
            return 0;
        }

        /**
         * Gets the revision of the keyboard overlay.
         * @return
         *         Keyboard overlay revision.
         */
        public int getRevision() {
            return 0;
        }

        /**
         * Gets the creation date of the keyboard overlay.
         * @return
         *         Keyboard overlay creation date.
         */
        public String getDate() {
            return null;
        }
    }

    /**
     * @hide
     */
    private AdvancedKeyboard() throws Exception {

    }

    /**
     * Reads an integer property.
     * @param property
     *        The property to read.
     * @return
     *        Value of the property if present, otherwise it throws an exception
     *        if exceptions are enabled through the {@link ErrorManager} singleton
     *        or it returns
     *        {@link <a href="http://developer.android.com/reference/java/lang/Integer.html#MIN_VALUE">
     *        Integer.MIN_VALUE</a>} if exceptions are disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public int getIntProperty(Property property) {
        return 0;
    }

    /**
     * Reads a string property.
     * @param property
     *        The property to read.
     * @return
     *        Value of the property if present, otherwise it throws an exception
     *        if exceptions are enabled through the {@link ErrorManager} singleton
     *        or it returns null if exceptions are disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public String getStringProperty(Property property) {
        return null;
    }

    /**
     * Gets the info related to the installed keyboard configuration.
     * @return
     *         The keyboard configuration info if available, otherwise it
     *         throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton or null if the exceptions are
     *         disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public Info getInfo() {
        return null;
    }

    /**
     * Gets the resources related to the installed keyboard configuration.
     * @return
     *         The keyboard configuration resources if available, otherwise it
     *         throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton or null if the exceptions are
     *         disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public Resources getResources() {
        return null;
    }

    /**
     * Gets the configuration related to some keyboard parameters.
     * @return
     *         The keyboard configuration if available, otherwise it
     *         throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton or null if the exceptions are
     *         disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public Configuration getConfiguration() {
        return null;
    }

    /**
     * Sets the keyboard configuration parameters.
     * @param configuration
     *         The keyboard configuration to set.
     * @return
     *         True in case the configuration has been set correctrly, otherwise it
     *         throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton or returns false if the exceptions
     *         are disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean setConfiguration(Configuration configuration) {
        return false;
    }

    /**
     * Gets the currently available keyboard overlays.
     * @return
     *         A list of available overlays that can be empty if there are no
     *         overlays available.
     */
    public List<Overlay> getOverlays() {
        return null;
    }

    /**
     * Command the installation of a keyboard overlay, by specifying the
     * overlay object for the keyboard to install. This object must be one of the
     * overlays available through the {@link #getOverlays} method.
     * @param overlay
     *        The overlay object.
     * @param persistenceType
     *        Desired type of persistence. Be aware that the
     *        FACTORY_RESET_PERSISTENT is not allowed and will cause an
     *        installation failure.
     * @return
     *         true in case the installation is done and all new keyboard data is
     *         immediately available, false in case of installation failure or
     *         throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean installOverlay(Overlay overlay, PersistenceType persistenceType) {
        return false;
    }

    /**
     * Gets the index of the current layout in which the keyboard is.
     * @return
     *         The layout index (0 is the default layout). If there is an error
     *         in reading this value, it will throw an exception if exceptions
     *         are enabled through the {@link ErrorManager} singleton or return
     *         {@link <a href="http://developer.android.com/reference/java/lang/Integer.html#MIN_VALUE">
     *         Integer.MIN_VALUE</a>} if exceptions are disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public int getCurrentLayoutIndex() {
        return 0;
    }

    /**
     * Sets the current layout index. This operation will be done in a
     * moment in which all keyboard keys are released.
     * @param layoutIndex
     *        The layout index.
     * @return
     *         True in case the layout has been set successfully. If there is an error
     *         in reading this value, it will throw an exception if exceptions
     *         are enabled through the {@link ErrorManager} singleton or return
     *         false if exceptions are disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean setCurrentLayoutIndex(int layoutIndex) {
        return false;
    }

    /**
     * Checks if the keyboard layout is currently locked, preventing any layout
     * change both manually and through the SDK.
     * @return
     *         True if the layout is locked, false otherwise. In case of error it
     *         will throw an exception if exceptions are enabled
     *         through the {@link ErrorManager} singleton or return
     *         false if exceptions are disabled.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean isLayoutLocked() {
        return false;
    }

    /**
     * Locks or unlocks the possibility for the keyboard to change its current
     * layout both manually or through the SDK methods.
     * @param layoutLocked
     *        True to lock the layout, false to unlock it.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public void setLayoutLocked(boolean layoutLocked) {

    }

    /**
     * Command the installation of a new keyboard configuration, by specifying
     * the path to the keyboard configuration file (as exported through the
     * Keyboard Editor application), the desired type of persistence and the option
     * to clear any existing configuration (outside of the default one).
     * @param path
     *        Path of a zip file created through the use of the Keyboard Editor
     *        application.
     * @param persistenceType
     *        Desired type of persistence. Be aware that the
     *        FACTORY_RESET_PERSISTENT is not allowed and will cause an
     *        installation failure.
     * @return
     *         true in case the installation is done and all new keyboard data is
     *         immediately available, false in case of installation failure or
     *         throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean installKeyboard(String path, PersistenceType persistenceType) {
        return false;
    }

    /**
     * Resets the keyboard configuration to the default one.
     */
    public void resetToDefault() {

    }

    /**
     * Adds a listener to a specific action key press or release.
     * @param listener
     *        The listener to add.
     * @param actionId
     *        ID of the action event to listen to.
     * @param pressed
     *        True to listen to the pressure event, false to listen to the release event.
     * @return
     *         True if the listener has been added successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean addActionEventListener(ActionEventListener listener,
            int actionId, boolean pressed) {
        return false;
    }

    /**
     * Adds a listener to an action key event, registering to both press and release events.
     * @param listener
     *        The listener to add.
     * @param actionId
     *        ID of the action event to listen to.
     * @return
     *         True if the listener has been added successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean addActionEventListener(ActionEventListener listener,
            int actionId) {
        return false;
    }

    /**
     * Adds a listener to all action key events.
     * @param listener
     *        The listener to add.
     * @return
     *         True if the listener has been added successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean addActionEventListener(ActionEventListener listener) {
        return false;
    }

    /**
     * Removes a listener to a specific action key press or release.
     * @param listener
     *        The listener to remove.
     * @param actionId
     *        ID of the related action key.
     * @param pressed
     *        True to remove the pressure event, false to remove the release event.
     * @return
     *         True if the listener has been removed successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean removeActionEventListener(ActionEventListener listener,
            int actionId, boolean pressed) {
        return false;
    }

    /**
     * Removes a listener to a specific action key event, both for press and release.
     * @param listener
     *        The listener to remove.
     * @param actionId
     *        ID of the related action key.
     * @return
     *         True if the listener has been removed successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean removeActionEventListener(ActionEventListener listener,
            int actionId) {
        return false;
    }

    /**
     * Removes a listener to all action key events.
     * @param listener
     *        The listener to remove.
     * @return
     *         True if the listener has been removed successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean removeActionEventListener(ActionEventListener listener) {
        return false;
    }

    /**
     * Adds a listener to layout change events.
     * @param listener
     *        The listener to add.
     * @return
     *         True if the listener has been added successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean addLayoutChangeEventListener(LayoutChangeEventListener listener) {
        return false;
    }

    /**
     * Removes a listener to layout change events.
     * @param listener
     *        The listener to remove.
     * @return
     *         True if the listener has been removed successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean removeLayoutChangeEventListener(LayoutChangeEventListener listener) {
        return false;
    }

    /**
     * Adds a listener to multitap events.
     * @param listener
     *        The listener to add.
     * @return
     *         True if the listener has been added successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean addMultitapEventListener(MultitapEventListener listener) {
        return false;
    }

    /**
     * Removes a listener to multitap events.
     * @param listener
     *        The listener to remove.
     * @return
     *         True if the listener has been removed successfully, false otherwise
     *         or throws an exception if exceptions are enabled through the
     *         {@link ErrorManager} singleton.
     * @throws DeviceException in case of error, when exceptions
     *         are enabled through the {@link ErrorManager} singleton.
     */
    public boolean removeMultitapEventListener(MultitapEventListener listener) {
        return false;
    }


}
