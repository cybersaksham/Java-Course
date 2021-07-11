/*
Create a library management system capable of issuing books to students.
Book should have info like :
1. Book Name
2. Book Author
3. Issued To
4. Issued On
User should be able to add books, return issued books, issue books.
Assume that all users are registered with their name in current database.
 */

package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Book7 {
    public String name, author, issued_to, issued_on;

    public Book7(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book7(String name, String author, String issued_to, String issued_on) {
        this.name = name;
        this.author = author;
        this.issued_to = issued_to;
        this.issued_on = issued_on;
    }

    public void showBooks() {
        System.out.println(this.name + " " + this.author);
    }
}

class Library7 {
    private ArrayList<Book7> availableBooks;
    private ArrayList<Book7> issuedBooks = new ArrayList<>();
    private boolean avlBook;
    private boolean issBook;

    public Library7(ArrayList<Book7> books) {
        this.availableBooks = books;
    }

    private Book7 check(Book7 book) {
        avlBook = false;
        issBook = false;
        Book7 temp = new Book7("a", "b");
        for (Book7 o : availableBooks) {
            if ((o.name).equals(book.name) && (o.author).equals(book.author)) {
                this.avlBook = true;
                return o;
            }
        }
        for (Book7 o : issuedBooks) {
            if ((o.name).equals(book.name) && (o.author).equals(book.author)) {
                this.issBook = true;
                return o;
            }
        }
        return temp;
    }

    public void showBook() {
        System.out.println("Showing books :");
        for (Book7 books : availableBooks) {
            books.showBooks();
        }
    }

    public void addBook(Book7 book) {
        System.out.println();
        Book7 pointer = this.check(book);
        if (this.issBook) {
            System.out.println("This book is issued to someone. Cannot add another.");
        } else if (this.avlBook) {
            System.out.println("This book is already present in library.");
        } else {
            this.availableBooks.add(book);
            System.out.println("Book has been added successfully.");
        }
    }

    public void issueBook(Book7 book) {
        System.out.println();
        Book7 pointer = this.check(book);
        if (this.issBook) {
            System.out.println("This book is already issued to someone.");
        } else if (this.avlBook) {
            pointer.issued_to = book.issued_to;
            pointer.issued_on = book.issued_on;
            this.availableBooks.remove(pointer);
            this.issuedBooks.add(pointer);
            System.out.println("Book has been issued successfully to " + book.issued_to + " on " + book.issued_on + ".");
        } else {
            System.out.println("This book is not present in library.");
        }
    }

    public void returnBook(Book7 book) {
        System.out.println();
        Book7 pointer = this.check(book);
        if (this.issBook) {
            System.out.println("Book was issued to " + pointer.issued_to + " on " + pointer.issued_on + ".");
            this.availableBooks.add(pointer);
            this.issuedBooks.remove(pointer);
            System.out.println("Now it has been returned successfully.");
        } else {
            System.out.println("This book is not issued to someone yet.");
        }
    }
}

public class E7_Library_Management_System {
    public static Book7 input() {
        Scanner sc = new Scanner(System.in);
        String name, author;
        System.out.print("Enter book name : ");
        name = sc.next();
        System.out.print("Enter author name : ");
        author = sc.next();

        return new Book7(name, author);
    }

    public static Book7 input2() {
        Scanner sc = new Scanner(System.in);

        String name, author, user;
        System.out.print("Enter book name : ");
        name = sc.next();
        System.out.print("Enter author name : ");
        author = sc.next();
        System.out.print("Enter your name : ");
        user = sc.next();

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy -- H:m:s");
        String myDate = ldt.format(dtf);

        return new Book7(name, author, user, myDate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our library!!!");

        ArrayList<Book7> book = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            book.add(new Book7("Book-" + (i + 1), "Author-" + (i + 1)));
        }

        Library7 obj = new Library7(book);
        String issued_to;

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
                case 1 -> obj.showBook();
                case 2 -> obj.addBook(input());
                case 3 -> obj.issueBook(input2());
                case 4 -> obj.returnBook(input());
                case 0 -> System.out.println("Exiting library...");
                default -> System.out.println("Enter correct input!!!");
            }
        }
        System.out.println("Thanks for coming. Visit Again!!!");
    }
}
