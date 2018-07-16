package com.mavharsha.scratchPad;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryNodeTest {

    @Test
    public void testBinaryNode() {
        BinaryNode<String> root = new BinaryNode<>("root");
        assertNull(root.getParent());
        assertNull(root.getLeft());
        assertNull(root.getRight());
        assertNotNull(root.getValue());
        assertTrue(root.getValue().equalsIgnoreCase("root"));
    }


    @Test
    public void testBinaryNodesChildren() {
        BinaryNode<String> leftChild = new BinaryNode<>("left Child");
        BinaryNode<String> rightChild = new BinaryNode<>("right Child");
        BinaryNode<String> root = new BinaryNode<>(null, leftChild, rightChild, "root");
        leftChild.setParent(root);
        rightChild.setParent(root);
        assertNull(root.getParent());
        assertNotNull(root.getLeft());
        assertNotNull(root.getRight());
        assertNotNull(root.getValue());
        assertTrue(root.getValue().equalsIgnoreCase("root"));
        assertTrue(root.getLeft().getValue().equalsIgnoreCase("left child"));
        assertTrue(root.getRight().getValue().equalsIgnoreCase("right child"));
    }
}