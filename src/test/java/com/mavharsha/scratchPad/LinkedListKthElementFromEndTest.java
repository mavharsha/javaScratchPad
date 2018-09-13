package com.mavharsha.scratchPad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListKthElementFromEndTest {

    private LinkedList<String> linkedList;
    private LinkedListKthElementFromEnd kTheElementFromEnd;
    @Before
    public void setUp() throws Exception {
        kTheElementFromEnd = new LinkedListKthElementFromEnd();
        linkedList = new LinkedList<String>("I am GROOT!");
        linkedList.insertAtEnd("b");
        linkedList.insertAtEnd("c");
        linkedList.insertAtEnd("d");
        linkedList.insertAtEnd("e");
        linkedList.insertAtEnd("f");
        linkedList.insertAtEnd("g");
        linkedList.insertAtEnd("h");
    }

    @After
    public void tearDown() throws Exception {
        linkedList = null;
        kTheElementFromEnd = null;
    }

    @Test
    public void testKthElementFromEnd() {
        Node<String> kThNode = kTheElementFromEnd.kThElementFromEnd(linkedList.getHead(), 4);
        if(kThNode != null) {
            assertEquals(kThNode.getValue(), "e");
        }
    }
}