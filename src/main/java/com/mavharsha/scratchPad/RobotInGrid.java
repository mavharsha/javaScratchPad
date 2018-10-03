package com.mavharsha.scratchPad;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/unique-paths/description/
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach
 * the bottom-right corner of the grid (marked 'Finish' in the diagram below). How many possible
 * unique paths are there?
 *
 * m and n will be at most 100
 * */

public class RobotInGrid {

    public int numberOfUniquePaths(int[][] grid) {
        if (grid == null) {
            throw new IllegalArgumentException("Grid cannot be null.");
        }

        int[][] store = new int[grid.length][grid[0].length];
        for (int i = 0; i < store.length; i++) {
            Arrays.fill(store[i], -1);
        }
        
        return helper(grid, store, grid.length - 1, grid[0].length - 1);
    }


    private int helper(int[][] grid, int[][] store, int row, int column) {
        if (row < 0 || column < 0) {
            return 0;
        }

        if (row == 0 && column == 0) {
            store[row][column] = 0;
            return 1;
        }

        if (store[row][column] != -1) {
            return store[row][column];
        }

        store[row][column] = helper(grid, store, row - 1, column) + helper(grid, store, row, column - 1);
        return store[row][column];
    }
}
