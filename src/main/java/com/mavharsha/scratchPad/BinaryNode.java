package com.mavharsha.scratchPad;

public class BinaryNode<T extends Comparable<T>> {
    private BinaryNode<T> parent, left, right;
    private T value;

    public BinaryNode(T value) {
        this.value = value;
    }

    public BinaryNode(BinaryNode<T> parent, BinaryNode<T> left, BinaryNode<T> right, T value) {
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinaryNode<T> getParent() {
        return parent;
    }

    public void setParent(BinaryNode<T> parent) {
        this.parent = parent;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
