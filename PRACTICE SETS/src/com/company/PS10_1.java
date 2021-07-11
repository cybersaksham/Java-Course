/*
Create a class circle & use inheritance to create Cylinder from it.
 */

package com.company;

class Circle10_1 {
    private int radius;

    public Circle10_1(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder10_1 extends Circle10_1 {
    private int height;

    public Cylinder10_1(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return this.area() * this.height;
    }
}

public class PS10_1 {
    public static void main(String[] args) {
        Cylinder10_1 obj = new Cylinder10_1(1, 2);
        System.out.println("The area of circle is " + obj.area());
        System.out.println("The volume of cylinder is " + obj.volume());
    }
}
