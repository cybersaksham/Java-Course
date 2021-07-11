/*
WAP to find max element in array
 */

package com.company;

public class PS6_6 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 6, 9, -2};
        int max = arr[0];

        for (int item : arr) {
            if (max < item) {
                max = item;
            }
        }
        System.out.println("The maximum no is " + max);
    }
}
