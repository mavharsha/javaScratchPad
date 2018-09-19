package com.mavharsha.scratchPad;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalToBinaryTest {

    @Test
    public void testShouldReturnBinary() {
        assertTrue(DecimalToBinary.convert(0).equalsIgnoreCase("0b0"));
        assertTrue(DecimalToBinary.convert(2).equalsIgnoreCase("0b10"));
        assertTrue(DecimalToBinary.convert(3).equalsIgnoreCase("0b11"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void expectAnExceptionWhenNumberIsLessThanZero() {
        DecimalToBinary.convert(-1);
        DecimalToBinary.convert(-100);
    }
}