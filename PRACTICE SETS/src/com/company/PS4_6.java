/*
Take a website url & check
.com --> Commercial Website
.org --> Organisational Website
.in --> Indian Website
 */

package com.company;

import java.util.Scanner;

public class PS4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an url :");
        String url = sc.nextLine();

        if (url.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organisational Website");
        } else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        }
    }
}
