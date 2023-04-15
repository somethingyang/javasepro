package com.yqy.day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a);

        long b = a.getTime();
        System.out.println(b);

        Date c= new Date(b);
        System.out.println(c);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String rs = sdf.format(c);
        System.out.println(rs);

        System.out.println("-----------");

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

    }
}
