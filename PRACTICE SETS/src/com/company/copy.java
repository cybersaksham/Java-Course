package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Tables2 {
    public int str;

    public void createFile() {
        File f1 = new File("ps16-" + str + ".txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            System.out.println("Some error occurred while creating file : ps16-" + str + ".txt");
            e.printStackTrace();
        }
    }

    public void writeFile(int a) {
        try {
            File f2 = new File("src/com/company/PS16_" + str + ".java");
            FileWriter f3 = new FileWriter("ps16-" + str + ".txt");
            try {
                Scanner sc = new Scanner(f2);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    f3.write(line + "\n");
                }
                f3.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!!!");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Some error occurred while writing file : multi_" + str);
            e.printStackTrace();
        }
    }
}

public class copy {
    public static void main(String[] args) {
        Tables2 t = new Tables2();
        for (int i = 1; i <= 6; i++) {
            t.str = i;
            t.createFile();
            t.writeFile(i);
        }
    }
}
