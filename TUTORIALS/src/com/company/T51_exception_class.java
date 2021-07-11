package com.company;

import java.util.Scanner;

// Making our own exception
class Exception51 extends Exception {
    String error;

    public Exception51() {
        error = "No custom error given";
    }

    public Exception51(String message) {
        super(message);
        this.error = message;
    }

    @Override
    public String toString() {
        return error;
    }

    @Override
    public String getMessage() {
        return "I am getMessage()!!!";
    }
}

public class T51_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();
        if (a < 20) {
            try {
                System.out.println("a = " + a);
                // throw new Exception51(); // Throwing error
                // Creating custom error
                if (a == 6) {
                    throw new Exception51("You cannot enter 6");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage()); // Over-written function
                System.out.println(e.toString()); // Over-written function
                e.printStackTrace(); // Put error occurred in program at end
            }
        }
        System.out.println("Finished...");
    }
}
