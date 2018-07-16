package com.mavharsha.scratchPad;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterateRecusiveLinkedListTest {

    private LinkedList<String> linkedList;
    private IterateRecusiveLinkedList<String> iterateRecusive;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList("I'm Groot");
        iterateRecusive = new IterateRecusiveLinkedList();
    }

    @Test
    public void testListIterateRecusive() {
        assertEquals(iterateRecusive.iterate(linkedList).size(), 1);
        linkedList.insertAtEnd("I'm second");
        System.out.println(linkedList.traverse());
        assertEquals(iterateRecusive.iterate(linkedList).size(), 2);
        linkedList.insertAtEnd("I'm third");
        System.out.println(linkedList.traverse());
        assertEquals(iterateRecusive.iterate(linkedList).size(), 3);
        linkedList.insertAtEnd("I'm fourth");
        linkedList.insertAtEnd("I'm fifth");
        System.out.println(linkedList.traverse());
        assertEquals(iterateRecusive.iterate(linkedList).size(), 5);
    }
}