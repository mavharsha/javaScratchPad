package com.mavharsha.scratchPad;

public class DeleteKthElementFromLast {

    public static <T extends Comparable> Node<T> lastKthElement(LinkedList<T> linkedList, int kThIndex) {
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
    }
}
