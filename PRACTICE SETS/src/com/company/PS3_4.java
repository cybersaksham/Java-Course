/*
Detect index of "  " and "   " in a string.
 */

package com.company;

import java.util.Scanner;

public class PS3_4 {
    public static void main(String[] args) {
        String s1 = "This string  contains double    & triple spaces.";
        System.out.println(s1.indexOf("  "));
        System.out.println(s1.indexOf("   "));
    }
}
