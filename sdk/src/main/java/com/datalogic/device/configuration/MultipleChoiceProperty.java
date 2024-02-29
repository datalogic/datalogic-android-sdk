package com.datalogic.device.configuration;


/**
 * <code>MultipleChoiceProperty</code> is the class that implements the property of type
 * MultipleChoice.
 *
 *The single choices are defined by the class that can be retrieved calling {@link MultipleChoiceProperty#getChoices}.
 *The value of the property is a combination of single choices. 
 *The combinations of the single choices that are allowed values can be retrieved calling {@link MultipleChoiceProperty#getAllowedValues}. 
 */
public class MultipleChoiceProperty extends Property<Integer> {
	/**
	 * Constructor
	 *
	 * @param index
     * @hide
	 */
	public MultipleChoiceProperty(int index) {
		super(index);
	}
  
   /**
    * Returns the allowed values of the property. 
    * The allowed values of the property are profiled based on the model and sku of the device, 
    * @return Integer[] The allowed values. 
    */
    public Integer[] getAllowedValues() {
        return null;
    }

	/**
	 * Returns the class object that list the single choices that can be selected.
	 *
	 * @return Class representing the corresponding class, null in case
	 * of error.
	 */
	public Class getChoices() {
		return null;
	}


}
