/*
Create an interface tvRemote & use it to inherit another interface SmartTvRemote
 */

package com.company;

interface tvRemote {
    void changeChannel();

    void increaseVolume();
}

interface SmartTvRemote extends tvRemote {
    void pauseScreen();

    void changeGraphics();
}

public class PS11_6 {
    public static void main(String[] args) {
    }
}
