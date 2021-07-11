/*
Write a java method to print the pattern using recursion :
****
***
**
*
 */

package com.company;

public class PS7_7 {
    static void pattern(int n) {
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pattern(n - 1);
        }
    }

    public static void main(String[] args) {
        int row = 4;
        pattern(row);
    }
}
