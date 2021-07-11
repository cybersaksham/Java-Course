/*
WAP to find min element in array
 */

package com.company;

public class PS6_7 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 6, 9, -2};
        int min = arr[0];

        for (int item : arr) {
            if (min > item) {
                min = item;
            }
        }
        System.out.println("The minimum no is " + min);
    }
}
