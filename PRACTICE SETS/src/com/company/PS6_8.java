/*
WAP to find an array is sorted or not
 */

package com.company;

public class PS6_8 {
    public static void main(String[] args) {
        int[] arr = {12, 6, -1, -5, -8};
        boolean increasing = true;
        boolean decreasing = true;

        // Checking for increasing array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                increasing = false;
                break;
            }
        }

        // Checking for decreasing array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                decreasing = false;
                break;
            }
        }

        // If any increasing or decrasing is true then Sorted
        if (increasing || decreasing) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
