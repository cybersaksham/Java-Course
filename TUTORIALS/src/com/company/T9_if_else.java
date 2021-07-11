package com.company;

public class T9_if_else {
    public static void main(String[] args) {
        int age = 12;
        if (age > 18) {
            System.out.println("Yes you can drive.");
        } else if (age > 10) {
            System.out.println("You can start learn driving.");
        } else {
            System.out.println("No you cannot drive.");
        } // else statement is optional
    }
}
