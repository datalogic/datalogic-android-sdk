package com.datalogic.device.input;

import java.util.List;
import java.util.Map;

import android.content.Intent;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

/**
 * This class provides access to keyboard related methods of the device.
 */
public class KeyboardManager {
	/**
	 * This is the constructor of KeyboardManager.
	 *
	 * @throws DeviceException in case of error.
	 */
	public KeyboardManager() {
	}

	/**
	 * Locks or unlocks the input from keyboard and physical buttons.
	 * 
	 * @param lock
	 *            <code>boolean</code> it specifies whether or not the keyboard will be locked.
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int lockInput(boolean lock) {
		return 0;
	}

	/**
	 * Tells if the input from keyboard is locked.
	 * 
	 * @return <code>boolean</code> it returns whether or not the keyboard is locked.
	 */
	public boolean isInputLocked() {
	    return true;
	}

	/**
	 * Assigns a virtual key code to a physical key. If a mapping for the
	 * desired physical key is already assigned and saved, it will be
	 * overridden.
	 * 
	 * @param scanCode
	 *             a {@link VScanEntry} representing the virtual scan code.
	 * @param keyCode
	 *            a {@link KeyCodeEntry} representing the Android key code and meta state. <br>
	 * <br>
	 *            Example code to avoid any keyboard event on the left scan
	 *            trigger pressure:<br>
	 *            <code>(new KeyboardManager()).mapKeyCode(new VScanEntry(VScanCode.VSCAN_LEFT_TRIGGER), new KeyCodeEntry(KeyEvent.KEYCODE_UNKNOWN));</code>
	 * <br>
	 * <br>
	 *            Example code to map the left scan trigger to the Android left
	 *            trigger button key code:<br>
	 *            <code>(new KeyboardManager()).mapKeyCode(new VScanEntry(VScanCode.VSCAN_LEFT_TRIGGER), new KeyCodeEntry(KeyEvent.KEYCODE_BUTTON_L1));</code>
	 * <br>
	 * <br>
	 *            Example code to map the enter key to the Android home key
	 *            code:<br>
	 *            <code>(new KeyboardManager()).mapKeyCode(new VScanEntry(VScanCode.VSCAN_RIGHT_ENTER), new KeyCodeEntry(KeyEvent.KEYCODE_HOME));</code>
	 * <br>
	 * <br>
	 * @see com.datalogic.device.input.VScanEntry
	 * @see com.datalogic.device.input.KeyCodeEntry
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int mapKeyCode(VScanEntry scanCode, KeyCodeEntry keyCode) {
		return 0;
	}

	/**
	 * Returns current mapping between a physical scan code key and an Android key code.
	 * 
	 * @param scanCode
	 *            a {@link VScanEntry} representing the virtual scan code.
	 * @see com.datalogic.device.input.VScanEntry
	 * @return {@link KeyCodeEntry} representing an Android key code and meta state. Returns null in case there
	 *         is no association.
	 * @see com.datalogic.device.input.KeyCodeEntry
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public KeyCodeEntry getKeyCode(VScanEntry scanCode) {
	    return null;
	}

	/**
	 * Assigns a unicode character to a physical key. If a mapping for the
	 * desired physical key is already assigned and saved, it will be
	 * overridden.
	 * 
	 * @param scanCode
	 *            a {@link VScanEntry} representing the virtual scan code.
	 * @see com.datalogic.device.input.VScanEntry
	 * @param c
	 *            unicode character <br>
	 * <br>
	 *            Example code to assign a Thai unicode character to the
	 *            physical key '1':<br>
	 *            <code>(new KeyboardManager()).mapUnicode(new VScanEntry(VScanCode.VSCAN_1), '\\u0e01');</code>
	 * <br>
	 * <br>
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int mapUnicode(VScanEntry scanCode, Character c) {
		return 0;
	}

	/**
	 * Returns current mapping between a physical key and a unicode character.
	 * 
	 * @param scanCode
	 *            a {@link VScanEntry} representing the virtual scan code.
	 * @see com.datalogic.device.input.VScanEntry
	 * @return unicode character. Returns null in case there is no association.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public Character getUnicode(VScanEntry scanCode) {
	    return null;
	}

	/**
	 * Assigns an Intent to a physical key. If a mapping for the desired
	 * physical key is already assigned and saved, it will be overridden.
	 * 
	 * @param scanCode
	 *            a {@link VScanEntry} representing the virtual scan code.
	 * @see com.datalogic.device.input.VScanEntry
	 * @param intent
	 *            Intent used to launch an Android activity through the
	 *            Context.startActivity(Intent intent) method. <br>
	 * <br>
	 *            Example code to make Camera Activity capture an image on the
	 *            front scan trigger pressure:<br>
	 *            <code>(new KeyboardManager()).mapIntent(new VScanEntry(VScanCode.VSCAN_FRONT_TRIGGER), new Intent(MediaStore.ACTION_IMAGE_CAPTURE));</code>
	 * <br>
	 * <br>
	 *            Example code to make BarcodeManager capture a barcode on the
	 *            front scan trigger pressure and to stop capturing on the front
	 *            scan trigger release:<br>
	 *            <code>(new KeyboardManager()).mapIntent(new VScanEntry(VScanCode.VSCAN_FRONT_TRIGGER), new Intent(BarcodeManager.ACTION_START_DECODE));</code>
	 * <br>
	 * <br>
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int mapIntent(VScanEntry scanCode, Intent intent) {
		return 0;
	}

	/**
	 * Returns current mapping between a physical key and an Intent.
	 * 
	 * @param scanCode
	 *            a {@link VScanEntry} representing the virtual scan code.
	 * @see com.datalogic.device.input.VScanEntry
	 * @return Intent used to launch an Android activity through the
	 *         Context.startActivity(Intent intent) method. Returns null in case
	 *         there is no association.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public Intent getIntent(VScanEntry scanCode) {
	    return null;
	}

	/**
	 * Removes all the configured mappings. Whenever this method is called, all
	 * the current active mappings are cleared and removed.
	 * 
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int clearAllMappings() {
		return 0;
	}

	/**
	 * Removes a single active mapping. The current active mapping for the
	 * selected {@link com.datalogic.device.input.VScanEntry}, if
	 * existing, is removed.
	 * 
	 * @param scanCode
	 *            a {@link VScanEntry} representing the virtual scan code, mapped that must be removed.
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int clearMapping(VScanEntry scanCode) {
		return 0;
	}

	/**
	 * Provides a {@link java.util.Map}<
	 * {@link com.datalogic.device.input.VScanEntry}, {@link com.datalogic.device.input.KeyCodeEntry}>
	 * containing all the stored and active Android key codes mappings.
	 * 
	 * @return {@link java.util.Map}<
	 *         {@link com.datalogic.device.input.VScanEntry},
	 *         {@link com.datalogic.device.input.KeyCodeEntry}> the corresponding saved mappings. Null is
	 *         returned if there aren't any mappings saved.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public Map<VScanEntry, KeyCodeEntry> getMappedKeyCodes() {
	    return null;
	}

	/**
	 * Provides a {@link java.util.Map}<
	 * {@link com.datalogic.device.input.VScanEntry},
	 * {@link <a href="http://developer.android.com/reference/android/content/Intent.html">android.content.Intent</a>}
	 * > containing all the stored and active Android Intent mappings.
	 * 
	 * @return {@link java.util.Map}<
	 *         {@link com.datalogic.device.input.VScanEntry},
	 *         {@link <a href="http://developer.android.com/reference/android/content/Intent.html">android.content.Intent</a>}
	 *         > the corresponding saved mappings. Null is returned if there
	 *         aren't any mappings saved.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public Map<VScanEntry, Intent> getMappedIntents() {
	    return null;
	}

	/**
	 * Provides a {@link java.util.Map}<
	 * {@link com.datalogic.device.input.VScanEntry},
	 * {@link java.lang.Character}> containing all the stored and active
	 * Character mappings.
	 * 
	 * @return {@link java.util.Map}<
	 *         {@link com.datalogic.device.input.VScanEntry},
	 *         {@link java.lang.Character}> the corresponding saved mappings.
	 *         Null is returned if there aren't any mappings saved.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public Map<VScanEntry, Character> getMappedUnicodes() {
	    return null;
	}

	/**
	 * Disables completely a single physical key, through the {@link com.datalogic.device.input.VScanEntry} data structure.
	 * When a key is disabled, no input will be produced whenever key presses are detected. When a key is again re-enabled,
	 * is reset to its original value, so any previous mapping is automatically lost.
	 *
	 * @param scanCode
	 *            a {@link VScanEntry} representing the virtual scan code, associated to the physical key.
	 * @param disable
	 * 			  a <code>boolean</code> that specifies whether or not the key will be disabled.
	 * @return <code>int</code> {@link DeviceException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link DeviceException} error constants.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int disableKey(VScanEntry scanCode, boolean disable) {
		return 0;
	}

	/**
	 * Checks if a physical key is disabled.
	 *
	 * @param scanCode
	 *            a {@link VScanEntry} representing the virtual scan code, associated to the physical key.
	 *
	 * @return <code>boolean</code> True in case the key is disabled, false otherwise or in case of error.
	 * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public boolean isKeyDisabled(VScanEntry scanCode) {
		return false;
	}

	/**
	 * Virtual key scan codes.
	 */
	public class VScanCode {
		/*
		 * TODO: Decide to define these values here or framework. If defined
		 * only here, then KeyboardLayout should be received from a system app,
		 * referencing this library. <br> Another possibility is to reference
		 * the header file directly in native C code.
		 */
		public final static int VSCAN_RESERVED = 0;
		public final static int VSCAN_ESC = 1;
		public final static int VSCAN_1 = 2;
		public final static int VSCAN_2 = 3;
		public final static int VSCAN_3 = 4;
		public final static int VSCAN_4 = 5;
		public final static int VSCAN_5 = 6;
		public final static int VSCAN_6 = 7;
		public final static int VSCAN_7 = 8;
		public final static int VSCAN_8 = 9;
		public final static int VSCAN_9 = 10;
		public final static int VSCAN_0 = 11;
		public final static int VSCAN_MINUS = 12;
		public final static int VSCAN_EQUAL = 13;
		public final static int VSCAN_BACKSPACE = 14;
		public final static int VSCAN_TAB = 15;
		public final static int VSCAN_Q = 16;
		public final static int VSCAN_W = 17;
		public final static int VSCAN_E = 18;
		public final static int VSCAN_R = 19;
		public final static int VSCAN_T = 20;
		public final static int VSCAN_Y = 21;
		public final static int VSCAN_U = 22;
		public final static int VSCAN_I = 23;
		public final static int VSCAN_O = 24;
		public final static int VSCAN_P = 25;
		public final static int VSCAN_LEFTBRACE = 26;
		public final static int VSCAN_RIGHTBRACE = 27;
		public final static int VSCAN_ENTER = 28;
		public final static int VSCAN_LEFTCTRL = 29;
		public final static int VSCAN_A = 30;
		public final static int VSCAN_S = 31;
		public final static int VSCAN_D = 32;
		public final static int VSCAN_F = 33;
		public final static int VSCAN_G = 34;
		public final static int VSCAN_H = 35;
		public final static int VSCAN_J = 36;
		public final static int VSCAN_K = 37;
		public final static int VSCAN_L = 38;
		public final static int VSCAN_SEMICOLON = 39;
		public final static int VSCAN_APOSTROPHE = 40;
		public final static int VSCAN_GRAVE = 41;
		public final static int VSCAN_LEFTSHIFT = 42;
		public final static int VSCAN_BACKSLASH = 43;
		public final static int VSCAN_Z = 44;
		public final static int VSCAN_X = 45;
		public final static int VSCAN_C = 46;
		public final static int VSCAN_V = 47;
		public final static int VSCAN_B = 48;
		public final static int VSCAN_N = 49;
		public final static int VSCAN_M = 50;
		public final static int VSCAN_COMMA = 51;
		public final static int VSCAN_DOT = 52;
		public final static int VSCAN_SLASH = 53;
		public final static int VSCAN_RIGHTSHIFT = 54;
		public final static int VSCAN_KPASTERISK = 55;
		public final static int VSCAN_LEFTALT = 56;
		public final static int VSCAN_SPACE = 57;
		public final static int VSCAN_CAPSLOCK = 58;
		public final static int VSCAN_F1 = 59;
		public final static int VSCAN_F2 = 60;
		public final static int VSCAN_F3 = 61;
		public final static int VSCAN_F4 = 62;
		public final static int VSCAN_F5 = 63;
		public final static int VSCAN_F6 = 64;
		public final static int VSCAN_F7 = 65;
		public final static int VSCAN_F8 = 66;
		public final static int VSCAN_F9 = 67;
		public final static int VSCAN_F10 = 68;
		public final static int VSCAN_NUMLOCK = 69;
		public final static int VSCAN_SCROLLLOCK = 70;
		public final static int VSCAN_KP7 = 71;
		public final static int VSCAN_KP8 = 72;
		public final static int VSCAN_KP9 = 73;
		public final static int VSCAN_KPMINUS = 74;
		public final static int VSCAN_KP4 = 75;
		public final static int VSCAN_KP5 = 76;
		public final static int VSCAN_KP6 = 77;
		public final static int VSCAN_KPPLUS = 78;
		public final static int VSCAN_KP1 = 79;
		public final static int VSCAN_KP2 = 80;
		public final static int VSCAN_KP3 = 81;
		public final static int VSCAN_KP0 = 82;
		public final static int VSCAN_KPDOT = 83;

		public final static int VSCAN_ZENKAKUHANKAKU = 85;
		public final static int VSCAN_102ND = 86;
		public final static int VSCAN_F11 = 87;
		public final static int VSCAN_F12 = 88;
		public final static int VSCAN_RO = 89;
		public final static int VSCAN_KATAKANA = 90;
		public final static int VSCAN_HIRAGANA = 91;
		public final static int VSCAN_HENKAN = 92;
		public final static int VSCAN_KATAKANAHIRAGANA = 93;
		public final static int VSCAN_MUHENKAN = 94;
		public final static int VSCAN_KPJPCOMMA = 95;
		public final static int VSCAN_KPENTER = 96;
		public final static int VSCAN_RIGHTCTRL = 97;
		public final static int VSCAN_KPSLASH = 98;
		public final static int VSCAN_SYSRQ = 99;
		public final static int VSCAN_RIGHTALT = 100;
		public final static int VSCAN_LINEFEED = 101;
		public final static int VSCAN_HOME = 102;
		public final static int VSCAN_UP = 103;
		public final static int VSCAN_PAGEUP = 104;
		public final static int VSCAN_LEFT = 105;
		public final static int VSCAN_RIGHT = 106;
		public final static int VSCAN_END = 107;
		public final static int VSCAN_DOWN = 108;
		public final static int VSCAN_PAGEDOWN = 109;
		public final static int VSCAN_INSERT = 110;
		public final static int VSCAN_DELETE = 111;
		public final static int VSCAN_MACRO = 112;
		public final static int VSCAN_MUTE = 113;
		public final static int VSCAN_VOLUMEDOWN = 114;
		public final static int VSCAN_VOLUMEUP = 115;
		public final static int VSCAN_POWER = 116;/* SC System Power Down */
		public final static int VSCAN_KPEQUAL = 117;
		public final static int VSCAN_KPPLUSMINUS = 118;
		public final static int VSCAN_PAUSE = 119;
		public final static int VSCAN_SCALE = 120;/* AL Compiz Scale (Expose) */

		public final static int VSCAN_KPCOMMA = 121;
		public final static int VSCAN_HANGEUL = 122;
		public final static int VSCAN_HANGUEL = VSCAN_HANGEUL;
		public final static int VSCAN_HANJA = 123;
		public final static int VSCAN_YEN = 124;
		public final static int VSCAN_LEFTMETA = 125;
		public final static int VSCAN_RIGHTMETA = 126;
		public final static int VSCAN_COMPOSE = 127;

		public final static int VSCAN_STOP = 128; /* AC Stop */
		public final static int VSCAN_AGAIN = 129;
		public final static int VSCAN_PROPS = 130;/* AC Properties */
		public final static int VSCAN_UNDO = 131;/* AC Undo */
		public final static int VSCAN_FRONT = 132;
		public final static int VSCAN_COPY = 133;/* AC Copy */
		public final static int VSCAN_OPEN = 134;/* AC Open */
		public final static int VSCAN_PASTE = 135;/* AC Paste */
		public final static int VSCAN_FIND = 136;/* AC Search */
		public final static int VSCAN_CUT = 137;/* AC Cut */
		public final static int VSCAN_HELP = 138;/* AL Integrated Help Center */
		public final static int VSCAN_MENU = 139;/* Menu (show menu) */
		public final static int VSCAN_CALC = 140;/* AL Calculator */
		public final static int VSCAN_SETUP = 141;
		public final static int VSCAN_SLEEP = 142;/* SC System Sleep */
		public final static int VSCAN_WAKEUP = 143;/* System Wake Up */
		public final static int VSCAN_FILE = 144;/* AL Local Machine Browser */
		public final static int VSCAN_SENDFILE = 145;
		public final static int VSCAN_DELETEFILE = 146;
		public final static int VSCAN_XFER = 147;
		public final static int VSCAN_PROG1 = 148;
		public final static int VSCAN_PROG2 = 149;
		public final static int VSCAN_WWW = 150;/* AL Internet Browser */
		public final static int VSCAN_MSDOS = 151;
		public final static int VSCAN_COFFEE = 152;/*
													 * AL Terminal
													 * Lock/Screensaver
													 */
		public final static int VSCAN_SCREENLOCK = VSCAN_COFFEE;
		public final static int VSCAN_DIRECTION = 153;
		public final static int VSCAN_CYCLEWINDOWS = 154;
		public final static int VSCAN_MAIL = 155;
		public final static int VSCAN_BOOKMARKS = 156;/* AC Bookmarks */
		public final static int VSCAN_COMPUTER = 157;
		public final static int VSCAN_BACK = 158;/* AC Back */
		public final static int VSCAN_FORWARD = 159;/* AC Forward */
		public final static int VSCAN_CLOSECD = 160;
		public final static int VSCAN_EJECTCD = 161;
		public final static int VSCAN_EJECTCLOSECD = 162;
		public final static int VSCAN_NEXTSONG = 163;
		public final static int VSCAN_PLAYPAUSE = 164;
		public final static int VSCAN_PREVIOUSSONG = 165;
		public final static int VSCAN_STOPCD = 166;
		public final static int VSCAN_RECORD = 167;
		public final static int VSCAN_REWIND = 168;
		public final static int VSCAN_PHONE = 169;/* Media Select Telephone */
		public final static int VSCAN_ISO = 170;
		public final static int VSCAN_CONFIG = 171;/*
													 * AL Consumer Control
													 * Configuration
													 */
		public final static int VSCAN_HOMEPAGE = 172;/* AC Home */
		public final static int VSCAN_REFRESH = 173;/* AC Refresh */
		public final static int VSCAN_EXIT = 174;/* AC Exit */
		public final static int VSCAN_MOVE = 175;
		public final static int VSCAN_EDIT = 176;
		public final static int VSCAN_SCROLLUP = 177;
		public final static int VSCAN_SCROLLDOWN = 178;
		public final static int VSCAN_KPLEFTPAREN = 179;
		public final static int VSCAN_KPRIGHTPAREN = 180;
		public final static int VSCAN_NEW = 181;/* AC New */
		public final static int VSCAN_REDO = 182;/* AC Redo/Repeat */

		public final static int VSCAN_F13 = 183;
		public final static int VSCAN_F14 = 184;
		public final static int VSCAN_F15 = 185;
		public final static int VSCAN_F16 = 186;
		public final static int VSCAN_F17 = 187;
		public final static int VSCAN_F18 = 188;
		public final static int VSCAN_F19 = 189;
		public final static int VSCAN_F20 = 190;
		public final static int VSCAN_F21 = 191;
		public final static int VSCAN_F22 = 192;
		public final static int VSCAN_F23 = 193;
		public final static int VSCAN_F24 = 194;

		public final static int VSCAN_PLAYCD = 200;
		public final static int VSCAN_PAUSECD = 201;
		public final static int VSCAN_PROG3 = 202;
		public final static int VSCAN_PROG4 = 203;
		public final static int VSCAN_DASHBOARD = 204;/* AL Dashboard */
		public final static int VSCAN_SUSPEND = 205;
		public final static int VSCAN_CLOSE = 206;/* AC Close */
		public final static int VSCAN_PLAY = 207;
		public final static int VSCAN_FASTFORWARD = 208;
		public final static int VSCAN_BASSBOOST = 209;
		public final static int VSCAN_PRINT = 210;/* AC Print */
		public final static int VSCAN_HP = 211;
		public final static int VSCAN_CAMERA = 212;
		public final static int VSCAN_SOUND = 213;
		public final static int VSCAN_QUESTION = 214;
		public final static int VSCAN_EMAIL = 215;
		public final static int VSCAN_CHAT = 216;
		public final static int VSCAN_SEARCH = 217;
		public final static int VSCAN_CONNECT = 218;
		public final static int VSCAN_FINANCE = 219;/* AL Checkbook/Finance */
		public final static int VSCAN_SPORT = 220;
		public final static int VSCAN_SHOP = 221;
		public final static int VSCAN_ALTERASE = 222;
		public final static int VSCAN_CANCEL = 223;/* AC Cancel */
		public final static int VSCAN_BRIGHTNESSDOWN = 224;
		public final static int VSCAN_BRIGHTNESSUP = 225;
		public final static int VSCAN_MEDIA = 226;

		public final static int VSCAN_SWITCHVIDEOMODE = 227; /*
															 * Cycle between
															 * available video
															 * outputs
															 * (Monitor/=
															 * LCD;/TV-out/etc)
															 */
		public final static int VSCAN_KBDILLUMTOGGLE = 228;
		public final static int VSCAN_KBDILLUMDOWN = 229;
		public final static int VSCAN_KBDILLUMUP = 230;

		public final static int VSCAN_SEND = 231; /* AC Send */
		public final static int VSCAN_REPLY = 232;/* AC Reply */
		public final static int VSCAN_FORWARDMAIL = 233;/* AC Forward Msg */
		public final static int VSCAN_SAVE = 234;/* AC Save */
		public final static int VSCAN_DOCUMENTS = 235;

		public final static int VSCAN_BATTERY = 236;

		public final static int VSCAN_BLUETOOTH = 237;
		public final static int VSCAN_WLAN = 238;
		public final static int VSCAN_UWB = 239;

		public final static int VSCAN_UNKNOWN = 240;

		public final static int VSCAN_VIDEO_NEXT = 241; /*
														 * drive next video
														 * source
														 */
		public final static int VSCAN_VIDEO_PREV = 242;/*
														 * drive previous video
														 * source
														 */
		public final static int VSCAN_BRIGHTNESS_CYCLE = 243;/*
															 * brightness up,
															 * after max is min
															 */
		public final static int VSCAN_BRIGHTNESS_ZERO = 244;/*
															 * brightness off,
															 * use ambient
															 */
		public final static int VSCAN_DISPLAY_OFF = 245;/*
														 * display device to off
														 * state
														 */

		public final static int VSCAN_WIMAX = 246;

		/* Range 248 - 255 is reserved for special needs of AT keyboard driver */

		/* Range 256 - 337 is for mouse and joystick buttons codes */
		public final static int VSCAN_BTN_MISC = 0x100;
		public final static int VSCAN_BTN_0 = 0x100;
		public final static int VSCAN_BTN_1 = 0x101;
		public final static int VSCAN_BTN_2 = 0x102;
		public final static int VSCAN_BTN_3 = 0x103;
		public final static int VSCAN_BTN_4 = 0x104;
		public final static int VSCAN_BTN_5 = 0x105;
		public final static int VSCAN_BTN_6 = 0x106;
		public final static int VSCAN_BTN_7 = 0x107;
		public final static int VSCAN_BTN_8 = 0x108;
		public final static int VSCAN_BTN_9 = 0x109;

		public final static int VSCAN_BTN_MOUSE = 0x110;
		public final static int VSCAN_BTN_LEFT = 0x110;
		public final static int VSCAN_BTN_RIGHT = 0x111;
		public final static int VSCAN_BTN_MIDDLE = 0x112;
		public final static int VSCAN_BTN_SIDE = 0x113;
		public final static int VSCAN_BTN_EXTRA = 0x114;
		public final static int VSCAN_BTN_FORWARD = 0x115;
		public final static int VSCAN_BTN_BACK = 0x116;
		public final static int VSCAN_BTN_TASK = 0x117;

		public final static int VSCAN_BTN_JOYSTICK = 0x120;
		public final static int VSCAN_BTN_TRIGGER = 0x120;
		public final static int VSCAN_BTN_THUMB = 0x121;
		public final static int VSCAN_BTN_THUMB2 = 0x122;
		public final static int VSCAN_BTN_TOP = 0x123;
		public final static int VSCAN_BTN_TOP2 = 0x124;
		public final static int VSCAN_BTN_PINKIE = 0x125;
		public final static int VSCAN_BTN_BASE = 0x126;
		public final static int VSCAN_BTN_BASE2 = 0x127;
		public final static int VSCAN_BTN_BASE3 = 0x128;
		public final static int VSCAN_BTN_BASE4 = 0x129;
		public final static int VSCAN_BTN_BASE5 = 0x12a;
		public final static int VSCAN_BTN_BASE6 = 0x12b;
		public final static int VSCAN_BTN_DEAD = 0x12f;
		public final static int VSCAN_BTN_GAMEPAD = 0x130;
		public final static int VSCAN_BTN_A = 0x130;
		public final static int VSCAN_BTN_B = 0x131;
		public final static int VSCAN_BTN_C = 0x132;
		public final static int VSCAN_BTN_X = 0x133;
		public final static int VSCAN_BTN_Y = 0x134;
		public final static int VSCAN_BTN_Z = 0x135;
		public final static int VSCAN_BTN_TL = 0x136;
		public final static int VSCAN_BTN_TR = 0x137;
		public final static int VSCAN_BTN_TL2 = 0x138;
		public final static int VSCAN_BTN_TR2 = 0x139;
		public final static int VSCAN_BTN_SELECT = 0x13a;
		public final static int VSCAN_BTN_START = 0x13b;
		public final static int VSCAN_BTN_MODE = 0x13c;
		public final static int VSCAN_BTN_THUMBL = 0x13d;
		public final static int VSCAN_BTN_THUMBR = 0x13e;
		public final static int VSCAN_BTN_DIGI = 0x140;
		public final static int VSCAN_BTN_TOOL_PEN = 0x140;
		public final static int VSCAN_BTN_TOOL_RUBBER = 0x141;
		public final static int VSCAN_BTN_TOOL_BRUSH = 0x142;
		public final static int VSCAN_BTN_TOOL_PENCIL = 0x143;
		public final static int VSCAN_BTN_TOOL_AIRBRUSH = 0x144;
		public final static int VSCAN_BTN_TOOL_FINGER = 0x145;
		public final static int VSCAN_BTN_TOOL_MOUSE = 0x146;
		public final static int VSCAN_BTN_TOOL_LENS = 0x147;
		public final static int VSCAN_BTN_TOUCH = 0x14a;
		public final static int VSCAN_BTN_STYLUS = 0x14b;
		public final static int VSCAN_BTN_STYLUS2 = 0x14c;
		public final static int VSCAN_BTN_TOOL_DOUBLETAP = 0x14d;
		public final static int VSCAN_BTN_TOOL_TRIPLETAP = 0x14e;

		public final static int VSCAN_BTN_WHEEL = 0x150;
		public final static int VSCAN_BTN_GEAR_DOWN = 0x150;
		public final static int VSCAN_BTN_GEAR_UP = 0x151;

		public final static int VSCAN_OK = 0x160;
		public final static int VSCAN_SELECT = 0x161;
		public final static int VSCAN_GOTO = 0x162;
		public final static int VSCAN_CLEAR = 0x163;
		public final static int VSCAN_POWER2 = 0x164;
		public final static int VSCAN_OPTION = 0x165;
		public final static int VSCAN_INFO = 0x166;/*
													 * AL OEM
													 * Features/Tips/Tutorial
													 */
		public final static int VSCAN_TIME = 0x167;
		public final static int VSCAN_VENDOR = 0x168;
		public final static int VSCAN_ARCHIVE = 0x169;
		public final static int VSCAN_PROGRAM = 0x16a;/*
													 * Media Select Program
													 * Guide
													 */
		public final static int VSCAN_CHANNEL = 0x16b;
		public final static int VSCAN_FAVORITES = 0x16c;
		public final static int VSCAN_EPG = 0x16d;
		public final static int VSCAN_PVR = 0x16e;/* Media Select Home */
		public final static int VSCAN_MHP = 0x16f;
		public final static int VSCAN_LANGUAGE = 0x170;
		public final static int VSCAN_TITLE = 0x171;
		public final static int VSCAN_SUBTITLE = 0x172;
		public final static int VSCAN_ANGLE = 0x173;
		public final static int VSCAN_ZOOM = 0x174;
		public final static int VSCAN_MODE = 0x175;
		public final static int VSCAN_KEYBOARD = 0x176;
		public final static int VSCAN_SCREEN = 0x177;
		public final static int VSCAN_PC = 0x178;/* Media Select Computer */
		public final static int VSCAN_TV = 0x179;/* Media Select TV */
		public final static int VSCAN_TV2 = 0x17a;/* Media Select Cable */
		public final static int VSCAN_VCR = 0x17b;/* Media Select VCR */
		public final static int VSCAN_VCR2 = 0x17c;/* VCR Plus */
		public final static int VSCAN_SAT = 0x17d;/* Media Select Satellite */
		public final static int VSCAN_SAT2 = 0x17e;
		public final static int VSCAN_CD = 0x17f;/* Media Select CD */
		public final static int VSCAN_TAPE = 0x180;/* Media Select Tape */
		public final static int VSCAN_RADIO = 0x181;
		public final static int VSCAN_TUNER = 0x182;/* Media Select Tuner */
		public final static int VSCAN_PLAYER = 0x183;
		public final static int VSCAN_TEXT = 0x184;
		public final static int VSCAN_DVD = 0x185;/* Media Select DVD */
		public final static int VSCAN_AUX = 0x186;
		public final static int VSCAN_MP3 = 0x187;
		public final static int VSCAN_AUDIO = 0x188;
		public final static int VSCAN_VIDEO = 0x189;
		public final static int VSCAN_DIRECTORY = 0x18a;
		public final static int VSCAN_LIST = 0x18b;
		public final static int VSCAN_MEMO = 0x18c;/* Media Select Messages */
		public final static int VSCAN_CALENDAR = 0x18d;
		public final static int VSCAN_RED = 0x18e;
		public final static int VSCAN_GREEN = 0x18f;
		public final static int VSCAN_YELLOW = 0x190;
		public final static int VSCAN_BLUE = 0x191;
		public final static int VSCAN_CHANNELUP = 0x192;/* Channel Increment */
		public final static int VSCAN_CHANNELDOWN = 0x193;/* Channel Decrement */
		public final static int VSCAN_FIRST = 0x194;
		public final static int VSCAN_LAST = 0x195;/* Recall Last */
		public final static int VSCAN_AB = 0x196;
		public final static int VSCAN_NEXT = 0x197;
		public final static int VSCAN_RESTART = 0x198;
		public final static int VSCAN_SLOW = 0x199;
		public final static int VSCAN_SHUFFLE = 0x19a;
		public final static int VSCAN_BREAK = 0x19b;
		public final static int VSCAN_PREVIOUS = 0x19c;
		public final static int VSCAN_DIGITS = 0x19d;
		public final static int VSCAN_TEEN = 0x19e;
		public final static int VSCAN_TWEN = 0x19f;
		public final static int VSCAN_VIDEOPHONE = 0x1a0;/*
														 * Media Select Video
														 * Phone
														 */
		public final static int VSCAN_GAMES = 0x1a1;/* Media Select Games */
		public final static int VSCAN_ZOOMIN = 0x1a2;/* AC Zoom In */
		public final static int VSCAN_ZOOMOUT = 0x1a3;/* AC Zoom Out */
		public final static int VSCAN_ZOOMRESET = 0x1a4;/* AC Zoom */
		public final static int VSCAN_WORDPROCESSOR = 0x1a5;/* AL Word Processor */
		public final static int VSCAN_EDITOR = 0x1a6;/* AL Text Editor */
		public final static int VSCAN_SPREADSHEET = 0x1a7;/* AL Spreadsheet */
		public final static int VSCAN_GRAPHICSEDITOR = 0x1a8;/*
															 * AL Graphics
															 * Editor
															 */
		public final static int VSCAN_PRESENTATION = 0x1a9;/*
															 * AL Presentation
															 * App
															 */
		public final static int VSCAN_DATABASE = 0x1aa;/* AL Database App */
		public final static int VSCAN_NEWS = 0x1ab;/* AL Newsreader */
		public final static int VSCAN_VOICEMAIL = 0x1ac;/* AL Voicemail */
		public final static int VSCAN_ADDRESSBOOK = 0x1ad;/*
														 * AL Contacts/Address
														 * Book
														 */
		public final static int VSCAN_MESSENGER = 0x1ae;/* AL Instant Messaging */
		public final static int VSCAN_DISPLAYTOGGLE = 0x1af;/*
															 * Turn display
															 * (LCD) on and off
															 */
		public final static int VSCAN_SPELLCHECK = 0x1b0;/* AL Spell Check */
		public final static int VSCAN_LOGOFF = 0x1b1;/* AL Logoff */

		public final static int VSCAN_DOLLAR = 0x1b2;
		public final static int VSCAN_EURO = 0x1b3;

		public final static int VSCAN_FRAMEBACK = 0x1b4; /*
														 * Consumer - transport
														 * controls
														 */
		public final static int VSCAN_FRAMEFORWARD = 0x1b5;
		public final static int VSCAN_CONTEXT_MENU = 0x1b6;/*
															 * GenDesc - system
															 * context menu
															 */
		public final static int VSCAN_MEDIA_REPEAT = 0x1b7;/*
															 * Consumer -
															 * transport control
															 */

		public final static int VSCAN_DEL_EOL = 0x1c0;
		public final static int VSCAN_DEL_EOS = 0x1c1;
		public final static int VSCAN_INS_LINE = 0x1c2;
		public final static int VSCAN_DEL_LINE = 0x1c3;

		public final static int VSCAN_FN = 0x1d0;
		public final static int VSCAN_FN_ESC = 0x1d1;
		public final static int VSCAN_FN_F1 = 0x1d2;
		public final static int VSCAN_FN_F2 = 0x1d3;
		public final static int VSCAN_FN_F3 = 0x1d4;
		public final static int VSCAN_FN_F4 = 0x1d5;
		public final static int VSCAN_FN_F5 = 0x1d6;
		public final static int VSCAN_FN_F6 = 0x1d7;
		public final static int VSCAN_FN_F7 = 0x1d8;
		public final static int VSCAN_FN_F8 = 0x1d9;
		public final static int VSCAN_FN_F9 = 0x1da;
		public final static int VSCAN_FN_F10 = 0x1db;
		public final static int VSCAN_FN_F11 = 0x1dc;
		public final static int VSCAN_FN_F12 = 0x1dd;
		public final static int VSCAN_FN_1 = 0x1de;
		public final static int VSCAN_FN_2 = 0x1df;
		public final static int VSCAN_FN_D = 0x1e0;
		public final static int VSCAN_FN_E = 0x1e1;
		public final static int VSCAN_FN_F = 0x1e2;
		public final static int VSCAN_FN_S = 0x1e3;
		public final static int VSCAN_FN_B = 0x1e4;

		public final static int VSCAN_BRL_DOT1 = 0x1f1;
		public final static int VSCAN_BRL_DOT2 = 0x1f2;
		public final static int VSCAN_BRL_DOT3 = 0x1f3;
		public final static int VSCAN_BRL_DOT4 = 0x1f4;
		public final static int VSCAN_BRL_DOT5 = 0x1f5;
		public final static int VSCAN_BRL_DOT6 = 0x1f6;
		public final static int VSCAN_BRL_DOT7 = 0x1f7;
		public final static int VSCAN_BRL_DOT8 = 0x1f8;
		public final static int VSCAN_BRL_DOT9 = 0x1f9;
		public final static int VSCAN_BRL_DOT10 = 0x1fa;

		public final static int VSCAN_NUMERIC_0 = 0x200; /*
														 * used by phones,
														 * remote controls,
														 */
		public final static int VSCAN_NUMERIC_1 = 0x201;/* and other keypads */
		public final static int VSCAN_NUMERIC_2 = 0x202;
		public final static int VSCAN_NUMERIC_3 = 0x203;
		public final static int VSCAN_NUMERIC_4 = 0x204;
		public final static int VSCAN_NUMERIC_5 = 0x205;
		public final static int VSCAN_NUMERIC_6 = 0x206;
		public final static int VSCAN_NUMERIC_7 = 0x207;
		public final static int VSCAN_NUMERIC_8 = 0x208;
		public final static int VSCAN_NUMERIC_9 = 0x209;
		public final static int VSCAN_NUMERIC_STAR = 0x20a;
		public final static int VSCAN_NUMERIC_POUND = 0x20b;

		/*
		 * default for left trigger: scancode=VSCAN_LEFT_TRIGGER,
		 * keycode=KEYCODE_BUTTON_L1
		 */
		public final static int VSCAN_LEFT_TRIGGER = VSCAN_BTN_TL;// VSCAN_BTN_LEFT;
		/*
		 * default for right trigger: scancode=VSCAN_RIGHT_TRIGGER,
		 * keycode=KEYCODE_BUTTON_R1
		 */
		public final static int VSCAN_RIGHT_TRIGGER = VSCAN_BTN_TR;// VSCAN_BTN_RIGHT;
		/*
		 * default for pistol trigger: scancode=VSCAN_PISTOL_TRIGGER,
		 * keycode=KEYCODE_BUTTON_SELECT
		 */
		public final static int VSCAN_PISTOL_TRIGGER = VSCAN_BTN_SELECT;
		/*
		 * default for front trigger: scancode=VSCAN_FRONT_TRIGGER,
		 * keycode=KEYCODE_BUTTON_START
		 */
		public final static int VSCAN_FRONT_TRIGGER = VSCAN_BTN_START;
		/*
		 * default for auto scan: scancode=VSCAN_AUTOSCAN_TRIGGER,
		 * keycode=KEYCODE_BUTTON_A
		 */
		public final static int VSCAN_AUTOSCAN_TRIGGER = VSCAN_BTN_A;
		/*
		 * default for auto scan: scancode=VSCAN_MOTION_TRIGGER,
		 * keycode=KEYCODE_BUTTON_B
		 */
		public final static int VSCAN_MOTION_TRIGGER = VSCAN_BTN_B;

		public final static int VSCAN_RIGHT_ENTER = VSCAN_ENTER;
		public final static int VSCAN_LEFT_ENTER = VSCAN_KPENTER;
	}

	/**
	 * Returns the physical keyboard layout. It can be used by application for
	 * keyboard remapping.
	 * 
	 * @return the physical keys are returned in a table of scan codes. The
	 *         table is represented by an array of vectors, where each vector is
	 *         a row of physical scan code numbers. Note that all the rows of
	 *         the table have the same number of keys. Application can use
	 *         returned scan code number with the KeyboardManager remapping
	 *         methods, i.e. mapKeyCode, mapIntent, ...
	 * 
	 * <br>
	 * <br>
	 * <br>
	 *         How the table looks like for ELF-numeric keyboard:<br>
	 *         <table border=2>
	 *         <tr>
	 *         <td>vol_up</td>
	 *         <td>vol_down</td>
	 *         <td>scan_left</td>
	 *         <td>reserved</td>
	 *         <td>reserved</td>
	 *         <td>reserved</td>
	 *         </tr>
	 *         <tr>
	 *         <td>reserved</td>
	 *         <td>reserved</td>
	 *         <td>scan_right</td>
	 *         <td>reserved</td>
	 *         <td>reserved</td>
	 *         <td>reserved</td>
	 *         </tr>
	 *         <tr>
	 *         <td>reserved</td>
	 *         <td>back</td>
	 *         <td>scan_front</td>
	 *         <td>home</td>
	 *         <td>reserved</td>
	 *         </tr>
	 *         <tr>
	 *         <td>dial</td>
	 *         <td>left</td>
	 *         <td>up</td>
	 *         <td>down</td>
	 *         <td>right</td>
	 *         <td>hangup</td>
	 *         </tr>
	 *         <tr>
	 *         <td>menu</td>
	 *         <td>1</td>
	 *         <td>2</td>
	 *         <td>3</td>
	 *         <td>backspace</td>
	 *         <td>reserved</td>
	 *         </tr>
	 *         <tr>
	 *         <td>Fn</td>
	 *         <td>4</td>
	 *         <td>5</td>
	 *         <td>6</td>
	 *         <td>enter</td>
	 *         <td>reserved</td>
	 *         </tr>
	 *         <tr>
	 *         <td>Shift</td>
	 *         <td>7</td>
	 *         <td>8</td>
	 *         <td>9</td>
	 *         <td>reserved</td>
	 *         <td>reserved</td>
	 *         </tr>
	 *         <tr>
	 *         <td>yellow</td>
	 *         <td>.</td>
	 *         <td>0</td>
	 *         <td>space</td>
	 *         <td>power</td>
	 *         <td>reserved</td>
	 *         </tr>
	 *         </table>
	 */

	/**
	 * Returns the physical keyboard layout. It can be used by application for
	 * keyboard remapping.
	 * 
	 * @return Cubic grid of scan codes, representing the physical keyboard
	 *         present. If a row does not span the entire length, 0's or -1's
	 *         will fill those spots.
	 */
	public static int[][] getKeyboardLayout() {
	    return null;
	}

        /**
         * ID for Left trigger.
         */
        public static final int TRIGGER_ID_LEFT = 0;

        /**
         * ID for Right trigger.
         */
        public static final int TRIGGER_ID_RIGHT = 1;

        /**
         * ID for Pistol trigger.
         */
        public static final int TRIGGER_ID_PISTOL = 2;

        /**
         * ID for Front trigger.
         */
        public static final int TRIGGER_ID_FRONT = 3;

        /**
         * ID for AutoScan trigger.
         */
        public static final int TRIGGER_ID_AUTOSCAN = 4;

        /**
         * ID for Motion trigger.
         */
        public static final int TRIGGER_ID_MOTION = 5;

        /**
         * Returns the available triggers in the device.
         *
         * @return List of {@link Trigger} objects, each representing one of the supported triggers.
         * @throws DeviceException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
         */
        public List<Trigger> getAvailableTriggers() {
	    return null;
        }
}
