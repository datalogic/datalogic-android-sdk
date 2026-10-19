package com.datalogic.device.input;

import java.util.List;

/**
 * Provides access to scan-code trigger events from the device.
 * <p>
 * Supported only on devices running Android 15 or later.
 */
public class InputManager {

    /**
     * Listener for scancode trigger events.
     */
    public interface InputTriggerEventListener {
        /**
         * Called when the state of a registered trigger scancode changes.
         *
         * @param scanCode the scancode associated with the event
         * @param pressed whether the trigger is pressed ({@code true}) or released
         *                ({@code false})
         * @param eventTime the event timestamp
         */
        void onStateChanged(int scanCode, boolean pressed, long eventTime);
    }

    /**
     * Creates an input manager.
     *
     * @throws DeviceException if the input manager cannot be created
     */
    public InputManager() {}

    /**
     * Registers a listener to receive events for the specified scancodes.
     *
     * <p>Only trigger scancodes are supported. Unsupported scancodes in the list
     * are ignored. The supported trigger scancodes are:
     * <ul>
    *     <li>{@link KeyboardManager.VScanCode#VSCAN_LEFT_TRIGGER}</li>
    *     <li>{@link KeyboardManager.VScanCode#VSCAN_RIGHT_TRIGGER}</li>
    *     <li>{@link KeyboardManager.VScanCode#VSCAN_PISTOL_TRIGGER}</li>
    *     <li>{@link KeyboardManager.VScanCode#VSCAN_FRONT_TRIGGER}</li>
    *     <li>{@link KeyboardManager.VScanCode#VSCAN_PUSH_TO_TALK}</li>
     * </ul>
     *
     * @param listener the {@link InputTriggerEventListener} to notify when a
     *                 supported scancode event occurs
     * @param scanCodes the scancodes for which the listener should receive events
     * @return {@code true} if the listener was successfully registered;
     *         {@code false} otherwise
     */
    public boolean addInputTriggerEventListener(InputTriggerEventListener listener, List<Integer> scanCodes) {
        return false;
    }

    /**
     * Unregisters a listener from receiving scancode events.
     *
     * @param listener the {@link InputTriggerEventListener} to unregister
     * @return {@code true} if the listener was successfully unregistered;
     *         {@code false} otherwise
     */
    public boolean removeInputTriggerEventListener(InputTriggerEventListener listener) {
        return false;
    }
}
