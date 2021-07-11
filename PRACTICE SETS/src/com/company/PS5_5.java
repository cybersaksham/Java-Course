/*
WAP to print factorial of a given no using for loop
 */

package com.company;

public class PS5_5 {
    public static void main(String[] args) {
        int n = 5, fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);
    }
}
