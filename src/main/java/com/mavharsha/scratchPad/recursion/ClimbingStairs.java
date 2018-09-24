package com.mavharsha.scratchPad.recursion;


import java.util.HashMap;
import java.util.Map;

/*
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *   number of paths up 100 stairs =  number of paths up 100 stairs when the first leap is 1 step (number of steps left is 99)
 *                                   + number of paths up 100 stairs when the first leap is 2 steps (number of steps left is 98)
 * */
public class ClimbingStairs {

    /*
     * Using double for the store instead of Integer because Integer.MAX_VALUE maxes out at 2147483647.
     * */
    private Map<Integer, Double> store = new HashMap<>();

    public double climbStairs(int numberOfStairs) {
        if (numberOfStairs == 0) {
            return 1;
        }
        if (numberOfStairs < 0) {
            return 0;
        }
        if (store.get(numberOfStairs) != null) {
            return store.get(numberOfStairs);
        }
        double currentMinusOne = climbStairs(numberOfStairs - 1);
        double currentMinusTwo = climbStairs(numberOfStairs - 2);

        store.put(numberOfStairs - 1, currentMinusOne);
        store.put(numberOfStairs - 2, currentMinusTwo);
        store.put(numberOfStairs, currentMinusOne + currentMinusTwo);

        return currentMinusOne + currentMinusTwo;
    }

    /*
     * When you look at the recursive solution, it looks exactly like fibonacii series.
     * */
    public double climbStairsDP(int totalSteps) {
        // corner case:
        if (totalSteps == 0 || totalSteps == 1 || totalSteps == 2) {
            return totalSteps;
        }

        double[] stepsNeeded = new double[totalSteps + 1];
        stepsNeeded[0] = 0;
        stepsNeeded[1] = 1;
        stepsNeeded[2] = 2;
        for (int i = 3; i < totalSteps + 1; i++) {
            stepsNeeded[i] = stepsNeeded[i - 1] + stepsNeeded[i - 2];
        }
        return stepsNeeded[totalSteps];
    }
}
