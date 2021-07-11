/*
Create a set with duplicate elements & show that only one element is stored.
 */

package com.company;

import java.util.HashSet;

public class PS15_5 {
    public static void main(String[] args) {
        HashSet<Integer> obj = new HashSet<>();
        obj.add(1);
        obj.add(2);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        for (Object o : obj) {
            System.out.println(o);
        }
    }
}
