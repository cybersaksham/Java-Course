/*
Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/TimeZone.html
 */

package com.company;

import java.util.TimeZone;

public class T61_timezone {
    public static void main(String[] args) {
        for (String item : TimeZone.getAvailableIDs()) {
            System.out.println(item);
        }
    }
}
