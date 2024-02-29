package com.datalogic.device.input;

import android.os.Parcel;

/**
 * A simple delay action. Usually used in {@link CompositionMapping} to create a complex action.
 */
public class DelayMapping extends MappingObject {
    private final long mTimeout;

    public static final Creator<DelayMapping> CREATOR = new Creator<DelayMapping>() {
        @Override
        public DelayMapping createFromParcel(Parcel in) {
            return null;
        }

        @Override
        public DelayMapping[] newArray(int size) {
            return null;
        }
    };

    @Override
    public void writeToParcel(Parcel out, int flags) {
    }

    /**
     * Construct a delay mapping object.
     *
     * @param timeout timeout in millisecond
     */
    public DelayMapping(long timeout) {
        super(MappingObject.TYPE_DELAY_MAPPING);
        mTimeout = timeout;
    }


    /**
     * Returns the timeout value.
     *
     * @return timeout value in millisecond
     */
    public long getTimeout() {
        return mTimeout;
    }
}
