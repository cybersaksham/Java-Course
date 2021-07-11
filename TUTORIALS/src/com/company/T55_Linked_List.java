/*
Methods are same as ArrayList but some different methods are :
1. l1.addLast(a) --> add a at last
2. l1.addFirst(a) --> add a at first

// Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/LinkedList.html
 */

package com.company;


import java.util.LinkedList;

public class T55_Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(5);
        l1.add(6);
        l1.add(1, 4);
        l1.add(8);

        LinkedList<Integer> l2 = new LinkedList<>(); // Initializing with initial size 5
        l2.add(15);
        l2.add(16);
        l2.add(17);

        l1.addAll(l2);
        l1.addAll(1, l2);
        l1.offer(500);
        for (Integer integer : l1) {
            System.out.println(integer);
        }
    }
}
