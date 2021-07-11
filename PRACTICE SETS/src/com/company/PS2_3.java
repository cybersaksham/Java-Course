/*
Take a number as input & check whether it is greater than 8 or not
 */

package com.company;

import java.util.Scanner;

public class PS2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.println(a > 8);
    }
}
