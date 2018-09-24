package com.mavharsha.scratchPad.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    Map<Integer, Integer> store = new HashMap<>();
    public int getElementN(int number) {
        validateInputs(number);

        if(store.containsKey(number)) {
            return store.get(number);
        }

        if(number == 1 || number == 0){
            return 1;
        }

        int intermediateMinusTwo = getElementN(number - 2);
        int intermediateMinusOne = getElementN(number - 1);

        store.put(number -1, intermediateMinusOne);
        store.put(number -2, intermediateMinusTwo);
        store.put(number, intermediateMinusOne + intermediateMinusTwo);

        return intermediateMinusOne + intermediateMinusTwo;
    }

    private void validateInputs(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Illegal parameter.");
        }
    }
}
