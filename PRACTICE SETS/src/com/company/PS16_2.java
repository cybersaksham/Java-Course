/*
Create a deprecated method in a class
 */

package com.company;

class A16_2 {
    @Deprecated
    public void greet() {
        System.out.println("hello!!!");
    }
}

public class PS16_2 {
    public static void main(String[] args) {
        A16_2 obj = new A16_2();
        obj.greet();
    }
}
