package com.company;

interface camera37 {
    void takeSnap();

    void recordVideo();
}

interface WiFi37 {
    String[] getNetworks();

    void connectToNetwork();
}

class cellPhone37 {
    void callNo(int phoneNo) {
        System.out.println("Calling " + phoneNo);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class smartPhone37 extends cellPhone37 implements camera37, WiFi37 {
    @Override
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of connections...");
        return new String[]{"net1", "net2", "net3"};
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Connecting to network...");
    }
}

public class T37_polymorphism_in_interfaces {
    public static void main(String[] args) {
        camera37 obj = new smartPhone37();
        // obj.getNetworks --> Not Allowed, can only access functions of camera37
        obj.recordVideo();

        WiFi37 obj2 = new smartPhone37();
        // obj2.recordVideo --> Not Allowed, can only access functions of WiFi37
        obj2.getNetworks();

        cellPhone37 obj3 = new smartPhone37();
        obj3.callNo(12345); // Can access only methods of cellPhone37 class
    }
}
