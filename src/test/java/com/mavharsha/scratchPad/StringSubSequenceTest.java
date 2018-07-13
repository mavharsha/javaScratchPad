package com.mavharsha.scratchPad;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringSubSequenceTest {

    @Test
    public void testIfContainsSubSequence() {
        assertTrue(StringSubSequence.hasASubSequence("abc", "ac", 0, 0));
        assertTrue(StringSubSequence.hasASubSequence("abcdef", "acef", 0, 0));
        assertFalse(StringSubSequence.hasASubSequence("abcdef", "acdfq", 0, 0));
        assertFalse(StringSubSequence.hasASubSequence("abcdef", "acb", 0, 0));
    }

    @Test
    public void testNumberOfSubSequences() {

        assertEquals(1,StringSubSequence.numberOfSubSequences("abc", "ac", 0, 0));
        assertEquals(1,StringSubSequence.numberOfSubSequences("abcdef", "acef", 0, 0));
        assertEquals(2,StringSubSequence.numberOfSubSequences("abcc", "abc", 0, 0));
        assertEquals(3,StringSubSequence.numberOfSubSequences("abcbc", "abc", 0, 0));

        assertEquals(0,StringSubSequence.numberOfSubSequences("abcdef", "acdfq", 0, 0));
        assertEquals(0,StringSubSequence.numberOfSubSequences("abcdef", "acb", 0, 0));
    }
}