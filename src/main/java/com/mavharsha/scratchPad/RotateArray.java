package com.mavharsha.scratchPad;

public class RotateArray {


    public int[] rotateRight(int[] inputArray, int rotateBy) {
        if (inputArray == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        } else if (rotateBy < 0) {
            throw new IllegalArgumentException("Rotate by parameter cannot be less than 0");
        }
        int inputLength = inputArray.length;
        int[] auxArray = new int[inputLength];

        if (rotateBy > inputLength) {
            rotateBy = rotateBy % inputLength;
        }

        if (inputLength == rotateBy) {
            return inputArray.clone();
        }

        for (int index = 0; index < inputLength; index++) {
            auxArray[rotateBy] = inputArray[index];
            rotateBy++;
            if (rotateBy >= inputLength) {
                rotateBy = 0;
            }
        }
        return auxArray;
    }
}
