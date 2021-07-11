package com.company;

abstract class Base32 {
    public Base32() {
        System.out.println("I am constructor of base class.");
    }

    public void hello() {
        System.out.println("Hello");
    }

    abstract public void greet();

    abstract public void greet2();
}

class Derived32 extends Base32 {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Morning Again");
    }
}

abstract class Derived32_2 extends Base32 {
    @Override
    public void greet() {
        System.out.println("Good Evening");
    }
}

public class T32_abstract_class {
    public static void main(String[] args) {
        // We cannot make object of abstract class
        // Base32 obj1 = new Base32(); --> Will throw error
        Derived32 obj2 = new Derived32();
        // Derived32_2 obj3 = new Derived32_2(); --> Will throw error

        obj2.greet();
        obj2.greet2();
    }
}
