/*
* Take input for kms & convert it into milse.
* */

package com.company;

import java.util.Scanner;

public class PS1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of kms : ");
        double kms = sc.nextDouble();
        System.out.println(kms + " kms = " + (kms * 0.621371) + " miles");
    }
}
