/*
Write a iterative method to find sum of first n natural numbers.
 */

package com.company;

public class PS7_10 {
    static int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The sum is " + sum(n));
    }
}
