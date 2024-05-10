package com.datalogic.device.configuration;


    /**
     * The base type for a BlobProperty must extends the abstract class SerializableBlob.
     */
public abstract class SerializableBlob implements Cloneable {

    /**
     * Method to crete a clone of the instance of the base type of the BlobProperty 
     * it is used by the get() method of BlobProperty to give not the reference to the same instance present in ConfigurationManager tree
     * otherwise the commit() does not work
     */
    @Override
    public SerializableBlob clone() throws CloneNotSupportedException {
        return (SerializableBlob) super.clone(); // calling JVM cloning mechanism
    }
}
