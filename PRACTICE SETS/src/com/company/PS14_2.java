/*
WAP that print "haha" on arithmetic exception
& "hehe" at illegal arguments.
 */

package com.company;

public class PS14_2 {
    public static void main(String[] args) {
        try {
            System.out.println(66 / 0);
        } catch (ArithmeticException e) {
            System.out.println("haha");
        } catch (IllegalArgumentException e) {
            System.out.println("hehe");
        }
    }
}
