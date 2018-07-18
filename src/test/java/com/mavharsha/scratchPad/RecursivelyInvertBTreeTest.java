package com.mavharsha.scratchPad;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursivelyInvertBTreeTest {


    public static final String rootValue = "I'm Groot!";
    private BinaryNode root;

    @Test
    public void testInvertBinaryTreeWithJustOneNode() {
        root = new BinaryNode(rootValue);
        RecursivelyInvertBTree.invert(root);
        assertEquals(root.getValue(), rootValue);
        assertNull(root.getLeft());
        assertNull(root.getRight());
    }

    @Test
    public void testInvertBinaryTreeWithMultipleNodes() {
        BinarySearchTree<Integer> anotherBST = new BinarySearchTree<Integer>(5);
        anotherBST.insert(3);
        anotherBST.insert(4);
        anotherBST.insert(2);
        anotherBST.insert(10);

        assertEquals(anotherBST.getRoot().getLeft().getValue(), new Integer(3));
        assertEquals(anotherBST.getRoot().getRight().getValue(), new Integer(10));

        BinaryNode<Integer> firstLeftChild = anotherBST.getRoot().getLeft();
        assertEquals(firstLeftChild.getLeft().getValue(), new Integer(2));
        assertEquals(firstLeftChild.getRight().getValue(), new Integer(4));
        System.out.println("** Before invert **");
        System.out.println(anotherBST.preOrderTraversal());

        RecursivelyInvertBTree.invert(anotherBST.getRoot());
        System.out.println("** After invert **");

        System.out.println(anotherBST.preOrderTraversal());

        assertEquals(anotherBST.getRoot().getLeft().getValue(), new Integer(10));
        assertEquals(anotherBST.getRoot().getRight().getValue(), new Integer(3));

        firstLeftChild = anotherBST.getRoot().getRight();
        assertEquals(firstLeftChild.getLeft().getValue(), new Integer(4));
        assertEquals(firstLeftChild.getRight().getValue(), new Integer(2));
    }
}