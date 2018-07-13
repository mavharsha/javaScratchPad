package com.mavharsha.scratchPad;

public class StringSubSequence {

    public static boolean hasASubSequence(String biggerString, String smallerString, int biggerIndex, int smallerIndex) {

        if(smallerString.length() == smallerIndex) {
            return true;
        }
        if(biggerString.length() == biggerIndex) {
            return false;
        }

        if(biggerString.charAt(biggerIndex) == smallerString.charAt(smallerIndex)) {
            return hasASubSequence(biggerString,  smallerString,  biggerIndex + 1,  smallerIndex + 1);
        }
        return hasASubSequence(biggerString,  smallerString,  biggerIndex + 1,  smallerIndex);
    }

    public static int numberOfSubSequences(String biggerString, String smallerString, int biggerIndex, int smallerIndex) {
        if(smallerString.length() == smallerIndex) {
            return 1;
        }
        if(biggerString.length() == biggerIndex) {
            return 0;
        }

        if(biggerString.charAt(biggerIndex) == smallerString.charAt(smallerIndex)) {
            return numberOfSubSequences(biggerString,  smallerString,  biggerIndex + 1,  smallerIndex + 1) +
                    numberOfSubSequences(biggerString,  smallerString,  biggerIndex + 1,  smallerIndex);
        }
        return numberOfSubSequences(biggerString,  smallerString,  biggerIndex + 1,  smallerIndex);
    }
}
