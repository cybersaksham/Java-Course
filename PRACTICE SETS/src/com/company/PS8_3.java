/*
Make a class Square for initializing side, find area & perimeter.
 */

package com.company;

class Square {
    float side;

    public void setSide(float a) {
        side = a;
    }

    public float getArea() {
        return (side * side);
    }

    public float getPeri() {
        return (4 * side);
    }
}

public class PS8_3 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSide(1.2f);
        System.out.println("Area is " + s1.getArea());
        System.out.println("Perimeter is " + s1.getPeri());
    }
}
