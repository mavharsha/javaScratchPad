package com.mavharsha.scratchPad.recursion;

/*
 * Given a set of non-negative numbers, and a value, determine
 * if there exists a subset whose sum would equal to given value.
 * */

public class SubsetSum {

    public static boolean hasASubsetWhoseSum(int[] set, int number) {
        validateInput(set);
        return recursiveFunction(set, number, set.length);
    }

    private static boolean recursiveFunction(int[] set, int sum, int length) {
        if (sum == 0) {
            return true;
        } else if (sum < 0) {
            return false;
        }

        // if the we have reached to start of the array and the sum is not zero, lost cause. Return false.
        if (length == 0 && sum != 0) {
            return false;
        }

        // if the current element is greater than sum, ignore it.
        if (set[length - 1] > sum) {
            return recursiveFunction(set, sum, length - 1);
        }

        // consider a subset with current element and also a subset without current subset.
        return recursiveFunction(set, sum - set[length - 1], length - 1) ||
                recursiveFunction(set, sum, length - 1);
    }

    private static void validateInput(int[] set) {
        if (set == null) {
            throw new IllegalArgumentException("");
        }
    }
}
