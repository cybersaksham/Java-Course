/*
Demonstrate syntax, logical & runtime errors.
 */

package com.company;

public class PS14_1 {
    public static void main(String[] args) {
        // Syntax Error
        // int a = 7 --> ';' mistake

        // Logical Error
        int age = 70;
        int year_born = 2000 - age;

        // Exception
        System.out.println(6 / 0);
    }
}
