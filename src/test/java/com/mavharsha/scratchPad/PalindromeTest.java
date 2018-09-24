package com.mavharsha.scratchPad;

import com.mavharsha.scratchPad.recursion.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome;
    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        palindrome = null;
    }

    @Test
    public void testIsPalindromWithSingleChar() {
        assertTrue(palindrome.isPalindrome("A"));
        assertTrue(palindrome.isPalindrome("B"));
    }

    @Test
    public void testIsPalindromeWithMoreThanOneCharInInputString() {
        assertTrue(palindrome.isPalindrome("aa"));
        assertTrue(palindrome.isPalindrome("rotor"));

        assertFalse(palindrome.isPalindrome("ab"));
        assertFalse(palindrome.isPalindrome("motor"));
    }
}