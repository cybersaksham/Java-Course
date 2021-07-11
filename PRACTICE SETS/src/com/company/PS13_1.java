/*
WAP to print "Good Morning" & "Welcome" continuously on screen using threads.
 */

package com.company;

class class13_1_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
        }
    }
}

class class13_1_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome");
        }
    }
}

public class PS13_1 {
    public static void main(String[] args) {
        class13_1_1 t1 = new class13_1_1();
        class13_1_2 t2 = new class13_1_2();

        t1.start();
        t2.start();
    }
}
