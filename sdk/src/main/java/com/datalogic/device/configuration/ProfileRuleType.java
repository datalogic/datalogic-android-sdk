package com.datalogic.device.configuration;

import java.util.ArrayList;
/**
 * <code>public class ProfileRuleType {</code> is the class that implements the descriptor of the association of a profile to a set of activities.
 * When one of the listed activities comes to the foreground the profile is automatically loaded.
 * When the activity is no more in foreground the previous configuration will be restored.
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
