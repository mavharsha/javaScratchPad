package com.mavharsha.scratchPad;

import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinaryNode<String> root;
    BinarySearchTree<String> binarySearchTree;
    private final static String rootText = "I'm Groot!";
    @Before
    public void setUp() throws Exception {
        this.root = root = new BinaryNode<>(rootText);
        this.binarySearchTree = new BinarySearchTree<String>(root);
    }

    @Test
    public void testRootShouldNotBeNull() {
        assertNotNull(binarySearchTree.getRoot());
        assertNull(binarySearchTree.getRoot().getLeft());
        assertNull(binarySearchTree.getRoot().getRight());
        assertTrue(binarySearchTree.getRoot().getValue() instanceof String);
        assertTrue(binarySearchTree.getRoot().getValue().equalsIgnoreCase(rootText));
    }

    @Test
    public void testTreeInsertion() {
    }

    @Test
    public void testPreOrderTraversal() {
        System.out.println(binarySearchTree.preOrderTraversal());
        assertTrue(binarySearchTree.preOrderTraversal().size() == 1);
        binarySearchTree.insert("WhatsUp?");
        binarySearchTree.insert("Test");
        //System.out.println(binarySearchTree.preOrderTraversal());
    }

    @Test
    public void testPreOrderTraversalAnother() {
        BinarySearchTree<Integer> anotherBST = new BinarySearchTree<Integer>(5);
        anotherBST.insert(4);
        anotherBST.insert(3);
        anotherBST.insert(2);
        anotherBST.insert(10);
        System.out.println(anotherBST.preOrderTraversal());

    }


    @Test
    public void testInOrderTraversal() {
        List<String> list = Arrays.asList("First", "Second", "Fourth", "Third");
        binarySearchTree.getRoot().setValue("First");
        binarySearchTree.insert("Second");
        binarySearchTree.insert("Third");
        binarySearchTree.insert("Fourth");
        //System.out.println(binarySearchTree.levelOrderTraversal());
        List<String> traversedList = binarySearchTree.levelOrderTraversal();
        for (int index = 0; index < list.size(); index++) {
            assertTrue(list.get(index).equalsIgnoreCase(traversedList.get(index)));
        }
    }


    @Test
    public void anotherLevelOrderTest() {
        List<Integer> expectedList = Arrays.asList(new Integer(5), new Integer(4), new Integer(10), new Integer(3), new Integer(2));
        BinarySearchTree<Integer> anotherBST = new BinarySearchTree<Integer>(5);
        anotherBST.insert(4);
        anotherBST.insert(3);
        anotherBST.insert(2);
        anotherBST.insert(10);
        List<Integer> traversedList = anotherBST.levelOrderTraversal();
        for (int index = 0; index < expectedList.size(); index++) {
            assertTrue(expectedList.get(index).equals(traversedList.get(index)));
        }
    }
}