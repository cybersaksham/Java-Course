/*
There are 3 types of errors :
1. Syntax Error
2. Logical Error
3. Runtime Error
 */

package com.company;

public class T47_errors {
    public static void main(String[] args) {
        // 1. Syntax Error
        // int a = 5 --> error (we have not put ';' at end so it is syntax error)

        // 2. Logical Error
        // If we did some logical mistakes then program runs successfully but give unexpected output
        System.out.println("Printing prime numbers from 1 to 10.");
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }
        // The logic is wrong for printing prime numbers. Our IDE cannot find these errors.

        /*
        3. Runtime Error
        If user enters incorrect input then error may occur.
        These are also called exceptions
        */
    }
}
