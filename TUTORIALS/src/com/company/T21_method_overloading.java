/*
If we made more than one method of same name then it run appropriate method according to arguments.
But it cannot be identified according to return type.
 */

package com.company;

public class T21_method_overloading {
    static void method() {
        System.out.println("Good Morning!!");
    }

    static void method(int a) {
        System.out.println("The integer is " + a);
    }

    static void method(float a) {
        System.out.println("The floating point is " + a);
    }

    static void method(int a, int b) {
        System.out.println("The sum is " + (a + b));
    }

    public static void main(String[] args) {
        method();
        method(300);
        method(3.14f);
        method(4, 5);
    }
}
