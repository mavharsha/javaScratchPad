package com.mavharsha.scratchPad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotInGridTest {

    private RobotInGrid robotInGrid;

    @Before
    public void setUp() throws Exception {
        robotInGrid = new RobotInGrid();
    }

    @After
    public void tearDown() throws Exception {
        robotInGrid = null;
    }

    @Test
    public void testForOneByOneGrid() {
        int[][] grid = new int[][]{{0}};
        assertEquals(robotInGrid.numberOfUniquePaths(grid), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNullGridIsPassed() {
        robotInGrid.numberOfUniquePaths(null);
    }


    @Test
    public void shouldReturnUniquePathsWithValidGrid() {
        int[][] grid = new int[][]{{0, 0}};
        assertEquals(robotInGrid.numberOfUniquePaths(grid), 1);
        grid = new int[][]{{0}, {0}};
        assertEquals(robotInGrid.numberOfUniquePaths(grid), 1);
        grid = new int[][]{{0, 0}, {0, 0}};
        assertEquals(robotInGrid.numberOfUniquePaths(grid), 2);
        grid = new int[][]{{0, 0, 0}, {0, 0, 0}};
        assertEquals(robotInGrid.numberOfUniquePaths(grid), 3);
        grid = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertEquals(robotInGrid.numberOfUniquePaths(grid), 28);
    }
}