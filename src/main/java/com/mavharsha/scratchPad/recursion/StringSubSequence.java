package com.mavharsha.scratchPad.recursion;

public class StringSubSequence {

    public static boolean hasASubSequence(String biggerString, String smallerString, int biggerIndex, int smallerIndex) {
        validateInput(biggerString, smallerString);
        if (smallerString.length() == smallerIndex) {
            return true;
        }
        if (biggerString.length() == biggerIndex) {
            return false;
        }

        if (biggerString.charAt(biggerIndex) == smallerString.charAt(smallerIndex)) {
            return hasASubSequence(biggerString, smallerString, biggerIndex + 1, smallerIndex + 1);
        }
        return hasASubSequence(biggerString, smallerString, biggerIndex + 1, smallerIndex);
    }

    public static int numberOfSubSequences(String biggerString, String smallerString, int biggerIndex, int smallerIndex) {
        if (smallerString.length() == smallerIndex) {
            return 1;
        }
        if (biggerString.length() == biggerIndex) {
            return 0;
        }

        if (biggerString.charAt(biggerIndex) == smallerString.charAt(smallerIndex)) {
            return numberOfSubSequences(biggerString, smallerString, biggerIndex + 1, smallerIndex + 1) +
                    numberOfSubSequences(biggerString, smallerString, biggerIndex + 1, smallerIndex);
        }
        return numberOfSubSequences(biggerString, smallerString, biggerIndex + 1, smallerIndex);
    }

    private static void validateInput(String biggerString, String smallerString) {
        if (biggerString == null || smallerString == null) {
            throw new IllegalArgumentException("Input strings cannot be null.");
        }
    }
}
