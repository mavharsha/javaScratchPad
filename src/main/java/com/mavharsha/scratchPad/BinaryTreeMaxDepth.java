package com.mavharsha.scratchPad;


public class BinaryTreeMaxDepth {

    public int getHeight(BinaryNode rootNode) {
        validateInput(rootNode);
        return getTreeHeight(rootNode);
    }

    private int getTreeHeight(BinaryNode rootNode) {
        if (rootNode == null) {
            return 0;
        }
        return 1 + Math.max(getTreeHeight(rootNode.getLeft()), getTreeHeight(rootNode.getRight()));
    }

    private void validateInput(BinaryNode rootNode) {
        if(rootNode == null) {
            throw new IllegalArgumentException("GrootNode cannot be null");
        }
    }
}
