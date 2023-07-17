package com.datalogic.device.configuration;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.datalogic.device.ErrorManager;
import com.datalogic.decode.configuration.Code39;
import com.datalogic.device.configuration.*;
import com.datalogic.decode.BarcodeManager;

/**
 * <code>PropertyGroup</code> contains properties and/or other property groups.
 */
public class PropertyGroup {

	/**
	 * This is an empty constructor, in the implementation MUST be implemented.
	 * @hide
	 */
	public PropertyGroup(){}

   /**
	 * Returns the properties contained in this group, not in the whole subtree.
	 *
	 * @return ArrayList of properties contained in the group. <br>
	 *         Empty if there are no properties in this group, not in the whole subtree.
	 */
	public ArrayList<Property> getProperties() {
		return null;
	}

   /**
     *  Returns the property groups contained in this group, not in the whole subtree.
     *
     * @return ArrayList of property groups contained in the group. <br>
     *         Empty if there are no other property groups in this group, not in the whole subtree.
     */
	public ArrayList<PropertyGroup> getGroups() {
		return null;
	}

   /**
     * Gets the {@link Property}, belonging to this group's subtree, whose identifier has the given integer value in {@link PropertyID}.
     * If a property with the given id is not found NULL is returned.
     * If the returned property is not supported, get and set on the property will fail.
	 * The method is meaningful only for propertyGroups of the ConfigurationManager tree not for the classes, derived from PropertyGroup, handled by BarcodeManager like for example {@link Code39}.
     * @param id
     *            <code>int</code> unique identifier of the requested property.
     * @return {@link Property}.
     */
    public Property getPropertyById(int id) {
        return null;
    }

   /**
     * Gets the {@link Property}, belonging to this group's subtree, whose identifier has the integer value defined by the given string in {@link PropertyID}.
     * If a property with the given name is not found NULL is returned.
     * If the returned property is not supported, get and set on the property will fail.
	 * The method is meaningful only for propertyGroups of the ConfigurationManager tree not for the classes, derived from PropertyGroup, handled by BarcodeManager like for example {@link Code39}.
     * @param name
     *            <code>String</code> defining string of the unique identifier of the requested property.
     * @return {@link Property}.
     */
    public Property getPropertyByName(String name) {
        return null;
    }

   /**
     * Gets the {@link PropertyGroup}, belonging to this group's subtree, whose identifier has the given integer value in {@link PropertyGroupID}.
	 * The method is meaningful only for propertyGroups of the ConfigurationManager tree not for the classes, derived from PropertyGroup, handled by BarcodeManager like for example {@link Code39}.
     *
     * @param id
     *            <code>int</code> unique identifier of the requested group.
     * @return {@link PropertyGroup}.
     */
    public PropertyGroup getPropertyGroupById(int id) {
        return null;
    }

    /**
      * Gets the {@link PropertyGroup}, belonging to this group's subtree, whose identifier has the integer value defined by the given string in {@link PropertyGroupID}.
	  * The method is meaningful only for propertyGroups of the ConfigurationManager tree not for the classes, derived from PropertyGroup, handled by BarcodeManager like for example {@link Code39}.
      *
      * @param name
      *            <code>String</code> name of the requested group.
      * @return {@link PropertyGroup}.
      */
     public PropertyGroup getPropertyGroupByName(String name) {
         return null;
     }

   /**
     * Gets the name of the unique identifier{@link PropertyGroupID} of the group.
	 * The method is meaningful only for propertyGroups of the ConfigurationManager tree not for the classes, derived from PropertyGroup, handled by BarcodeManager like for example {@link Code39}.
     *
     * @return String.
     */
    public String getName() {
        return null;
    }

    /**
      *  Gets the integer value of the unique identifier {@link PropertyGroupID} of the group.
	  *  The method is meaningful only for propertyGroups of the ConfigurationManager tree not for the classes, derived from PropertyGroup, handled by BarcodeManager like for example {@link Code39}.
      *
      * @return int.
      */
     public int getId() {
         return 0;
     }

     /**
       * Resets to the default value all the properties contained in the subtree.
       * To make the change persistent the {@link ConfigurationManager#commit} must be called.
	   * The method is meaningful only for propertyGroups of the ConfigurationManager tree not for the classes, derived from PropertyGroup, handled by BarcodeManager like for example {@link Code39}.
	   */
      public void setToDefault() {
      }

	/**
	 * Load the properties values contained by this group from the
	 * PropertyGetter.
	 *
	 * @param from The {@link PropertyGetter} called to synchronize the current values.
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int load(PropertyGetter from) {
		return 0;
	}

	/**
	 * Store the properties values contained by this property into the
	 * PropertyEditor persistently or not, depending from the <code>persist</code> parameter.
	 *
	 * @param to The {@link PropertyEditor} in charge of applying the desired values.
	 * @param persist <code>boolean</code> if true the configuration is saved in a persistent way across
	 *            system reboots with an implicit call to {@link PropertyEditor#commitProperties()}; it could happens to persists properties not related to the property group and previously changed 
	 *            not persistently. See the <code>BarcodeManager</code> {@link BarcodeManager persistance note};
	 *
	 * @return <code>int</code> {@link ConfigException#SUCCESS} in case of success,
	 * otherwise a possible error code, matching one of the {@link ConfigException} error constants.
	 * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
	 */
	public int store(PropertyEditor to, boolean persist) {
		return 0;
	}

	/**
	 * Tells if this property group is supported by the underling decoding
	 * hardware.
	 *
	 * @return true if at least one contained property is supported by the
	 *         underling decoding hardware. <br>
	 *         If this property group doesn't contain any property, this method
	 *         returns false.
	 */
	public boolean isSupported() {
		return false;
	}

	/**
     * Tells if this property group is completely supported by the underling decoding
     * hardware.
     *
     * @return true if all contained property are supported by the
     *         underling decoding hardware. <br>
     *         If this property group doesn't contain any property, this method
     *         returns false.
	 */
	public boolean isFullySupported() {
        return true;
	}
}
