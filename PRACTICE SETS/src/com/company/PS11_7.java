/*
Create an class TV which implements to interfaces of Q.6
 */

package com.company;

interface tvRemote1 {
    void changeChannel();

    void increaseVolume();
}

interface SmartTvRemote1 extends tvRemote1 {
    void pauseScreen();

    void changeGraphics();
}

class TV implements tvRemote1, SmartTvRemote1 {
    @Override
    public void changeChannel() {
        System.out.println("Changing the channel...");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing the volume...");
    }

    @Override
    public void pauseScreen() {
        System.out.println("Screen is paused...");
    }

    @Override
    public void changeGraphics() {
        System.out.println("Graphics switched...");
    }
}

public class PS11_7 {
    public static void main(String[] args) {
        TV obj = new TV();
        obj.changeChannel();
        obj.changeGraphics();
        obj.pauseScreen();
        obj.increaseVolume();
    }
}
