package com.mavharsha.scratchPad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class RotateArrayTest {

    private RotateArray rotateArray;

    @Before
    public void setUp() throws Exception {
        rotateArray = new RotateArray();
    }

    @After
    public void tearDown() throws Exception {
        rotateArray = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRotateArrayRightThrowsExceptionWhenArrayIsNull() {
        rotateArray.rotateRight(null, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRotateArrayRightThrowsExceptionWhenRotateByIsLessThanZero() {
        rotateArray.rotateRight(new int[]{1, 2, 3}, -1);
        rotateArray.rotateRight(new int[]{1, 2, 3}, -4);
    }

    @Test
    public void shouldReturnSameAsInputArrayWhenRotateByIsSameAsInputArraySize() {
        assertArrayEquals(rotateArray.rotateRight(new int[]{1, 2, 3}, 3), new int[]{1, 2, 3});
        assertArrayEquals(rotateArray.rotateRight(new int[]{1}, 1), new int[]{1});
        // false case
        assertThat(rotateArray.rotateRight(new int[]{1}, 1), is(not(new int[]{1, 2})));
    }

    @Test
    public void shouldReturnRotatedArray() {
        assertArrayEquals(rotateArray.rotateRight(new int[]{1, 2, 3}, 2), new int[]{2, 3, 1});
        assertArrayEquals(rotateArray.rotateRight(new int[]{1, 2, 3, 4, 5}, 6), new int[]{5, 1, 2, 3, 4});
    }
}