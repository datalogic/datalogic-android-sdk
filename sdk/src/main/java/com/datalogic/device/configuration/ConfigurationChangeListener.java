package com.datalogic.device.configuration;
import java.util.HashMap;
import com.datalogic.device.configuration.Property;
/**
 * This interface is used by the application to listen to configuration changes.
 */

public interface ConfigurationChangeListener {

    /**
     * onConfigurationChanged will be called to notify changes of the configuration. <br>
     * The configuration change can be the consequence of an interaction with the environment (e.g: the device is inserted in a cradle) or
     * can be the consequence of a change to the {@link Property}s done and committed by another sdk user {@link ConfigurationManager#commit}.
     *
     * @param map
     *          <code>HashMap<Integer, Object></code> map of the changes <br>
     * 			e.g: for each couple of the map:<br>
     *				 key = {@link PropertyID}<br>
     *				 value = new value of the {@link Property}
     *
     */
	public void onConfigurationChanged(HashMap<Integer, Object> map);
}
