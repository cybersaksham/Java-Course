/*
WAP to print multiplication table of a number n
 */

package com.company;

public class PS5_3 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
