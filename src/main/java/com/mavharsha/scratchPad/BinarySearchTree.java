package com.mavharsha.scratchPad;


public class BinarySearchTree<T extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinarySearchTree(T value) {
        root = new BinaryNode<T>(value);
    }

    public BinaryNode<T> getRoot() {
        return root;
    }

    private void setRoot(BinaryNode<T> root) {
        this.root = root;
    }

    public void insert(T value) {
        BinaryNode<T> newNode = new BinaryNode<T>(value);
        BinaryNode<T> tempNode = root;
        BinaryNode<T> previous = null;

        while(tempNode!= null) {
            previous = tempNode;
            if(value.compareTo(tempNode.getValue()) >= 0) {
                tempNode = tempNode.getRight();
            }else {
                tempNode = tempNode.getLeft();
            }
        }

        if(value.compareTo(previous.getValue()) > 0) {
            previous.setRight(newNode);
        }else {
            previous.setLeft(newNode);
        }
    }


    /**
     * TRAVERSALS
     * */

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(BinaryNode rootNode) {
        throw new UnsupportedOperationException("UnSupported yet!");
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(BinaryNode rootNode) {
        throw new UnsupportedOperationException("UnSupported yet!");
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(BinaryNode rootNode) {
        throw new UnsupportedOperationException("UnSupported yet!");
    }

    public void levelOrderTraversal() {
        inOrderTraversal(root);
    }

    private void levelOrderTraversal(BinaryNode rootNode) {
        throw new UnsupportedOperationException("UnSupported yet!");
    }
}
