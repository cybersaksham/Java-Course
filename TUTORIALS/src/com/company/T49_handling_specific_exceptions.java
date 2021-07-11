package com.company;

import java.util.Scanner;

public class T49_handling_specific_exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {10, 20, 30};

        System.out.print("Enter index no = ");
        int ind = sc.nextInt();

        System.out.print("Enter no you want to divide with = ");
        int num = sc.nextInt();

        try {
            System.out.println("The value of array index is " + marks[ind]);
            System.out.println("After dividing result is " + marks[ind] / num);
        } catch (IndexOutOfBoundsException e1) { // If user enters invalid index
            System.out.println("Index entered is incorrect!!!");
        } catch (ArithmeticException e2) { // If user enters 0 in number
            System.out.println("Cannot divide with that number!!!");
        } catch (Exception e) { // If other exception occurred
            System.out.println("Some unknown exception occurred!!!");
            System.out.println(e);
        }
    }
}
