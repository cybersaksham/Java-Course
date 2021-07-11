package com.company;

public class T20_passing_arrays {
    static void change1(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    public static void main(String[] args) {
        // Case 1 : Changing the integer
        int x = 5;
        change1(x); // Value will not change
        System.out.println("The value of x after running change1() is " + x);

        // Case 2 : Changing the array
        int[] marks = {1, 2, 3, 4, 5};
        change2(marks); // Value will be changed because in array address of array is passed as argument
        System.out.println("The value of marks[0] after running change2() is " + marks[0]);
    }
}
