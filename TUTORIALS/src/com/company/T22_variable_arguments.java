package com.company;

public class T22_variable_arguments {
    // Packing all arguments given in an array
    static int sum(int... arr) {
        int res = 0;
        for (int item : arr) {
            res += item;
        }
        return res;
    }

    // If we want to give a compulsory argument
    static int sum2(int x, int... arr) {
        int res = x;
        for (int item : arr) {
            res += item;
        }
        return res;
    }

    public static void main(String[] args) {
        // Giving variable no of arguments to method
        System.out.println("The value of sum() is " + sum());
        System.out.println("The sum of 1 & 2 is " + sum(1, 2));
        System.out.println("The sum of 1, 2 & 3 is " + sum(1, 2, 3));
        System.out.println("The sum of 1, 2, 3 & 4 is " + sum(1, 2, 3, 4));
        System.out.println("The sum of 1, 2, 3, 4 & 5 is " + sum(1, 2, 3, 4, 5));

        // System.out.println(sum2()); --> Will produce an error
        System.out.println("The value of 1, 2 & 3 by sum2 is " + sum2(1, 2, 3));
    }
}
