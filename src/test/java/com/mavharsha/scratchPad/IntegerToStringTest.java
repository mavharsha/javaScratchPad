package com.mavharsha.scratchPad;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToStringTest {

    @Test
    public void testConvertToString() {
        System.out.println("99_999_999: " + IntegerToString.convertToString(99_999_999));
        assertTrue(IntegerToString.convertToString(99_999_999).trim().equalsIgnoreCase("Ninety Nine million  Nine hundred Ninety Nine thousand Nine hundred Ninety Nine"));


        System.out.println("100: " + IntegerToString.convertToString(100));
        assertTrue(IntegerToString.convertToString(100).trim().equalsIgnoreCase("one hundred"));


        System.out.println("212: " + IntegerToString.convertToString(212));
        assertTrue(IntegerToString.convertToString(212).trim().equalsIgnoreCase("Two hundred twelve"));
    }
}