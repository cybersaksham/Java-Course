/*
Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/ArrayDeque.html
 */

package com.company;

import java.util.ArrayDeque;

public class T56_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
    }
}
