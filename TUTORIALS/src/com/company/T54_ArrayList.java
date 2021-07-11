/*
Some Common Methods :
1. add(a) --> add element a at end
2. add(i, a) --> add element a at index i
3. List1.addAll(List2) --> add all elements of List2 at end of List1
4. List1.addAll(i, List2) --> add all elements of List2 at index i of List1
5. l1.clear() --> clear all elements of a list
6. l1.size() --> returns size of list
7. l1.get(i) --> returns element at index i of l1
8. l1.contains(a) --> returns true if a is present in l1
9. l1.indexOf(a) --> If a is present in l1 then returns first index of a, else -1
10. l1.lastIndexOf(a) --> If a is present in l1 then returns last index of a, else -1
11. l1.remove(i) --> Remove element present at index i
12. l1.set(i, a) --> Replace element present at index i with a

Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/ArrayList.html
 */

package com.company;

import java.util.ArrayList;

public class T54_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(1, 4);
        l1.add(8);

        ArrayList<Integer> l2 = new ArrayList<>(5); // Initializing with initial size 5
        l2.add(15);
        l2.add(16);
        l2.add(17);

        l1.addAll(l2);
        l1.addAll(1, l2);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
