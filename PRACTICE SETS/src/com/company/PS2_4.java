/*
Write (v^2-u^2)/(2as) by precedence rules.
 */

package com.company;

public class PS2_4 {
    public static void main(String[] args) {
        int v = 1, u = 1, a = 1, s = 1;
        int res = (v * v - u * u) / (2 * a * s);
        System.out.println(res);
    }
}
