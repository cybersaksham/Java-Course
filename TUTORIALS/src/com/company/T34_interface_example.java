package com.company;

interface camera {
    void takeSnap();

    void recordVideo();
}

interface WiFi {
    String[] getNetworks();

    void connectToNetwork();
}

class cellPhone {
    void callNo(int phoneNo) {
        System.out.println("Calling " + phoneNo);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class smartPhone extends cellPhone implements camera, WiFi {
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

public class T34_interface_example {
    public static void main(String[] args) {
        smartPhone obj = new smartPhone();

        String[] arr = obj.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
