/*
WAP to find sum of first n even numbers using for loop.
 */

package com.company;

public class PS5_11 {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (2 * i);
        }
        System.out.println("The sum is " + sum);
    }
}
