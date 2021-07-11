/*
Sometimes we have to implement same code many times.
But we do not want to repeat the code so we make a method & use it where ever required.
It is same as functions in other programming languages.

Our main method is static so we can call a static method inside main.
So we must have to write static in starting of each method.

For non-static method see method2
 */

package com.company;

public class T19_methods {
    // Ways to make methods

    // 1. Static Method
    static int method1(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // 2. Non-Static Method
    int method2(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // Void Return type
    static void greet() {
        System.out.println("Hello, Good Morning");
    }

    public static void main(String[] args) {
        int a = 5, b = 7;
        int a1 = 7, b1 = 5;
        int c, c1;

        // Ways to call methods

        // 1. Static Method
        c = method1(a, b);

        // 2. Non-Static Method
        T19_methods obj = new T19_methods(); // We have to make an object
        c1 = obj.method2(a1, b1);

        greet();
        System.out.println(c);
        System.out.println(c1);
    }
}
