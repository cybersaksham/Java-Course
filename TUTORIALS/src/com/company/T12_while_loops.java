/*
Syntax :
while (condition) {
    // Code --> If condition is true
}
When condition becomes false loop exits
 */

package com.company;

public class T12_while_loops {
    public static void main(String[] args) {
        System.out.println("Printning number from 1 to 100");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("Numbers printed!!!");
    }
}
