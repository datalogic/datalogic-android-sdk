package com.datalogic.decode.configuration;

import com.datalogic.device.configuration.*;

/**
 * <code>SymbologyLengths</code> is the class to set the minimum and maximum
 * label lengths.
 * 
 */
class SymbologyLengths extends SymbologyBase {

	/**
	 * <code>Length1</code> is one of the two configurable label lengths. It can be used
	 * as a single fixed accepted length, when {@link #lengthMode} is set to {@link LengthControlMode#ONE_FIXED}.
	 * When {@link LengthControlMode#TWO_FIXED} is enabled, its value is one of the two possible accepted fixed lengths for a specific label.
	 * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
	 * 
	 * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	 * biggest accepted length will be used. 
	 * <p>
	 * <b>Note:</b> <code>Length1</code> allowed range of values is somehow related to the nature of the barcode (linear vs 2D) but it's not intended to document
	 * in any way the scanner capabilities. An accepted minimum value and an accepted maximum value are introduced only to simplify length management in the 
	 * device <b>Scanner settings</b> app. The chance to read a barcode depends on it's printed quality, resolution, overall size, distance from the reader, 
	 * environmental light, etc...
	 * </p>  
	 * @see LengthControlMode
	 */
	public NumericProperty Length1;

	/**
	 * <code>Length2</code> is one of the two configurable label lengths.
	 * When {@link LengthControlMode#TWO_FIXED} is enabled, its value is one of the two possible accepted fixed lengths for a specific label.
	 * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
	 *
	 * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
	 * biggest accepted length will be used.
	 * <p>
	 * <b>Note:</b> <code>Length2</code> allowed range of values is somehow related to the nature of the barcode (linear vs 2D) but it's not intended to document
	 * in any way the scanner capabilities. An accepted minimum value and an accepted maximum value are introduced only to simplify length management in the 
	 * device <b>Scanner settings</b> app. The chance to read a barcode depends on it's printed quality, resolution, overall size, distance from the reader, 
	 * environmental light, etc...
	 * </p>  
	 * @see LengthControlMode
	 */
	public NumericProperty Length2;

	/**
	 * <code>lengthMode</code> is the {@link LengthControlMode} selected for a label.
	 * Selects the length control mode.
	 * 
	 * @see LengthControlMode
	 */
	public EnumProperty<LengthControlMode> lengthMode;

	/**
	 * This is an empty constructor that will not be used. In the implementation a different one protected/private
	 * will be invoked. Leave it empty, do not implement. This avoids breaking code if the class is extended.
	 * @hide
	 */
	protected SymbologyLengths(){}
}
