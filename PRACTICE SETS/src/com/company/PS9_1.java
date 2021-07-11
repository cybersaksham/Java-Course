/*
Create a class Cylinder & use getters & setters to set radius & height.
 */

package com.company;

class Cylinder {
    private int radius, height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}

public class PS9_1 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setRadius(1);
        obj.setHeight(2);
        System.out.println("The radius is " + obj.getRadius());
        System.out.println("The height is " + obj.getHeight());
    }
}
