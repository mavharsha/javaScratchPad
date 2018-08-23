package com.mavharsha.scratchPad;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {

    private final int capacity;
    private final Map<K, V> cache;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity);
    }


    public V get(K key){
        V value = cache.get(key);
        if(value == null) { return null;}
        cache.remove(key);
        cache.put(key, value);
        return value;
    }

    public void set(K key, V value) {
        if(cache.containsKey(key)) {
            cache.remove(key);
        }

        if(cache.size() >= capacity) {
            // remove the last element
        }
        cache.put(key, value);
    }
}
