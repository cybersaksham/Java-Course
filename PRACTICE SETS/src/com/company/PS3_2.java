/*
Take a string as input & replace all space with '_'
 */

package com.company;

import java.util.Scanner;

public class PS3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s1 = sc.nextLine();
        s1 = s1.replace(" ", "_");
        System.out.println(s1);
    }
}
