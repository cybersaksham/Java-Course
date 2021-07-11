/*
Create a class Cylinder & use setters to set radius & height.
Find surface area and volume of cylinder.
 */

package com.company;

class Cylinder2 {
    private int radius, height;
    private float s_area, volume;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getArea() {
        s_area = (2.0f * 3.14f * radius * height);
        return s_area;
    }

    public float getVol() {
        volume = (3.14f * radius * radius * height);
        return volume;
    }
}

public class PS9_2 {
    public static void main(String[] args) {
        Cylinder2 obj = new Cylinder2();
        obj.setRadius(1);
        obj.setHeight(2);
        System.out.println("The surface area is " + obj.getArea());
        System.out.println("The volume is " + obj.getVol());
    }
}
