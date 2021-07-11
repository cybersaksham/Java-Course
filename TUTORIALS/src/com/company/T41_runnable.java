package com.company;

class myRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am myRunnable1");
        }
    }
}

class myRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am myRunnable2");
        }
    }
}

public class T41_runnable {
    public static void main(String[] args) {
        myRunnable1 r1 = new myRunnable1();
        Thread t1 = new Thread(r1);

        myRunnable2 r2 = new myRunnable2();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
