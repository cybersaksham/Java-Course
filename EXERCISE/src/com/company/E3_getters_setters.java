/*
Make a Circle class & set its radius, area & perimeter.
Then check their validity.
 */

package com.company;

class Circle {
    private float rad, area, peri;

    public void setRad(float rad) {
        this.rad = rad;
    }

    public void setArea(float area) {
        this.area = area;
        if (this.area != (3.14f * rad * rad)) {
            System.out.println("Area is incorrect according to radius.");
        }
    }

    public void setPeri(float peri) {
        this.peri = peri;
        if (this.peri != (2.0f * 3.14f * rad)) {
            System.out.println("Perimeter is incorrect according to radius.");
        }
    }
}

public class E3_getters_setters {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRad(1.0f);
        c1.setArea(2.0f);
        c1.setPeri(3.0f);
    }
}
