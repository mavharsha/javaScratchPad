package com.mavharsha.scratchPad;/*
 * You are a professional robber planning to rob houses along a street. Each house has a
 * certain amount of money stashed, the only constraint stopping you from robbing each of
 * them is that adjacent houses have security system connected and it will automatically
 * contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * https://leetcode.com/problems/house-robber/description/
 * */

public class HouseRobber {

    public static int rob(int[] nums) {
        validate(nums);
        return helper(nums, nums.length, 0);
    }

    private static int helper(int[] nums, int numberOfHouses, int currentHouse) {
        if (numberOfHouses == 0) {
            return 0;
        } else if (numberOfHouses == 1) {
            return nums[0];
        } else if (numberOfHouses == 2) {
            return Math.max(nums[0], nums[1]);
        }

        if (currentHouse > (numberOfHouses - 1)) {
            return 0;
        }
        if (currentHouse == (numberOfHouses - 1)) {
            return nums[currentHouse];
        }

        int ifSelected = nums[currentHouse] + helper(nums, numberOfHouses, currentHouse + 2);
        int ifNotSelected = helper(nums, numberOfHouses, currentHouse + 1);
        return Math.max(ifSelected, ifNotSelected);
    }


    private static void validate(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("House value array cannot be null");
        }
    }
}
