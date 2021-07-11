/*
Write a method to find nth term of fibonacci series.
 */

package com.company;

public class PS7_5 {
    static int fibonacci(int n) {
        if (n <= 2) {
            return n - 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    public static void main(String[] args) {
        int a = 8;
        System.out.println("The fibonacci at " + a + " is " + fibonacci(a));
    }
}
