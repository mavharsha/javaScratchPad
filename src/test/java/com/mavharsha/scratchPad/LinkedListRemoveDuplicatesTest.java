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
        linkedList = null;
    }


    @Test
    public void removeDuplicatesUsingHashSet() {
        assertEquals("Assert Length of the linked list",linkedList.getCOUNT(), 10);
        LinkedList<String> deDupedList = LinkedListRemoveDuplicates.removeDuplicates(linkedList);
        assertEquals("Assert Length of the linked list after deleting duplicates", deDupedList.getCOUNT(), 8);
    }

    @Test
    public void removeDuplicatesWithoutAuxMemory() {
        assertEquals("Assert Length of the linked list",linkedList.getCOUNT(), 10);
        LinkedListRemoveDuplicates.removeDuplicatesNoAuxMemory(linkedList);
        assertEquals("Assert Length of the linked list after deleting duplicates", linkedList.getCOUNT(), 8);
    }
}