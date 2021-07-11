/*
 * Take input for 3 integers & print sum.
 * */

package com.company;

import java.util.Scanner;

public class PS1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
    }
}
