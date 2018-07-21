package com.mavharsha.scratchPad;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList<String> linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList<String>("Head");
    }
    /*TODO
    *   ADD tests for all the methods for linked list class
    * */


    @Test
    public void testInsertAtEnd() {
        assertEquals(linkedList.getCOUNT(), 1);
        linkedList.insertAtEnd("one");
        linkedList.insertAtEnd("two");
        linkedList.insertAtEnd("three");
        assertEquals(linkedList.getCOUNT(), 4);
        assertTrue(linkedList.contains("one"));
    }

    @Test
    public void testInsertAtHead() {
        assertEquals(linkedList.getCOUNT(), 1);
        linkedList.insertAtHead("one");
        linkedList.insertAtHead("two");
        linkedList.insertAtHead("three");
        assertEquals(linkedList.getCOUNT(), 4);
        System.out.println(linkedList.traverse());
        assertTrue(linkedList.contains("one"));
    }

    @Test
    public void deleteAtHead() {
        assertEquals(linkedList.getCOUNT(), 1);
        linkedList.insertAtEnd("one");
        linkedList.insertAtEnd("two");
        linkedList.insertAtEnd("three");
        System.out.println(linkedList.traverse());
        linkedList.deleteAtHead();
        System.out.println(linkedList.traverse());
        assertEquals(linkedList.getCOUNT(), 3);
        assertTrue(linkedList.contains("one"));
        assertFalse(linkedList.contains("Head"));
    }

    @Test
    public void deleteAtTail() {
        assertEquals(linkedList.getCOUNT(), 1);
        linkedList.insertAtEnd("one");
        linkedList.insertAtEnd("two");
        linkedList.insertAtEnd("three");
        System.out.println(linkedList.traverse());
        linkedList.deleteAtEnd();
        System.out.println(linkedList.traverse());
        assertEquals(linkedList.getCOUNT(), 3);
        assertTrue(linkedList.contains("one"));
        assertFalse(linkedList.contains("three"));
    }
}