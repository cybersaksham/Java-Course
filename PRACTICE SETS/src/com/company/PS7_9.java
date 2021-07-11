/*
Write a method to convert celsius to fahrenheit.
 */

package com.company;

public class PS7_9 {
    static float convert(float c) {
        return (c * 1.8f) + 32.0f;
    }

    public static void main(String[] args) {
        float cel = 36.7f;
        float far = convert(cel);
        System.out.println(cel + " celsius in fahrenheit is " + far);
    }
}
