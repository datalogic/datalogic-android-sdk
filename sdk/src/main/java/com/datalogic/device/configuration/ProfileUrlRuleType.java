package com.datalogic.device.configuration;

import java.util.ArrayList;

/**
 * <code>ProfileUrlRuleType</code>describe the condition for which a profile is automatically loaded.
 * The condition defines the URL that, if accessed by an activity (or a list of activities) in foreground, cause the profile to be loaded automatically. 
 * When one of the listed activities comes to the foreground and loads the URL the active profile is automatically loaded.
 * When the activity is no more in foreground or the URL is no more loaded the previous configuration will be restored.
 * To avoid any ambiguity, two {@link ProfileUrlRuleType}s with overlapping loading conditions are not permitted. 
 * Overlap occurs when two ProfileUrlRuleType share one or more URLs for the same activity.
 * This type of profile rule is added using {@link ProfileManager#addProfileUrlRule}.
 */
public class ProfileUrlRuleType extends ProfileRuleType {

    /**
    * Regular expression that defines valid URLs which, when loaded by a foreground activity, trigger automatic profile activation.
    */
    public String urlRegex;


    /**
     * Returns a string representation of the ProfileUrlRuleType.
     */
    public String toString() {
        return null;
    }

}
