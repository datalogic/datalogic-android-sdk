package com.datalogic.device.configuration;

import android.content.Context;
import android.os.RemoteException;

import com.datalogic.device.PersistenceType;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.datalogic.device.ErrorManager;


/**
 * <code>ProfileManager</code> gives the developer the ability to create a profile and to load it explicitly or to associate it to a loading condition to be automatically loaded. <br>
 * A profile is a set of properties ({@link Property}) with their value.<br>
 * The utility of a profile is that we can collect in it the setting of the properties we need for a
 * specific purpose and then we can load it explicitly calling {@link #loadProfile} or automatically when the loading condition is verified.
 * The loading condition is defined by a profile rule. There are two types of profile rules:
 * <ul>
 *  <li> {@link ProfileRuleType}: the profile is loaded when an activity comes to
 *  foreground. 
 *  The rule associates the profile to be loaded with an activity, or a list of activities, that must be in foreground. 
 *  This type of rule is created using the method {@link #addProfileRule}.
 * 
 *  <li> {@link ProfileUrlRuleType}: the profile is loaded when a specified URL is loaded by a given activity.
 *  The rule associates the profile to be loaded with an activity, or a list of activities, and a regular expression (regex) that defines a valid URL.
 *  This type of rule is created using the method {@link #addProfileUrlRule}.
 * </ul>
 
 * A profile is identified by a symbolic name that must be unique on the device.
 * When a profile is created it is assigned a {@link PersistenceType} that can be:
 * </p>
 * <ul>
 * <li> Factory Reset Persistent, the file containing the profile will survive to a factory reset.
 * <li> Enterprise Reset Persistent, the file containing the profile will survive to an enterprise reset.
 * <li> Reboot Persistent, the file containing the profile will survive to a reboot.
 * </ul>
 * </p>
 * A Factory Reset Persistent profile can only be preinstalled on the device by an Espresso OTA and cannot be deleted.
 * <br>
 * The creation of a profile is done in best effort with reference to the specified set of couples of property and value,
 * that is when a profile is created all the properties that are read-only or which are set to values outside the range of their allowed
 * values or which require a device reboot to be applied are ignored.
 * <br>
 * A profile is saved on the device in a json file with the following schema:
 * <br>
 * <pre>
 * {
 *  "$schema": "http://json-schema.org/draft-07/schema#",
 *  "title": "Profile Description Schema",
 *  "description": "Schema of a profile.",
 *  "type": "object",
 *  "version": "2.0.0",
 *
 *  "definitions": {
 *      "properties": {
 *          "type": "array",
 *          "items": { "$ref": "#/definitions/property" }
 *      },
 *
 *      "property": {
 *          "type": "object",
 *          "properties": {
 *              "id": {
 *                  "type": ["integer", "string"],
 *                  "description": "Unique integer identifier of the property. 
 *                                  The defining string can be used instead of the numeric value."
 *              },
 *              "value": {
 *                  "type": "string",
 *                  "description": "Value of the property. It is a string and 
 *                                  it will be parsed according to the specific type of the property. 
 *                                  Value for a CharacterProperty is the unicode format (i.e: \\uFFFF)."
 *              }
 *          },
 *          "required": ["id", "value"]
 *      },
 *  },
 *
 *  "properties": {
 *      "version": {
 *          "type": "string",
 *          "description": "Version of the schema. If you use this the value must be 2.0.0."
 *      }        ,
 *      "description": {
 *          "type": "string",
 *          "description": "Short string describing the profile."
 *      },
 *      "properties": {
 *          "$ref": "#/definitions/properties",
 *          "description": "List of properties with their value."
 *      }
 *  }
 * }
 * </pre>
 * <br>
 * As said a profile can be load in two different ways:
 * </p>
 * <ol>
 * <li> manually, calling method {@link #loadProfile};
 * <li> automatically, calling {@link #addProfileRule} or {@link #addProfileUrlRule} to define a rule that associates the profile to an activation condition.
 * As soon as the condition is verified, the related profile is automatically loaded. 
 * The previous configuration is restored when that condition is no more satisfied.
 * </ol>
 * </p>
 * There can be only one profile automatically loaded at the time.
 * The method {@link #loadProfile} fails if there is already a profile manually loaded.
 * <br>
 * It is allowed to have at the same moment a manually loaded profile and an automatically loaded profile.
 * When there is both a manually loaded profile and an automatically loaded profile the value of the properties belonging to both profiles
 * are set to the value specified in the automatically loaded profile. This is true no matter the order of load of the two profiles was.
 * </p>
 * The persistence type of a profile controls:
 * </p>
 * <ol>
 * <li> the persistence to reboot or reset of the profile file saved on the device, but not the persistence of the applied profile configuration;
 * <li> the persistence to reboot or reset of the rules that associate the profile to activation conditions, if any. 
 *  A rule that associates a profile with persistence `REBOOT_PERSISTENT` to an activation condition will survive to a reboot but it will be deleted 
 *  by an enterprise or factory reset. 
 *  A rule that associates a profile with persistence `ENTERPRISE_RESET_PERSISTENT` to an activation condition will survice to a reboot
 *  or enterprise reset but it will be deleted by a factory reset.
 </ol>
 * The configuration applied by an automatically loaded profile is automatically unloaded when the associated activation condition is no more satisfied 
 * or the device restarts.
 * <br>
 * The configuration applied by a manually loaded profile is persistent to a reboot and must be explicitly unloaded.
 * <br><br>
 * 
 * <b>To create a profile follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager};
 * <li>Create an HashMap and add it the couples {{@link PropertyID}, value} to be set when applying the profile;
 * <li>Create the profile calling {@link #createProfile(String,HashMap,String,PersistenceType)}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * HashMap<Integer,String> map = new HashMap<Integer,String>();
 * map.put(PropertyID.CODE128_ENABLE, "true");  // BooleanProperty
 * map.put(PropertyID.CODE128_LENGTH2, "10"); // NumericProperty
 * map.put(PropertyID.CODE128_GS1_USER_ID, String.format ("\\u%04x", (int)'a')); // CharacterProperty
 * map.put(PropertyID.CODE128_LENGTH_CONTROL, LengthControlMode.ONE_FIXED.toString()); // EnumProperty
 * map.put(PropertyID.LABEL_PREFIX, "pippo"); // TextProperty
 * pm.createProfile("profilo_128.json", 
 *                  map, 
 *                  "enable code128, disable datamatrix", 
 *                  PersistenceType.ENTERPRISE_RESET_PERSISTENT);
 * </pre>
 * 
 * <b>To add a rule that automatically loads the profile <i>profilo_128.json</i> 
 * when the application with package name <i>com.datalogic.testprofilo1</i> 
 * comes to the foreground, follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Create a StringBuffer and initialize it with the preferred identifier to be used to register the rule.
 * <li>Create the rule calling {@link #addProfileRule}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * StringBuffer rule1_name = new StringBuffer("rule_1");
 * pm.addProfileRule(rule1_name,
 *                   "profilo_1.json", 
 *                   "com.datalogic.testprofilo1", 
 *                   new ArrayList<String>());
 * </pre>
 * 
 * <b>To define a rule that automatically loads the profile <i>profilo_128.json</i> when the app with package name <i>com.datalogic.testprofilo1</i> 
 * comes to the foreground and accesses any URL under <i>"https://www.datalogic.com"</i>, follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Create a StringBuffer and initialize it with the preferred identifier to be used to register the rule.
 * <li>Create the rule calling {@link #addProfileUrlRule}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * StringBuffer rule1_name = new StringBuffer("rule_1");
 * pm.addProfileUrlRule(rule1_name,
 *                   "profilo_1.json", 
 *                   "com.datalogic.testprofilo1", 
 *                   new ArrayList<String>(),
 *                   "^https://www\\.datalogic\\.com(/.*)?$");
 * </pre>
 * 
 * <b>To manually load the profile <i>profilo_128.json</i> follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Load the profile calling {@link #loadProfile}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * pm.loadProfile("profilo_1.json");
 * </pre>
 * 
 * <b>To get the identifier of the manually loaded profile, if any, follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Get the profile identifier calling {@link #getLoadedProfile}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * String profile = pm.getLoadedProfile();
 * </pre>
 * 
 * <b>To unload the manually loaded profile follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Unload the profile calling {@link #unloadProfile}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * pm.unloadProfile();
 * </pre>
 * 
 * <b>To delete the profile <i>profilo_128.json</i> follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Delete the profile calling {@link #deleteProfile}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * pm.deleteProfile("profilo_1.json");
 * </pre>
 * 
 * <b>To remove the rule "rule_1" follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Remove the rule calling {@link #removeProfileRule}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * pm.removeProfileRule("rule_1");
 * </pre>
 * 
 * <b>To get the list of all the profiles saved on the device follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Get the list calling {@link #getProfilesList}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * ArrayList&lt;ProfileType&gt; profileList = pm.getProfilesList();
 * </pre>
 * 
 * <b>To get the list of all the rules defined on the device follow these steps:</b>
 * <ol>
 * <li>Obtain an instance of ProfileManager with {@link #ProfileManager}.
 * <li>Get the list calling {@link #getProfileRulesList}.
 * </ol>
 * <pre>
 * ProfileManager pm = new ProfileManager(this);
 * ArrayList&lt;ProfileRuleType&gt; profileRuleList = pm.getProfileRulesList();
 * </pre>
 * </p>
 */


public class ProfileManager {
    /**
     * This is the constructor of ProfileManager.
     * @param context
     *            <code>Context</code> context of the caller application
     * @throws ConfigException in case of error.
     */
    public ProfileManager(Context context) {

    }


    /**
     * Creates the profile with the given name and the specified persistence type.
     * <br>
     * If a profile with the same name is already present the method fails.
     * <br>
     * The schema of the profile file is:
     * <br>
     * <pre>
     * {
     *  "$schema": "http://json-schema.org/draft-07/schema#",
     *  "title": "Profile Description Schema",
     *  "description": "Schema of a profile.",
     *  "type": "object",
     *  "version": "2.0.0",
     *
     *  "definitions": {
     *      "properties": {
     *          "type": "array",
     *          "items": { "$ref": "#/definitions/property" }
     *      },
     *
     *      "property": {
     *          "type": "object",
     *          "properties": {
     *              "id": {
     *                  "type": ["integer", "string"],
     *                  "description": "Unique integer identifier of the property. 
     *                                  The defining string can be used instead of the numeric value."
     *              },
     *              "value": {
     *                  "type": "string",
     *                  "description": "Value of the property. It is a string and 
     *                                  it will be parsed according to the specific type of the property. 
     *                                  Value for a CharacterProperty is the unicode format (i.e: \\uFFFF)."
     *              }
     *          },
     *          "required": ["id", "value"]
     *      },
     *  },
     *
     *  "properties": {
     *      "version": {
     *          "type": "string",
     *          "description": "Version of the schema. If you use this the value must be 2.0.0."
     *      }        ,
     *      "description": {
     *          "type": "string",
     *          "description": "Short string describing the profile."
     *      },
     *      "properties": {
     *          "$ref": "#/definitions/properties",
     *          "description": "List of properties with their value."
     *      }
     *  }
     * }
     * </pre>
     * <br>
     * @param name
     *            <code>String</code> name to be used to create the profile file.
     *           The name must have the ".json" extension, otherwise it is added by the method.
     * @param profile
     *            <code>File</code> file of the profile to be saved on the device.
     *            The file must have the schema shown above.
     * @param persistence
     *            <code>{@link PersistenceType}</code> the persistence mode assigned to the profile file to be created.
     *          Only {@link PersistenceType#REBOOT_PERSISTENT} and {@link PersistenceType#ENTERPRISE_RESET_PERSISTENT} are allowed.
     *          It is not possible to create a profile with {@link PersistenceType#FACTORY_RESET_PERSISTENT} persistence.
     *          A Factory Reset Persistent profile can only be preinstalled on the device by an Espresso OTA and cannot be deleted.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int createProfile(String name, File profile, PersistenceType persistence) {
        return 0;
    }

    /**
     * Saves the given map as a profile with the specified name, description and persistence type.
     * If a profile with the same name is already present the method fails.
     * <br>
     * The profile file is a .json file with the schema shown in {@link #createProfile}.
     * @param name
     *            <code>String</code> name to be used to create the profile file.
     *           The name must have the ".json" extension, otherwise it is added.
     * @param map
     *            <code>HasMap</code> map of properties with their value to be saved as profile.
     * @param description
     *            <code>String</code> description to be associated to the profile.
     * @param persistence
     *            <code>{@link PersistenceType}</code> the persistence mode to be assigned to the profile.
     *          Only {@link PersistenceType#REBOOT_PERSISTENT} and {@link PersistenceType#ENTERPRISE_RESET_PERSISTENT} are allowed.
     *          It is not possible to save a profile with {@link PersistenceType#FACTORY_RESET_PERSISTENT} persistence.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int createProfile(String name, HashMap<Integer, String> map, String description, PersistenceType persistence) {
        return 0;
    }

    /**
     * Deletes the given profile.
     * The method fails if the profile has {@link PersistenceType#FACTORY_RESET_PERSISTENT} persistence or 
     * it is currently loaded or it is associated to a rule.
     *
     * @param name
     *            <code>String</code> name of the profile file to be deleted.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int deleteProfile(String name) {
        return 0;
    }

    /**
     * Returns the name of the manually loaded profile, otherwise an empty string.
     *
     * @return String, the name of the manually loaded profile or an empty String if there isn't a manually loaded profile.
     */
    public String getLoadedProfile() {
        return null;
    }

    /**
     * Applies the given profile. If there is already a manually loaded profile the method fails.
     * The properties listed in the profile are set to the values specified in the profile.
     * The changes done to the configuration loading the profile are persistent to the reboot of the device.
     * To unload the profile the method {@link #unloadProfile} must be invoked.
     * @param name
     *            <code>String</code> name of the profile file to be loaded.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int loadProfile(String name) {
        return 0;
    }

    /**
     * Revert the manually loaded profile restoring the values previously set on the device.
     * It fails if there isn't a profile manually loaded.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int unloadProfile() {
        return 0;
    }

    /**
     * Gets the list of all the profiles saved on the device.
     * @return ArrayList<{@link ProfileType}> in case of success, otherwise, if exceptions are not enabled, a null pointer.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public ArrayList<ProfileType> getProfilesList() {
        return null;
    }

    /**
     * Gets the list of all the profile rules defined on the device. See @link{ProfileRuleType} and @link{ProfileRuleUrlType} for more info.
     * @return ArrayList<{@link ProfileRuleType}> in case of success, otherwise, if exceptions are not enabled, a null pointer.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public ArrayList<ProfileRuleType> getProfileRulesList() {
        return null;
    }

    /**
     * Creates a rule to automatically load the given profile when one of the specified activities comes to foreground. 
     * The specified activities must all belong to the same package.
     * When the activity is no more in foreground the previous configuration is restored.
     * <br>
     * A rule is uniquely identified by its name which must therefore be unique. In input, through parameter name, you can specify the name to be associated with the rule. 
     * If name is unique it is used, otherwise the method makes it unique adding it a suffix. 
     * The caller can learn the string used to name the rule because the StringBuffer object name is updated.
     * <br>
     * The profile associated to the rule is the one found with the given name.
     * There must be only one rule to be loaded when an activity comes to the foreground.
     * If one of the specified activities already has an associated profile the method fails.
     * <br>
     * The persistence to reboot of a rule is that of the referred profile. If the referred profile is deleted by reboot all the rules in which it is referred are deleted.
     *
     * @param name
     *            <code>StringBuffer</code> in input an empty string or the preferred name for the rule, in output the unique name assigned
     *            to the rule; if the value in input is unique and not empty is the value used otherwise the method makes it unique adding a suffix.
     * @param profile
     *            <code>String</code> the name of the profile to be loaded when one of the given activities comes to foreground.
     * @param packageName
     *            <code>String</code> name of the package containing the given activities.
     * @param classes
     *            <code>ArrayList<String></String></code> list of class names inside of the package for which the profile must be loaded.
     *            If the list is empty it means all the classes of the package.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int addProfileRule(StringBuffer name, String profile, String packageName, ArrayList<String> classes) {
        return 0;
    }

    /**
     * Creates a rule to automatically load the given profile when one of the specified activities comes to foreground loading an url that matches the specified rule in regex format.
     * The specified activities must all belong to the same package.
     * When the activity is no more in foreground or the url is unloaded the previous configuration is restored.
     * <br>
     * <b>Important:</b> This URL-based profile rule feature is only supported for applications that use Android's
     * Webview component. Applications that use proprietary or custom WebView implementations,
     * such as Google Chrome or Mozilla Firefox, are <b>not supported</b>. These browsers compile their own
     * rendering engines (Blink for Chrome, Gecko for Firefox) and do not use the standard Android WebView,
     * which prevents the system from detecting URL changes within those applications.
     * <br>
     * A rule is uniquely identified by its name which must therefore be unique. In input, through parameter name, you can specify the name to be associated with the rule.
     * If name is unique it is used, otherwise the method makes it unique adding it a suffix.
     * The caller can learn the string used to name the rule because the StringBuffer object name is updated.
     * <br>
     * The profile associated to the rule is the one found with the given name.
     * There must be only one rule to be loaded when the activation condition (activity in foreground and url loaded) becomes true.
     * If the rule doesn't satisfy this condition the method fails.
     * <br>
     * The persistence to reboot of a rule is that of the referred profile. If the referred profile is deleted by reboot all the rules in which it is referred are deleted.
     *
     * @param name
     *            <code>StringBuffer</code> in input an empty string or the preferred name for the rule, in output the unique name assigned
     *            to the rule; if the value in input is unique and not empty is the value used otherwise the method makes it unique adding a suffix.
     * @param profile
     *            <code>String</code> the name of the profile to be loaded when one of the given activities comes to foreground.
     * @param packageName
     *            <code>String</code> name of the package containing the given activities.
     * @param classes
     *            <code>ArrayList<String></String></code> list of class names inside of the package for which the profile must be loaded.
     *            If the list is empty it means all the classes of the package.
     * @param urlRegex
     *            <code>String</code> regex for the URL. Exact URL string is valid.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int addProfileUrlRule(StringBuffer name, String profile, String packageName, ArrayList<String> classes, String urlRegex) {
        return 0;
    }

    /**
     * Delete the specified rule.
     *
     * @param name
     *            <code>String</code> name of the rule to be deleted.
     * @return int {@link ConfigException#SUCCESS} in case of success, otherwise a possible error
     *          code, matching one of the {@link ConfigException} error constants.
     * @throws ConfigException in case of error, when exceptions are enabled through the {@link ErrorManager} singleton.
     */
    public int removeProfileRule(String name) {
        return 0;
    }
}
