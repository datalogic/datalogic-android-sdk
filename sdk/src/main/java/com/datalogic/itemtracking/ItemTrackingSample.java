package com.datalogic.example.itemtrackingsampleapi;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.datalogic.itemtracking.ItemTrackingManager;
import com.datalogic.itemtracking.ItemTrackingManager.EventListener;
import com.datalogic.itemtracking.ItemTrackingManager.Session;
import com.datalogic.itemtracking.ItemTrackingManager.EventListener.EventType;

import androidx.annotation.Nullable;

/**
 * Overview - Item Tracking Sample Application
 * <p>
 * The Item Tracking functionality enables real-time detection, tracking, and analysis of items.
 * It is originally designed for self shopping use cases where applications need to monitor items added or removed from a trolley.
 * <p>
 * The ItemTrackingManager class provides a comprehensive API to manage the item tracking algorithm,
 * including session management, state transitions, and event handling.
 * By leveraging this functionality, developers can integrate item tracking capabilities into their applications,
 * enabling seamless monitoring of item-related events.
 * <p>
 * Key Features
 * <ul>
 *   <li>Session Management: Control the lifecycle of the item tracking algorithm using the Session class.</li>
 *   <li>State Transitions: Manage the algorithm's states (STOPPED, STARTED, PAUSED) to optimize performance and resource usage.</li>
 *   <li>Event Handling: Register listeners to receive notifications about item insertion and extraction events.</li>
 * </ul>
 * </p>
 */
public class MainActivity extends Activity {
    private static final String TAG = "DL-ItemTracking-Sample";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ======================================================================
        // STEP 1: INITIALIZING THE ITEM TRACKING MANAGER
        // ======================================================================
        // Create an instance of the ItemTrackingManager class to manage item tracking sessions.
        //
        // Refer to the official Datalogic SDK documentation here:
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTackingManager.html
        //
        ItemTrackingManager manager = new ItemTrackingManager();
        if (manager == null) {
            Log.d(TAG, "Error: Device does not support item tracking.");
            return;
        }

        // ======================================================================
        // STEP 2: HANDLE EVENTS
        // ======================================================================
        // Register an event listener to receive notifications about item tracking events.
        // The listener will be notified when items are inserted or extracted from the tracked area.
        // The EventType enum defines the types of events that can occur: INSERTION or EXTRACTION.
        //
        // Refer to the official Datalogic SDK documentation here:
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTackingManager.EventListener.html
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTackingManager.EventListener.EventType.html
        //
        EventListener listener = new EventListener() {
            @Override
            public void onEvent(EventType eventType, int numItems) {
                if (eventType == EventType.INSERTION) {
                    Log.d(TAG, "Items inserted: " + numItems);
                } else if (eventType == EventType.EXTRACTION) {
                    Log.d(TAG, "Items extracted: " + numItems);
                }
            }
        };
        manager.addEventListener(listener);

        // ======================================================================
        // STEP 3: HANDLE THE SESSION
        // ======================================================================
        // Create a session to manage item tracking operations.
        // The session allows you to start, stop, and manage the item tracking algorithm.
        //
        // Refer to the official Datalogic SDK documentation here:
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTackingManager.Session.html
        //
        Session session = manager.createSession();
        if (session == null) {
            Log.d(TAG, "Error: Item Tracking Manager cannot retrieve a valid session.");
            return;
        }

        // Retrieve and check the current state of the item tracking session.
        //
        // The session state is represented by the Session.State enum, which can have the following values:
        // - Session.State.STOPPED: The session is not running,
        //       you can start it to begin receiving item tracking events.
        // - Session.State.STARTED: The session is running and actively tracking items,
        //       you can continue to receive item tracking events without any further action.
        // - Session.State.PAUSED: The session is paused and not actively tracking items,
        //       you can resume it to continue receiving item tracking events.
        //
        // The session state can be checked using the getState() method of the Session class.
        //
        // Refer to the official Datalogic SDK documentation here:
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTackingManager.Session.State.html
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTackingManager.Session.html#getState()
        //
        // Note: The session state is managed by the ItemTrackingManager, and it can be shared across multiple applications.
        // If the session is already in the STARTED state, it means that another application has already started it,
        // and you can simply register your event listener to receive item tracking events.
        //
        // The start() method of the Session class is used to start the item tracking algorithm.
        // It returns an error code that can be used to handle specific errors.
        // The error codes are defined in the ItemTrackingException class.
        //
        // Refer to the official Datalogic SDK documentation here:
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTackingManager.Session.html#start()
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTrackingException.html
        //
        int currentState = session.getState();
        if (currentState != Session.State.STARTED) {
            Log.d(TAG, "Item tracking session is currently stopped.");

            // Start the item tracking session, if it was not running
            int startResult = session.start();
            if (startResult == ItemTrackingException.SUCCESS) { // SUCCESS
                Log.d(TAG, "Item tracking session started successfully.");
            } else {
                Log.d(TAG, "Error: Failed to start item tracking session. Error code: " + startResult);
                session.release();
                return;
            }
        } else {
            Log.d(TAG, "Item tracking session is already running.");
        }

        // Note: Once the listeners are set, the application will start receiving item tracking events immediately
        // if the session is already being managed by another application.
        // This is because the ItemTrackingManager shares the session across all applications,
        // and the session may already be in the STARTED state.
        // In such cases, there is no need to actively manage the session (e.g., starting or stopping it)
        // within the current application.
        // The application can simply focus on handling the events received from the shared session,
        // which is managed by another app.

        // ======================================================================
        // STEP 4: DO YOUR STUFF
        // ======================================================================
        // Simulate some operations
        try {
            Thread.sleep(5000); // Simulate tracking for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ======================================================================
        // STEP 5: STOP AND RELEASE THE SESSION
        // ======================================================================
        // After performing your operations, you can:
        //  - de-register the event listener
        //  - possibly stop the item tracking session (your application may not need to stop the session
        //      if it is shared with other applications)
        //  - release the session to free up resources.

        // De-register the event listener previously registered.
        manager.removeEventListener(listener);

        // Stopping the session will stop the item tracking algorithm and release any resources associated with the session.
        // The session can be stopped at any time, and it will not affect the event listener.
        // If the session is already in the STOPPED state, calling stop() will have no effect.
        // If the session is in the STARTED or PAUSED state, calling stop() will reset the session.
        //
        // Refer to the official Datalogic SDK documentation here:
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTackingManager.Session.html#stop()
        //
        // Note: The stop() method returns an error code, which can be used to handle specific errors.
        // The error codes are defined in the ItemTrackingException class.
        // Refer to the official Datalogic SDK documentation here:
        // https://datalogic.github.io/android-sdk-docs/reference/com/datalogic/itemtacking/ItemTrackingException.html
        //
        int stopResult = session.stop();
        if (stopResult == ItemTrackingException.SUCCESS) { // SUCCESS
            Log.d(TAG, "Item tracking session stopped successfully.");
        } else {
            Log.d(TAG, "Error: Failed to stop item tracking session. Error code: " + stopResult);
        }

        // Release the session to free up resources.
        session.release();
        Log.d(TAG, "Session released.");
    }
}