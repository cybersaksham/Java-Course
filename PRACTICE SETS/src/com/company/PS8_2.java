/*
Create a class cellPhone with methods printing ringing, vibrating etc.
 */

package com.company;

class cellPhone {
    public void ring() {
        System.out.println("Ringing.....");
    }

    public void vibrate() {
        System.out.println("Vibrating.....");
    }

    public void play() {
        System.out.println("Playing.....");
    }
}

public class PS8_2 {
    public static void main(String[] args) {
        cellPhone ph = new cellPhone();
        ph.ring();
        ph.vibrate();
        ph.play();
    }
}
