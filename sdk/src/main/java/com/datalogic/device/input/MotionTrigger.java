package com.datalogic.device.input;

import java.util.List;

/**
 * Interface representing a trigger that automatically executes a specific
 * action (scan by default) when a motion event is detected.
 */
public interface MotionTrigger extends Trigger
{
        /**
         * Class representing the sensitivity used to trigger the action, constituted by
         * an id and a name.
         */
        public class Sensitivity
        {
                /**
                 * Leave the constructor but limit its visibility to package.
                 * Avoid calls on constructor!
                 * @hide
                 */
                Sensitivity(int id, String name) {}

                /**
                 * Gets the sensitivity ID.
                 * @return <code>int</code>
                 *         The motion ID.
                 */
                public int getId()
                {
                        return 0;
                }

                /**
                 * Gets the sensitivity name.
                 * @return <code>String</code>
                 *         The motion name.
                 */
                public String getName()
                {
                        return null;
                }
        }

        /**
         * Returns the list of supported sensitivities.
         * @return List of {@link Sensitivity} objects.
         */
        public List<Sensitivity> getSupportedSensitivities();

        /**
         * Sets the current sensitivity between the ones supported.
         * @param sensitivity
         *        The sensitivity to set.
         * @return <code>boolean</code>
         *         true if the sensitivity has been set successfully, false otherwise.
         */
        public boolean setCurrentSensitivity(Sensitivity sensitivity);

        /**
         * Gets the currently set sensitivity between the ones supported.
         * @return
         *         The current sensitivity.
         */
        public Sensitivity getCurrentSensitivity();

        /**
         * Enables or disables the vibration when a motion is detected.
         * @param enable
         *        True to enable vibration, false otherwise.
         */
        public void setVibrationEnabled(boolean enable);

        /**
         * Checks if the vibration during motion is enabled.
         * @return <code>boolean</code>
         *         true if the vibration during motion is enabled, false otherwise.
         */
        public boolean isVibrationEnabled();
}
