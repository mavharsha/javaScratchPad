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


    /*
    *
    * Remove duplicates in linked list, without using extra memory(no hashset)
    * */
    public static <T extends Comparable> void removeDuplicatesNoAuxMemory(LinkedList<T> list){
        Node<T> head = list.getHead();

        while(head != null) {
            Node<T> current = head;

            while(current != null) {

                if(current.getNext() != null && head.getValue() == current.getNext().getValue()) {
                    current.setNext(current.getNext().getNext());
                } else {
                    current = current.getNext();
                }
            }
            head = head.getNext();
        }
    }

}
