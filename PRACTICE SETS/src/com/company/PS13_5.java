/*
How to get reference to current thread
 */

package com.company;

class class13_5_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
        }
    }
}


public class PS13_5 {
    public static void main(String[] args) {
        class13_5_1 t1 = new class13_5_1();

        t1.start();
        System.out.println(Thread.currentThread().getState()); // referring to current running thread
    }
}
