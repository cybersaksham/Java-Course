package com.company;

class A30 {
    public void m1() {
        System.out.println("I am method 1 of class A30");
    }

    public void m2() {
        System.out.println("I am method 2 of class A30");
    }
}

class B30 extends A30 {
    public void m3() {
        System.out.println("I am method 3 of class B30");
    }

    @Override // It is not necessary to write this notation but it is recommended
    public void m2() { // Over-riding m2
        System.out.println("I am method 2 of class B30");
    }
}

public class T30_method_overriding {
    public static void main(String[] args) {
        B30 obj = new B30();
        obj.m1();
        obj.m2(); //  If not over-ride then it will use original m2 of class A30
        obj.m3();
    }
}
