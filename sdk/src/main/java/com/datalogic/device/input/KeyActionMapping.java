package com.datalogic.device.input;

import android.os.Parcel;
import android.view.KeyEvent;

/**
 * Represents a key action.
 */
public class KeyActionMapping extends MappingObject {
    private final KeyCodeEntry mKey;
    private final int mAction;

    /** Action of key pressing */
    public static final int ACTION_PRESS_DOWN = KeyEvent.ACTION_DOWN;

    /** Action of key releasing */
    public static final int ACTION_RELEASE = KeyEvent.ACTION_UP;


    /**
     * Constructs a key action with a {@link KeyCodeEntry}.
     *
     * @param key a {@link KeyCodeEntry} object
     * @param action either {@link KeyActionMapping#ACTION_PRESS_DOWN} or {@link KeyActionMapping#ACTION_RELEASE}
     */
    public KeyActionMapping(KeyCodeEntry key, int action) {
        super(MappingObject.TYPE_KEY_ACTION_MAPPING);
        mKey = key;
        mAction = action;
    }

    /**
     * Constructs a key action with key code and meta state.
     *
     * @param keyCode <code>int</code> Android standard keycode
     * @param metaState <code>int</code> flags of meta key states
     * @param action either {@link KeyActionMapping#ACTION_PRESS_DOWN} or {@link KeyActionMapping#ACTION_RELEASE}
     */
    public KeyActionMapping(int keyCode, int metaState, int action) {
        this(new KeyCodeEntry(keyCode, metaState), action);
    }

    public static final Creator<KeyActionMapping> CREATOR = new Creator<KeyActionMapping>() {
        @Override
        public KeyActionMapping createFromParcel(Parcel in) {
            return null;
        }

        @Override
        public KeyActionMapping[] newArray(int size) {
            return null;
        }
    };

    @Override
    public void writeToParcel(Parcel out, int flags) { }

    /**
     * Gets the {@link KeyCodeEntry} object stored in this class.
     *
     * @return the {@link KeyCodeEntry} object
     */
    public KeyCodeEntry getKeyCode() {
        return mKey;
    }

    /**
     * Gets the key action of this class.
     *
     * @return either {@link KeyActionMapping#ACTION_PRESS_DOWN} or {@link KeyActionMapping#ACTION_RELEASE}
     */
    public int getAction() {
        return mAction;
    }
}
