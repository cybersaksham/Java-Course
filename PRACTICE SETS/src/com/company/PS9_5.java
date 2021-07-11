/*
Create a class Cylinder & use getters & setters to set radius & height.
 */

package com.company;

class Sphere {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}

public class PS9_5 {
    public static void main(String[] args) {
        Sphere obj = new Sphere();
        obj.setRadius(1);
        System.out.println("The radius is " + obj.getRadius());
    }
}
