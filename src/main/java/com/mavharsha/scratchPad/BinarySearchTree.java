package com.mavharsha.scratchPad;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinarySearchTree(T value) {
        root = new BinaryNode<T>(value);
    }

    public BinarySearchTree(BinaryNode<T> root) {
        this.root = root;
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

    public List<T> preOrderTraversal() {
        return preOrderTraversal(root);
    }

    private List<T> preOrderTraversal(BinaryNode rootNode) {
        //throw new UnsupportedOperationException("UnSupported yet!");
        List<T> listOfElements = new ArrayList<T>();
        Stack<BinaryNode<T>> interimStack = new Stack<>();
        interimStack.push(rootNode);

        while(!interimStack.empty()){
            BinaryNode<T> currentTop =  interimStack.pop();
            listOfElements.add(currentTop.getValue());
            if(currentTop.getRight()!=null) { interimStack.push(currentTop.getRight());}
            if(currentTop.getLeft()!=null) { interimStack.push(currentTop.getLeft());}
        }

        return listOfElements;
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
