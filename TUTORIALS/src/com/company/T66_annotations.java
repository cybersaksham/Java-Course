package com.company;

@FunctionalInterface // To ensure that interface contain only one abstract method
interface Inter66 {
    void method1();
    // void method2();
}

class A66 {
    public void show() {
        System.out.println("I am A66");
    }
}

class B66 extends A66 {
    @Override // For overriding a method
    public void show() {
        System.out.println("I am B66");
    }

    @Deprecated // For deprecating methods
    public void sum(int a, int b) {
        System.out.println("The sum is " + (a + b));
    }
}

public class T66_annotations {
    @SuppressWarnings("deprecation") // To suppress warnings
    public static void main(String[] args) {
        B66 obj = new B66();
        obj.show();
        obj.sum(4, 5);
    }
}
