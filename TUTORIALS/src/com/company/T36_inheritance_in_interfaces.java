package com.company;

interface inter36 {
    void m1();

    void m2();
}

// Inheriting interfaces
interface inter36_2 extends inter36 {
    void m3();

    void m4();
}

class class36 implements inter36_2 {
    @Override
    public void m1() {
        System.out.println("This is m1");
    }

    @Override
    public void m2() {
        System.out.println("This is m2");
    }

    @Override
    public void m3() {
        System.out.println("This is m3");
    }

    @Override
    public void m4() {
        System.out.println("This is m4");
    }
}

public class T36_inheritance_in_interfaces {
    public static void main(String[] args) {
        class36 obj = new class36();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
