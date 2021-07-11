/*
Write a function to find average of a set of numbers.
 */

package com.company;

public class PS7_6 {
    static float avg(float... arr) {
        float sum = 0.0f;
        for (float i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println("The average of 1, 2, 3, 4 & 5 is " + avg(1, 2, 3, 4, 5));
    }
}
