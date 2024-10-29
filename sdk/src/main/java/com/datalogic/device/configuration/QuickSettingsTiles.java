package com.datalogic.device.configuration;

import android.content.Context;
import java.util.HashMap;

/**
 * <code>QuickSettingsTiles</code> provides information about the available tiles in the Quick Settings panel.
 * It offers methods to retrieve both system and custom tiles, as well as the correspondence
 * between the ID and the name for the tiles currently available on the device.
 * <p>
 * In particular, Android offers two types of tiles in the Quick Settings panel: System and App tiles.<br>
 * System tiles are built into the Android operating system and provide essential device functionalities.
 * In contrast, App or Custom tiles offer quick access to functionalities provided by applications,
 * such as Google Mobile Services (GMS).
 * Therefore, they can be customized and added by installing third-party applications that provide this capability.
 * <p>
 * See {@link PropertyID#QUICK_SETTINGS_PANEL_TILES} for more info about tiles.
 */
public class QuickSettingsTiles {
    /**
     * @hide
     * Constructor
     *
     * 
     * */
    public QuickSettingsTiles(){}

    /**
     * Get a map with all available system tiles in the format <id,label>.
     *
     * @param context
     *            <code>Context</code>
     * 
     * @return HashMap<String, String> the map of available system tiles.
     * 
     * */
    public static HashMap<String, String> getAvailableSystemTiles(Context context) {
        return null;
    }

    /**
     * Get a map with all available custom tiles in the format <id,label>.
     *
     * @param context
     *            <code>Context</code>
     * 
     * @return HashMap<String, String> the map of available custom tiles.
     * 
     * */
    public static HashMap<String, String> getAvailableCustomTiles(Context context) {
        return null;
    }

    /**
     * Retrieve the corresponding tile ID, given its name.
     *
     * @param context
     *            <code>Context</code>
     * @param name
     *            <code>String</code>
     * 
     * @return String the corresponding tile ID
     * 
     * */
    public static String getTileIdByName(Context context, String name) {
        return null;
    }

    /**
     * Retrieve the corresponding tile name, given its ID.
     *
     * @param context
     *            <code>Context</code>
     * @param id
     *            <code>String</code>
     * 
     * @return String the corresponding tile name
     * 
     * */
    public static String getTileNameById(Context context, String id) {
        return null;
    }

}

