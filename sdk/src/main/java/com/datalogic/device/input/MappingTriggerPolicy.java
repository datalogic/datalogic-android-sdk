package com.datalogic.device.input;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * The key event trigger policy.
 */
public enum MappingTriggerPolicy implements Parcelable {
    /** Triggered whenever a key is pressed down */
    DOWN,

    /** Triggered whenever a key is releasing */
    UP,

    /**
     * Triggered when a long press is detected after pressing for a certain amount of time.
     * You may configure the timeout by {@link KeyboardManager#ARG_LONG_PRESS_TIMEOUT}
     */
    LONG_PRESS_TIMED_OUT,

    /**
     * Triggered when users release the key after a long press.
     * <br>
     * Note that you must use this policy together with {@link #LONG_PRESS_TIMED_OUT}.
     * If you want to map some actions to this event only, prepare a Map with {@link #LONG_PRESS_TIMED_OUT} mapped to null. For example:
     * <br>
     * Map{ LONG_PRESS_TIMED_OUT -> null, LONG_PRESS_UP -> [your customized action]}
     * <br>
     * Then use this map as the mappingInfo (second parameter) of {@link KeyboardManager#mapKey(VScanEntry, Map)}
     */
    LONG_PRESS_UP,

    /**
     * Triggered when a very long press is detected after pressing for a certain amount of time.
     * You may configure the timeout by {@link KeyboardManager#ARG_VERY_LONG_PRESS_TIMEOUT}
     */
    VERY_LONG_PRESS_TIMED_OUT,

    /**
     * Triggered when users release the key after a very long press.
     * <br>
     * Note that you must use this policy together with {@link #VERY_LONG_PRESS_TIMED_OUT}.
     * If you want to map some actions to this event only, prepare a Map with {@link #VERY_LONG_PRESS_TIMED_OUT} mapped to null. For example:
     * <br>
     * Map{ VERY_LONG_PRESS_TIMED_OUT -> null, VERY_LONG_PRESS_UP -> [your customized action]}
     * <br>
     * Then use this map as the mappingInfo (second parameter) of {@link KeyboardManager#mapKey(VScanEntry, Map)}
     */
    VERY_LONG_PRESS_UP,

    /**
     * Triggered when a single press is detected.
     */
    SINGLE_PRESS_UP,

    /**
     * Triggered when a multiple press is detected, such as a double click.
     * You may configure the arguments of the multiple press by using these arguments:
     *      {@link KeyboardManager#ARG_MULTIPLE_PRESS_COUNT} (2 for double click),
     *      {@link KeyboardManager#ARG_MULTIPLE_PRESS_MAX_INTERVAL},
     *      {@link KeyboardManager#ARG_MULTIPLE_PRESS_MAX_BREAK}
     */
    MULTIPLE_PRESS_UP;

    public static final Creator<MappingTriggerPolicy> CREATOR = new Creator<MappingTriggerPolicy>() {
        @Override
        public MappingTriggerPolicy createFromParcel(Parcel source) {
            return null;
        }

        @Override
        public MappingTriggerPolicy[] newArray(int size) {
            return null;
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) { }
}
