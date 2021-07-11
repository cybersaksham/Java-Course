/*
Overload a constructor used to initialize rectangle of length 4 & width 5.
 */

package com.company;

class Rectangle2 {
    private int len, wid;

    Rectangle2() {
        this.len = 4;
        this.wid = 5;
    }

    public Rectangle2(int l) {
        this.len = l;
        this.wid = 5;
    }

    public Rectangle2(int l, int b) {
        this.len = l;
        this.wid = b;
    }

    public int getLen() {
        return len;
    }

    public int getWid() {
        return wid;
    }
}

public class PS9_4 {
    public static void main(String[] args) {
        Rectangle2 obj = new Rectangle2();
        System.out.println("The length is " + obj.getLen());
        System.out.println("The width is " + obj.getWid());
    }
}
