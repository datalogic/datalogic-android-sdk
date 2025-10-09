package com.datalogic.decode;

import java.util.List;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

/**
 * <code>VisualFormatter</code> is a class used to install and manage the different
 * projects created from the Visual Formatter tool available inside Scan2Deploy Studio.<br/>
 * A project consists of a list of items of 2 types:<br/>
 * - <code>FORMATTER</code>: Takes as input the barcode received from the scanner and transforms
 * it as desired, returning the modified barcode as output;<br/>
 * - <code>DISPATCHER</code>: Takes as input the barcode received from the scanner and selects
 * the <code>FORMATTER</code> items to execute.<br/>
 * After a project is installed, one of its items will be set as the active item.
 * When a new barcode is read its contents will be passed to the active item in order to be
 * managed. The active item can also be changed in any moment.
 */
public class VisualFormatter {
    /**
     * @hide
     */
    private VisualFormatter() {

    }

    /**
     * Gets an instance of the VisualFormatter, if it is supported but the platform.
     *
     * @return A VisualFormatter object if supported, null otherwise.
     */
    public static VisualFormatter getInstance() {
        return null;
    }

    /**
     * Checks if the Visual Formatter is enabled.
     * 
     * @return true in case the Visual Formater is enabled, false otherwise or in case of failure.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public boolean isEnabled() {
        return false;
    }

    /**
     * Enables or disables the Visual Formatter. When enabled, the Visual Formatter will
     * execute the script associated with the current active item. If no item is active
     * it will not execute.
     *
     * @param enable
     *        True to enable the Visual Formatter, false to disable it.
     * @return
     *        {@link DecodeException#SUCCESS} in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a {@link DecodeException} in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int setEnable(boolean enable) {
        return 0;
    }

    /**
     * Gets the Visual Formatter script execution timeout.
     *
     * @return
     *        The timeout in milliseconds.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int getTimeout() {
        return 0;
    }

    /**
     * Sets the Visual Formatter script execution timeout. If during the execution of a script
     * the timeout is reached, an error is returned.
     *
     * @param timeout
     *        The timeout in milliseconds, with accepted values in range 10-1000.
     * @return
     *        {@link DecodeException#SUCCESS} in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a {@link DecodeException} in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int setTimeout(int timeout) {
        return 0;
    }

    /**
     * Gets the Visual Formatter feature level.
     *
     * @return
     *        The maximum supported feature level.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int getFeatureLevel() {
        return 0;
    }

    /**
     * Installs a new formatter project by specifying a zip file. It also sets the active item to one of the items found inside the zip file.
     * The zip to be installed must not be located within an application's internal storage.
     *
     * @param path
     *        The path to a zip file containing the formatter project. The file can contain multitple scripts corresponding to
     *        different formatting items.
     * @param persistenceType
     *        The type of persistence required for this formatter configuration. Can only be reboot or enterprise reset persistent.
     * @param overwriteExisting
     *        Used when some items with the same project ID of the new project are already installed in the device. It will clear all items found
     *        with the same project ID of the new one before installing it.
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int install(String path, PersistenceType persistenceType, boolean overwriteExisting) {
        return 0;
    }

    /**
     * Remove the items of the specified project.
     *
     * @param projectId
     *        The project id.
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int remove(String projectId) {
        return 0;
    }

    /**
     * Remove the items of the specified persistence type.
     *
     * @param persistenceType
     *        The persistence type of the items to remove.
     * @return
     *        DecodeException.SUCCESS in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a DecodeException in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int remove(PersistenceType persistenceType) {
        return 0;
    }

    /**
     * Removes all items that are reboot or enterprise reset persistent.
     *
     * @return
     *        {@link DecodeException#SUCCESS} in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a {@link DecodeException} in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int resetToDefault() {
        return 0;
    }

    /**
     * Gets the currently active item if any, or null otherwise.
     *
     * @return
     *        The currently active item if found, or null otherwise.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public Item getActiveItem() {
        return null;
    }

    /**
     * Sets the item to make active.
     *
     * @param activeItem
     *        The item to make active.
     * @return
     *        {@link DecodeException#SUCCESS} in case it succeeds, otherwise it returns an error code if the
     *        exceptions are disabled or throws a {@link DecodeException} in case the exceptions are enabled.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int setActiveItem(Item activeItem) {
        return 0;
    }

    /**
     * Lists all available formatting items.
     *
     * @return
     *        The available items, the list is empty if no items are available.
     * @throws DecodeException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public List<Item> getItems() {
        return null;
    }

    /**
     * <code>VisualFormatter.PersistenceType</code> is an enumeration representing the
     * persistence type of the installed visual formatter configuration.
     */
    public enum PersistenceType {
        /**
         * The visual formatter configuration is persistent to device reboots. Any type
         * of data reset (enterprise or factory) will remove this configuration.
         */
        REBOOT_PERSISTENT,
        /**
         * The visual formatter configuration is persistent to enterprise reset. Only a
         * factory reset can remove this configuration.
         */
        ENTERPRISE_RESET_PERSISTENT,
        /**
         * The visual formatter configuration is persistent to factory reset.
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
    }

    /**
     * <code>VisualFormatter.Item</code> is a class representing a visual formatting item,
     * used to manipulate the input barcode data when set as active item.
     */
    public static class Item {
        /**
         * <code>VisualFormatter.Item.Type</code> is an enumeration representing the type of item.
         */
        public enum Type {
            /**
             * Formatter type, used to modify the input barcode data such as the
             * barcode string or type.
             */
            FORMATTER,
            /**
             * Dispatcher type, used to validate the input barcode data and decide which
             * formatter type to execute between the ones installed in the same formatter
             * configuration, with the addition of the standard formatter that is always
             * executable.
             */
            DISPATCHER;

            /**
             * Converts the item type to its integer corresponding value.
             *
             * @return
             *         Integer value of this item type.
             */
            public int toInt() {
                return 0;
            }

            /**
             * Retrieves the corresponding item type value from a valid integer.
             *
             * @param value
             *        Integer to use as input in the conversion.
             * @return
             *         The corresponding item type.
             */
            public static Type fromInt(int value) {
                return null;
            }
        }

        /**
         * <code>VisualFormatter.Item.Property</code> is a class representing a property of
         * a visual formatting item, used to add custom parameters that can change the runtime
         * behavior of the formatting item. A property can be of different types and directions.
         */
        public static class Property<T> {
            /**
             * <code>VisualFormatter.Item.Property.Type</code> is an enumeration representing
             * the type of property.
             */
            public enum Type {
                /**
                 * String.
                 */
                STRING,
                /**
                 * Number, corresponding to the Double type for the property value.
                 */
                NUMBER,
                /**
                 * Boolean.
                 */
                BOOLEAN;

                /**
                 * Converts the property type to its integer corresponding value.
                 *
                 * @return
                 *         Integer value of this property type.
                 */
                public int toInt() {
                    return 0;
                }

                /**
                 * Retrieves the corresponding property type value from a valid integer.
                 *
                 * @param value
                 *        Integer to use as input in the conversion.
                 * @return
                 *         The corresponding property type.
                 */
                public static Type fromInt(int value) {
                    return null;
                }
            }

            /**
             * <code>VisualFormatter.Item.Property.Direction</code> is an enumeration representing
             * the direction of the property.
             */
            public enum Direction {
                /**
                 * Input.
                 */
                INPUT,
                /**
                 * Output.
                 */
                OUTPUT,
                /**
                 * Input and Output.
                 */
                INPUT_OUTPUT;

                /**
                 * Converts the property direction to its integer corresponding value.
                 *
                 * @return
                 *         Integer value of this property direction.
                 */
                public int toInt() {
                    return 0;
                }

                /**
                 * Retrieves the corresponding property direction value from a valid integer.
                 *
                 * @param value
                 *        Integer to use as input in the conversion.
                 * @return
                 *         The corresponding property direction.
                 */
                public static Direction fromInt(int value) {
                    return null;
                }
            }

            /**
             * @hide
             */
            public Property(String id, String name, String description, Type type,
                    Direction direction, T defaultValue, T value) {
                
            }

            /**
             * Returns the property id that uniquely identifies this property.
             *
             * @return
             *        The property id.
             */
            public String getId() {
                return null;
            }

            /**
             * Returns the property name.
             *
             * @return
             *        The property name.
             */
            public String getName() {
                return null;
            }

            /**
             * Returns the property description.
             *
             * @return
             *        The property description.
             */
            public String getDescription() {
                return null;
            }

            /**
             * Returns the property type.
             *
             * @return
             *        The property type.
             */
            public Type getType() {
                return null;
            }

            /**
             * Returns the property direction.
             *
             * @return
             *        The property direction.
             */
            public Direction getDirection() {
                return null;
            }

            /**
             * Returns the property default value.
             *
             * @return
             *        The property default value.
             */
            public T getDefaultValue() {
                return null;
            }

            /**
             * Returns the property current value.
             *
             * @return
             *        The property current value.
             */
            public T getValue() {
                return null;
            }

            /**
             * @hide
             */
            public boolean isHiddenFromUI() {
                return false;
            }

            /**
             * Sets the property current value.
             *
             * @param value
             *        The value to set.
             */
            public void setValue(T value) {
                
            }
        }

        /**
         * @hide
         */
        public Item(int version, String name, String id, String fileName,
                Type type, String description, String author, String revision, String date,
                PersistenceType persistenceType, String projectId, String projectName,
                List<Property> properties) {
            
        }

        /**
         * @hide
         */
        public int getVersion() {
            return 0;
        }

        /**
         * Returns the item name.
         *
         * @return
         *        The item name.
         */
        public String getName() {
            return null;
        }

        /**
         * @hide
         */
        public String getId() {
            return null;
        }

        /**
         * @hide
         */
        public String getFileName() {
            return null;
        }

        /**
         * Returns the item type.
         *
         * @return
         *        The item type.
         */
        public Type getType() {
            return null;
        }

        /**
         * Returns the item description.
         *
         * @return
         *        The item description.
         */
        public String getDescription() {
            return null;
        }

        /**
         * Returns the item author.
         *
         * @return
         *        The item author.
         */
        public String getAuthor() {
            return null;
        }

        /**
         * Returns the item revision.
         *
         * @return
         *        The item revision.
         */
        public String getRevision() {
            return null;
        }

        /**
         * Returns the item creation date.
         *
         * @return
         *        The item creation date.
         */
        public String getDate() {
            return null;
        }

        /**
         * Returns the item persistence type.
         *
         * @return
         *        The item persistence type.
         */
        public PersistenceType getPersistenceType() {
            return null;
        }

        /**
         * Returns the id of the project the item belongs to.
         *
         * @return
         *        The project id.
         */
        public String getProjectId() {
            return null;
        }

        /**
         * Returns the name of the project the item belongs to.
         *
         * @return
         *        The project name.
         */
        public String getProjectName() {
            return null;
        }

        /**
         * Returns the item properties.
         *
         * @return
         *        The item properties.
         */
        public List<Property> getProperties() {
            return null;
        }
    }
}
