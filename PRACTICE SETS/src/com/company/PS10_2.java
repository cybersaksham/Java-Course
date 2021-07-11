/*
Create a class Rectangle & use inheritance to create Cuboid from it.
 */

package com.company;

class Rectangle10_2 {
    private int len, wid;

    public Rectangle10_2(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }

    public int area() {
        return this.len * this.wid;
    }
}

class Cuboid10_2 extends Rectangle10_2 {
    private int height;

    public Cuboid10_2(int len, int wid, int height) {
        super(len, wid);
        this.height = height;
    }

    public int volume() {
        return this.area() * this.height;
    }
}

public class PS10_2 {
    public static void main(String[] args) {
        Cuboid10_2 obj = new Cuboid10_2(1, 2, 3);
        System.out.println("The area of rectangle is " + obj.area());
        System.out.println("The volume of cuboid is " + obj.volume());
    }
}
