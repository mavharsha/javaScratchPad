package com.mavharsha.scratchPad;

import java.util.List;

public class SumOfList {

    public int sum(List<Integer> numbers) {
        return sum(numbers, 0);
    }

    private int sum(List<Integer> list, int index) {
        if(index == list.size()) {
            return 0;
        }
        return list.get(index) + sum(list, index + 1);
    }
}
