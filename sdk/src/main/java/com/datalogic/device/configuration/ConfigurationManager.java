package com.datalogic.device.configuration;
import java.util.ArrayList;
import java.io.File;
import android.content.Context;
import com.datalogic.device.ErrorManager;
import com.datalogic.decode.*;
import com.datalogic.device.configuration.*;
/**
 * <code>ConfigurationManager</code> gives the developer the ability to browse and set the configuration properties of the device. The device, as a managed device, exposes properties organized in a tree. Each property has a unique identifier used to uniquely identify the property.
 * ConfigurationManager is the sdk access point to the whole of properties that describes and allows the configuration of the device.<br>
 * Using ConfigurationManager the user can read and modify the value of any property.<br>
 * The properties are organized in a tree where the leaves are the properties and the intermediate nodes are the groups. A group is a functional collection of property.
 * A group cannot be modified, only the contained properties can be modified.<br>
 * A property is uniquely identified by an integer identifier {@link PropertyID}.<br>
 * A group is uniquely identified by an integer identifier {@link PropertyGroupID}..<br>
 * <p>
 * The ConfigurationManager offers methods:
 * </p>
 * <ol>
 * <li>to directly access a property,</li>
 * <li>to navigate the tree of properties,</li>
 * </ol>
 * </p>
 * <p>
 * A {@link Property} offers methods to get/set the value.<br>
 * When the value of a property is modified it is not directly applied to the device.
 * The change is only kept in the sdk local image of the configuration that’s the  tree of properties.
 * To actually apply the change to the device the ConfigurationManager commit() method must be called.
 * </p>
 * <p>
 * A group {@link PropertyGroup} offers methods:
 * </p>
 * <ol>
 * <li>to directly access a property of its subtree,
 * <li>to navigate its subtree of properties and groups.
 * </ol>
 */
public class ConfigurationManager {



   /**
     * This is the constructor of ConfigurationManager.
     * @param context
     *            <code>Context</code> context of the caller application
     * @throws ConfigException in case of error.
     */
    public ConfigurationManager(Context context) {
 
    }

    /**
     * Register the {@link ConfigurationChangeListener}.
     *
     * @param listener
     *            <code>ConfigurationChangeListener</code> listener used to be notified of a change of the configuration
     *
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     */
    public int registerListener(ConfigurationChangeListener listener) {
        return 0;
    }

    /**
     * Unegister the {@link ConfigurationChangeListener}.
     *
     * @param listener
     *            <code>ConfigurationChangeListener</code> listener to be notified of a change of the configuration
     *
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     */
    public int unregisterListener(ConfigurationChangeListener listener) {
        return 0;
    }

    /**
     * Returns the {@link PropertyGroup} root of the tree of {@link Property}s of the configuration.
     *
     * @return {@link PropertyGroup} representing the root of the configuration tree.
     */
    public PropertyGroup getTreeRoot() {
        return null;
    }

    /**
     * Returns the {@link Property} whose identifier has the given integer value {@link PropertyID}.
     * If a property with the given id is not found NULL is returned.
     * If the returned property is not supported, get and set on the property will fail.
     *
     * @param id
     *            <code>int</code> unique identifier of the requested property
     * @return {@link Property}.
     */
    public Property getPropertyById(int id) {
        return null;
    }

    /**
     * Gets the{@link Property} whose identifier has the integer value defined by the given constant {@link PropertyID}.
     * If a property with the given name is not found NULL is returned.
     * If the returned property is not supported, get and set on the property will fail.
     *
     * @param name
     *            <code>String</code> defining string of the unique identifier of the requested property
     * @return {@link Property}.
     */
    public Property getPropertyByName(String name) {
        return null;
    }

   /**
     * Gets the {@link PropertyGroup} whose identifier has the given integer value {@link PropertyGroupID}.
     * If a propertyGroup with the given id is not found NULL is returned.
     *
     * @param id
     *            <code>int</code> integer value of the identifier of the requested group
     * @return {@link PropertyGroup}.
     */
    public PropertyGroup getPropertyGroupById(int id) {
        return null;
    }

    /**
      * Gets the {@link PropertyGroup} whose identifier has the integer value defined by the given string {@link PropertyGroupID}.
      * If a propertyGroup with the given name is not found NULL is returned.
      *
      * @param name
      *            <code>String</code> name of the requested group
      * @return {@link PropertyGroup}.
      */
     public PropertyGroup getPropertyGroupByName(String name) {
         return null;
     }

    /**
     * Applies all the modified values since the last {@link ConfigurationManager#commit} to the device
     * and also commits them to the persistent storage.
     * All the properties committed in this way will maintain the set value between reboots.
     * It works in best effort. If the application of some properties failed, the list of their identifiers
     * is returned through the exception {@link ConfigException#bad_id_buffer}.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int commit() {
        return 0;
    }
}
