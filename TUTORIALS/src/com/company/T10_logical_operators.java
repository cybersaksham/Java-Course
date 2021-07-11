package com.company;

public class T10_logical_operators {
    public static void main(String[] args) {
        boolean y = true;
        boolean n = false;

        if (y && n) {
            System.out.println("Both are true.");
        } else if (y || n) {
            System.out.println("Atleast one is true");
        } else {
            System.out.println("Both are false");
        }

        if (!y) {
            System.out.println("y is false");
        } else {
            System.out.println("y is true");
        }
    }
}
