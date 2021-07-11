/*
WAP to reverse an array
 */

package com.company;

public class PS6_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
