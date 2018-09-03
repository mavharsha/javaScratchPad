package com.mavharsha.scratchPad.data;

import com.mavharsha.scratchPad.LinkedList;

public class LinkedListDataGenerator {


    public static LinkedList<String> getListOfStrings() {
        LinkedList<String> linkedList = new LinkedList<String>("a");
        linkedList.insertAtEnd("b");
        linkedList.insertAtEnd("c");
        linkedList.insertAtEnd("d");
        linkedList.insertAtEnd("e");
        linkedList.insertAtEnd("f");
        linkedList.insertAtEnd("g");
        linkedList.insertAtEnd("h");
        return linkedList;
    }

}
