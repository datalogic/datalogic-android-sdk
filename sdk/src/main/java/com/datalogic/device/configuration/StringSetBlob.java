package com.datalogic.device.configuration;

import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

/**
 * <code>StringSetBlob</code> implements the {@code SerializableBlob} that manages a collection of {@code String}.
 */
public class StringSetBlob extends SerializableBlob implements Iterable<String> {
    /**
     * Default constructor
     */
    public StringSetBlob() {}

    /**
     * StringSetBlob's constructor from a collection of {@code String}.
     *
     * @param strings {@code Collection<String>} : Collection of multiple {@code String}.
     */
    public StringSetBlob(Collection<String> strings) {
    }

    /**
     * Add the specified {@code String} to the collection of Strings.
     *
     * @param str : {@code String} to be added to this collection.
     */
    public void add(String str) {
    }

    /**
     * Remove the specified {@code String} from the collection of Strings.
     *
     * @param str : {@code String} to be removed from this collection.
     */
    public void remove(String str) {
    }

    /**
     * Remove the specified collection of {@code String} from this collection of Strings.
     *
     * @param strs : {@code Collection<String>} to be removed from this collection.
     */
    public void removeAll(Collection<String> strs) {
    }

    /**
     * Returns the number of {@code String} elements in this collection.
     * If this collection contains more than {@code Integer.MAX_VALUE} elements,
     * returns {@code Integer.MAX_VALUE}.
     *
     * @return {@code int} the number of elements in this collection.
     */
    public int size() {
        return 0;
    }

    /**
     * Clear all {@code String} elements in the collection.
     */
    public void clear() {
    }

    /**
     * Returns true if the collection is empty.
     *
     * @return {@code boolean} true if the collection is empty, otherwise false.
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns true if the specified {@code String} is contained into the collection.
     *
     * @param str : {@code <String>} to be checked.
     *
     * @return {@code boolean} true if the string is in this collection, otherwise false.
     */
    public boolean contains(String str) {
        return false;
    }

    /**
     * Returns the all the strings from the collection.
     *
     * @return {@code Set<String> as the strings present into the collection.
     */
    public Set<String> get() {
        return null;
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
