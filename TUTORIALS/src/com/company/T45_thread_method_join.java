package com.company;

class thread45 extends Thread {
    public thread45(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The name is " + this.getName());
        }
    }
}

public class T45_thread_method_join {
    public static void main(String[] args) {
        thread45 t1 = new thread45("Thread 1");
        thread45 t2 = new thread45("Thread 2");
        thread45 t3 = new thread45("Thread 3");

        t1.start();
        // try-catch is used to handle exceptions
        // join method can give errors so we put it in try block
        try {
            t1.join(); // First t1 run until it terminates
        } catch (Exception e) {
            System.out.println(e);
        }

        // Then t2 & t3 run normally
        t2.start();
        t3.start();
    }
}
