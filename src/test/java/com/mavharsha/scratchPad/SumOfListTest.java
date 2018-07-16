package com.mavharsha.scratchPad;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class SumOfListTest {

    private SumOfList summable;

    @Before
    public void setUp() throws Exception {
        summable = new SumOfList();
    }

    @Test
    public void testSumOfNumbers() {
        assertEquals(summable.sum(Collections.EMPTY_LIST), 0);
        assertEquals(summable.sum(Arrays.asList(1, 2, 3)), 6);
        assertEquals(summable.sum(Arrays.asList(-1, -2, -3)), -6);
    }
}