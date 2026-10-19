package com.datalogic.device.input;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;
import com.datalogic.device.configuration.PropertyID;
import com.datalogic.device.configuration.SerializableBlob;

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
     * Collection of scan code constants used to configure and identify
     * key mappings for the Datalogic logo overlay.<br/>
     * Each constant represents a hardware scan code associated with
     * a keyboard key, function key, navigation key, trigger or
     * device-specific action supported by Datalogic devices.<br/>
     * The values are aligned with Linux input subsystem scan codes,
     * extended with Datalogic-specific proprietary codes.
     */
    public static class ScanCode {
        /** No scan code assigned. */
        public static final int CODE_NONE = 0;
        /** Escape key. */
        public static final int CODE_ESC = 1;
        /** Numeric key 1. */
        public static final int CODE_1 = 2;
        /** Numeric key 2. */
        public static final int CODE_2 = 3;
        /** Numeric key 3. */
        public static final int CODE_3 = 4;
        /** Numeric key 4. */
        public static final int CODE_4 = 5;
        /** Numeric key 5. */
        public static final int CODE_5 = 6;
        /** Numeric key 6. */
        public static final int CODE_6 = 7;
        /** Numeric key 7. */
        public static final int CODE_7 = 8;
        /** Numeric key 8. */
        public static final int CODE_8 = 9;
        /** Numeric key 9. */
        public static final int CODE_9 = 10;
        /** Numeric key 0. */
        public static final int CODE_0 = 11;
        /** Minus key (-). */
        public static final int CODE_MINUS = 12;
        /** Equal key (=). */
        public static final int CODE_EQUAL = 13;
        /** Backspace key. */
        public static final int CODE_BKSP = 14;
        /** Tab key. */
        public static final int CODE_TAB = 15;
        /** Letter Q key. */
        public static final int CODE_Q = 16;
        /** Letter W key. */
        public static final int CODE_W = 17;
        /** Letter E key. */
        public static final int CODE_E = 18;
        /** Letter R key. */
        public static final int CODE_R = 19;
        /** Letter T key. */
        public static final int CODE_T = 20;
        /** Letter Y key. */
        public static final int CODE_Y = 21;
        /** Letter U key. */
        public static final int CODE_U = 22;
        /** Letter I key. */
        public static final int CODE_I = 23;
        /** Letter O key. */
        public static final int CODE_O = 24;
        /** Letter P key. */
        public static final int CODE_P = 25;
        /** Left bracket key ([). */
        public static final int CODE_LEFT_BRACKET = 26;
        /** Right bracket key (]). */
        public static final int CODE_RIGHT_BRACKET = 27;
        /** Right Enter key. */
        public static final int CODE_ENTER_R = 28;
        /** Control key. */
        public static final int CODE_CTRL = 29;
        /** Letter A key. */
        public static final int CODE_A = 30;
        /** Letter S key. */
        public static final int CODE_S = 31;
        /** Letter D key. */
        public static final int CODE_D = 32;
        /** Letter F key. */
        public static final int CODE_F = 33;
        /** Letter G key. */
        public static final int CODE_G = 34;
        /** Letter H key. */
        public static final int CODE_H = 35;
        /** Letter J key. */
        public static final int CODE_J = 36;
        /** Letter K key. */
        public static final int CODE_K = 37;
        /** Letter L key. */
        public static final int CODE_L = 38;
        /** Semicolon key (;). */
        public static final int CODE_SEMICOLON = 39;
        /** Apostrophe key ('). */
        public static final int CODE_APOSTROPHE = 40;
        /** Backtick key (`). */
        public static final int CODE_BACKTICK = 41;
        /** Shift key. */
        public static final int CODE_SHIFT = 42;
        /** Backslash key (\). */
        public static final int CODE_BACKSLASH = 43;
        /** Letter Z key. */
        public static final int CODE_Z = 44;
        /** Letter X key. */
        public static final int CODE_X = 45;
        /** Letter C key. */
        public static final int CODE_C = 46;
        /** Letter V key. */
        public static final int CODE_V = 47;
        /** Letter B key. */
        public static final int CODE_B = 48;
        /** Letter N key. */
        public static final int CODE_N = 49;
        /** Letter M key. */
        public static final int CODE_M = 50;
        /** Comma key (,). */
        public static final int CODE_COMMA = 51;
        /** Period key (.). */
        public static final int CODE_PERIOD = 52;
        /** Slash key (/). */
        public static final int CODE_SLASH = 53;
        /** Numeric keypad asterisk key (*). */
        public static final int CODE_ASTERISK = 55;
        /** Alt key. */
        public static final int CODE_ALT = 56;
        /** Space bar key. */
        public static final int CODE_SPACE = 57;
        /** Caps Lock key. */
        public static final int CODE_CAPS = 58;
        /** Function key F1. */
        public static final int CODE_F1 = 59;
        /** Function key F2. */
        public static final int CODE_F2 = 60;
        /** Function key F3. */
        public static final int CODE_F3 = 61;
        /** Function key F4. */
        public static final int CODE_F4 = 62;
        /** Function key F5. */
        public static final int CODE_F5 = 63;
        /** Function key F6. */
        public static final int CODE_F6 = 64;
        /** Function key F7. */
        public static final int CODE_F7 = 65;
        /** Function key F8. */
        public static final int CODE_F8 = 66;
        /** Function key F9. */
        public static final int CODE_F9 = 67;
        /** Function key F10. */
        public static final int CODE_F10 = 68;
        /** Plus key (+). */
        public static final int CODE_PLUS = 78;
        /** Function key F11. */
        public static final int CODE_F11 = 87;
        /** Function key F12. */
        public static final int CODE_F12 = 88;
        /** Left Enter key. */
        public static final int CODE_ENTER_L = 96;
        /** Print Screen key. */
        public static final int CODE_PRINTSCRN = 99;
        /** Home key. */
        public static final int CODE_HOME = 102;
        /** Up arrow key. */
        public static final int CODE_UP = 103;
        /** Page Up key. */
        public static final int CODE_PGUP = 104;
        /** Left arrow key. */
        public static final int CODE_LEFT = 105;
        /** Right arrow key. */
        public static final int CODE_RIGHT = 106;
        /** End key. */
        public static final int CODE_END = 107;
        /** Down arrow key. */
        public static final int CODE_DOWN = 108;
        /** Page Down key. */
        public static final int CODE_PGDWN = 109;
        /** Insert key. */
        public static final int CODE_INS = 110;
        /** Delete key. */
        public static final int CODE_DEL = 111;
        /** Volume down key. */
        public static final int CODE_VOL_MINUS = 114;
        /** Volume up key. */
        public static final int CODE_VOL_PLUS = 115;
        /** Power key. */
        public static final int CODE_PWR = 116;
        /** Stop key. */
        public static final int CODE_STOP = 128;
        /** SOS/emergency key. */
        public static final int CODE_SOS = 138;
        /** Menu key. */
        public static final int CODE_MENU = 139;
        /** Programmable key P1. */
        public static final int CODE_P1 = 148;
        /** Programmable key P2. */
        public static final int CODE_P2 = 149;
        /** Lock key. */
        public static final int CODE_LOCK = 152;
        /** Back key. */
        public static final int CODE_BACK = 158;
        /** Forward key. */
        public static final int CODE_FRWRD = 159;
        /** Refresh key. */
        public static final int CODE_REFRESH = 173;
        /** Scroll/roller increment key. */
        public static final int CODE_ROLL_PLUS = 177;
        /** Scroll/roller decrement key. */
        public static final int CODE_ROLL_MINUS = 178;
        /** Left parenthesis key ((). */
        public static final int CODE_LEFT_PAREN = 179;
        /** Right parenthesis key ()). */
        public static final int CODE_RIGHT_PAREN = 180;
        /** Function key F13. */
        public static final int CODE_F13 = 183;
        /** Function key F14. */
        public static final int CODE_F14 = 184;
        /** Function key F15. */
        public static final int CODE_F15 = 185;
        /** Function key F16. */
        public static final int CODE_F16 = 186;
        /** Function key F17. */
        public static final int CODE_F17 = 187;
        /** Function key F18. */
        public static final int CODE_F18 = 188;
        /** Function key F19. */
        public static final int CODE_F19 = 189;
        /** Function key F20. */
        public static final int CODE_F20 = 190;
        /** Function key F21. */
        public static final int CODE_F21 = 191;
        /** Function key F22. */
        public static final int CODE_F22 = 192;
        /** Function key F23. */
        public static final int CODE_F23 = 193;
        /** Function key F24. */
        public static final int CODE_F24 = 194;
        /** Question mark key (?). */
        public static final int CODE_QUESTION = 214;
        /** Brightness up key. */
        public static final int CODE_BRUP = 224;
        /** Brightness down key. */
        public static final int CODE_BRDWN = 225;
        /** Battery swap key. */
        public static final int CODE_BATTSWAP = 236;
        /** Brightness cycle key. */
        public static final int CODE_BRCYC = 243;
        /** Less-than key (<). */
        public static final int CODE_LESS = 256;
        /** Greater-than key (>). */
        public static final int CODE_GREATER = 257;
        /** Exclamation mark key (!). */
        public static final int CODE_EXCLAMATION = 258;
        /** Caret key (^). */
        public static final int CODE_CARET = 259;
        /** Ampersand key (&). */
        public static final int CODE_AMPERSAND = 260;
        /** Underscore key (_). */
        public static final int CODE_UNDERSCORE = 262;
        /** Colon key (:). */
        public static final int CODE_COLON = 263;
        /** Double quote key ("). */
        public static final int CODE_QUOTE = 264;
        /** Percent key (%). */
        public static final int CODE_PERCENT = 265;
        /** Pipe key (|). */
        public static final int CODE_PIPE = 266;
        /** Tilde key (~). */
        public static final int CODE_TILDE = 267;
        /** Shift+Tab key combination. */
        public static final int CODE_SHIFT_TAB = 268;
        /** Attention key. */
        public static final int CODE_ATTN = 269;
        /** Function exit key. */
        public static final int CODE_FEXIT = 270;
        /** Symbol key. */
        public static final int CODE_SYMB = 271;
        /** Auto-scan trigger key. */
        public static final int CODE_SCAN_A = 304;
        /** Motion scan trigger M key. */
        public static final int CODE_SCAN_M = 305;
        /** Reset key. */
        public static final int CODE_RST = 306;
        /** Half trigger key. */
        public static final int CODE_HALF_TRIG = 307;
        /** Left trigger scan key. */
        public static final int CODE_SCAN_L = 310;
        /** Right trigger scan key. */
        public static final int CODE_SCAN_R = 311;
        /** Field decrement key. */
        public static final int CODE_FLD_MINUS = 312;
        /** Field increment key. */
        public static final int CODE_FLD_PLUS = 313;
        /** Pistol trigger scan key. */
        public static final int CODE_SCAN_T = 314;
        /** Front trigger scan key. */
        public static final int CODE_SCAN_F = 315;
        /** Trigger handle left key. */
        public static final int CODE_THL = 317;
        /** Trigger handle right key. */
        public static final int CODE_THR = 318;
        /** Clear key. */
        public static final int CODE_CLR = 355;
        /** Datalogic key. */
        public static final int CODE_DL = 360;
        /** Symbol modifier key. */
        public static final int CODE_SYM = 368;
        /** Dollar sign key ($). */
        public static final int CODE_DOLLAR = 434;
        /** At sign key (@). */
        public static final int CODE_AT = 512;
        /** Hash sign key (#). */
        public static final int CODE_HASH = 523;
        /** Push-to-talk key. */
        public static final int CODE_PTT = 586;
    }

    /**
     * <code>LogoKeys</code> implements the BlobProperty that allows to manage
     * the mapping of the keys available in the Datalogic logo overlay, which
     * is shown when pressing the Datalogic logo button.<br>
     * The class is managed by the ConfigurationManager Blob Property
     * {@link PropertyID#KEYBOARD_LOGO_KEYS}.
     */
    public static class LogoKeys extends SerializableBlob {
        /**
         * @hide
         */
        public LogoKeys() {
        }

        /**
         * Get the list of currently mapped keys. The list cannot be
         * modified to add or remove items, the only editable thing is the
         * scan code of the contained keys. After editing the scancodes,
         * the changes can be applied by calling the {@link #setKeys} method.
         * @return An unmodifiable list containing all the mapped keys.
         */
        public List<Key> getKeys() {
            return null;
        }

        /**
         * Set the list of currently mapped keys. The list must contain the same
         * keys already included in the property, the only change allowed is
         * in the internal scancodes of the keys.
         * @param logoKeys A list containing all the mapped keys.
         * @throws IllegalArgumentException The input keys are not valid.
         */
        public void setKeys(List<Key> logoKeys) {
            
        }

        /**
         * A single key found in the Datalogic logo overlay.
         */
        public static class Key {
            /**
             * @hide
             */
            public Key() {
                
            }

            /**
             * Returns the key name.
             * @return The name.
             */
            public String getName() {
                return null;
            }

            /**
             * Returns the scancode of this key. The list of available scancodes
             * is found in the {@link ScanCode} class.
             * @return The scancode.
             */
            public int getScanCode() {
                return 0;
            }

            /**
             * Set the scancode of this key. The list of available scancodes
             * is found in the {@link ScanCode} class.
             * @param scanCode The new scancode.
             */
            public void setScanCode(int scanCode) {
                
            }
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
