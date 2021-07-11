/*
Repeat Q.5 with numbers 2-9 & store all in a folder.
 */

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Tables {
    public int str;

    public void createFile() {
        File f1 = new File("Tables_ps16/multi_" + str + ".txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            System.out.println("Some error occurred while creating file : multi_" + str + ".txt");
            e.printStackTrace();
        }
    }

    public void writeFile(int a) {
        try {
            FileWriter f2 = new FileWriter("Tables_ps16/multi_" + str + ".txt");
            for (int i = 1; i <= 10; i++) {
                f2.write(a + " * " + i + " = " + (a * i) + "\n");
            }
            f2.close();
        } catch (IOException e) {
            System.out.println("Some error occurred while writing file : multi_" + str + ".txt");
            e.printStackTrace();
        }
    }
}

public class PS16_6 {
    public static void main(String[] args) {
        Tables t = new Tables();
        for (int i = 2; i <= 9; i++) {
            t.str = i;
            t.createFile();
            t.writeFile(i);
        }
    }
}
