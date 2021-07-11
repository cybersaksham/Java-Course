/*
Make an array containing marks of all students.
Then find average by for-each loop.
 */

package com.company;

public class PS6_3 {
    public static void main(String[] args) {
        float avg, sum = 0;
        float[] arr = {45.1f, 31.4f, 82.2f, 56.4f, 94.7f};
        for (float item : arr) {
            sum += item;
        }
        avg = sum / arr.length;
        System.out.println("The average marks are " + avg);
    }
}
