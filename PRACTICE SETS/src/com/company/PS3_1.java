/*
Take input for a string & convert it into lowercase.
 */

package com.company;

import java.util.Locale;
import java.util.Scanner;

public class PS3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        System.out.println(s1);
    }
}
