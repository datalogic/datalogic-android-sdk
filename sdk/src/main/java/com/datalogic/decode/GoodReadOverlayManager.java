package com.datalogic.decode;

import com.datalogic.device.ErrorManager;

import java.util.List;

/**
 * <code>GoodReadOverlayManager</code> is a class used to install and manage the Good Read's custom overlays.<br/>
 * When a new barcode is read and the property <code>GOOD_READ_OVERLAY_ENABLE</code> is enabled an overlay
 * is show.<br/>
 * This class manage the custom overlays used when <code>GOOD_READ_OVERLAY_SHAPE_POLICY</code> set to
 * <code>CUSTOM</code>. To select the overlay name (the filename excluding the extension)
 * must be set in the propriety <code>GOOD_READ_OVERLAY_CUSTOM_SHAPE_NAME_PROFILE</code>.
 */
public class GoodReadOverlayManager {

    /**
     * @hide
     */
    private GoodReadOverlayManager() {

    }

    /**
     * Gets an instance of the GoodReadOverlayImageInstaller, if it is supported by the platform.
     *
     * @return A GoodReadOverlayImageInstaller object if supported, null otherwise.
     */
    public static GoodReadOverlayManager getInstance() {
        return null;
    }

    /**
     * Adds a new good read overlay image by specifying a png file.
     * If the image share the same filename of another image already installed the second image will be overwritten.
     *
     * @param path
     *        The full path to a png file of the image.
     * @param persistenceType
     *        The type of persistence required for this overlay. Can only be reboot or enterprise reset persistent.
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int add(String path, PersistenceType persistenceType) {
        return 0;
    }

    /**
     * Remove the custom overlay of the specified name.
     *
     * @param name
     *        The Good Read Overlay's name. The name consists of the filename of the image installed (excluding the extension).
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int remove(String name) {
        return 0;
    }

    /**
     * Returns a list of the available custom overlays. The names consist of the filename of the images installed (excluding the extensions).
     *
     * @return
     *        The available custom overlay names, the list is empty if no custom overlay is available.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public List<String> getCustomOverlayNames() {
        return null;
    }

    /**
     * Enumerative representing the persistence type of the installed overlays.
     */
    public enum PersistenceType {
        /**
         * The overlay is persistent to device reboots. Any type
         * of data reset (enterprise or factory) will remove this configuration.
         */
        REBOOT_PERSISTENT,
        /**
         * The overlay is persistent to enterprise reset. Only a
         * factory reset can remove this configuration.
         */
        ENTERPRISE_RESET_PERSISTENT,
        /**
         * The overlay is persistent to factory reset.
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

        @Override
        public String toString() {
            return null;
        }
    }

}
