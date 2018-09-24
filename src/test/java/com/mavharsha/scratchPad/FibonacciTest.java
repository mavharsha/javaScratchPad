package com.mavharsha.scratchPad;

import com.mavharsha.scratchPad.recursion.Fibonacci;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci instance;

    @Before
    public void setUp() throws Exception {
        instance = new Fibonacci();
    }

    @Test
    public void testFibonacciRecursive() {

        /*
        *   index  - 0,1,2,3,4,5,6,7
        *   values - 1,1,2,3,5,8,13,21
        * */
        assertEquals(instance.getElementN(0), 1);
        assertEquals(instance.getElementN(1), 1);
        assertEquals(instance.getElementN(2), 2);
        assertEquals(instance.getElementN(3), 3);
        assertEquals(instance.getElementN(4), 5);
        assertEquals(instance.getElementN(5), 8);
        assertEquals(instance.getElementN(6), 13);
        assertEquals(instance.getElementN(7), 21);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciRecursiveException() {
        instance.getElementN(-1);
        instance.getElementN(-100);
    }
}