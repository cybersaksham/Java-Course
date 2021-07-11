/*
Throw a custom exception in Q.3 after max retries.
 */

package com.company;

import java.util.Scanner;

class Exception14_4 extends Exception {
    @Override
    public String toString() {
        return "Max retries reached!!!";
    }

    @Override
    public String getMessage() {
        return "Max retries reached!!!";
    }
}

public class PS14_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {1, 2, 3, 4, 5};
        boolean flag = true;
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.print("Enter an index : ");
                int ind = sc.nextInt();
                System.out.println("The value is " + marks[ind]);
                flag = false;
            } catch (Exception e) {
                System.out.println("Invalid Index!!!");
                i++;
            }
        }
        try {
            if (i >= 5) {
                throw new Exception14_4();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
