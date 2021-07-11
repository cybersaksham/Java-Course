/*
WAP to print factorial of a given no using while loop
 */

package com.company;

public class PS5_6 {
    public static void main(String[] args) {
        int n = 6, fact = 1, i = n;
        while (i > 1) {
            fact *= i;
            i--;
        }
        System.out.println(n + "! = " + fact);
    }
}
