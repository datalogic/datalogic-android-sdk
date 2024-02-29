package com.datalogic.device.input;

import android.os.Parcel;

/**
 * A {@link MappingObject} contains a Unicode string. This is used to input something when certain
 * key events occur. If you want to simply input an Unicode character, use this class with a one-element string.
 */
public class StringMapping extends MappingObject {
    private final String mString;

    public static final Creator<StringMapping> CREATOR = new Creator<StringMapping>() {
        @Override
        public StringMapping createFromParcel(Parcel in) {
            return null;
        }

        @Override
        public StringMapping[] newArray(int size) {
            return null;
        }
    };

    /**
     * Constructs with a string.
     *
     * @param str <code>String</code> the given string
     */
    public StringMapping(String str) {
        super(MappingObject.TYPE_STRING_MAPPING);
        mString = str;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
    }

    /**
     * Get the String value from the Object
     * @return <code> String </code>
     */
    public String getString() {
        return mString;
    }
}
