package com.company;

public class T23_recursion {
    static int factorial(int n) {
        if (n <= 1) { // Base condition is necessary otherwise recursion will continue infinitely
            return 1;
        } else {
            return n * factorial(n - 1); // Calling itself means recursion
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The value of factorial(" + n + ") is " + factorial(n));
    }
}
