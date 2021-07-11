/*
WAP to print following pattern by for loop :
****
***
**
*
 */

package com.company;

public class PS5_1 {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
