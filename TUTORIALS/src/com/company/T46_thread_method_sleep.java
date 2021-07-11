package com.company;

class thread46 extends Thread {
    public thread46(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The name is " + this.getName());
            try {
                Thread.sleep(1000); // Thread stops for 1000 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class T46_thread_method_sleep {
    public static void main(String[] args) {
        thread46 t1 = new thread46("Thread 1");

        t1.start();
    }
}
