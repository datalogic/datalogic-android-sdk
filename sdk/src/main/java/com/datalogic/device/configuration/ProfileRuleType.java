package com.datalogic.device.configuration;

import java.util.ArrayList;
/**
 * <code>ProfileRuleType</code> describe the condition for which a profile is automatically loaded.
 * The condition defines the activity or the list of activities that, when in the foreground, cause the profile to be loaded automatically.
 * When one of the listed activities comes to the foreground the profile is automatically loaded.
 * When the activity is no more in foreground the previous configuration will be restored.
 * To avoid any ambiguity, two {@link ProfileRuleType}s with overlapping loading conditions are not permitted.
 * Overlap occurs when two ProfileRuleType share one or more activities.
 * This type of profile rule is added using {@link ProfileManager#addProfileRule}.
 */
public class ProfileRuleType {

    /**
     * Identifier of the rule.
     */
    public String name;
    /**
     * Name of the profile.
     */
    public String profile;
    /**
     * Package of the activities.
     */
    public String packageName;
    /**
     * List of the names of the classes inside of package for which the profile must be loaded; an empty list means all the activities of the package.
     */
    public ArrayList<String> classes;


    /**
     * Returns a string representation of the ProfileRuleType.
     */
    public String toString()
    {
        return null;
    }

}
