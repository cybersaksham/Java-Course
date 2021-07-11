package com.company;

import java.util.Scanner;

class Exception52 extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative or zero!!!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative or zero!!!";
    }
}

public class T52_throw_and_throws {
    // throws is used to warn that this method may throw an exception
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static double area(int r) throws Exception52 {
        if (r <= 0) {
            // throw is used to throw an exception
            throw new Exception52();
        }
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();

        try {
            System.out.println(divide(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.print("Enter radius = ");
        int r = sc.nextInt();

        try {
            System.out.println(area(r));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
