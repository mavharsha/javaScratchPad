package com.mavharsha.scratchPad;

import com.sun.source.tree.BinaryTree;

public class RecursivelyInvertBTree {

    public static void invert(BinaryNode root) {

        if(root == null) {
            return;
        }

        // swap left and right
        BinaryNode temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        invert(root.getLeft());
        invert(root.getRight());
    }
}
