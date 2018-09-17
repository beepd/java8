package com.bee.joda;

import java.time.*;

public class JodaTest {
    public static void main(String args[]) {
        LocalDate date = LocalDate.now(); // 2018-09-16
        LocalTime time = LocalTime.now(); // 19:31:31.276
        System.out.println(date);
        System.out.println(time);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());
        System.out.println(date.plusMonths(6l));
        System.out.println(date.minusMonths(6l));

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt); //2018-09-16T20:00:11.681

        LocalDate bday = LocalDate.of(1984, Month.NOVEMBER, 13);
        Period p = Period.between(bday, date);
        System.out.println(p.getYears()+"-"+p.getMonths()+"-"+p.getDays());

        //LocalDateTime.of(yy, mm, dd, h, m, s, n)

        Year y = Year.of(1984);
        System.out.println(y.isLeap());
        System.out.println(Year.of(1985).isLeap());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId laId = ZoneId.of("America/Los_Angeles");
        System.out.println(ZonedDateTime.now(laId));
    }
}
