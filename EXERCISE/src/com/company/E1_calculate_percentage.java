/*
* Take max marks & marks of 5 subjects.
* Then calculate percentage & display it.
* */

package com.company;

import java.util.Scanner;

public class E1_calculate_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print your marks in following subjects.");

        System.out.print("Max Marks of one subject - ");
        float max_marks = sc.nextFloat();

        System.out.print("Physics - ");
        float physics = sc.nextFloat();

        System.out.print("Maths - ");
        float maths = sc.nextFloat();

        System.out.print("Chemistry - ");
        float chem = sc.nextFloat();

        System.out.print("Hindi - ");
        float hindi = sc.nextFloat();

        System.out.print("English - ");
        float eng = sc.nextFloat();

        float marks = physics + maths + chem + hindi + eng;
        float percentage = (marks / max_marks) * 20;

        System.out.println("Your percentage is - " + percentage + " %");
    }
}
