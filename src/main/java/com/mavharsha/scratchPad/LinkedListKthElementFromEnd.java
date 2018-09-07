package com.mavharsha.scratchPad;

public class LinkedListKthElementFromEnd {

    String value;
    public  <T extends Comparable> Node<T> kThElementFromEnd(Node<T> head, int nodeTobeFoundIndex) {
        if(!(nodeTobeFoundIndex > 0)) {
            throw new IllegalArgumentException("The index should be greater than 0");
        }

        Node<T> nodeToBeFound = null;
        int index = helper(head, nodeTobeFoundIndex, nodeToBeFound);
        return nodeToBeFound;
    }

    private <T extends Comparable> int helper(Node<T> head, int nodeToBeFoundIndex, Node<T> nodeToBeFound) {
        if(head == null) {
            return 0;
        }
        int index = helper(head.getNext(), nodeToBeFoundIndex, nodeToBeFound) + 1;

        if(index == nodeToBeFoundIndex) {
            nodeToBeFound = head;
        }
        return -1;
    }
}
