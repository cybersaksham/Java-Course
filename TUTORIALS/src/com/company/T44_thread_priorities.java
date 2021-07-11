package com.company;

class myThread44 extends Thread {
    public myThread44(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The name is " + this.getName());
        }
    }
}

public class T44_thread_priorities {
    public static void main(String[] args) {
        myThread44 t1 = new myThread44("1");
        myThread44 t2 = new myThread44("2");
        myThread44 t3 = new myThread44("3");
        myThread44 t4 = new myThread44("4");
        myThread44 t5 = new myThread44("5");

        t1.setPriority(Thread.MAX_PRIORITY); // Will have maximum priority

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
