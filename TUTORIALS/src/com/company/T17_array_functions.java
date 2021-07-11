package com.company;

public class T17_array_functions {
    public static void main(String[] args) {
        String[] students = {"saksham", "rohan", "shubham", "harry"};
        System.out.println(students.length); // Returns length of array

        /*
        Array can be printed by for loop that us called "Array Traversal".
        But it is better to use for-each loop for arrays.
         */
        // For-Each loop
        for (String item : students) {
            System.out.println(item);
        }
    }
}
