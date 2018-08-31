package com.mavharsha.scratchPad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList<T extends Comparable> {
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
        next.setPrevious(current);
        setCurrent(next);
        COUNT++;
    }

    public void insertAtHead(T value) {
        Node<T> previous = new Node<T>(value);
        previous.setNext(head);
        head.setPrevious(previous);
        head = previous;
        COUNT++;
    }

    public int getCOUNT() {
        Node<T> tempHead = head;
        int temporaryCount = 0;
        while(tempHead != null) {
            temporaryCount++;
            tempHead = tempHead.getNext();
        }
        return temporaryCount;
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

    public boolean contains(T value) {
        if(head == null) {
            return false;
        }
        Node<T> tempHead = head;
        while(tempHead!=null) {
            if(tempHead.getValue().equals(value)){
                return true;
            }
            tempHead = tempHead.getNext();
        }
        return false;
    }

    /* Current will always point to tail of the list */
    public void deleteAtEnd() {
        deleteNode(current);
    }

    public void deleteAtHead() {
        deleteNode(getHead());
    }

    private void deleteNode(Node<T> node) {
        Node<T> temporaryPrevious = node.getPrevious();
        Node<T> temporaryNext = node.getNext();

        // check if head
        if(node ==  getHead()) {
            if(temporaryNext != null) {
                setHead(temporaryNext);
            }
            node = null;
            COUNT--;
        }
        // check if tail
        if(temporaryNext == null) {
            node = null;
            temporaryPrevious.setNext(null);
            current = temporaryPrevious;
            COUNT--;
        }

        // middle node
        if(temporaryPrevious !=  null && temporaryNext != null) {
            node = null;
            temporaryPrevious.setNext(temporaryNext);
            COUNT--;
        }
    }

    /*  TODO
    *   Insert at HEAD - DONE
    *   Insert at END - DONE
    *   Delete at HEAD - DONE
    *   Delete at END - DONE
    *   Insert at nth place
    *   Delete at nth place
    *   IsCircular - tortise hare algorithm
    *   IsEmpty
    * */
}
