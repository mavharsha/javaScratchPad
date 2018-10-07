package com.mavharsha.scratchPad.java.enums;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class OperationTest {

    @Test
    public void testShouldReturnCorrectValues() {
        assertThat(Operation.PLUS.apply(1,1)).as("Addition of one and one is two").isEqualTo(2);
        assertThat(Operation.MINUS.apply(1,2)).as("Subtraction of one and two is minus one").isEqualTo(-1);

        assertThat(Operation.TIMES.apply(1,2)).as("Multiplication of one and two is two").isEqualTo(2);
        assertThat(Operation.DIVIDE.apply(5,2)).as("Division of five and two is two and half").isEqualTo(2.5);
        assertThat(Operation.MODULO.apply(11,5)).as("Mod five of eleven is one").isEqualTo(1);
    }


    @Test
    public void testShouldReturnCorrectSymbols() {
        // Positive Cases
        assertThat(Operation.PLUS.getSymbol()).as("Returns addition symbol *").isEqualToIgnoringCase("+");
        assertThat(Operation.MINUS.getSymbol()).as("Returns addition symbol *").isEqualToIgnoringCase("-");
        assertThat(Operation.TIMES.getSymbol()).as("Returns addition symbol *").isEqualToIgnoringCase("*");
        assertThat(Operation.DIVIDE.getSymbol()).as("Returns addition symbol *").isEqualToIgnoringCase("/");
        assertThat(Operation.MODULO.getSymbol()).as("Returns addition symbol *").isEqualToIgnoringCase("%");

        // Negative Cases
        assertThat(Operation.PLUS.getSymbol()).as("Returns addition symbol +").isNotEqualToIgnoringCase("*");
        assertThat(Operation.MINUS.getSymbol()).as("Returns addition symbol -").isNotEqualToIgnoringCase("/");
        assertThat(Operation.TIMES.getSymbol()).as("Returns addition symbol *").isNotEqualToIgnoringCase("+");
        assertThat(Operation.DIVIDE.getSymbol()).as("Returns addition symbol /").isNotEqualToIgnoringCase("+");
        assertThat(Operation.MODULO.getSymbol()).as("Returns addition symbol %").isNotEqualToIgnoringCase("+");
    }
}