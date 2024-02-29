package com.datalogic.device.input;

import android.os.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * A {@link CompositionMapping} is a complex {@link MappingObject} that represents a sequence of actions
 * to be executed when certain key events occur. To create a {@link CompositionMapping} instance,
 * please use {@link CompositionMapping.Builder}.
 */
public class CompositionMapping extends MappingObject {
    private final List<MappingObject> mMappingObjects;

    public static final Creator<CompositionMapping> CREATOR = new Creator<CompositionMapping>() {
        @Override
        public CompositionMapping createFromParcel(Parcel in) {
            return null;
        }

        @Override
        public CompositionMapping[] newArray(int size) {
            return null;
        }
    };

    @Override
    public void writeToParcel(Parcel out, int flags) {
    }

    private CompositionMapping(List<MappingObject> mappingObjects) {
        super(MappingObject.TYPE_COMPOSITION_MAPPING);
        mMappingObjects = mappingObjects;
    }

    /**
     * Get the unmodifiable list of {@link MappingObject} stored in this class.
     *
     * @return An unmodifiable list of {@link MappingObject}
     */
    public List<MappingObject> getMappingObjects() {
        return null;
    }

    @Override
    public int describeContents() {
        return super.describeContents();
    }

    /** Builder class of {@link CompositionMapping} */
    public static class Builder {
        private final List<MappingObject> mMappingObjects;

        public Builder() {
            mMappingObjects = new ArrayList<>();
        }

        /**
         * Adds a generic event representing by an {@link MappingObject}.
         *
         * @param action see {@link MappingObject}
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder addEvent(MappingObject action) {
            mMappingObjects.add(action);
            return this;
        }

        /**
         * Adds an action that will press and release a key.
         *
         * @param key a {@link KeyCodeEntry} object containing a keycode and its meta states
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder addKey(KeyCodeEntry key) {
            return this;
        }

        /**
         * Adds a key action. You can specify press or release action.
         *
         * @param key key a {@link KeyCodeEntry} object containing a keycode and its meta states
         * @param action either {@link KeyActionMapping#ACTION_PRESS_DOWN} or {@link KeyActionMapping#ACTION_RELEASE}
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder addKeyAction(KeyCodeEntry key, int action) {
            return this;
        }

        /**
         * Adds a delay to the sequence
         *
         * @param delay delay time in millisecond
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder addDelay(long delay) {
            return this;
        }

        /**
         * Enables Shift meta key.
         *
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder enableShift() {
            return this;
        }

        /**
         * Disables Shift meta key.
         *
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder disableShift() {
            return this;
        }

        /**
         * Enables Ctrl meta key.
         *
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder enableCtrl() {
            return this;
        }

        /**
         * Disables Ctrl meta key.
         *
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder disableCtrl() {
            return this;
        }

        /**
         * Enables Alt meta key.
         *
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder enableAlt() {
            return this;
        }

        /**
         * Disables Alt meta key.
         *
         * @return the current {@link CompositionMapping.Builder} instance
         */
        public Builder disableAlt() {
            return this;
        }

        /**
         * Builds the configured {@link CompositionMapping} object
         *
         * @return the configured {@link CompositionMapping} object
         */
        public CompositionMapping build() {
            return null;
        }
    }
}
