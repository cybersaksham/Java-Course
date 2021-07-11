/*
Create an array of 5 floats & print their sum
 */

package com.company;

public class PS6_1 {
    public static void main(String[] args) {
        float[] arr = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        float sum = 0;

        for (float item : arr) {
            sum += item;
        }
        System.out.println(sum);
    }
}
