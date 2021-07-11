/*
Write a java method to print the pattern :
****
***
**
*
 */

package com.company;

public class PS7_4 {
    static void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
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
