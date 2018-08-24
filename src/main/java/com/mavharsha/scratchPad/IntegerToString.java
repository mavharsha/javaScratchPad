package com.mavharsha.scratchPad;


import java.util.HashMap;
import java.util.Map;

/*
*
* Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.
*
* URL: https://leetcode.com/problems/integer-to-english-words/description/
* */
public class IntegerToString {

    private final static int BILLION = 1_000_000_000;
    private final static int MILLION = 1_000_000;
    private final static int THOUSAND = 1_000;
    private final static int HUNDRED = 100;

    private final static Map<Integer, String> integerStringMap = new HashMap<>();
    static {
        integerStringMap.put(0, "Zero");
        integerStringMap.put(1, "One");
        integerStringMap.put(2, "Two");
        integerStringMap.put(3, "Three");
        integerStringMap.put(4, "Four");
        integerStringMap.put(5, "Five");
        integerStringMap.put(6, "Six");
        integerStringMap.put(7, "Seven");
        integerStringMap.put(8, "Eight");
        integerStringMap.put(9, "Nine");
        integerStringMap.put(10, "Ten");
        integerStringMap.put(11, "Eleven");
        integerStringMap.put(12, "Twelve");
        integerStringMap.put(13, "Thirteen");
        integerStringMap.put(14, "Fourteen");
        integerStringMap.put(15, "Fifteen");
        integerStringMap.put(16, "Sixteen");
        integerStringMap.put(17, "Seventeen");
        integerStringMap.put(18, "Eighteen");
        integerStringMap.put(19, "Nineteen");
        integerStringMap.put(20, "Twenty");
        integerStringMap.put(30, "Thirty");
        integerStringMap.put(40, "Forty");
        integerStringMap.put(50, "Fifty");
        integerStringMap.put(60, "Sixty");
        integerStringMap.put(70, "Seventy");
        integerStringMap.put(80, "Eighty");
        integerStringMap.put(90, "Ninety");
        integerStringMap.put(100, "Hundred");
    }

    public static String convertToString(int number) {

        StringBuilder builder = new StringBuilder();
        if(number > BILLION) {
            int moreThan = number / BILLION;
            builder.append(convert(moreThan) + " billion");
            number = number % BILLION;
        }


        if(number > MILLION) {
            int moreThan = number / MILLION;
            builder.append(" " + convert(moreThan) + " million");
            number = number % MILLION;
        }

        if(number > THOUSAND) {
            int moreThan = number / THOUSAND;
            builder.append(" " + convert(moreThan) + " thousand");
            number = number % THOUSAND;
        }

        if(number > 0) {
            builder.append(convert(number));
        }

        return builder.toString();
    }

    private static String convert(int extra) {

        StringBuilder builder = new StringBuilder();

        if(extra >= 100) {
            int hundreds = extra / 100;
            builder.append(" " + integerStringMap.get(hundreds) + " hundred");
            extra = extra % 100;
        }

        if(extra > 0) {
            if(extra <= 20) {
                builder.append(" " + integerStringMap.get(extra));
            }else {


                int firstNumber = extra / 10;
                builder.append(" " + integerStringMap.get(firstNumber * 10));

                extra = extra % 10;
                if(extra > 0) {
                    builder.append(" " + integerStringMap.get(extra));
                }
            }
        }
        return builder.toString();
    }
}
