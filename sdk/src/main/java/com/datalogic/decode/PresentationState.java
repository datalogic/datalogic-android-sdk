package com.datalogic.decode;

/**
 * <code>PresentationState</code> is an enumeration class defining constants for presentation mode states.
 * 
 */
public enum PresentationState {
    /**
     * Presentation mode is armed and ready to detect motion.
     */
    READY,
    /**
     * Presentation mode is waiting for a stable condition. In this state the system cannot detect motion. To avoid unwanted 
	 * activations it is important that the system could identify a static condition (device not moving and no objects in motion in front of the scan egine). When the device detects a stable condition it switches from 
	 * <code>WAITING</code> to <code>READY</code>.
     */
    WAITING,
    /**
     * Presentation mode is decoding. When the device detects a motion in <code>READY</code> state, it switches to <code>SCANNING</code> starting the decoding system. It keeps in this state until a decode result or the decode timeout expired. When the
	 * decoding system switch off the device moves to the <code>WAITING</code> state.
     */
    SCANNING,
    /**
     * Presentation mode is disabled.
     */
    DISABLED;
}