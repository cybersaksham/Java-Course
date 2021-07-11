/*
Create a Monkey class with methods jump() & bite().
Create a Human class inherited from monkey class
& implements basicAnimal interface with methods eat() & sleep()
 */

package com.company;

interface basicAnimals {
    void eat();

    void sleep();
}

class Monkey {
    public void jump() {
        System.out.println("Jumping...");
    }

    public void bite() {
        System.out.println("Biting...");
    }
}

class Humans extends Monkey implements basicAnimals {
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

public class PS11_3 {
    public static void main(String[] args) {
        Humans obj = new Humans();
        obj.eat();
        obj.sleep();
        obj.speak();
        obj.bite();
        obj.bite();
    }
}
