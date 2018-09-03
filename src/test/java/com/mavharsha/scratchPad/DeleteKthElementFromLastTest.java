package com.mavharsha.scratchPad;

import com.mavharsha.scratchPad.data.LinkedListDataGenerator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteKthElementFromLastTest {


    LinkedList<String> listOfStrings;
    @Before
    public void setUp() throws Exception {
        listOfStrings = LinkedListDataGenerator.getListOfStrings();
    }

    @After
    public void tearDown() throws Exception {
        listOfStrings = null;
    }

    @Test
    public void testDeleteKthfromLast() {
        assertEquals(listOfStrings.getCOUNT(), 8);
        System.out.println(listOfStrings.traverse());
        Node<String> returnedNode = DeleteKthElementFromLast.lastKthElement(listOfStrings, 1);
        assertEquals(returnedNode.getValue(), "h");
    }
}