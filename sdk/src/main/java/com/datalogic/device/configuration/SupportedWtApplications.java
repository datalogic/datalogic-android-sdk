package com.datalogic.device.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.List;

/**
 * <code>StringArrayBlob</code> implements the class that manages the list of supported Walkie-Talkie applications to be used with the Push-to-Talk button.
 * The class is managed by the ConfigurationManager BlobProperty {@link PropertyID#KEYBOARD_PTT_SUPPORTED_WT_APPLICATIONS}.
 */
public class SupportedWtApplications extends StringArrayBlob {

    /**
     * Default constructor
     */
    public SupportedWtApplications() {
        super();
    }

    /**
     * SupportedWtApplications's constructor from a list of {@code String}.
     * 
     * @param strings : {@code List} of {@code String}.
     */
    public SupportedWtApplications(List<String> strings) {
    }

    /**
     * Returns the {@code ApplicationInfo} of the installed application at the specified position in the SupportedWtApplications list.
     *
     * @param i : index of the application.
     * @return {@code ApplicationInfo} : Information of the installed application at the specified position in the SupportedWtApplications list.
     */
    public ApplicationInfo getAvailableWtApplication(Context context, int i) {
        return null;
    }

}
