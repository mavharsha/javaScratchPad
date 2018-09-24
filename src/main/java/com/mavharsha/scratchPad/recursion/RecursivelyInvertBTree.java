package com.mavharsha.scratchPad.recursion;

import com.mavharsha.scratchPad.BinaryNode;

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
