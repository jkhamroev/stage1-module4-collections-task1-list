package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer n : sourceList) {
            if ((n & 1) == 1) {
                linkedList.addFirst(n);
            } else {
                linkedList.addLast(n);
            }
        }

        return linkedList;
    }
}
