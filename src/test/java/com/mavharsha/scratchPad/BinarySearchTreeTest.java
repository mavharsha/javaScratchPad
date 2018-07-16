package com.mavharsha.scratchPad;

import org.junit.Before;
import org.junit.Test;

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
        System.out.println(binarySearchTree.preOrderTraversal());
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
}