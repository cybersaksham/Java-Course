// Strings are immutable

package com.company;

import java.util.Scanner;

public class T7_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = new String("Saksham");
        String name = "Saksham";
        System.out.print("The name is : ");
        System.out.println(name);

        // Taking input for string
        String s1 = sc.next(); // Take only one word
        String s2 = sc.nextLine(); // Take whole line
    }
}
