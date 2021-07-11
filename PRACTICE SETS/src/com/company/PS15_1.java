/*
Create an ArrayList & store 10 names in it.
 */

package com.company;

import java.util.ArrayList;

public class PS15_1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add("Student " + (i + 1));
        }

        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
