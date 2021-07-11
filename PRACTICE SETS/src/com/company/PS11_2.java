/*
Create an abstract class with methods write() & refill().
Use it to make fountainPen with method changeNib().
 */

package com.company;

abstract class Pen1 {
    abstract void write();

    abstract void refill();
}

class fountainPen extends Pen1 {
    void write() {
        System.out.println("Writing...");
    }

    void refill() {
        System.out.println("Refilling...");
    }

    void changeNib() {
        System.out.println("Changing the nib...");
    }
}

public class PS11_2 {
    public static void main(String[] args) {

    }
}
