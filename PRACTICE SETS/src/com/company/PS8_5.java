/*
Create a class TommyVecetti capable of hitting, running, firing etc.
 */

package com.company;

class TommyVecetti {
    public void hitting() {
        System.out.println("Hitting...");
    }

    public void running() {
        System.out.println("Running...");
    }

    public void firing() {
        System.out.println("Firing...");
    }
}

public class PS8_5 {
    public static void main(String[] args) {
        TommyVecetti player = new TommyVecetti();
        player.hitting();
        player.running();
        player.firing();
    }
}
