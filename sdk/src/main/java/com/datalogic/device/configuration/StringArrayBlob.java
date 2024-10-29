package com.datalogic.device.configuration;

import java.util.*;

/**
 * <code>StringArrayBlob</code> implements the {@code SerializableBlob} that manages a list of {@code String}.
 */
public class StringArrayBlob extends SerializableBlob implements Iterable<String> {
    /**
     * Default constructor
     */
    public StringArrayBlob() {}

    /**
     * StringArrayBlob's constructor from a list of {@code String}.
     * 
     * @param strings {@code List<String>} : List of multiple {@code String}.
     */
    public StringArrayBlob(List<String> strings) {
    }

    /**
     * Returns the {@code String} at the specified position in this list.
     *
     * @param i : index of the {@code String} to return.
     * 
     * @return the element at the specified position in this list
     */
    public String get(int i) {
        return null;
    }

    /**
     * Appends the specified {@code String} to the end of this list.
     *
     * @param str : {@code String} to be appended to this list.
     */
    public void add(String str) {
    }

    /**
     * Removes the String at the specified position in this list. 
     * Shifts any subsequent String to the left (subtracts one from their indices).
     *
     * @param i : the index of the element to be removed
     */
    public void remove(int i) {
    }

    /**
     * Returns the number of {@code String} elements in this list.  If this list contains
     * more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return {@code int} the number of elements in this list
     */
    public int size() {
        return 0;
    }

    /**
     * Clear all {@code String} elements in the list.
     */
    public void clear() {
    }

    /**
     * Returns an iterator over elements of {@code String}.
     *
     * @return {@code Iterator<String>} : a String iterator.
     */
    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
