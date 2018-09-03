package com.mavharsha.scratchPad;

public class DeleteKthElementFromLast {

    /*public static <T extends Comparable> Node<T> lastKthElement(LinkedList<T> linkedList, int kThIndex) {
        Integer currentIndex = new Integer(0);
        return helper(linkedList.getHead(), currentIndex, kThIndex);
    }

    private static <T extends Comparable> Node<T> helper(Node<T> head, Integer currentIndex, int kThIndex) {

        if(head == null) {
            return null;
        }
        Node<T> returnableNode = helper(head.getNext(), currentIndex, kThIndex);
        currentIndex = new Integer(currentIndex.intValue() + 1);
        if(currentIndex == kThIndex) {
            return head;
        }
        return head;
    }*/


    /*
    *   1 - 2 - 3 - 4 - 5 - 6
    *   6   5   4   3   2   1
    *
    *   k = 2
    *   move forward two times
    *   current is at 2
    *   and follower is at 1
    *
    * */

    public static <T extends Comparable> Node<T> lastKthElement(LinkedList<T> linkedList, int kThIndex){

        // validations to make sure head is not null
        if(linkedList.getHead() == null) { throw new IllegalArgumentException("Head cannot be null");}

        Node<T> currentPointer = linkedList.getHead();
        Node<T> followingPointer = linkedList.getHead();

        int index = 1;
        while(index < kThIndex) {
            currentPointer = currentPointer.getNext();
            index++;
        }

        while(currentPointer.getNext() != null) {
            currentPointer = currentPointer.getNext();
            followingPointer = followingPointer.getNext();
        }
        return followingPointer;
    }
}
