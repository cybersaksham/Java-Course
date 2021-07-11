/*
Suppress method in Q.2
 */

package com.company;

class A16_3 {
    @Deprecated
    public void greet() {
        System.out.println("hello!!!");
    }
}

public class PS16_3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        A16_3 obj = new A16_3();
        obj.greet();
    }
}
