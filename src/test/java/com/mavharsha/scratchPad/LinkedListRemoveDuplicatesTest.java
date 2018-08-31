package com.mavharsha.scratchPad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListRemoveDuplicatesTest {

    private LinkedList<String> linkedList;
    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList<String>("I am GROOT!");
        linkedList.insertAtEnd("b");
        linkedList.insertAtEnd("b");
        linkedList.insertAtEnd("c");
        linkedList.insertAtEnd("d");
        linkedList.insertAtEnd("e");
        linkedList.insertAtEnd("f");
        linkedList.insertAtEnd("g");
        linkedList.insertAtEnd("g");
        linkedList.insertAtEnd("h");
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void removeDuplicates() {
        assertEquals("Assert Length of the linked list",linkedList.getCOUNT(), 10);
        LinkedList<String> deDupedList = LinkedListRemoveDuplicates.removeDuplicates(linkedList);
        assertEquals("Assert Length of the linked list after deleting duplicates", deDupedList.getCOUNT(), 8);
    }
}