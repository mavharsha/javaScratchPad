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

    public static String covertRecursively(int number) {
        validate(number);
        return BINARY_PREFIX + helper(number);
    }

    private static String helper(int number) {
        if(number == 0) {
            return "0";
        }
        if(number == 1) {
            return "1";
        }
        String binary = "";
        int remainder = number % 2;
        binary = remainder + binary;
        number = number / 2;
        return helper(number) + binary;
    }

    private static void validate(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Number cannot be less than 10");
        }
    }
}
