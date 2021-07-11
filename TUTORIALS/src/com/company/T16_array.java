package com.company;

public class T16_array {
    public static void main(String[] args) {
        // There are 3 ways to make arrays

        // 1. Declaring & Memory Allocating
        int[] marks1 = new int[5];
        // Initializing
        marks1[0] = 1;
        marks1[1] = 2;
        marks1[2] = 3;
        marks1[3] = 4;
        marks1[4] = 5;

        // 2. Declaring then Memory Allocating
        int[] marks2;
        marks2 = new int[5];
        // Initializing
        marks2[0] = 1;
        marks2[1] = 2;
        marks2[2] = 3;
        marks2[3] = 4;
        marks2[4] = 5;

        // 3. Declaring, Allocating & Initializing together
        int[] marks3 = {1, 2, 3, 4, 5};

        // Printing marks1
        System.out.println("Array 1 :");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks1[i] + " ");
        }
        System.out.println();

        // Printing marks2
        System.out.println("Array 2 :");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks2[i] + " ");
        }
        System.out.println();

        // Printing marks3
        System.out.println("Array 3 :");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks3[i] + " ");
        }
        System.out.println();
    }
}
