/*
Make a class Circle for initializing radius, find area & perimeter.
 */

package com.company;

class Circle {
    float rad;

    public void setRad(float a) {
        rad = a;
    }

    public float getArea() {
        return (rad * rad * 3.14f);
    }

    public float getPeri() {
        return (2.0f * 3.14f * rad);
    }
}

public class PS8_6 {
    public static void main(String[] args) {
        Circle s1 = new Circle();
        s1.setRad(1.2f);
        System.out.println("Area is " + s1.getArea());
        System.out.println("Perimeter is " + s1.getPeri());
    }
}
