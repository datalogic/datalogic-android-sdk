package com.datalogic.device.battery;
/**
 * This interface is used by the application to listen to battery events.
 */



public interface BatteryEventListener {

    /**
     * onEvent will be call to signal an event concerning battery. 
     * e.g: when the battery swap starts or ends.
     *
     * @param event {@link BatteryEvent}
     *          <code>BatteryEvent</code> type of event
     * @param data
     *          <code>Object</code> details of the event
     * e.g: event = BATTERY_SWAP_EVENT_BEGIN, Object = timestamp (long System.currentTimeMillis())
     */
     public void onEvent(BatteryEvent event, Object data);
}
