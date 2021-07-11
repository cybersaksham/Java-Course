/*
Create an interface & make an instance from it
 */

package com.company;

interface Inter16_4 {
    void greet();
}

public class PS16_4 {
    public static void main(String[] args) {
        Inter16_4 obj = new Inter16_4() {
            @Override
            public void greet() {
                System.out.println("Hello...");
            }
        };
        obj.greet();
    }
}
