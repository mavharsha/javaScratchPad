package com.mavharsha.scratchPad;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class StringsAreSpecialTest {

    @Test
    public void testTwoStringsPointToTheSameReference() {
        String one = "hello";
        String tou = "hello";
        assertTrue(one == tou);

        String three = new String("hello");
        assertTrue(one.equalsIgnoreCase(three)  );
    }
}
