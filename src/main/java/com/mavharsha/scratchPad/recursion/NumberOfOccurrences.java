package com.mavharsha.scratchPad.recursion;

public class NumberOfOccurrences {

    public static int findIndexOfOccurrences(int[] array, int key, int index) {
        validateInput(array);

        if (array.length == index) {
            return -1;
        }
        if (array[index] == key) {
            return index;
        }
        return findIndexOfOccurrences(array, key, index + 1);
    }

    public static int findNumberOfOccurrences(int[] array, int key, int index) {
        validateInput(array);

        if (array.length == index) {
            return 0;
        }
        if (array[index] == key) {
            return 1 + findNumberOfOccurrences(array, key, index + 1);
        }
        return findNumberOfOccurrences(array, key, index + 1);
    }

    private static void validateInput(int[] inputArray) {
        if (inputArray == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
    }

}
