/*
Write a java method to print the pattern using recursion :
*
**
***
****
 */

package com.company;

public class PS7_8 {
    static void pattern(int n) {
        if (n >= 1) {
            pattern(n - 1);
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 4;
        pattern(row);
    }
}
