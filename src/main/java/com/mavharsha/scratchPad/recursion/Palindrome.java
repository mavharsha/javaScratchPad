package com.mavharsha.scratchPad.recursion;

public class Palindrome {

    public boolean isPalindrome(String input) {
        validateInput(input);
        return helper(input, 0, input.length() - 1);
    }

    private boolean helper(String input, int beginIndex, int endIndex) {

        if (beginIndex >= endIndex) {
            return true;
        }

        if (input.charAt(beginIndex) == input.charAt(endIndex)) {
            return helper(input, beginIndex + 1, endIndex - 1);
        }
        return false;
    }

    private void validateInput(String input) {
        if (input == null) {
            throw new IllegalArgumentException("The input string cannot be null.");
        }
    }
}
