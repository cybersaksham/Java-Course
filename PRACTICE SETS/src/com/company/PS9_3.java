/*
Use a constructor & repeat 1
 */

package com.company;

class Cylinder3 {
    private int radius, height;

    public Cylinder3(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}

public class PS9_3 {
    public static void main(String[] args) {
        Cylinder3 obj = new Cylinder3(1, 2);
        System.out.println("The radius is " + obj.getRadius());
        System.out.println("The height is " + obj.getHeight());
    }
}
