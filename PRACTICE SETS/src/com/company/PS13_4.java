/*
How to get state of a thread
 */

package com.company;

class class13_4_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
        }
    }
}

public class PS13_4 {
    public static void main(String[] args) {
        class13_4_1 t1 = new class13_4_1();

        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());
    }
}
