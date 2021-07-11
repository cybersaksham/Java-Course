/*
Take 3 marks as input.
Pass --> if percentage >= 40 and marks in each subject >= 33
else fail
 */

package com.company;

import java.util.Scanner;

public class PS4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        float percentage;
        System.out.println("Enter your marks in three subjects :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        percentage = (a + b + c) / 3.0f;

        System.out.println("Your overall percentage is " + percentage + " %");

        if (percentage >= 40 && a >= 33 && b >= 33 && c >= 33) {
            System.out.println("Pass!!");
        } else {
            System.out.println("Fail!!");
        }
    }
}
