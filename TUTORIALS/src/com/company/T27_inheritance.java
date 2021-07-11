/*
Java does not support multiple inheritance i.e. cannot not inherit from more than one class.
 */

package com.company;

class Base {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am base class.");
    }
}

class Derived extends Base {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class T27_inheritance {
    public static void main(String[] args) {
        // Object of Base class
        Base o1 = new Base();
        o1.setX(4);
        System.out.println(o1.getX());

        // Object of Derived class
        Derived o2 = new Derived();
        o2.setX(5);
        System.out.println(o2.getX());
    }
}
