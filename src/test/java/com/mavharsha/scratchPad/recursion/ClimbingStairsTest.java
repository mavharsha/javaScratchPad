package com.mavharsha.scratchPad.recursion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {


    private ClimbingStairs climbingStairs;

    @Before
    public void setUp() throws Exception {
        climbingStairs = new ClimbingStairs();
    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void testNumberWayToClimbZeroStepsShouldReturnOne() {
        assertEquals(climbingStairs.climbStairs(0), 1, 0D);
    }

    @Test
    public void testNumberOfWaysToClimbOneSteppedStairShouldReturnOne() {
        assertEquals(climbingStairs.climbStairs(1), 1, 0D);
    }


    @Test
    public void testNumberOfWaysToClimbMoreThanOneStep() {
        assertEquals(climbingStairs.climbStairs(443), 2.760751194989718E92, 0D);
        assertEquals(climbingStairs.climbStairs(672), 1.9915760092189344E140, 0D);
    }


    @Test
    public void testNumberOfWaysToClimbMoreThanOneStepDP() {
        System.out.println(Integer.MAX_VALUE);
        assertEquals(climbingStairs.climbStairsDP(443), 2.760751194989718E92, 0D);
        assertEquals(climbingStairs.climbStairsDP(672), 1.9915760092189344E140, 0D);
    }
}