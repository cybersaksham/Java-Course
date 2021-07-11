/*
Take a string as input & fill template :
"Dear {{string}}, Thanks a lot."
 */

package com.company;

import java.util.Scanner;

public class PS3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        String letter = "Dear <|name|>, Thanks a lot.";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}
