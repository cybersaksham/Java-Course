/*
Create a calculator with functions :
+, -, *, /
Handle these exceptions :
1. Invalid Input Exception ex- 8 & 9
2. Cannot Divide by 0 Exception
3. Max input Exception (input cannot be greater than 100000)
4. Max Multiplier reached Exception (don't allow any multiplication input to be greater than 7000)
 */

package com.company;

import java.util.Scanner;

class calcExceptions extends Exception {
    String msg, name;

    public calcExceptions(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Name - " + name;
    }

    @Override
    public String getMessage() {
        return "Cause - " + msg;
    }
}

public class E6_custom_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, check = 0;
        String c;
        System.out.println("Welcome to Custom Calculator!!!\n");

        while (check == 0) {
            System.out.print("Enter first operand = ");
            a = sc.nextInt();
            System.out.print("Enter second operand = ");
            b = sc.nextInt();
            System.out.print("Enter Operation = ");
            c = sc.next();

            // Checking exceptions
            try {
                if (a > 100000 || b > 100000) {
                    throw new calcExceptions("Max Input Exception!!!", "Both operands must be less than 100000.");
                }
                if ((a > 7000 || b > 7000) && c.equals("*")) {
                    throw new calcExceptions("Max Multiplier Reached Exception!!!", "In multiplication both input must be less than 7000.");
                }
                if (b == 0 && c.equals("/")) {
                    throw new calcExceptions("Cannot Divide By 0 Exception!!!", "In maths denominator cannot have zero.");
                }
                switch (c) {
                    case "+" -> System.out.println(a + " + " + b + " = " + (a + b));
                    case "-" -> System.out.println(a + " - " + b + " = " + (a - b));
                    case "*" -> System.out.println(a + " * " + b + " = " + (a * b));
                    case "/" -> System.out.println(a + " / " + b + " = " + (a / b));
                    default -> {
                        throw new calcExceptions("Invalid Input Exception!!!", "Operator can be +, -, *, / only.");
                    }
                }
            } catch (Exception e) {
                // Showing errors
                System.out.println();
                System.out.println("Following error occurred!!!");
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }

            // Asking user for exiting or not
            check = 2;
            System.out.println();
            while (!(check == 0 || check == 1)) {
                System.out.print("Enter 0 for play & 1 for exit = ");
                check = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Thanks for using Custom Calculator!!!");
    }
}
