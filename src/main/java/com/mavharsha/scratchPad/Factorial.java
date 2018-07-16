package com.mavharsha.scratchPad;

import java.util.HashMap;
import java.util.Map;

public class Factorial {

    private Map<Integer, Integer> memomization = new HashMap<>();

    public int factorialIterative(int number) {
        validateInput(number);
        int tempFactorial = 1;
        while(number >=1) {
            tempFactorial = tempFactorial * number;
            number--;
        }
        return tempFactorial;
    }


    public int factorialRecursive(int number){
        validateInput(number);
        if(memomization.containsKey(number)){
            return memomization.get(number);
        }
        if(number == 1 || number == 0) {
            return 1;
        }
        Integer value = number * factorialRecursive(number -1);
        memomization.put(number, value);
        return memomization.get(number);
    }


    private void validateInput(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Illegal parameter.");
        }
    }
}
