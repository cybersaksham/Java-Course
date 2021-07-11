/*
Cannot make object of interface but can make reference.
All functions inside interface are abstract.
A class can implement more than one interfaces.
We can create properties in interfaces but cannot modify them.
Interfaces methods are public by default.
 */

package com.company;

interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface Vehicle {
    void speed();
}

class AvonCycle implements Bicycle, Vehicle {
    public void blowHorn() {
        System.out.println("Blowing Horn...");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake...");
    }

    public void speedUp(int increment) {
        System.out.println("Increasing Speed...");
    }

    public void speed() {
        System.out.println("The speed is fast...");
    }
}

public class T33_interfaces {
    public static void main(String[] args) {
        AvonCycle obj = new AvonCycle();
        System.out.println(obj.a);
        obj.blowHorn();
        obj.applyBrake(1);
        obj.speedUp(2);
        obj.speed();
    }
}
