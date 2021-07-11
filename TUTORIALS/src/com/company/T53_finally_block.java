/*
Finally block executes in every condition.
 */

package com.company;

public class T53_finally_block {
    public static int greet(int a) {
        try {
            if (a == 0) {
                return 0; // Returns here but finally block will also execute
            }
        } finally {
            System.out.println("This is in finally block!!!");
        }
        System.out.println("This is not in finally block!!!");
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(greet(0));
    }
}
