/*
Calculate income tax based on following table :
    Income Slab     Tax
    0.0L - 2.5L     0.0%
    2.5L - 5.0L     5.0%
    5.0L - 10.0L    20.0%
    Above 10.0L     30.0%
 */

package com.company;

import java.util.Scanner;

public class PS4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float income, tax = 0.0f;
        System.out.print("Enter your income in lacs = ");
        income = sc.nextFloat();

        if (income < 2.5f) {
            tax += 0;
        } else if (income < 5.0f) {
            tax += 0.05f * (income - 2.5f);
        } else if (income < 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (income - 5.0f);
        } else {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0f - 5.0f);
            tax += 0.3f * (income - 10.0f);
        }

        System.out.println("You have to pay total tax of " + tax + " lacs.");
    }
}
