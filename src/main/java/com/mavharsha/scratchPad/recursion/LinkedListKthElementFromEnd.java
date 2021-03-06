package com.mavharsha.scratchPad.recursion;

import com.mavharsha.scratchPad.Node;

public class LinkedListKthElementFromEnd {

    public <T extends Comparable> Node<T> kThElementFromEnd(Node<T> head, int nodeTobeFoundIndex) {
        validateInput(nodeTobeFoundIndex);

        Node<T> nodeToBeFound = null;
        int index = helper(head, nodeTobeFoundIndex, nodeToBeFound);
        return nodeToBeFound;
    }

    private <T extends Comparable> int helper(Node<T> head, int nodeToBeFoundIndex, Node<T> nodeToBeFound) {
        if (head == null) {
            return 0;
        }
        int index = helper(head.getNext(), nodeToBeFoundIndex, nodeToBeFound) + 1;

        if (index == nodeToBeFoundIndex) {
            nodeToBeFound = head;
        }
        return -1;
    }

    private void validateInput(int nodeTobeFoundIndex) {
        if (!(nodeTobeFoundIndex > 0)) {
            throw new IllegalArgumentException("The index should be greater than 0");
        }
    }
}
