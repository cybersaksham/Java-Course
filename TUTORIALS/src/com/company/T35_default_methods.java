package com.company;

interface inter35 {
    // There is no need to initialize default methods again in derived classes
    // If we over-ride default methods then over-ridden method is called.
    default void print() {
        System.out.println("This is default method");
    }
    // If we want to made some function for helping in logic of default methods
    // Then we can make private methods in interface which are not accessible to any derived class.
}

class class35 implements inter35 {
    public class35() {
        System.out.println("Class made!!!");
    }
}

public class T35_default_methods {
    public static void main(String[] args) {
        class35 obj = new class35();
        obj.print();
    }
}
