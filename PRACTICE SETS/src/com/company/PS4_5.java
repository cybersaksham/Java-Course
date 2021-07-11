/*
WAP to check a year is leap year or not.
 */

package com.company;

import java.util.Scanner;

public class PS4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an year = ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
