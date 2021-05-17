package io.github.mavenreposs.illuminate4j.collections;

import io.github.mavenreposs.illuminate4j.support.Arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Collection<T> {

    protected List<T> items = new ArrayList<T>();

    /**
     * Create a new collection.
     */
    public Collection() {
    }

    /**
     * Create a new collection.
     */
    public Collection(T item) {
        List<T> list = new ArrayList<>();
        list.add(item);
        this.items = list;
    }

    /**
     * Create a new collection.
     */
    public Collection(List<T> items) {
        this.items = items;
    }

    /**
     * Create a new collection.
     */
    public Collection(Collection<T> items) {
        this.items = items.all();
    }

    /**
     * Get all of the items in the collection.
     * @return List
     */
    public List<T> all() {
        return items;
    }

    public <V> Collection<V> pluck(Function<? super T, ? extends V> value) {
        return new Collection<V>(Arr.pluck(items, value));
    }

    public <K, V> CollectionMap<K, V> pluck(Function<? super T, ? extends V> value, Function<? super T, ? extends K> key) {
        return new CollectionMap<K, V>(Arr.pluck(items, value, key));
    }

    /**
     * Push one or more items onto the end of the collection.
     * @param values T
     * @return Collection
     */
    public Collection<T> push(T... values) {
        items.addAll(Arrays.asList(values));
        return this;
    }

    /**
     * Push one or more items onto the end of the collection.
     * @param values T
     * @return Collection
     */
    public Collection<T> push(List<T> values) {
        items.addAll(values);
        return this;
    }

    /**
     * Push all of the given items onto the collection.
     * @param source iterable
     * @return Collection
     */
    public Collection<T> concat(List<T> source) {
        Collection<T> collection = new Collection<>(this);
        collection.push(source);
        return collection;
    }

    /**
     * Reset the keys on the underlying array.
     * @return Collection
     */
    public Collection<T> values() {
        return new Collection<>(this);
    }

    /**
     * Count the number of items in the collection.
     * @return int
     */
    public int count() {
        return items.toArray().length;
    }

    /**
     * Add an item to the collection.
     * @param item T
     * @return Collection
     */
    public Collection<T> add(T item) {
        items.add(item);
        return this;
    }


}
