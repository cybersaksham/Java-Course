/*
Some common constructors :
1. Thread()
2. Thread(String name)
3. Thread(Runnable r)
4. Thread(Runnable r, String name)
 */

package com.company;

class myThread43 extends Thread {
    public myThread43(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am myThread43");
        }
    }
}

public class T43_thread_constructor {
    public static void main(String[] args) {
        myThread43 t1 = new myThread43("Saksham");
        myThread43 t2 = new myThread43("Harry");

        t1.start();
        t2.start();

        System.out.println("The id of thread t1 is " + t1.getId()); // ReEvery thread has its id
        System.out.println("The name of thread t1 is " + t1.getName()); // name is given bu us in constructor

        System.out.println("The id of thread t2 is " + t2.getId());
        System.out.println("The name of thread t2 is " + t2.getName());
    }
}
