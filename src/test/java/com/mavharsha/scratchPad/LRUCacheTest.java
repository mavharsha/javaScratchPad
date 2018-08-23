package com.mavharsha.scratchPad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

    private LRUCache<String, String> cache;
    @Before
    public void setUp() throws Exception {
        cache = new LRUCache<>(2);
    }

    @After
    public void tearDown() throws Exception {
        cache = null;
    }

    @Test
    public void testInsertion() {
        assertEquals(cache.numberOfKeys(), 0);
        System.out.println("Insertion test: " + cache.toString());
        cache.set("Key", "Value");
        assertEquals(cache.numberOfKeys(), 1);
        cache.set("Key1", "Value1");
        assertEquals(cache.numberOfKeys(), 2);
        cache.set("Key2", "Value2");
        assertEquals(cache.numberOfKeys(), 2);
        System.out.println("Insertion test: " + cache.toString());
    }

    @Test
    public void testGettingKeys() {
        cache.set("Key", "Value");
        cache.set("Key1", "Value1");
        cache.set("Key2", "Value2");

        assertNull(cache.get("Key"));
        assertNull(cache.get("AnotherKey"));

        assertTrue(cache.get("Key1").equalsIgnoreCase("Value1"));
        assertTrue(cache.get("Key2").equalsIgnoreCase("Value2"));
    }
}