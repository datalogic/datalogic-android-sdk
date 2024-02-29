package com.datalogic.device.input;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Map;

/**
 * This class is a generic representation of actions to be executed when certain key events occur.
 * This class is used in the key remapping feature. See {@link KeyboardManager#mapKey(VScanEntry, Map, Map)}
 */
public abstract class MappingObject implements Parcelable {
    private final int mType;

    public static final int TYPE_DELAY_MAPPING = 2;
    public static final int TYPE_KEY_ACTION_MAPPING = 3;
    public static final int TYPE_STRING_MAPPING = 4;
    public static final int TYPE_INTENT_MAPPING = 5;
    public static final int TYPE_COMPOSITION_MAPPING = 6;

    public MappingObject(int type) {
        mType = type;
    }

    public static final Creator<MappingObject> CREATOR = new Creator<MappingObject>() {
        @Override
        public MappingObject createFromParcel(Parcel source) {
            return null;
        }

        @Override
        public MappingObject[] newArray(int size) {
            return null;
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    /**
     * Returns the type of this mapping object
     *
     * @return the type of this mapping object
     */
    public int getType() {
        return mType;
    }
}