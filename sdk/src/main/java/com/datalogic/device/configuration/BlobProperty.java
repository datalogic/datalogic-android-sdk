package com.datalogic.device.configuration;

/**
 * <code>BlobProperty</code> implements the property that allows to manage any class through the ConfigurationManager.
 * The only constraint is that the base type for a BlobProperty must extends the abstract class {@link SerializableBlob}.
 */
public class BlobProperty extends Property<SerializableBlob> {
	/**
	 * Constructor
	 *
	 * @param index
	 */
	public BlobProperty(int index) {
		super(index);
	}

	/**
	 * Returns the class object corresponding to the Blob.
	 *
	 * @return Class representing the corresponding blob class, null in case
	 * of error.
	 */
	public Class getBlobClass() {
		return null;
	}

}
