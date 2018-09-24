package com.mavharsha.scratchPad;

import com.mavharsha.scratchPad.recursion.NumberOfOccurrences;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestNumberOfOccurrences {

    @Test
    public void testIndexOfOccurrences() {
        System.out.println(NumberOfOccurrences.findIndexOfOccurrences(new int[] {1,2,3}, 3, 0));
        assertEquals(2, NumberOfOccurrences.findIndexOfOccurrences(new int[] {1,2,3}, 3, 0));

        assertEquals(-1, NumberOfOccurrences.findIndexOfOccurrences(new int[] { 1, 2, 3, 4, 5, 6, 7}, 9, 0));
    }

    @Test
    public void testNumberOfOccurrences() {
        assertEquals(1, NumberOfOccurrences.findNumberOfOccurrences(new int[] {1,2,3}, 3, 0));
        assertEquals(3, NumberOfOccurrences.findNumberOfOccurrences(new int[] { 1, 2, 3, 4, 5, 6, 7, 3, 4, 3}, 3, 0));
        assertEquals(0, NumberOfOccurrences.findNumberOfOccurrences(new int[] { 1, 2, 3, 4, 5, 6, 7}, 9, 0));
    }
}
