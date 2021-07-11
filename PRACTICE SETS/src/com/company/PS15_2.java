/*
Use Date class to print in following format ;
21:47:02
 */

package com.company;

import java.util.Date;

public class PS15_2 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
    }
}
