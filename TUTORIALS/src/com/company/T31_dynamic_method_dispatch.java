package com.company;

class A31 {
    public void name() {
        System.out.println("I am class A31");
    }

    public void greet() {
        System.out.println("Good Morning");
    }
}

class B31 extends A31 {
    public void name() {
        System.out.println("I am class B31");
    }

    public void greet2() {
        System.out.println("Good Evening");
    }
}

public class T31_dynamic_method_dispatch {
    public static void main(String[] args) {
        A31 obj = new B31(); // Allowed
        // B31 obj2 = new A31(); // Not Allowed
        obj.name(); // Overridden method will be called
        // obj.greet2(); // Not Allowed --> Only overridden methods of subclass & all methods of superclass can be accessed
    }
}
