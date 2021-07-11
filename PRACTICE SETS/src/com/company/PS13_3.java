/*
Use getPriority() & setPriority() methods
 */

package com.company;

class class13_3_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
        }
    }
}

public class PS13_3 {
    public static void main(String[] args) {
        class13_3_1 t1 = new class13_3_1();
        class13_3_1 t2 = new class13_3_1();

        t1.setPriority(6);
        t2.setPriority(9);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
