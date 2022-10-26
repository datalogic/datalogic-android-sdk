package com.datalogic.device.configuration;

import com.datalogic.device.PersistenceType;
/**
 * <code>ProfileType</code> is the class that implements the descriptor of a profile.
 */
public class ProfileType {

    /**
     * Name of the profile. Creating a profile with the same name of one already defined on the device is refused.
     */
    public String name;

    /**
     * Short description of the profile.
     */
    public String description;

    /**
     * Version of the profile's schema.
     * @hide
     */
    public String version;

    /**
     * Persistence of the profile.
     */
    public PersistenceType persistence;

    /**
     * Returns a string representation of theProfileType.
     */
    public String toString()
    {
        return null;
    }


}
