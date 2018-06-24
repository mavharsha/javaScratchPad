package com.mavharsha.scratchPad;

import org.junit.Test;

import java.util.function.*;

public class LambdaTest {

    private static final String testString = "Test String";

    /* Takes a parameter and returns a boolean
    *  Acts like a filter in javascript */
    @Test
    public void testPredicate() {
        Predicate<String> isLengthGreaterThan10 = (string) -> string.length() > 10;
        System.out.println(isLengthGreaterThan10.test(testString));
    }

    /* A function that consumes a parameter */
    @Test
    public void testConsumer() {
        Consumer<String> printLength = (string) -> System.out.println(string.length());
        printLength.accept(testString);
    }

    /* A function takes in a parameter and returns a value
    *  Acts like a map in javascript */
    @Test
    public void testFunction(){
        Function<String, String> toLowerCase = (string) -> string.toLowerCase();
        System.out.println(toLowerCase.apply(testString));
    }

    /* Binary operator takes in two parameters and returns a values of type specified
    *  The formal parameters of the lambda are inferred from the lambda return type*/
    @Test
    public void testBinaryOperator(){
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(1,2));
    }

    /* UnaryOperator is a type lambda where the input type and the return type are the same.
    *  It is a specialized version of function */
    @Test
    public void testUnaryOperator() {
        UnaryOperator<String> printUpper = (string) -> string.toUpperCase();
        System.out.println(printUpper.apply(testString));
    }

    /* Testing custom sum interface */
    @Test
    public void testCustomSumInterface() {
        Sum<Integer, Integer, Integer> sum = (first, second) -> first + second;
        System.out.println(sum.sum(10, 12));
    }

    /* Testing custom call out interface */
    @Test
    public void testCustomCallOutInterface() {
        CallOutInterface<String> callOutInterface = (input) -> "Calling out **: " + input + " : ***";
        System.out.println(callOutInterface.callOut(testString));
    }
}
