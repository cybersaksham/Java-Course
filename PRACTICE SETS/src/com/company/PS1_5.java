/*
* Take input for an integer & check whether it is integer or not.
* */

package com.company;

import java.util.Scanner;

public class PS1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        System.out.println(sc.hasNextInt());
    }
}
