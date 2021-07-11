package com.company;

interface Inter67 {
    void meth1(int a);
}

public class T67_lambda_expressions {
    public static void main(String[] args) {

        // Anonymous class
        Inter67 obj = new Inter67() {
            // Making an anonymous class
            @Override
            public void meth1(int a) {
                System.out.println("I am meth1. " + a);
            }
        };

        obj.meth1(5);

        // Lambda Expressions
        Inter67 obj2 = (a) -> {
            System.out.println("I am lambda expression " + a);
        };
        obj2.meth1(6);
    }
}
