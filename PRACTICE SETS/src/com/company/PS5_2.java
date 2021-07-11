/*
WAP to find sum of first n even numbers using while loop.
 */

package com.company;

public class PS5_2 {
    public static void main(String[] args) {
        int n = 10, i = 1, sum = 0;
        while (i <= n) {
            sum += (2 * i);
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
