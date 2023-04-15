package com.yqy.day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo4 {
    public static void main(String[] args) {
        //日期
        LocalDate localDate = LocalDate.now();
        //时间
        LocalTime localTime = LocalTime.now();
        //日期和时间
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println("------------");

        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        int day = localDateTime.getDayOfMonth();
        int day1 = localDateTime.getDayOfYear();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(day1);

        System.out.println("============");
        //将LocalDateTime类转为LocalTime类或LocalDate类
        LocalTime localTime1 = localDateTime.toLocalTime();
        LocalDate localDate1 = localDateTime.toLocalDate();
        System.out.println(localDate1);
        System.out.println(localTime1);

    }
}
