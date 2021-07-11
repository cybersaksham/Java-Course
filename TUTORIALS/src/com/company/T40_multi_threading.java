package com.company;

class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("My thread is running");
            System.out.println("I am happy");
        }
    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("My thread2 is running");
            System.out.println("I am very happy");
        }
    }
}

public class T40_multi_threading {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();

        // These both run together not one after one
        t1.start(); // For starting a thread
        t2.start();
    }
}
