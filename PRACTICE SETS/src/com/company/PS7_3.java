/*
Write a recursive method to find sum of first n natural numbers.
 */

package com.company;

public class PS7_3 {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The sum is " + sum(n));
    }
}
