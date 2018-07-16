package com.mavharsha.scratchPad;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setUp() throws Exception {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialIterative() {
        assertEquals(1, factorial.factorialIterative(0));
        assertEquals(1, factorial.factorialIterative(1));
        assertEquals(2, factorial.factorialIterative(2));
        assertEquals(6, factorial.factorialIterative(3));
        assertEquals(24, factorial.factorialIterative(4));
        assertEquals(120, factorial.factorialIterative(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialIterativeException() {
        factorial.factorialIterative(-1);
        factorial.factorialIterative(-5);
    }

    @Test
    public void testFactorialRecusive() {
        assertEquals(1, factorial.factorialRecursive(0));
        assertEquals(1, factorial.factorialRecursive(1));
        assertEquals(2, factorial.factorialRecursive(2));
        assertEquals(24, factorial.factorialRecursive(4));
        assertEquals(120, factorial.factorialRecursive(5));
    }
}