package com.datalogic.decode;

/**
 * Interface representing an input device. The implementation will define the
 * type of input device.
 */
public interface InputDevice {
    /**
     * Enumeration representing the type of input device.
     */
    public enum Type {
        /**
         * Type for a Scan Engine input device.
         */
        SCANENGINE,
        /**
         * Type for a Camera input device.
         */
        CAMERA;

        /**
         * Converts the type to its integer corresponding value.
         *
         * @return
         *         Integer value of this type.
         */
        public int toInt() {
            return 0;
        }

        /**
         * Retrieves the corresponding Type value from a valid integer.
         *
         * @param value
         *        Integer to use as input in the conversion.
         * @return
         *         The corresponding type.
         */
        public static Type fromInt(int value) {
            return null;
        }
    }

    /**
     * Returns the type of input device between the ones defined by the
     * {@link Type} enumeration.
     *
     * @return
     *         The type of input device.
     */
    public Type getType();

    /**
     * Returns the name of the input device.
     *
     * @return
     *         The name of the input device.
     */
    public String getName();
}
