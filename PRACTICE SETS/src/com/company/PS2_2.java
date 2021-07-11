/*
Take input for a grade.
Encrypt it by adding it & then decrypt.
 */

package com.company;

import java.util.Scanner;

public class PS2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade : ");
        char grade = sc.next().charAt(0);

        // Encrypting Grade
        grade = (char) (grade + 8);
        System.out.println("Encrypted grade is : " + grade);

        // Decrypting Grade
        grade = (char) (grade - 8);
        System.out.println("Decrypted grade is : " + grade);
    }
}
