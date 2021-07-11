/*
Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/GregorianCalendar.html
 */

package com.company;

import java.util.GregorianCalendar;

public class T60_gregorian_calendar {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();

        System.out.println(c.isLeapYear(2021));
    }
}
