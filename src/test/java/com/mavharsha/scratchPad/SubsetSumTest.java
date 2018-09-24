package com.mavharsha.scratchPad;

import com.mavharsha.scratchPad.recursion.SubsetSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetSumTest {

    int[] set = {1,2,3,4,5,6};
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSetContains() {
        assertTrue(SubsetSum.hasASubsetWhoseSum(set, 4));
        assertTrue(SubsetSum.hasASubsetWhoseSum(set, 14));
        assertTrue(SubsetSum.hasASubsetWhoseSum(set, 15));

        assertFalse(SubsetSum.hasASubsetWhoseSum(set, 22));
    }
}