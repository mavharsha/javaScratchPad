package com.mavharsha.scratchPad;

import java.util.HashSet;
import java.util.Set;

/*
*
* Remove duplicates from an unsorted list
* */
public class LinkedListRemoveDuplicates {


    /*
    *
    *  a -> b -> c -> d -> e -> f -> g -> f -> h --|
    *
    *  ===> a -> b -> c -> d -> e -> f -> g -> h --|
    *
    * */

    public static <T extends Comparable> LinkedList removeDuplicates(LinkedList<T> list){
        Node<T> head = list.getHead();
        Set<T> set = new HashSet<T>();
        Node previous = null;
        while(head != null) {
            if(set.contains(head.getValue())) {
                previous.setNext(head.getNext());
            } else {
                set.add(head.getValue());
                previous = head;
            }
            head = head.getNext();
        }
        return list;
    }

}
