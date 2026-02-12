package com.datalogic.device.configuration;

import com.datalogic.device.DeviceException;
import com.datalogic.device.ErrorManager;

import java.util.List;
import java.util.Map;

/**
 * The {@code PoseManager} provides all classes and methods that allow to register different
 * device poses (characterized by a unique name and gravity vector) and associate to them actions
 * that will be executed when the device finds itself inside or outside any device pose. <br/>
 * It also provides APIs to:
 * <ul>
 *   <li>Retrieve the current gravity vector synchronously ({@link PoseManager#retrieveGravityVector()})
 *   or asynchronously ({@link PoseManager#retrieveGravityVector(GravityVectorRetrievalListener)}).</li>
 *   <li>Register ({@link PoseManager#addPoseChangeEventListener(PoseChangeEventListener)}) and
 *   unregister ({@link PoseManager#removePoseChangeEventListener(PoseChangeEventListener)}) listeners
 *   for pose change events.</li>
 *   <li>Manage the blob property ({@link PropertyID#POSE_MANAGER_DEVICE_POSES}) containing the pose
 *   definitions and their associated settings.</li>
 * </ul>
 */
public class PoseManager {
    /**
     * Listener interface used to retrieve a gravity vector asynchronously from the Pose Manager.
     * Implementations of this interface are passed to the method
     * {@link PoseManager#retrieveGravityVector(GravityVectorRetrievalListener)}.
     */
    public interface GravityVectorRetrievalListener {
        /**
         * Method called when the Pose Manager has completed the task of retrieving a
         * gravity vector.
         *
         * @param gravityVector The gravity vector that has been retrieved, or {@link GravityVector#INVALID}
         *                      in case of failure during the procedure.
         */
        void onGravityVectorRetrieved(GravityVector gravityVector);
    }

    /**
     * Listener interface used to receive notifications when the device enters or exits a pose.
     */
    public interface PoseChangeEventListener {
        /**
         * Called when the device pose changes.
         *
         * @param poseName The name of the pose that triggered the event.
         * @param inPose {@code true} if the device is now inside the pose,
         *               {@code false} if it has exited the pose.
         */
        void onPoseChanged(String poseName, boolean inPose);
    }

    /**
     * Constructor for the Pose Manager object.
     *
     * @throws DeviceException In case the Pose Manager service cannot be found in this device.
     */
    public PoseManager() throws Exception {
        
    }

    /**
     * Retrieve the current gravity vector synchronously.<br/>
     * This method requires a calibration process that takes some time to execute (at most 10 seconds) and
     * requires the device to be stationary for an optimal result.
     *
     * @return The current {@link GravityVector}, or {@link GravityVector#INVALID} in case of failure during
     *         the procedure and the exceptions are not enabled through the {@link ErrorManager}.
     * @throws DeviceException In case of failures, if the exceptions are enabled through the {@link ErrorManager}.
     */
    public GravityVector retrieveGravityVector() {
        return null;
    }

    /**
     * Retrieve the current gravity vector asynchronously.<br/>
     * This method requires a calibration process that takes some time to execute (at most 10 seconds) and
     * requires the device to be stationary for an optimal result.<br/>
     * The provided listener will be notified once the gravity vector has been retrieved.
     *
     * @param listener The listener to notify when the gravity vector is available.
     * @return Returns {@link DeviceException#SUCCESS} in case the call succeeded, otherwise it returns
     *         an error code from the {@link DeviceException} error codes, if the exceptions are not enabled through
     *         the {@link ErrorManager}.
     * @throws DeviceException In case of failures, if the exceptions are enabled through the {@link ErrorManager}.
     */
    public int retrieveGravityVector(GravityVectorRetrievalListener listener) {
        return 0;
    }

    /**
     * Register a listener to receive notifications when the device enters or exits a pose.
     *
     * @param listener The listener to register.
     * @return {@code true} if the listener was successfully registered, {@code false} otherwise.
     */
    public boolean addPoseChangeEventListener(PoseChangeEventListener listener) {
        return false;
    }

    /**
     * Unregister a listener to receive notifications when the device enters or exits a pose.
     *
     * @param listener The listener to unregister.
     * @return {@code true } if the listener was successfully unregistered, {@code false} otherwise.
     */
    public boolean removePoseChangeEventListener(PoseChangeEventListener listener) {
        return false;
    }

    /**
     * Represents a 3D gravity vector with X, Y, and Z components.
     * Used to characterize the orientation of the device in space.
     */
    public static class GravityVector {
        /**
         * An invalid gravity vector returned when the PoseManager fails to
         * retrieve a valid gravity vector.
         */
        public static GravityVector INVALID = new GravityVector(0, 0, 0);

        /**
         * Constructor for the gravity vector.
         *
         * @param x The X component.
         * @param y The Y component.
         * @param z The Z component.
         */
        public GravityVector(float x, float y, float z) {
        }

        /**
         * Get the X component of the gravity vector.
         *
         * @return The X component.
         */
        public float getX() {
            return 0;
        }

        /**
         * Get the Y component of the gravity vector.
         *
         * @return The Y component.
         */
        public float getY() {
            return 0;
        }

        /**
         * Get the Z component of the gravity vector.
         *
         * @return The Z component.
         */
        public float getZ() {
            return 0;
        }

        /**
         * Set the X component of the gravity vector.
         *
         * @param x The new value for X.
         */
        public void setX(float x) {
            
        }

        /**
         * Set the Y component of the gravity vector.
         *
         * @param y The new value for Y.
         */
        public void setY(float y) {
            
        }

        /**
         * Set the Z component of the gravity vector.
         *
         * @param z The new value for Z.
         */
        public void setZ(float z) {
            
        }
    }

    /**
     * Represents a collection of configured device poses.
     * This class is managed by the {@link ConfigurationManager} Blob Property with ID
     * {@link PropertyID#POSE_MANAGER_DEVICE_POSES}.
     * <br/>
     * Provides methods to add, remove, clear and list device poses.
     */
    public static class DevicePoses extends SerializableBlob {
        /**
         * @hide
         */
        public DevicePoses() {
        }

        /**
         * Get an unmodifiable list with the currently configured device poses.
         *
         * @return The list of poses.
         */
        public List<Pose> getPoses() {
            return null;
        }

        /**
         * Add a pose to the list. If a pose with the same name already exists, it will be
         * replaced.
         *
         * @param pose The pose to add.
         * @throws IllegalArgumentException if the pose is null.
         */
        public void add(Pose pose) {
            
        }

        /**
         * Remove a pose from the list, whose name is the same as the one passed as parameter.
         *
         * @param poseName The name of the pose to remove.
         * @throws IllegalArgumentException if the pose name is null.
         */
        public void remove(String poseName) {
            
        }

        /**
         * Remove all poses from the list.
         */
        public void clear() {
            
        }

        /**
         * Builder for the {@link DevicePoses}.
         */
        public static class Builder {
            /**
             * Create a new Builder for the {@link DevicePoses} object with an
             * initial empty list of poses.
             */
            public Builder() {
            }

            /**
             * Add a pose to the list.
             *
             * @param pose The pose to add.
             * @throws IllegalArgumentException if the pose is null.
             */
            public Builder addPose(Pose pose) {
                return null;
            }

            /**
             * Build and return a newly created {@link DevicePoses} object. The created
             * object is guaranteed to be valid and ready to use.
             *
             * @return The {@link DevicePoses} object.
             */
            public DevicePoses build() {
                return null;
            }
        }
    }

    /**
     * Represents a single device pose, defined by a name, gravity vector and associated settings.
     * A pose can have actions configured for when the device enters or exits it.
     */
    public static class Pose {
        /**
         * @hide
         */
        protected Pose() {
            
        }

        /**
         * Get the unique pose name.
         *
         * @return The unique pose name.
         */
        public String getName() {
            return null;
        }

        /**
         * Get the gravity vector.
         *
         * @return The gravity vector.
         */
        public GravityVector getGravityVector() {
            return null;
        }

        /**
         * Check if the detection of this device pose is on.
         *
         * @return {@code true} if the detection is on, {@code false} otherwise.
         */
        public boolean isDetectionEnabled() {
            return false;
        }

        /**
         * Get the settings used when the device enters this pose.
         *
         * @return The in pose settings.
         */
        public PoseSettings getInPoseSettings() {
            return null;
        }

        /**
         * Get the settings used when the device exits this pose.
         *
         * @return The out of pose settings.
         */
        public PoseSettings getOutOfPoseSettings() {
            return null;
        }

        /**
         * Set the unique pose name. The check on the uniqueness of this
         * name will be done only when setting this pose inside the list
         * of poses in the {@link ConfigurationManager} Blob Property with ID
         * {@link PropertyID#POSE_MANAGER_DEVICE_POSES}.
         *
         * @param name The unique pose name.
         * @throws IllegalArgumentException if the name is empty or null.
         */
        public void setName(String name) {
            
        }

        /**
         * Set the gravity vector.
         *
         * @param gravityVector The gravity vector.
         */
        public void setGravityVector(GravityVector gravityVector) {
            
        }

        /**
         * Set if the detection of this pose is enabled.
         * @param detectionEnabled {@code true} to enable the detection of this pose, {@code false} otherwise.
         */
        public void setDetectionEnabled(boolean detectionEnabled) {
            
        }

        /**
         * Modify the settings used when the device enters this pose.
         *
         * @param inPoseSettings The in pose settings.
         */
        public void setInPoseSettings(PoseSettings inPoseSettings) {
            
        }

        /**
         * Modify the settings used when the device exits this pose.
         *
         * @param outOfPoseSettings The out of pose settings.
         */
        public void setOutOfPoseSettings(PoseSettings outOfPoseSettings) {
            
        }

        /**
         * The builder for the {@link Pose}.
         */
        public static class Builder {
            /**
             * Create a new Builder for the {@link Pose} object, with the following default values:
             * <ul>
             *     <li>`name` unset</li>
             *     <li>`gravityVector` unset</li>
             *     <li>`detectionEnabled` set to `false`</li>
             *     <li>`inPoseSettings` set to its Builder default (see {@link PoseSettings.Builder})</li>
             *     <li>`outOfPoseSettings` set to `its Builder default (see {@link PoseSettings.Builder})</li>
             * </ul>
             * The name and gravity vector must be set before building the Profile object.
             */
            public Builder() {
                
            }

            /**
             * Set the pose name.
             * The name must be non empty and unique among all poses. It is used to identify the
             * pose when creating it.
             *
             * @param name The name of the pose.
             * @throws IllegalArgumentException if the name is empty or null.
             * @return This builder instance.
             */
            public Builder withName(String name) {
                return null;
            }

            /**
             * Set the gravity vector.
             *
             * @param gravityVector The gravity vector of the pose.
             * @return This builder instance.
             */
            public Builder withGravityVector(GravityVector gravityVector) {
                return null;
            }

            /**
             * Set if the detection of this pose is enabled.
             *
             * @param detectionEnabled {@code true} to enable detection, {@code false} otherwise.
             * @return This builder instance.
             */
            public Builder withDetectionEnabled(boolean detectionEnabled) {
                return null;
            }

            /**
             * Set the in pose settings.
             *
             * @param inPoseSettings The in pose settings.
             * @return This builder instance.
             */
            public Builder withInPoseSettings(PoseSettings inPoseSettings) {
                return null;
            }

            /**
             * Set the out of pose settings.
             *
             * @param outOfPoseSettings The out of pose settings.
             * @return This builder instance.
             */
            public Builder withOutOfPoseSettings(PoseSettings outOfPoseSettings) {
                return null;
            }

            /**
             * Build and return a newly created Pose object. The created object is
             * guaranteed to be valid and ready to use.
             * @return The Pose object.
             * @throws IllegalStateException if the name or gravity vector is not set or is invalid.
             */
            public PoseManager.Pose build() {
                return null;
            }
        }
    }

    /**
     * Settings related to a specific pose, they are assigned to the pose itself with:
     * <ul>
     *     <li>
     *         {@link Pose#setInPoseSettings(PoseSettings)} or {@link Pose.Builder#withInPoseSettings(PoseSettings)}
     *         for the settings to use when entering the pose
     *     </li>
     *     <li>
     *         {@link Pose#setOutOfPoseSettings(PoseSettings)} or {@link Pose.Builder#withOutOfPoseSettings(PoseSettings)}
     *         for the settings to use when exiting the pose
     *     </li>
     * </ul>
     * The settings are used to specify additional constraints when entering or exiting the
     * associated pose, as well as the operations to execute when the device is inside or
     * outside the pose.
     */
    public static class PoseSettings {
        /**
         * @hide
         */
        protected PoseSettings() {
            
        }

        /**
         * Get the maximum angle (in radians) accepted between a detected gravity vector and the associated pose gravity vector.
         * If the angle is exceeded the gravity vector is considered as outside the associated pose, otherwise it is considered
         * as inside it.
         *
         * @return The delta angle (in radians).
         */
        public float getDeltaAngle() {
            return 0;
        }

        /**
         * Get the amount of time (in milliseconds) in which the device must stay in or out the associated
         * pose to cause this setting to become valid.
         *
         * @return The stabilization time (in milliseconds).
         */
        public int getStabilizationTime() {
            return 0;
        }

        /**
         * Get an unmodifiable list of options used, together with the angle and the stabilization time, to detect
         * if a device is considered inside or outside the associated pose.
         *
         * @return The list of activation options.
         */
        public List<ActivationOption> getActivationOptions() {
            return null;
        }

        /**
         * Get the list of options that describe the steps to take after the device is found inside or outside the
         * associated pose.
         *
         * @return The list of execution options.
         */
        public List<ExecutionOption> getExecutionOptions() {
            return null;
        }

        /**
         * Set the maximum angle (in radians) accepted between a detected gravity vector and the associated pose gravity vector.
         * If the angle is exceeded the gravity vector is considered as outside the associated pose, otherwise it is considered
         * as inside it.
         *
         * @param deltaAngle The delta angle (in radians).
         */
        public void setDeltaAngle(float deltaAngle) {
            
        }

        /**
         * Set the amount of time (in milliseconds) in which the device must stay in or out the associated
         * pose to cause this setting to become valid.
         *
         * @param stabilizationTIme The stabilization time (in milliseconds).
         */
        public void setStabilizationTIme(int stabilizationTIme) {
            
        }

        /**
         * Add a new activation option in the list of available options.
         *
         * @param activationOption  The activation option to add.
         */
        public void addActivationOption(ActivationOption activationOption) {
            
        }

        /**
         * Remove an existing activation option from the list of available options.
         *
         * @param activationOption  The activation option to remove.
         */
        public void removeActivationOption(ActivationOption activationOption) {
            
        }

        /**
         * Remove all existing activation options from the list of available options.
         */
        public void clearActivationOptions() {
            
        }

        /**
         * Add a new execution option in the list of available options.
         *
         * @param executionOption The execution option to add.
         */
        public void addExecutionOption(ExecutionOption executionOption) {
            
        }

        /**
         * Remove an existing execution option from the list of available options.
         *
         * @param executionOption The execution option to remove.
         */
        public void removeExecutionOption(ExecutionOption executionOption) {
            
        }

        /**
         * Remove all existing execution options from the list of available options.
         */
        public void clearExecutionOptions() {
            
        }

        /**
         * The builder for the {@link PoseSettings}.
         */
        public static class Builder {
            /**
             * Create a new Builder for the {@link PoseSettings} object, with the following default values:
             * <ul>
             *     <li>`deltaAngle` set to 10 degrees (expressed in radiants)</li>
             *     <li>`stabilizationTIme` set to 200 milliseconds</li>
             *     <li>`activationOptions` set to empty list</li>
             *     <li>`executionOptions` set to empty list</li>
             * </ul>
             */
            public Builder() {
                
            }

            /**
             * Set the maximum angle (in radians) accepted between a detected gravity vector and the associated pose gravity vector.
             * If the angle is exceeded the gravity vector is considered as outside the associated pose, otherwise it is considered
             * as inside it.
             *
             * @param deltaAngle The delta angle (in radians).
             * @return This builder instance.
             */
            public Builder withDeltaAngle(float deltaAngle) {
                return null;
            }

            /**
             * Set the stabilization time (in milliseconds).
             * The stabilization time defines how long the device must remain in or out of the pose
             * before the pose is considered valid.
             *
             * @param stabilizationTime The stabilization time in milliseconds.
             * @return This builder instance.
             */
            public Builder withStabilizationTime(int stabilizationTime) {
                return null;
            }

            /**
             * Add an activation option to the pose settings.
             *
             * @param activationOption The activation option to add.
             * @return This builder instance.
             */
            public Builder addActivationOption(ActivationOption activationOption) {
                return null;
            }

            /**
             * Remove an activation option from the pose settings.
             *
             * @param activationOption The activation option to remove.
             * @return This builder instance.
             */
            public Builder removeActivationOption(ActivationOption activationOption) {
                return null;
            }

            /**
             * Add an execution option to the pose settings.
             *
             * @param executionOption The execution option to add.
             * @return This builder instance.
             */
            public Builder addExecutionOption(ExecutionOption executionOption) {
                return null;
            }

            /**
             * Remove an execution option from the pose settings.
             *
             * @param executionOption The execution option to remove.
             * @return This builder instance.
             */
            public Builder removeExecutionOption(ExecutionOption executionOption) {
                return null;
            }

            /**
             * Build and return a newly created PoseSettings object. The created object is
             * guaranteed to be valid and ready to use.
             *
             * @return The {@link PoseSettings} object.
             */
            public PoseManager.PoseSettings build() {
                return null;
            }
        }
    }

    /**
     * Class representing an option of activation applied to a pose setting. The option
     * is used to restrict the validity of the associated pose, both when the setting is used
     * to detect when the device is inside the pose then for the outside of pose detection (but
     * with the opposite logic).
     */
    public static class ActivationOption {
        /**
         * The type of activation option.
         */
        public enum Type {
            /**
             * Activation option that verifies if the device is inside or outside the cradle.
             */
            IN_CRADLE,
            /**
             * Activation option that verifies if the device is stationary or not.
             */
            STATIONARY,
            /**
             * Activation option that verifies if the device proximity sensor detects an object nearby or not.
             */
            UNOBSTRUCTED
        }

        /**
         * The threshold used by the proximity sensor to detect when an object is close, in case the
         * activation option type is {@link Type#UNOBSTRUCTED}.
         */
        public static final String PARAM_TOF_THRESHOLD = "tofThreshold";

        /**
         * @hide
         */
        protected ActivationOption() {
            
        }

        /**
         * Get the activation option type.
         *
         * @return The type of activation option.
         */
        public Type getType() {
            return null;
        }

        /**
         * Returns the representation of the internal parameters of the activation option.<br/>
         * Parameters are represented as a map of key-value pairs. Their meaning depends on the type:
         * <ul>
         *   <li>For {@link Type#IN_CRADLE}, no parameters are required.</li>
         *   <li>For {@link Type#STATIONARY}, no parameters are required.</li>
         *   <li>For {@link Type#UNOBSTRUCTED}, keys include:
         *       <ul>
         *         <li>{@link #PARAM_TOF_THRESHOLD}</li>
         *       </ul>
         *   </li>
         * </ul>
         *
         * @return A map of parameter names to values.
         */
        public Map<String, String> getParams() {
            return null;
        }

        /**
         * The builder for the {@link ActivationOption}.
         */
        public static class Builder {
            /**
             * Creates a new Builder for the {@link ActivationOption} object, with the following default
             * values:
             * <ul>
             *     <li>type equals to {@link Type#STATIONARY}.</li>
             * </ul>
             */
            public Builder() {
                
            }

            /**
             * Setup an activation option with type set as {@link Type#STATIONARY}.
             *
             * @return This builder instance.
             */
            public Builder withStationary() {
                return null;
            }

            /**
             * Setup an activation option with type set as {@link Type#IN_CRADLE}.
             *
             * @return This builder instance.
             */
            public Builder withInCradle() {
                return null;
            }

            /**
             * Setup an activation option with type set as {@link Type#UNOBSTRUCTED}.
             *
             * @param tofThreshold The threshold distance (in mm) to consider the proximity as obstructed by an object.
             * @return This builder instance.
             */
            public Builder withUnobstructed(int tofThreshold) {
                return null;
            }

            /**
             * Build and return a newly created ActivationOption object.
             *
             * @return The {@link ActivationOption} object.
             */
            public PoseManager.ActivationOption build() {
                return null;
            }
        }
    }

    /**
     * Class representing an execution step applied to a pose setting. This option
     * is used to execute a specific action when the device finds itself inside or outside a
     * specific pose, depending on the pose setting that adds this and the corresponding pose.
     */
    public static class ExecutionOption {
        /**
         * The type of execution option.
         */
        public enum Type {
            /**
             * This type sends an intent when the associated pose setting is valid.
             */
            SEND_INTENT,
            /**
             * This type notifies listeners registered in the {@link PoseManager} when
             * the associated pose setting is valid.
             */
            NOTIFY_LISTENER
        }

        /**
         * The mode used when sending the intent when the execution option type is
         * {@link ExecutionOption.Type#SEND_INTENT}.
         */
        public enum IntentDeliveryMode {
            /**
             * Start an activity.
             */
            START_ACTIVITY,
            /**
             * Start a service.
             */
            START_SERVICE,
            /**
             * Send the intent in broadcast.
             */
            SEND_BROADCAST
        }

        /**
         * The intent action used in case the execution option type is {@link Type#SEND_INTENT}.
         */
        public static final String PARAM_INTENT_ACTION = "intentAction";

        /**
         * The intent category used in case the execution option type is {@link Type#SEND_INTENT}.
         * If set to an empty string, it will not be added in the intent itself.
         */
        public static final String PARAM_INTENT_CATEGORY = "intentCategory";

        /**
         * The name of the string extra used to provide the pose name, used in case the execution option type
         * is {@link Type#SEND_INTENT}.
         */
        public static final String PARAM_INTENT_POSE_NAME_EXTRA = "intentPoseNameExtra";

        /**
         * The name of the string extra used to provide the event type, used in case the execution option type
         * is {@link Type#SEND_INTENT}. The extra value can be {@link ExecutionOption#IN_POSE_EVENT} or
         * {@link ExecutionOption#OUT_OF_POSE_EVENT} depending on the detected state.
         */
        public static final String PARAM_INTENT_EVENT_EXTRA = "intentEventExtra";

        /**
         * The delivery mode of the intent, used in case the execution option type
         * is {@link Type#SEND_INTENT}.
         */
        public static final String PARAM_INTENT_DELIVERY_MODE = "intentDeliveryMode";

        /**
         * Value of the event extra when the device is detected in pose.
         */
        public static final String IN_POSE_EVENT = "IN_POSE";

        /**
         * Value of the event extra when the device is detected out of pose pose.
         */
        public static final String OUT_OF_POSE_EVENT = "OUT_OF_POSE";

        /**
         * @hide
         */
        protected ExecutionOption() {
            
        }

        /**
         * Get the execution option type.
         * @return The type of execution option.
         */
        public Type getType() {
            return null;
        }

        /**
         * Returns the representation of the internal parameters of the execution option.<br/>
         * Parameters are represented as a map of key-value pairs. Their meaning depends on the type:
         * <ul>
         *   <li>For {@link Type#SEND_INTENT}, keys include:
         *       <ul>
         *         <li>{@link #PARAM_INTENT_ACTION}</li>
         *         <li>{@link #PARAM_INTENT_CATEGORY}</li>
         *         <li>{@link #PARAM_INTENT_POSE_NAME_EXTRA}</li>
         *         <li>{@link #PARAM_INTENT_EVENT_EXTRA}</li>
         *         <li>{@link #PARAM_INTENT_DELIVERY_MODE}</li>
         *       </ul>
         *   </li>
         *   <li>For {@link Type#NOTIFY_LISTENER}, no parameters are required.</li>
         * </ul>
         * @return A map of parameter names to values.
         */
        public Map<String, String> getParams() {
            return null;
        }

        /**
         * The builder for the {@link ExecutionOption}.
         */
        public static class Builder {
            /**
             * Creates a new Builder for the {@link ExecutionOption} object, with the following default
             * values:
             * <ul>
             *     <li>type equal to `NOTIFY_LISTENER`.</li>
             * </ul>
             */
            public Builder() {
                
            }

            /**
             * Configure this execution option to notify the registered listeners when a pose event occurs.
             *
             * @return This builder instance.
             */
            public Builder withNotifyListener() {
                return null;
            }

            /**
             * Configure this execution option to send an intent when a pose event occurs.
             *
             * @param intentAction The intent action string.
             * @param intentCategory The intent category string.
             * @param intentPoseNameExtra Extra data containing the pose name.
             * @param intentEventExtra Extra data containing the event type.
             * @param intentDeliveryMode The delivery mode (activity, service or broadcast).
             * @return This builder instance.
             */
            public Builder withSendIntent(String intentAction, String intentCategory,
                                          String intentPoseNameExtra, String intentEventExtra,
                                          IntentDeliveryMode intentDeliveryMode) {
                return null;
            }

            /**
             * Build and return a newly created ExecutionOption object.
             *
             * @return The {@link ExecutionOption} object.
             */
            public PoseManager.ExecutionOption build() {
                return null;
            }
        }
    }
}
