/*
Create a class with abstract methods ring(), lift(), disconnect()
Create smartTelephone class & demonstrate polymorphism.
 */

package com.company;

abstract class c11_4 {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class c11_4_2 extends c11_4 {
    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting...");
    }

    @Override
    void lift() {
        System.out.println("Lifting...");
    }

    public void m1() {
        System.out.println("This is my method...");
    }
}

public class PS11_4 {
    public static void main(String[] args) {
        c11_4 obj = new c11_4_2();
        obj.ring();
        obj.disconnect();
        obj.lift();
        // obj.m1(); --> will give error
    }
}
