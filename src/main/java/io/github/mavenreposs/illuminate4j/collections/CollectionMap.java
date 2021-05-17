package io.github.mavenreposs.illuminate4j.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap<K, V> {

    protected Map<K, V> items = new HashMap<K, V>();

    /**
     * Create a new collection.
     */
    public CollectionMap() {
    }

    /**
     * Create a new collection.
     */
    public CollectionMap(Map<K, V> items) {
        this.items = items;
    }

    /**
     * Get all of the items in the collection.
     * @return List
     */
    public Map<K, V> all() {
        return items;
    }

//    public <T> CollectionMap<K, V> pluck(Function<? super T, ? extends V> value, Function<? super T, ? extends K> key) {
//        return new CollectionMap<K, V>(DSC_Collection.pluck(items, value, key));
//    }


}
