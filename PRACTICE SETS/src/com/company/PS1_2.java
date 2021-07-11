/*
* Take input for 3 numbers & print their CGPA.
* */

package com.company;

import java.util.Scanner;

public class PS1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in 3 subjects : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("The CGPA is " + ((a + b + c) / 30));
    }
}
