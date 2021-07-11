package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class T69_file_handling {
    public static void main(String[] args) {

        // Creating a new file
        File f1 = new File("T69_sample_file.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file...");
            e.printStackTrace();
        }

        // Writing in a file (after removing all present content)
        try {
            FileWriter f2 = new FileWriter("T69_sample_file.txt");
            f2.write("Hi\nSaksham here!!!");
            f2.close(); // Remember to close a file
        } catch (IOException e) {
            System.out.println("Failed to reach the file...");
            e.printStackTrace();
        }

        // Reading a file
        File f3 = new File("T69_sample_file.txt");
        try {
            Scanner sc = new Scanner(f3);
            System.out.println("File contains...");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }

        // Deleting a file
        File f4 = new File("T69_sample_file.txt");
        if (f4.delete()) {
            System.out.println("File deleted...");
        } else {
            System.out.println("Some error occurred...");
        }
    }
}
