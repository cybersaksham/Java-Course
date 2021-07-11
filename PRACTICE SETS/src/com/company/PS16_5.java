/*
Store multiplication table of 6 in a file
 */

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PS16_5 {
    public static void main(String[] args) {
        File f1 = new File("multi_6.txt");
        try {
            f1.createNewFile();
            System.out.println("Created Successfully...");
        } catch (IOException e) {
            System.out.println("Some error occurred in creating...");
            e.printStackTrace();
        }

        try {
            FileWriter f2 = new FileWriter("multi_6.txt");
            for (int i = 1; i <= 10; i++) {
                f2.write("6 * " + i + " = " + (6 * i) + "\n");
            }
            f2.close();
            System.out.println("Written Successfully...");
        } catch (IOException e) {
            System.out.println("Some error occurred in writing...");
            e.printStackTrace();
        }
    }
}
