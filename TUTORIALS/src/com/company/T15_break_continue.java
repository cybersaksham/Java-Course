package com.company;

public class T15_break_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                break; // All iterations of loop breaks
            }
            if (i == 6) {
                continue; // Current loop breaks & move on to next iteration
            }
            System.out.println(i); // Printing values
        }
    }
}
