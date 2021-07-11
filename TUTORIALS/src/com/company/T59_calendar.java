/*
Calendar is an abstract class.
Reference https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Calendar.html
 */

package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class T59_calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c2.getTimeZone());

        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        // Station Clock
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
