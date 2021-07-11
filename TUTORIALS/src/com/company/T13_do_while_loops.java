/*
Syntax :
do {
    // Code --> without checking anything
} while (condition);
if condition is true then re-enter loop else exit & move ahead.
 */

package com.company;

public class T13_do_while_loops {
    public static void main(String[] args) {
        int a = 10;
        do {
            // do-while loop executes atleast once
            System.out.println(a);
            a++;
        } while (a < 5);
    }
}
