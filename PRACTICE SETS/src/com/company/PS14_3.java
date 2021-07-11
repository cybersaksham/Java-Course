/*
WAP to access an array until index is valid.
If max retries exceed 5 then print error.
 */

package com.company;

import java.util.Scanner;

public class PS14_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {1, 2, 3, 4, 5};
        boolean flag = true;
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.print("Enter an index : ");
                int ind = sc.nextInt();
                System.out.println("The value is " + marks[ind]);
                flag = false;
            } catch (Exception e) {
                System.out.println("Invalid Index!!!");
                i++;
            }
        }
        if (i >= 5) {
            System.out.println("error");
        }
    }
}
