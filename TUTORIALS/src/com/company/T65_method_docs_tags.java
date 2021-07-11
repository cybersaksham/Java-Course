package com.company;

public class T65_method_docs_tags {
    /**
     * @param args These are arguments supplied to command line
     */
    public static void main(String[] args) {
        System.out.println("This is main method.");
    }

    /**
     * This method is to add two numbers.
     * @param a This is first operand
     * @param b This is second operand
     * @return Sum of two numbers as an integer
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * This method is to divide two numbers.
     * @param a This is first operand
     * @param b This is second operand
     * @return Sum of two numbers as an integer
     * @throws ArithmeticException if b is 0
     * @deprecated This method is deprecated
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a + b;
    }
}
