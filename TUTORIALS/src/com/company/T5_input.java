package com.company;

import java.util.Scanner;

public class T5_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt(); // For integer
        System.out.println("Entered no is " + a);

        System.out.print("Enter a floating point : ");
        float b = sc.nextFloat(); // For float
        System.out.println("Entered no is " + b);

        System.out.print("Enter a string : ");
        String d = sc.next(); // Only takes first word
        System.out.println(d);

        System.out.print("Enter a string : ");
        String e = sc.nextLine(); // Takes all words
        System.out.println(e);

        System.out.print("Enter an integer : ");
        boolean c = sc.hasNextInt(); // Check if entered no is int or not
        System.out.println(c);
    }
}
