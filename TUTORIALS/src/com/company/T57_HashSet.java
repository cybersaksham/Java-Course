/*
Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/HashSet.html
 */

package com.company;

import java.util.HashSet;

public class T57_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(6);
        a.add(7);
        a.add(8);
        System.out.println(a);
    }
}
