/*
Write a java method to print multiplication table.
 */

package com.company;

public class PS7_1 {
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        int n = 7;
        table(n);
    }
}
