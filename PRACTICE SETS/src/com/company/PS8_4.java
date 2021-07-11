/*
Make a class Rectangle for initializing sides, find area & perimeter.
 */

package com.company;

class Rectangle {
    float len, wid;

    public void setSides(float a, float b) {
        len = a;
        wid = b;
    }

    public float getArea() {
        return (len * wid);
    }

    public float getPeri() {
        return (2 * (len + wid));
    }
}

public class PS8_4 {
    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();
        s1.setSides(1.2f, 2.1f);
        System.out.println("Area is " + s1.getArea());
        System.out.println("Perimeter is " + s1.getPeri());
    }
}
