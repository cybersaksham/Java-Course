/*
WAP to find sum of numbers occuring in multiplication table of 8
 */

package com.company;

public class PS5_9 {
    public static void main(String[] args) {
        int n = 8, sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += (i * n);
        }
        System.out.println("The sum is " + sum);
    }
}
