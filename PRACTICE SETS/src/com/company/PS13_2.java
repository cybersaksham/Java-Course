/*
Use sleep method to delay welcome thread for 200ms in Q.1
 */

package com.company;

class class13_2_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
        }
    }
}

class class13_2_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class PS13_2 {
    public static void main(String[] args) {
        class13_2_1 t1 = new class13_2_1();
        class13_2_2 t2 = new class13_2_2();

        t1.start();
        t2.start();
    }
}
