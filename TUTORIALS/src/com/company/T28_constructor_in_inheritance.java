/*
First Base class constructor runs & then Derived class.
 */

package com.company;

class Base2 {
    public Base2() {
        System.out.println("I am Base2 class constructor.");
    }

    public Base2(int x) {
        System.out.println("I am Base2 class constructor with an argument.");
    }
}

class Derived2 extends Base2 {
    public Derived2() {
        // super(0); // Use this if you want to run overloaded constructor else original constructor will run.
        System.out.println("I am Derived2 class constructor.");
    }

    public Derived2(int a, int b) {
        super(5);
        System.out.println("I am Derived2 class constructor with 2 arguments.");
    }
}

class Child2 extends Derived2 {
    public Child2() {
        System.out.println("I am Child2 class constructor.");
    }

    public Child2(int p, int q, int r) {
        super(1, 4);
        System.out.println("I am Child2 class constructor with 3 arguments.");
    }
}

public class T28_constructor_in_inheritance {
    public static void main(String[] args) {
        Child2 obj = new Child2(1, 2, 3);
    }
}
