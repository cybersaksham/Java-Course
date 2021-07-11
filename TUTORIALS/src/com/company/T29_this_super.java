package com.company;

class A {
    private int a;

    public A(int a) {
        this.a = a; // this keyword points to object of class for which current method is running
        System.out.println("A class constructor run.");
    }

    public int getA() {
        return a;
    }
}

class B extends A {
    public B(int a) {
        super(a); // super keyword used to determine which constructor of base class should be run
        // If super os not written then constructor with 0 arguments will be called
        System.out.println("B class constructor run.");
    }
}

public class T29_this_super {
    public static void main(String[] args) {
        B obj = new B(5);
        System.out.println(obj.getA());
    }
}
