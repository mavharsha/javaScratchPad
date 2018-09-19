package com.mavharsha.scratchPad;

public class DecimalToBinary {
    private static final String BINARY_PREFIX = "0b";

    public static String convert(int number) {
        String binary = "";
        validate(number);
        int remainder;
        if(number == 0) {
            binary += "0";
        }
        while(number > 0) {
            remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }
        return BINARY_PREFIX + binary;
    }

    private static void validate(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Number cannot be less than 10");
        }
    }
}
