package com.datalogic.device.input;

import android.content.Intent;
import android.os.Parcel;

/**
 * A {@link MappingObject} contains an {@link Intent}.
 */
public class IntentMapping extends MappingObject {
    private final Intent mIntent;

    public static final Creator<IntentMapping> CREATOR = new Creator<IntentMapping>() {
        @Override
        public IntentMapping createFromParcel(Parcel in) {
            return null;
        }

        @Override
        public IntentMapping[] newArray(int size) {
            return null;
        }
    };

    @Override
    public void writeToParcel(Parcel out, int flags) {
    }

    /**
     * Creates with an {@link Intent} object
     *
     * @param intent Android intent object
     */
    public IntentMapping(Intent intent) {
        super(MappingObject.TYPE_INTENT_MAPPING);
        mIntent = intent;
    }

    /**
     * Returns the stored {@link Intent} object stored in this class.
     *
     * @return the stored Android intent object
     */
    public Intent getIntent() {
        return mIntent;
    }
}
