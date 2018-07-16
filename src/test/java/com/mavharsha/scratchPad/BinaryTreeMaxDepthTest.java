package com.mavharsha.scratchPad;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeMaxDepthTest {

    private BinaryTreeMaxDepth binaryTreeMaxDepth;
    private BinaryNode<String> root;

    @Before
    public void setUp() throws Exception {
        binaryTreeMaxDepth = new BinaryTreeMaxDepth();
        root = new BinaryNode("I'm Groot!");
    }

    @Test
    public void testSingleNodeTree() {
        assertEquals(binaryTreeMaxDepth.getHeight(root), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRootNodeNullException() {
        root = null;
        binaryTreeMaxDepth.getHeight(root);
    }

    @Test
    public void testHeightOfBtree() {
        BinaryNode<String> firstLeft = new BinaryNode<>("FirstLeft");
        BinaryNode<String> firstRight = new BinaryNode<>("FirstLeft");
        root.setLeft(firstLeft);
        root.setRight(firstRight);
        BinaryNode<String> secondLeft = new BinaryNode<>("SecondLeft");
        BinaryNode<String> thirdLeft = new BinaryNode<>("ThirdLeft");
        firstRight.setLeft(secondLeft);
        secondLeft.setLeft(thirdLeft);
        assertEquals(binaryTreeMaxDepth.getHeight(root), 4);
    }

    @Test
    public void testHeightOfBtreeAnother() {
        BinarySearchTree<String> bst = new BinarySearchTree<String>(root);
        assertEquals(binaryTreeMaxDepth.getHeight(bst.getRoot()), 1);
        bst.insert("First Child");
        bst.insert("Second Child");
        assertEquals(binaryTreeMaxDepth.getHeight(bst.getRoot()), 2);
        System.out.println(bst.preOrderTraversal());
        bst.insert("Third Child");
        bst.insert("Fourth Child");
        System.out.println(bst.preOrderTraversal());
        assertEquals(binaryTreeMaxDepth.getHeight(bst.getRoot()), 3);
        bst.insert("Fifth Child");
        System.out.println(bst.preOrderTraversal());
        assertEquals(binaryTreeMaxDepth.getHeight(bst.getRoot()), 3);
    }
}