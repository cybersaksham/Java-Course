/*
WAP to check whether a given integer is present in array or not
 */

package com.company;

public class PS6_2 {
    public static void main(String[] args) {
        int a = 5;
        boolean isIn = false;
        int[] arr = {1, 2, 3, 4, 5};

        for (int item : arr) {
            if (a == item) {
                isIn = true;
                break;
            }
        }

        if (isIn) {
            System.out.println(a + " is present");
        } else {
            System.out.println(a + " is not present");
        }
    }
}
