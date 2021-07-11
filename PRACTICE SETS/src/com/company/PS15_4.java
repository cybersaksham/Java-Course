/*
Repeat Q.2 by java.time API
 */

package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PS15_4 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter ldf = DateTimeFormatter.ofPattern("H:m:s");

        String myTime = ldt.format(ldf);
        System.out.println(myTime);
    }
}
