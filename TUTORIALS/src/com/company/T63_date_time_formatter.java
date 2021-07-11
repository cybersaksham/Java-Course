/*
Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/time/format/DateTimeFormatter.html
 */

package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T63_date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM/yyyy");
        String myDate = ldt.format(dtf);
        System.out.println(myDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 = ldt.format(dtf2);
        System.out.println(myDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        String myDate3 = ldt.format(dtf3);
        System.out.println(myDate3);

    }
}
