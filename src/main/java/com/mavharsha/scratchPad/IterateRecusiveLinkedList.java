package com.mavharsha.scratchPad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterateRecusiveLinkedList<T extends Comparable> {

    public List iterate(LinkedList<T> linkedList) {
        return iterate(linkedList.getHead(), new ArrayList());
    }

    private List iterate(Node head, List ofValues) {
        if(head == null) {
            return Collections.EMPTY_LIST;
        }
        ofValues.add(head.getValue());
        iterate(head.getNext(), ofValues);
        return ofValues;
    };
}
