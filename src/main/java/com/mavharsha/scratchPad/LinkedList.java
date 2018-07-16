package com.mavharsha.scratchPad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> current;
    private int COUNT;

    public LinkedList(Node<T> head) {
        this.head = head;
        this.current = head;
        COUNT++;
    }

    public LinkedList(T value) {
        this.head = new Node<>(value);
        this.current = head;
        COUNT++;
    }

    public Node<T> getNext(Node<T> current) {
        return current.getNext();
    };

    public Node<T> getPrevious(Node<T> current) {
        return current.getPrevious();
    };

    public Node<T> getNext() {
        return current.getNext();
    };

    public Node<T> getPrevious() {
        return current.getPrevious();
    };

    public void setNext(T value) {
        current.setNext(new Node<>(value));
    };

    public void setPrevious(T value) {
        current.setPrevious(new Node<>(value));
    };

    public void setNext(Node<T> current, T value) {
        current.setNext(new Node<>(value));
    };

    public void setPrevious(Node<T> current, T value) {
        current.setPrevious(new Node<>(value));
    };

    public void setNext(Node<T> current, Node<T> next) {
         current.setNext(next);
    };

    public void setPrevious(Node<T> current, Node<T> previous) {
         current.setPrevious(previous);
    };

    public void setNext(Node<T> next) {
         current.setNext(next);
    };

    public void setPrevious(Node<T> previous) {
         current.setPrevious(previous);
    };

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getCurrent() {
        return current;
    }

    public void setCurrent(Node<T> current) {
        this.current = current;
    }

    public void insertAtEnd(T value) {
        Node<T> next = new Node<T>(value);
        setNext(next);
        setCurrent(next);
        COUNT++;
    }

    public int getCOUNT() {
        return COUNT;
    }

    public List<T> traverse() {
        if(head == null) {
            return Collections.EMPTY_LIST;
        }
         List<T> listOfElements = new ArrayList<>();
         Node<T> tempHead = head;
         while(tempHead!=null) {
             listOfElements.add(tempHead.getValue());
             tempHead = tempHead.getNext();
         }
        return listOfElements;
    }

    /*TODO
    *   Insert at HEAD
    *   Insert at END
    *   Delete at HEAD
    *   Delete at END
    *   Insert at nth place
    *   Delete at nth place
    *   IsCircular - tortise hare algorithm
    *   IsEmpty
    * */
}
