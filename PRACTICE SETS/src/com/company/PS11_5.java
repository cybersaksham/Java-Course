/*
Use 1 to demonstrate polymorphism with monkey class.
 */

package com.company;

interface basicAnimals2 {
    void eat();

    void sleep();
}

class Monkey2 {
    public void jump() {
        System.out.println("Jumping...");
    }

    public void bite() {
        System.out.println("Biting...");
    }
}

class Humans2 extends Monkey2 implements basicAnimals2 {
    void speak() {
        System.out.println("Hello...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class PS11_5 {
    public static void main(String[] args) {
        Monkey2 obj = new Humans2();
        // obj.eat();
        // obj.sleep();
        // obj.speak();
        obj.bite();
        obj.bite();
    }
}
