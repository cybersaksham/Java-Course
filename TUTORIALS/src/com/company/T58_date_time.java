/*
Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.sql/java/sql/Date.html
 */

package com.company;

import java.util.Date;

public class T58_date_time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // Tells how much milliseconds spent from a reference time
        // We can print hours, minutes, days etc.... by doing mathematical operation. For eg. for hours
        System.out.println(((System.currentTimeMillis() / 1000) / 3600));

        // It is appropriate to store currentTimeMillis() in long variable

        // Making date class
        Date d1 = new Date();
        System.out.println("d1 = " + d1);
        System.out.println(d1.getYear());
    }
}
