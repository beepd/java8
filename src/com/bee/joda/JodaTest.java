package com.bee.joda;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaTest {
    public static void main(String args[]) {
        LocalDate date = LocalDate.now(); // 2018-09-16
        LocalTime time = LocalTime.now(); // 19:31:31.276
        System.out.println(date);
        System.out.println(time);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

    }
}
