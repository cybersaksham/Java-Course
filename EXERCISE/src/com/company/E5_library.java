/*
You have to create a Library class with following methods & properties :
1. issueBook()
2. returnBook()
3. showBooks()
4. addBooks()
5. Array to store available books
6. Array to store issued books
 */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Library {
    Scanner sc1 = new Scanner(System.in);
    private String[] availableBooks = new String[5];
    private String[] issuedBooks = new String[0];

    public Library() {
        availableBooks[0] = "A";
        availableBooks[1] = "B";
        availableBooks[2] = "C";
        availableBooks[3] = "D";
        availableBooks[4] = "E";
    }

    // For showing available books
    public void showBooks() {
        System.out.println("The available books are :");
        for (String item : availableBooks) {
            System.out.println(item);
        }
    }

    // For adding books
    public void addBooks() {
        System.out.print("Enter name of book you want to add : ");
        String str = sc1.nextLine();
        boolean check = true;
        for (String item : availableBooks) {
            if (item.equals(str)) {
                check = false; // Becomes false if book already present in library
                System.out.println("Book " + str + " is already present in library.");
                break;
            }
        }
        for (String item : issuedBooks) {
            if (item.equals(str)) {
                check = false; // Becomes false if book is issued to someone
                System.out.println("Book " + str + " is issued to someone. Cannot add another one.");
                break;
            }
        }
        int n = availableBooks.length;
        if (check) {
            // If boolean remains true then add book at end of array
            availableBooks = Arrays.copyOf(availableBooks, n + 1);
            availableBooks[n] = str;
            System.out.println("Book " + str + " successfully added to library.");
        }
    }

    // For issuing books
    public void issueBook() {
        System.out.print("Enter name of book you want to borrow : ");
        String str = sc1.nextLine();
        System.out.print("Enter your name : ");
        String name = sc1.nextLine();
        int n = -1;
        boolean check = true;
        for (String j : issuedBooks) {
            if (j.equals(str)) {
                check = false; // Becomes false if already issued to someone
                break;
            }
        }
        if (check) {
            // If boolean remains true
            for (int i = 0; i < availableBooks.length; i++) {
                if (availableBooks[i].equals(str)) {
                    // If present in available books then delete that & add in issued books
                    n = i;
                    for (int k = n; k < availableBooks.length - 1; k++) {
                        availableBooks[k] = availableBooks[k + 1];
                    }
                    availableBooks = Arrays.copyOf(availableBooks, availableBooks.length - 1);
                    issuedBooks = Arrays.copyOf(issuedBooks, issuedBooks.length + 1);
                    issuedBooks[issuedBooks.length - 1] = str;
                    break;
                }
            }
        } else {
            n = -2;
            System.out.println("Book " + str + " is already issued to someone.");
        }
        if (n == -1) {
            System.out.println("Book " + str + " is not present in library.");
        } else if (n >= 0) {
            System.out.println("Book " + str + " successfully issued to " + name + ".");
        }
    }

    // For returning an issued book
    public void returnBook() {
        System.out.print("Enter name of book you want to return : ");
        String str = sc1.nextLine();
        int n = -1;
        for (int i = 0; i < issuedBooks.length; i++) {
            if (issuedBooks[i].equals(str)) {
                // If present in issued books then delete that & add in available books
                n = i;
                for (int k = n; k < issuedBooks.length - 1; k++) {
                    issuedBooks[k] = issuedBooks[k + 1];
                }
                issuedBooks = Arrays.copyOf(issuedBooks, issuedBooks.length - 1);
                availableBooks = Arrays.copyOf(availableBooks, availableBooks.length + 1);
                availableBooks[availableBooks.length - 1] = str;
                break;
            }
        }
        if (n == -1) {
            System.out.println("Book " + str + " is not issued to anyone.");
        } else {
            System.out.println("Book " + str + " successfully returned.");
        }
    }
}

public class E5_library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library obj = new Library();
        int input = -1;
        while (input != 0) {
            System.out.println();
            System.out.println("Enter 1 to show available books.");
            System.out.println("Enter 2 to add books.");
            System.out.println("Enter 3 to issue books.");
            System.out.println("Enter 4 to return books.");
            System.out.println("Enter 0 to exit library.");
            System.out.print("Your input : ");
            input = sc.nextInt();
            System.out.println();

            switch (input) {
                case 1 -> obj.showBooks();
                case 2 -> obj.addBooks();
                case 3 -> obj.issueBook();
                case 4 -> obj.returnBook();
                case 0 -> System.out.println("Exiting library...");
                default -> System.out.println("Enter correct input!!!");
            }
        }
        System.out.println("Thanks for coming. Visit Again!!!");
    }
}
