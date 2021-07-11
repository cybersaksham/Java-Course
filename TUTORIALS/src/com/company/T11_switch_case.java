/*
When switch get a correct case then switch start executing until it find break statement.
Variable on which we want to run switch should be int, char or string only.
 */

package com.company;

import java.util.Scanner;

public class T11_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age = ");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("Your are going to become adult!");
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default: // If any case does not match
                System.out.println("Enjoy your life!");
                break;
        }

        // Enhanced Switch --> no need of break after every statement
        /*
        switch(var) {
            case 1 -> // Single Line Code
            case 2 -> {
                // Multi Line Code
            }
            default -> // Code
        }
         */
    }
}
