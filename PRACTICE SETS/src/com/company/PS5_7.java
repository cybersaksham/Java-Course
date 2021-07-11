/*
WAP to print following pattern by for & while loop :
****
***
**
*
 */

package com.company;

public class PS5_7 {
    public static void main(String[] args) {
        int j;
        for (int i = 4; i > 0; i--) {
            j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
    }
}
