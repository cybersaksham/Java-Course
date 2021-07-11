package com.company;

import java.util.Scanner;

public class T50_nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {10, 20, 30};
        System.out.print("Enter index no = ");
        int ind = sc.nextInt();

        try {
            // If user input invalid index
            try {
                System.out.println("The value at index is " + marks[ind]);
                System.out.print("Enter no you want to divide with = ");
                int num = sc.nextInt();
                // If user input in num
                try {
                    System.out.println("The result is " + marks[ind] / num);
                } catch (Exception e) {
                    System.out.println("Cannot divide with that number!!!");
                }
            } catch (Exception e) {
                System.out.println("This index does not exist!!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
